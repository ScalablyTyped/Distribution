package typings.atHapiHapi.atHapiHapiMod

import typings.atHapiHapi.atHapiHapiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessSetting extends js.Object {
  var entity: js.UndefOr[AccessEntity] = js.undefined
  var scope: AccessScopes | `false`
}

object AccessSetting {
  @scala.inline
  def apply(scope: AccessScopes | `false`, entity: AccessEntity = null): AccessSetting = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessSetting]
  }
}

