package typings.marked.mod

import typings.marked.markedStrings.center
import typings.marked.markedStrings.html
import typings.marked.markedStrings.left
import typings.marked.markedStrings.right
import typings.marked.markedStrings.text
import typings.marked.mod.Tokens.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.marked.mod.Tokens.Space
  - typings.marked.mod.Tokens.Code
  - typings.marked.mod.Tokens.Heading
  - typings.marked.mod.Tokens.Table
  - typings.marked.mod.Tokens.Hr
  - typings.marked.mod.Tokens.Blockquote
  - typings.marked.mod.Tokens.BlockquoteStart
  - typings.marked.mod.Tokens.BlockquoteEnd
  - typings.marked.mod.Tokens.List
  - typings.marked.mod.Tokens.ListItem
  - typings.marked.mod.Tokens.Paragraph
  - typings.marked.mod.Tokens.HTML
  - typings.marked.mod.Tokens.Text
  - typings.marked.mod.Tokens.Def
  - typings.marked.mod.Tokens.Escape
  - typings.marked.mod.Tokens.Tag
  - typings.marked.mod.Tokens.Image
  - typings.marked.mod.Tokens.Link
  - typings.marked.mod.Tokens.Strong
  - typings.marked.mod.Tokens.Em
  - typings.marked.mod.Tokens.Codespan
  - typings.marked.mod.Tokens.Br
  - typings.marked.mod.Tokens.Del
*/
trait Token extends StObject
object Token {
  
  inline def Blockquote(raw: String, text: String): typings.marked.mod.Tokens.Blockquote = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Blockquote]
  }
  
  inline def BlockquoteEnd(raw: String): typings.marked.mod.Tokens.BlockquoteEnd = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote_end")
    __obj.asInstanceOf[typings.marked.mod.Tokens.BlockquoteEnd]
  }
  
  inline def BlockquoteStart(raw: String): typings.marked.mod.Tokens.BlockquoteStart = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blockquote_start")
    __obj.asInstanceOf[typings.marked.mod.Tokens.BlockquoteStart]
  }
  
  inline def Br(raw: String): typings.marked.mod.Tokens.Br = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("br")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Br]
  }
  
  inline def Code(raw: String, text: String): typings.marked.mod.Tokens.Code = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Code]
  }
  
  inline def Codespan(raw: String, text: String): typings.marked.mod.Tokens.Codespan = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("codespan")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Codespan]
  }
  
  inline def Def(href: String, raw: String, title: String): typings.marked.mod.Tokens.Def = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Def]
  }
  
  inline def Del(raw: String, text: String): typings.marked.mod.Tokens.Del = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("del")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Del]
  }
  
  inline def Em(raw: String, text: String): typings.marked.mod.Tokens.Em = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Em]
  }
  
  inline def Escape(raw: String, text: String): typings.marked.mod.Tokens.Escape = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("escape")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Escape]
  }
  
  inline def HTML(pre: Boolean, raw: String, text: String): typings.marked.mod.Tokens.HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("html")
    __obj.asInstanceOf[typings.marked.mod.Tokens.HTML]
  }
  
  inline def Heading(depth: Double, raw: String, text: String): typings.marked.mod.Tokens.Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Heading]
  }
  
  inline def Hr(raw: String): typings.marked.mod.Tokens.Hr = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hr")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Hr]
  }
  
  inline def Image(href: String, raw: String, text: String, title: String): typings.marked.mod.Tokens.Image = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Image]
  }
  
  inline def Link(href: String, raw: String, text: String, title: String): typings.marked.mod.Tokens.Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("link")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Link]
  }
  
  inline def List(items: js.Array[ListItem], loose: Boolean, ordered: Boolean, raw: String, start: Boolean): typings.marked.mod.Tokens.List = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_start")
    __obj.asInstanceOf[typings.marked.mod.Tokens.List]
  }
  
  inline def ListItem(checked: Boolean, loose: Boolean, raw: String, task: Boolean, text: String): typings.marked.mod.Tokens.ListItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_item")
    __obj.asInstanceOf[typings.marked.mod.Tokens.ListItem]
  }
  
  inline def Paragraph(raw: String, text: String): typings.marked.mod.Tokens.Paragraph = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("paragraph")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Paragraph]
  }
  
  inline def Space(raw: String): typings.marked.mod.Tokens.Space = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("space")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Space]
  }
  
  inline def Strong(raw: String, text: String): typings.marked.mod.Tokens.Strong = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("strong")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Strong]
  }
  
  inline def Table(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    raw: String
  ): typings.marked.mod.Tokens.Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("table")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Table]
  }
  
  inline def Tag(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): typings.marked.mod.Tokens.Tag = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Tag]
  }
  
  inline def Text(raw: String, text: String): typings.marked.mod.Tokens.Text = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typings.marked.mod.Tokens.Text]
  }
}
