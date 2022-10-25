package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentNode[TValue /* <: MathNode */]
  extends StObject
     with MathNode {
  
  var index: IndexNode[js.Array[MathNode]] | Null = js.native
  
  var isAssignmentNode: `true` = js.native
  
  var name: String = js.native
  
  var `object`: SymbolNode | AccessorNode[MathNode] = js.native
  
  @JSName("type")
  var type_AssignmentNode: typings.mathjs.mathjsStrings.AssignmentNode = js.native
  
  var value: TValue = js.native
}
