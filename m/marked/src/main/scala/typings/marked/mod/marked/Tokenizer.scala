package typings.marked.mod.marked

import typings.marked.mod.marked.Tokens.Blockquote
import typings.marked.mod.marked.Tokens.Br
import typings.marked.mod.marked.Tokens.Code
import typings.marked.mod.marked.Tokens.Codespan
import typings.marked.mod.marked.Tokens.Def
import typings.marked.mod.marked.Tokens.Del
import typings.marked.mod.marked.Tokens.Em
import typings.marked.mod.marked.Tokens.Escape
import typings.marked.mod.marked.Tokens.HTML
import typings.marked.mod.marked.Tokens.Heading
import typings.marked.mod.marked.Tokens.Hr
import typings.marked.mod.marked.Tokens.Image
import typings.marked.mod.marked.Tokens.Link
import typings.marked.mod.marked.Tokens.Paragraph
import typings.marked.mod.marked.Tokens.Space
import typings.marked.mod.marked.Tokens.Strong
import typings.marked.mod.marked.Tokens.Table
import typings.marked.mod.marked.Tokens.Tag
import typings.marked.mod.marked.Tokens.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "marked.Tokenizer")
@js.native
open class Tokenizer[T] () extends StObject {
  def this(options: MarkedOptions) = this()
  
  def autolink(src: String, mangle: js.Function1[/* cap */ String, String]): Link | T = js.native
  
  def blockquote(src: String): Blockquote | T = js.native
  
  def br(src: String): Br | T = js.native
  
  def code(src: String): Code | T = js.native
  
  def codespan(src: String): Codespan | T = js.native
  
  def `def`(src: String): Def | T = js.native
  
  def del(src: String): Del | T = js.native
  
  def emStrong(src: String, maskedSrc: String, prevChar: String): Em | Strong | T = js.native
  
  def escape(src: String): Escape | T = js.native
  
  def fences(src: String): Code | T = js.native
  
  def heading(src: String): Heading | T = js.native
  
  def hr(src: String): Hr | T = js.native
  
  def html(src: String): HTML | T = js.native
  
  def inlineText(src: String, smartypants: js.Function1[/* cap */ String, String]): Text | T = js.native
  
  def lheading(src: String): Heading | T = js.native
  
  def link(src: String): Image | Link | T = js.native
  
  def list(src: String): typings.marked.mod.marked.Tokens.List | T = js.native
  
  var options: MarkedOptions = js.native
  
  def paragraph(src: String): Paragraph | T = js.native
  
  def reflink(src: String, links: js.Array[Image | Link]): Link | Image | Text | T = js.native
  
  def space(src: String): Space | T = js.native
  
  def table(src: String): Table | T = js.native
  
  def tag(src: String): Tag | T = js.native
  
  def text(src: String): Text | T = js.native
  
  def url(src: String, mangle: js.Function1[/* cap */ String, String]): Link | T = js.native
}
