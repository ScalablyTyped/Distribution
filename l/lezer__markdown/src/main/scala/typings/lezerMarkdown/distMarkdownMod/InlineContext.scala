package typings.lezerMarkdown.distMarkdownMod

import typings.lezerCommon.mod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lezer/markdown/dist/markdown", "InlineContext")
@js.native
open class InlineContext () extends StObject {
  
  def addDelimiter(`type`: DelimiterType, from: Double, to: Double, open: Boolean, close: Boolean): Double = js.native
  
  def addElement(elt: Element): Double = js.native
  
  def char(pos: Double): Double = js.native
  
  def elt(tree: Tree, at: Double): Element = js.native
  def elt(`type`: String, from: Double, to: Double): Element = js.native
  def elt(`type`: String, from: Double, to: Double, children: js.Array[Element]): Element = js.native
  
  def end: Double = js.native
  
  def findOpeningDelimiter(`type`: DelimiterType): Double = js.native
  
  val offset: Double = js.native
  
  val parser: MarkdownParser = js.native
  
  def skipSpace(from: Double): Double = js.native
  
  def slice(from: Double, to: Double): String = js.native
  
  def takeContent(startIndex: Double): js.Array[Any] = js.native
  
  val text: String = js.native
}
