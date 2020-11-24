package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jsonRulesEngine.mod.AllConditions
  - typings.jsonRulesEngine.mod.AnyConditions
*/
trait TopLevelCondition extends NestedCondition
object TopLevelCondition {
  
  @scala.inline
  def AllConditions(all: js.Array[NestedCondition]): TopLevelCondition = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelCondition]
  }
  
  @scala.inline
  def AnyConditions(any: js.Array[NestedCondition]): TopLevelCondition = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopLevelCondition]
  }
}
