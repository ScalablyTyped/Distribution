package typings.ink.textMod

import typings.ink.inkStrings.`truncate-end`
import typings.ink.inkStrings.`truncate-middle`
import typings.ink.inkStrings.`truncate-start`
import typings.ink.inkStrings.end
import typings.ink.inkStrings.middle
import typings.ink.inkStrings.truncate
import typings.ink.inkStrings.wrap
import typings.react.mod.ReactNode
import typings.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Same as `color`, but for background.
    */
  val backgroundColor: js.UndefOr[
    LiteralUnion[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundColor */ _, 
      String
    ]
  ] = js.native
  /**
    * Make the text bold.
    */
  val bold: js.UndefOr[Boolean] = js.native
  val children: js.UndefOr[ReactNode] = js.native
  /**
    * Change text color. Ink uses chalk under the hood, so all its functionality is supported.
    */
  val color: js.UndefOr[
    LiteralUnion[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ _, 
      String
    ]
  ] = js.native
  /**
    * Dim the color (emit a small amount of light).
    */
  val dimColor: js.UndefOr[Boolean] = js.native
  /**
    * Make the text italic.
    */
  val italic: js.UndefOr[Boolean] = js.native
  /**
    * Make the text crossed with a line.
    */
  val strikethrough: js.UndefOr[Boolean] = js.native
  /**
    * Make the text underlined.
    */
  val underline: js.UndefOr[Boolean] = js.native
  /**
    * This property tells Ink to wrap or truncate text if its width is larger than container.
    * If `wrap` is passed (by default), Ink will wrap text and split it into multiple lines.
    * If `truncate-*` is passed, Ink will truncate text instead, which will result in one line of text with the rest cut off.
    */
  val wrap: js.UndefOr[
    typings.ink.inkStrings.wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
  ] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundColor */ _, 
          String
        ]
    ): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setColor(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ _, 
          String
        ]
    ): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDimColor(value: Boolean): Self = this.set("dimColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimColor: Self = this.set("dimColor", js.undefined)
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikethrough: Self = this.set("strikethrough", js.undefined)
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    @scala.inline
    def setWrap(value: wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

