package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockNode
  extends StObject
     with MathNodeCommon
     with _MathNode {
  
  var blocks: js.Array[typings.mathjs.anon.Node] = js.native
  
  var isBlockNode: `true` = js.native
  
  @JSName("type")
  var type_BlockNode: typings.mathjs.mathjsStrings.BlockNode = js.native
}
