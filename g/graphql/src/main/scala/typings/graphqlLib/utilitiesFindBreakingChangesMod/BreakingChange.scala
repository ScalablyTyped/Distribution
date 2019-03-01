package typings
package graphqlLib.utilitiesFindBreakingChangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakingChange extends js.Object {
  var description: java.lang.String
  var `type`: java.lang.String
}

object BreakingChange {
  @scala.inline
  def apply(description: java.lang.String, `type`: java.lang.String): BreakingChange = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[BreakingChange]
  }
}

