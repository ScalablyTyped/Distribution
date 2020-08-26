package typings.grommet.textMod

import typings.grommet.grommetStrings.`break-all`
import typings.grommet.grommetStrings.`break-word`
import typings.grommet.grommetStrings.`keep-all`
import typings.grommet.grommetStrings.bold
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.normal
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PolymorphicType
import typings.grommet.utilsMod.TextAlignType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var as: js.UndefOr[PolymorphicType] = js.native
  var color: js.UndefOr[ColorType] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | xxlarge | String] = js.native
  var tag: js.UndefOr[PolymorphicType] = js.native
  var textAlign: js.UndefOr[TextAlignType] = js.native
  var truncate: js.UndefOr[Boolean] = js.native
  var weight: js.UndefOr[normal | bold | Double] = js.native
  var wordBreak: js.UndefOr[normal | `break-all` | `keep-all` | `break-word`] = js.native
}

object TextProps {
  @scala.inline
  def apply(): TextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProps]
  }
  @scala.inline
  implicit class TextPropsOps[Self <: TextProps] (val x: Self) extends AnyVal {
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
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAs(value: PolymorphicType): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setSize(value: xsmall | small | medium | large | xlarge | xxlarge | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTag(value: PolymorphicType): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTextAlign(value: TextAlignType): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTruncate(value: Boolean): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    @scala.inline
    def setWeight(value: normal | bold | Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    @scala.inline
    def setWordBreak(value: normal | `break-all` | `keep-all` | `break-word`): Self = this.set("wordBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordBreak: Self = this.set("wordBreak", js.undefined)
  }
  
}

