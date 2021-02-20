package typings.marked.mod

import typings.marked.markedStrings.blockquote
import typings.marked.markedStrings.blockquote_end
import typings.marked.markedStrings.blockquote_start
import typings.marked.markedStrings.br
import typings.marked.markedStrings.center
import typings.marked.markedStrings.code
import typings.marked.markedStrings.codespan
import typings.marked.markedStrings.del
import typings.marked.markedStrings.em
import typings.marked.markedStrings.escape
import typings.marked.markedStrings.heading
import typings.marked.markedStrings.hr
import typings.marked.markedStrings.html
import typings.marked.markedStrings.image
import typings.marked.markedStrings.left
import typings.marked.markedStrings.link
import typings.marked.markedStrings.list_item
import typings.marked.markedStrings.list_start
import typings.marked.markedStrings.paragraph
import typings.marked.markedStrings.right
import typings.marked.markedStrings.space
import typings.marked.markedStrings.strong
import typings.marked.markedStrings.table
import typings.marked.markedStrings.text
import typings.marked.mod.Tokens.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def Blockquote(raw: String, text: String, `type`: blockquote): typings.marked.mod.Tokens.Blockquote = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Blockquote]
  }
  
  @scala.inline
  def BlockquoteEnd(raw: String, `type`: blockquote_end): typings.marked.mod.Tokens.BlockquoteEnd = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.BlockquoteEnd]
  }
  
  @scala.inline
  def BlockquoteStart(raw: String, `type`: blockquote_start): typings.marked.mod.Tokens.BlockquoteStart = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.BlockquoteStart]
  }
  
  @scala.inline
  def Br(raw: String, `type`: br): typings.marked.mod.Tokens.Br = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Br]
  }
  
  @scala.inline
  def Code(raw: String, text: String, `type`: code): typings.marked.mod.Tokens.Code = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Code]
  }
  
  @scala.inline
  def Codespan(raw: String, text: String, `type`: codespan): typings.marked.mod.Tokens.Codespan = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Codespan]
  }
  
  @scala.inline
  def Def(href: String, raw: String, title: String): typings.marked.mod.Tokens.Def = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Def]
  }
  
  @scala.inline
  def Del(raw: String, text: String, `type`: del): typings.marked.mod.Tokens.Del = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Del]
  }
  
  @scala.inline
  def Em(raw: String, text: String, `type`: em): typings.marked.mod.Tokens.Em = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Em]
  }
  
  @scala.inline
  def Escape(raw: String, text: String, `type`: escape): typings.marked.mod.Tokens.Escape = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Escape]
  }
  
  @scala.inline
  def HTML(pre: Boolean, raw: String, text: String, `type`: html): typings.marked.mod.Tokens.HTML = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.HTML]
  }
  
  @scala.inline
  def Heading(depth: Double, raw: String, text: String, `type`: heading): typings.marked.mod.Tokens.Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Heading]
  }
  
  @scala.inline
  def Hr(raw: String, `type`: hr): typings.marked.mod.Tokens.Hr = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Hr]
  }
  
  @scala.inline
  def Image(href: String, raw: String, text: String, title: String, `type`: image): typings.marked.mod.Tokens.Image = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Image]
  }
  
  @scala.inline
  def Link(href: String, raw: String, text: String, title: String, `type`: link): typings.marked.mod.Tokens.Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Link]
  }
  
  @scala.inline
  def List(
    items: js.Array[ListItem],
    loose: Boolean,
    ordered: Boolean,
    raw: String,
    start: Boolean,
    `type`: list_start
  ): typings.marked.mod.Tokens.List = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.List]
  }
  
  @scala.inline
  def ListItem(checked: Boolean, loose: Boolean, raw: String, task: Boolean, text: String, `type`: list_item): typings.marked.mod.Tokens.ListItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.ListItem]
  }
  
  @scala.inline
  def Paragraph(raw: String, text: String, `type`: paragraph): typings.marked.mod.Tokens.Paragraph = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Paragraph]
  }
  
  @scala.inline
  def Space(raw: String, `type`: space): typings.marked.mod.Tokens.Space = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Space]
  }
  
  @scala.inline
  def Strong(raw: String, text: String, `type`: strong): typings.marked.mod.Tokens.Strong = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Strong]
  }
  
  @scala.inline
  def Table(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    raw: String,
    `type`: table
  ): typings.marked.mod.Tokens.Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Table]
  }
  
  @scala.inline
  def Tag(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): typings.marked.mod.Tokens.Tag = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Tag]
  }
  
  @scala.inline
  def Text(raw: String, text: String, `type`: text): typings.marked.mod.Tokens.Text = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.marked.mod.Tokens.Text]
  }
}
