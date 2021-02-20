package typings.marked.mod

import typings.marked.mod.Tokens.Blockquote
import typings.marked.mod.Tokens.Br
import typings.marked.mod.Tokens.Code
import typings.marked.mod.Tokens.Codespan
import typings.marked.mod.Tokens.Def
import typings.marked.mod.Tokens.Del
import typings.marked.mod.Tokens.Em
import typings.marked.mod.Tokens.Escape
import typings.marked.mod.Tokens.HTML
import typings.marked.mod.Tokens.Heading
import typings.marked.mod.Tokens.Hr
import typings.marked.mod.Tokens.Image
import typings.marked.mod.Tokens.Link
import typings.marked.mod.Tokens.List
import typings.marked.mod.Tokens.Paragraph
import typings.marked.mod.Tokens.Space
import typings.marked.mod.Tokens.Strong
import typings.marked.mod.Tokens.Table
import typings.marked.mod.Tokens.Tag
import typings.marked.mod.Tokens.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "Tokenizer")
@js.native
class Tokenizer () extends StObject {
  def this(options: MarkedOptions) = this()
  
  def autolink(src: String, mangle: js.Function1[/* cap */ String, String]): Link = js.native
  
  def blockquote(src: String): Blockquote = js.native
  
  def br(src: String): Br = js.native
  
  def code(src: String, token: Token): Code = js.native
  
  def codespan(src: String): Codespan = js.native
  
  def `def`(src: String): Def = js.native
  
  def del(src: String): Del = js.native
  
  def em(src: String): Em = js.native
  
  def escape(src: String): Escape = js.native
  
  def fences(src: String): Code = js.native
  
  def heading(src: String): Heading = js.native
  
  def hr(src: String): Hr = js.native
  
  def html(src: String): HTML = js.native
  
  def inlineText(src: String, inRawBlock: Boolean, smartypants: js.Function1[/* cap */ String, String]): Text = js.native
  
  def lheading(src: String): Heading = js.native
  
  def link(src: String): Image | Link = js.native
  
  def list(src: String): List = js.native
  
  def nptable(src: String): Table = js.native
  
  var options: MarkedOptions = js.native
  
  def paragraph(src: String): Paragraph = js.native
  
  def reflink(src: String, links: js.Array[Image | Link]): Link | Image | Text = js.native
  
  def space(src: String): Space = js.native
  
  def strong(src: String): Strong = js.native
  
  def table(src: String): Table = js.native
  
  def tag(src: String, inLink: Boolean, inRawBlock: Boolean): Tag = js.native
  
  def text(src: String): Text = js.native
  
  def url(src: String, mangle: js.Function1[/* cap */ String, String]): Link = js.native
}
