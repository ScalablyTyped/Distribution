package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalNode
  extends StObject
     with MathNode {
  
  var condition: MathNode = js.native
  
  var falseExpr: MathNode = js.native
  
  var isConditionalNode: Boolean = js.native
  
  var trueExpr: MathNode = js.native
  
  @JSName("type")
  var type_ConditionalNode: typings.mathjs.mathjsStrings.ConditionalNode = js.native
}
