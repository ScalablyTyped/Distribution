package typings.marked.markedMod

import typings.marked.markedStrings.blockquote_end
import typings.marked.markedStrings.blockquote_start
import typings.marked.markedStrings.center
import typings.marked.markedStrings.code
import typings.marked.markedStrings.heading
import typings.marked.markedStrings.hr
import typings.marked.markedStrings.html
import typings.marked.markedStrings.indented
import typings.marked.markedStrings.left
import typings.marked.markedStrings.list_end
import typings.marked.markedStrings.list_item_end
import typings.marked.markedStrings.list_item_start
import typings.marked.markedStrings.list_start
import typings.marked.markedStrings.loose_item_start
import typings.marked.markedStrings.paragraph
import typings.marked.markedStrings.right
import typings.marked.markedStrings.space
import typings.marked.markedStrings.table
import typings.marked.markedStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.marked.markedMod.Tokens.Space
  - typings.marked.markedMod.Tokens.Code
  - typings.marked.markedMod.Tokens.Heading
  - typings.marked.markedMod.Tokens.Table
  - typings.marked.markedMod.Tokens.Hr
  - typings.marked.markedMod.Tokens.BlockquoteStart
  - typings.marked.markedMod.Tokens.BlockquoteEnd
  - typings.marked.markedMod.Tokens.ListStart
  - typings.marked.markedMod.Tokens.LooseItemStart
  - typings.marked.markedMod.Tokens.ListItemStart
  - typings.marked.markedMod.Tokens.ListItemEnd
  - typings.marked.markedMod.Tokens.ListEnd
  - typings.marked.markedMod.Tokens.Paragraph
  - typings.marked.markedMod.Tokens.HTML
  - typings.marked.markedMod.Tokens.Text
*/
trait Token extends js.Object

object Token {
  @scala.inline
  def BlockquoteStart(`type`: blockquote_start): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Code(text: String, `type`: code, codeBlockStyle: indented = null, lang: String = null): Token = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (codeBlockStyle != null) __obj.updateDynamic("codeBlockStyle")(codeBlockStyle.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Paragraph(text: String, `type`: paragraph, pre: js.UndefOr[Boolean] = js.undefined): Token = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(pre)) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Space(`type`: space): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Hr(`type`: hr): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListItemStart(`type`: list_item_start): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Table(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    `type`: table
  ): Token = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Text(text: String, `type`: text): Token = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def Heading(depth: Double, text: String, `type`: heading): Token = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def LooseItemStart(`type`: loose_item_start): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def BlockquoteEnd(`type`: blockquote_end): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListStart(ordered: Boolean, `type`: list_start): Token = {
    val __obj = js.Dynamic.literal(ordered = ordered.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def HTML(pre: Boolean, text: String, `type`: html): Token = {
    val __obj = js.Dynamic.literal(pre = pre.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListItemEnd(`type`: list_item_end): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  def ListEnd(`type`: list_end): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

