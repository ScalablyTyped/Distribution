package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionAssignmentNode[TExpr /* <: MathNode */]
  extends StObject
     with MathNode {
  
  var expr: TExpr = js.native
  
  var isFunctionAssignmentNode: `true` = js.native
  
  var name: String = js.native
  
  var params: js.Array[String] = js.native
  
  @JSName("type")
  var type_FunctionAssignmentNode: typings.mathjs.mathjsStrings.FunctionAssignmentNode = js.native
}
