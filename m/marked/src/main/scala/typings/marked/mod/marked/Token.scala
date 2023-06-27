package typings.marked.mod.marked

import typings.marked.markedStrings._empty
import typings.marked.markedStrings.center
import typings.marked.markedStrings.html
import typings.marked.markedStrings.left
import typings.marked.markedStrings.right
import typings.marked.markedStrings.text
import typings.marked.mod.marked.Tokens.ListItem
import typings.marked.mod.marked.Tokens.TableCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.marked.mod.marked.Tokens.Space
  - typings.marked.mod.marked.Tokens.Code
  - typings.marked.mod.marked.Tokens.Heading
  - typings.marked.mod.marked.Tokens.Table
  - typings.marked.mod.marked.Tokens.Hr
  - typings.marked.mod.marked.Tokens.Blockquote
  - typings.marked.mod.marked.Tokens.List
  - typings.marked.mod.marked.Tokens.ListItem
  - typings.marked.mod.marked.Tokens.Paragraph
  - typings.marked.mod.marked.Tokens.HTML
  - typings.marked.mod.marked.Tokens.Text
  - typings.marked.mod.marked.Tokens.Def
  - typings.marked.mod.marked.Tokens.Escape
  - typings.marked.mod.marked.Tokens.Tag
  - typings.marked.mod.marked.Tokens.Image
  - typings.marked.mod.marked.Tokens.Link
  - typings.marked.mod.marked.Tokens.Strong
  - typings.marked.mod.marked.Tokens.Em
  - typings.marked.mod.marked.Tokens.Codespan
  - typings.marked.mod.marked.Tokens.Br
  - typings.marked.mod.marked.Tokens.Del
*/
trait Token extends StObject
object Token {
  
  inline def Blockquote(raw: String, text: String, tokens: js.Array[Token]): typings.marked.mod.marked.Tokens.Blockquote = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Blockquote]
  }
  
  inline def Br(raw: String): typings.marked.mod.marked.Tokens.Br = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("br")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Br]
  }
  
  inline def Code(raw: String, text: String): typings.marked.mod.marked.Tokens.Code = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Code]
  }
  
  inline def Codespan(raw: String, text: String): typings.marked.mod.marked.Tokens.Codespan = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("codespan")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Codespan]
  }
  
  inline def Def(href: String, raw: String, tag: String, title: String): typings.marked.mod.marked.Tokens.Def = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("def")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Def]
  }
  
  inline def Del(raw: String, text: String, tokens: js.Array[Token]): typings.marked.mod.marked.Tokens.Del = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("del")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Del]
  }
  
  inline def Em(raw: String, text: String, tokens: js.Array[Token]): typings.marked.mod.marked.Tokens.Em = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Em]
  }
  
  inline def Escape(raw: String, text: String): typings.marked.mod.marked.Tokens.Escape = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("escape")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Escape]
  }
  
  inline def HTML(pre: Boolean, raw: String, text: String): typings.marked.mod.marked.Tokens.HTML = {
    val __obj = js.Dynamic.literal(block = true, pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("html")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.HTML]
  }
  
  inline def Heading(depth: Double, raw: String, text: String, tokens: js.Array[Token]): typings.marked.mod.marked.Tokens.Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Heading]
  }
  
  inline def Hr(raw: String): typings.marked.mod.marked.Tokens.Hr = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hr")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Hr]
  }
  
  inline def Image(href: String, raw: String, text: String, title: String): typings.marked.mod.marked.Tokens.Image = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Image]
  }
  
  inline def Link(href: String, raw: String, text: String, title: String, tokens: js.Array[Token]): typings.marked.mod.marked.Tokens.Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Link]
  }
  
  inline def List(items: js.Array[ListItem], loose: Boolean, ordered: Boolean, raw: String, start: Double | _empty): typings.marked.mod.marked.Tokens.List = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.List]
  }
  
  inline def ListItem(loose: Boolean, raw: String, task: Boolean, text: String, tokens: js.Array[Token]): typings.marked.mod.marked.Tokens.ListItem = {
    val __obj = js.Dynamic.literal(loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_item")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.ListItem]
  }
  
  inline def Paragraph(raw: String, text: String, tokens: js.Array[Token]): typings.marked.mod.marked.Tokens.Paragraph = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("paragraph")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Paragraph]
  }
  
  inline def Space(raw: String): typings.marked.mod.marked.Tokens.Space = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("space")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Space]
  }
  
  inline def Strong(raw: String, text: String, tokens: js.Array[Token]): typings.marked.mod.marked.Tokens.Strong = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strong")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Strong]
  }
  
  inline def Table(
    align: js.Array[center | left | right | Null],
    header: js.Array[TableCell],
    raw: String,
    rows: js.Array[js.Array[TableCell]]
  ): typings.marked.mod.marked.Tokens.Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Table]
  }
  
  inline def Tag(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): typings.marked.mod.marked.Tokens.Tag = {
    val __obj = js.Dynamic.literal(block = false, inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Tag]
  }
  
  inline def Text(raw: String, text: String): typings.marked.mod.marked.Tokens.Text = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typings.marked.mod.marked.Tokens.Text]
  }
}
