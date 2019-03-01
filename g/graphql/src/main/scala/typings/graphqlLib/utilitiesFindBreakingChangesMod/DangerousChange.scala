package typings
package graphqlLib.utilitiesFindBreakingChangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DangerousChange extends js.Object {
  var description: java.lang.String
  var `type`: java.lang.String
}

object DangerousChange {
  @scala.inline
  def apply(description: java.lang.String, `type`: java.lang.String): DangerousChange = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[DangerousChange]
  }
}

