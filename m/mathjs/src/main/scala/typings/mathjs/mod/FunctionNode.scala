package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionNode
  extends StObject
     with MathNode {
  
  var args: js.Array[MathNode] = js.native
  
  var fn: SymbolNode = js.native
  
  var isFunctionNode: `true` = js.native
  
  @JSName("type")
  var type_FunctionNode: typings.mathjs.mathjsStrings.FunctionNode = js.native
}
