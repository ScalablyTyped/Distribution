package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionNode[TFn, TArgs /* <: js.Array[MathNode] */]
  extends StObject
     with MathNode {
  
  var args: TArgs = js.native
  
  var fn: TFn = js.native
  
  var isFunctionNode: `true` = js.native
  
  @JSName("type")
  var type_FunctionNode: typings.mathjs.mathjsStrings.FunctionNode = js.native
}
