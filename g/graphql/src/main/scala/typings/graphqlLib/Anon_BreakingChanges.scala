package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreakingChanges extends js.Object {
  var breakingChanges: js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange]
  var dangerousChanges: js.Array[graphqlLib.utilitiesFindBreakingChangesMod.DangerousChange]
}

object Anon_BreakingChanges {
  @scala.inline
  def apply(
    breakingChanges: js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange],
    dangerousChanges: js.Array[graphqlLib.utilitiesFindBreakingChangesMod.DangerousChange]
  ): Anon_BreakingChanges = {
    val __obj = js.Dynamic.literal(breakingChanges = breakingChanges, dangerousChanges = dangerousChanges)
  
    __obj.asInstanceOf[Anon_BreakingChanges]
  }
}

