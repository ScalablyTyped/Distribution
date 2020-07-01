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
import typings.marked.markedStrings.indented
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
import typings.marked.mod.Tokens.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Token extends js.Object

object Token {
  @scala.inline
  def Escape(raw: String, text: String, `type`: escape): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Def(href: String, raw: String, title: String): Token = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Image(href: String, raw: String, text: String, title: String, `type`: image): Token = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Blockquote(raw: String, text: String, `type`: blockquote): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Text(raw: String, text: String, `type`: text): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Strong(raw: String, text: String, `type`: strong): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Hr(raw: String, `type`: hr): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Del(raw: String, text: String, `type`: del): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def List(
    items: js.Array[ListItem],
    loose: Boolean,
    ordered: Boolean,
    raw: String,
    start: Boolean,
    `type`: list_start
  ): Token = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def BlockquoteStart(raw: String, `type`: blockquote_start): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Codespan(raw: String, text: String, `type`: codespan): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListItem(checked: Boolean, loose: Boolean, raw: String, task: Boolean, text: String, `type`: list_item): Token = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Space(raw: String, `type`: space): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Br(raw: String, `type`: br): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Em(raw: String, text: String, `type`: em): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Link(
    href: String,
    raw: String,
    text: String,
    title: String,
    `type`: link,
    tokens: js.Array[Text] = null
  ): Token = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Tag(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): Token = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Code(raw: String, text: String, `type`: code, codeBlockStyle: indented = null, lang: String = null): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (codeBlockStyle != null) __obj.updateDynamic("codeBlockStyle")(codeBlockStyle.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def BlockquoteEnd(raw: String, `type`: blockquote_end): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Table(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    raw: String,
    `type`: table
  ): Token = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Paragraph(raw: String, text: String, `type`: paragraph, pre: js.UndefOr[Boolean] = js.undefined): Token = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Heading(depth: Double, raw: String, text: String, `type`: heading): Token = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def HTML(pre: Boolean, raw: String, text: String, `type`: html): Token = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

