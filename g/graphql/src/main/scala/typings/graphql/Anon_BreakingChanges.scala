package typings.graphql

import typings.graphql.utilitiesFindBreakingChangesMod.BreakingChange
import typings.graphql.utilitiesFindBreakingChangesMod.DangerousChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BreakingChanges extends js.Object {
  var breakingChanges: js.Array[BreakingChange]
  var dangerousChanges: js.Array[DangerousChange]
}

object Anon_BreakingChanges {
  @scala.inline
  def apply(breakingChanges: js.Array[BreakingChange], dangerousChanges: js.Array[DangerousChange]): Anon_BreakingChanges = {
    val __obj = js.Dynamic.literal(breakingChanges = breakingChanges, dangerousChanges = dangerousChanges)
  
    __obj.asInstanceOf[Anon_BreakingChanges]
  }
}

