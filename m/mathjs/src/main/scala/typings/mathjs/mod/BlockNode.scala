package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockNode[TNode /* <: MathNode */]
  extends StObject
     with MathNode {
  
  var blocks: js.Array[typings.mathjs.anon.Node[TNode]] = js.native
  
  var isBlockNode: `true` = js.native
  
  @JSName("type")
  var type_BlockNode: typings.mathjs.mathjsStrings.BlockNode = js.native
}
