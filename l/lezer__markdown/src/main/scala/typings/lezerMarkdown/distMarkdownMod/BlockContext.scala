package typings.lezerMarkdown.distMarkdownMod

import typings.lezerCommon.distParseMod.PartialParse
import typings.lezerCommon.distTreeMod.Tree
import typings.lezerCommon.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lezer/markdown/dist/markdown", "BlockContext")
@js.native
open class BlockContext ()
  extends StObject
     with PartialParse {
  
  def addElement(elt: Element): Unit = js.native
  
  /* private */ var addGaps: Any = js.native
  
  def addLeafElement(leaf: LeafBlock, elt: Element): Unit = js.native
  
  /* CompleteClass */
  override def advance(): Tree | Null = js.native
  
  /* private */ var atEnd: Any = js.native
  
  def depth: Double = js.native
  
  def elt(tree: typings.lezerCommon.mod.Tree, at: Double): Element = js.native
  def elt(`type`: String, from: Double, to: Double): Element = js.native
  def elt(`type`: String, from: Double, to: Double, children: js.Array[Element]): Element = js.native
  
  /* private */ var finish: Any = js.native
  
  /* private */ var fragments: Any = js.native
  
  /* private */ var line: Any = js.native
  
  /* private */ var lineChunkAt: Any = js.native
  
  var lineStart: Double = js.native
  
  /* private */ var moveRangeI: Any = js.native
  
  def nextLine(): Boolean = js.native
  
  def parentType(): NodeType = js.native
  def parentType(depth: Double): NodeType = js.native
  
  /* CompleteClass */
  override val parsedPos: Double = js.native
  @JSName("parsedPos")
  def parsedPos_MBlockContext: Double = js.native
  
  val parser: MarkdownParser = js.native
  
  def prevLineEnd(): Double = js.native
  
  /* private */ var reuseFragment: Any = js.native
  
  def startComposite(`type`: String, start: Double): Unit = js.native
  def startComposite(`type`: String, start: Double, value: Double): Unit = js.native
  
  /* CompleteClass */
  override def stopAt(pos: Double): Unit = js.native
  
  /* CompleteClass */
  override val stoppedAt: Double | Null = js.native
  
  /* private */ var to: Any = js.native
}
