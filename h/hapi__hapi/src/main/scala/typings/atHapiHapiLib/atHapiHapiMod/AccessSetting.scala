package typings
package atHapiHapiLib.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessSetting extends js.Object {
  var entity: js.UndefOr[AccessEntity] = js.undefined
  var scope: AccessScopes | atHapiHapiLib.atHapiHapiLibNumbers.`false`
}

object AccessSetting {
  @scala.inline
  def apply(scope: AccessScopes | atHapiHapiLib.atHapiHapiLibNumbers.`false`, entity: AccessEntity = null): AccessSetting = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity)
    __obj.asInstanceOf[AccessSetting]
  }
}

