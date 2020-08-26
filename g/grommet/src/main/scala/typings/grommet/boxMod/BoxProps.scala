package typings.grommet.boxMod

import typings.grommet.anon.Delay
import typings.grommet.anon.Grow
import typings.grommet.anon.Horizontal
import typings.grommet.anon.Max
import typings.grommet.anon.SizeStyle
import typings.grommet.grommetStrings.`column-reverse`
import typings.grommet.grommetStrings.`row-responsive`
import typings.grommet.grommetStrings.`row-reverse`
import typings.grommet.grommetStrings.around
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.baseline
import typings.grommet.grommetStrings.between
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.column
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.evenly
import typings.grommet.grommetStrings.fadeIn
import typings.grommet.grommetStrings.fadeOut
import typings.grommet.grommetStrings.grow
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.jiggle
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.pulse
import typings.grommet.grommetStrings.reverse
import typings.grommet.grommetStrings.rotateLeft
import typings.grommet.grommetStrings.rotateRight
import typings.grommet.grommetStrings.row
import typings.grommet.grommetStrings.scroll
import typings.grommet.grommetStrings.shrink
import typings.grommet.grommetStrings.slideDown
import typings.grommet.grommetStrings.slideLeft
import typings.grommet.grommetStrings.slideRight
import typings.grommet.grommetStrings.slideUp
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.visible
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.grommetStrings.zoomIn
import typings.grommet.grommetStrings.zoomOut
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignContentType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.BasisType
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.ElevationType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import typings.grommet.utilsMod.PolymorphicType
import typings.grommet.utilsMod.RoundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.native
  var alignContent: js.UndefOr[AlignContentType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var animation: js.UndefOr[
    fadeIn | fadeOut | jiggle | pulse | rotateLeft | rotateRight | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay | (js.Array[
      fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay
    ])
  ] = js.native
  var as: js.UndefOr[PolymorphicType] = js.native
  var background: js.UndefOr[BackgroundType] = js.native
  var basis: js.UndefOr[BasisType] = js.native
  var border: js.UndefOr[BorderType] = js.native
  var direction: js.UndefOr[row | column | `row-responsive` | `row-reverse` | `column-reverse`] = js.native
  var elevation: js.UndefOr[ElevationType] = js.native
  var fill: js.UndefOr[FillType] = js.native
  var flex: js.UndefOr[grow | shrink | Boolean | Grow] = js.native
  var focusIndicator: js.UndefOr[Boolean] = js.native
  var gap: js.UndefOr[GapType] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max] = js.native
  var hoverIndicator: js.UndefOr[BackgroundType | Boolean] = js.native
  var justify: js.UndefOr[around | between | center | end | evenly | start | stretch] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var overflow: js.UndefOr[auto | hidden | scroll | visible | Horizontal | String] = js.native
  var pad: js.UndefOr[PadType] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var round: js.UndefOr[RoundType] = js.native
  var tag: js.UndefOr[PolymorphicType] = js.native
  var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max] = js.native
  var wrap: js.UndefOr[Boolean | reverse] = js.native
}

object BoxProps {
  @scala.inline
  def apply(): BoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxProps]
  }
  @scala.inline
  implicit class BoxPropsOps[Self <: BoxProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: start | center | end | baseline | stretch): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlignContent(value: AlignContentType): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAnimationVarargs(
      value: (fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay)*
    ): Self = this.set("animation", js.Array(value :_*))
    @scala.inline
    def setAnimation(
      value: fadeIn | fadeOut | jiggle | pulse | rotateLeft | rotateRight | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay | (js.Array[
          fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay
        ])
    ): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAs(value: PolymorphicType): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setBackground(value: BackgroundType): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBasis(value: BasisType): Self = this.set("basis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasis: Self = this.set("basis", js.undefined)
    @scala.inline
    def setBorderVarargs(value: SizeStyle*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(value: BorderType): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setDirection(value: row | column | `row-responsive` | `row-reverse` | `column-reverse`): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setElevation(value: ElevationType): Self = this.set("elevation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    @scala.inline
    def setFill(value: FillType): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFlex(value: grow | shrink | Boolean | Grow): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    @scala.inline
    def setFocusIndicator(value: Boolean): Self = this.set("focusIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusIndicator: Self = this.set("focusIndicator", js.undefined)
    @scala.inline
    def setGap(value: GapType): Self = this.set("gap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setHeight(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHoverIndicator(value: BackgroundType | Boolean): Self = this.set("hoverIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverIndicator: Self = this.set("hoverIndicator", js.undefined)
    @scala.inline
    def setJustify(value: around | between | center | end | evenly | start | stretch): Self = this.set("justify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustify: Self = this.set("justify", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOverflow(value: auto | hidden | scroll | visible | Horizontal | String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setPad(value: PadType): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setRound(value: RoundType): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setTag(value: PolymorphicType): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setWidth(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrap(value: Boolean | reverse): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

