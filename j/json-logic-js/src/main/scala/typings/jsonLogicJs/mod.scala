package typings.jsonLogicJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-logic-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @JSName("apply")
  def apply(logic: RulesLogic): js.Any = js.native
  @JSName("apply")
  def apply(logic: RulesLogic, data: js.Any): js.Any = js.native
  
  trait _RulesLogic extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typings.jsonLogicJs.anon.Var
    - typings.jsonLogicJs.anon.Missing
    - typings.jsonLogicJs.anon.Missingsome
    - typings.jsonLogicJs.anon.If
    - typings.jsonLogicJs.anon._empty
    - typings.jsonLogicJs.anon.`0`
    - typings.jsonLogicJs.anon.`1`
    - typings.jsonLogicJs.anon.`2`
    - typings.jsonLogicJs.anon.Any
    - typings.jsonLogicJs.anon.`3`
    - typings.jsonLogicJs.anon.Or
    - typings.jsonLogicJs.anon.And
    - typings.jsonLogicJs.anon.`4`
    - typings.jsonLogicJs.anon.`5`
    - typings.jsonLogicJs.anon.`6`
    - typings.jsonLogicJs.anon.`7`
    - typings.jsonLogicJs.anon.Max
    - typings.jsonLogicJs.anon.Min
    - typings.jsonLogicJs.anon.`8`
    - typings.jsonLogicJs.anon.`9`
    - typings.jsonLogicJs.anon.`10`
    - typings.jsonLogicJs.anon.`11`
    - typings.jsonLogicJs.anon.`12`
    - typings.jsonLogicJs.anon.Map
    - typings.jsonLogicJs.anon.Filter
    - typings.jsonLogicJs.anon.Reduce
    - typings.jsonLogicJs.anon.All
    - typings.jsonLogicJs.anon.None
    - typings.jsonLogicJs.anon.Some
    - typings.jsonLogicJs.anon.Merge
    - typings.jsonLogicJs.anon.In
    - typings.jsonLogicJs.anon.`13`
    - typings.jsonLogicJs.anon.Cat
    - typings.jsonLogicJs.anon.Substr
    - typings.jsonLogicJs.anon.Log
  */
  type RulesLogic = _RulesLogic | Boolean | String | Double
}
