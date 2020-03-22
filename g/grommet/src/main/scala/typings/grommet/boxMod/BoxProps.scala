package typings.grommet.boxMod

import typings.grommet.AnonDelay
import typings.grommet.AnonGrow
import typings.grommet.AnonHorizontal
import typings.grommet.AnonMax
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

trait BoxProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var alignContent: js.UndefOr[AlignContentType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var animation: js.UndefOr[
    fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay | (js.Array[
      fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay
    ])
  ] = js.undefined
  var as: js.UndefOr[PolymorphicType] = js.undefined
  var background: js.UndefOr[BackgroundType] = js.undefined
  var basis: js.UndefOr[BasisType] = js.undefined
  var border: js.UndefOr[BorderType] = js.undefined
  var direction: js.UndefOr[row | column | `row-responsive` | `row-reverse` | `column-reverse`] = js.undefined
  var elevation: js.UndefOr[ElevationType] = js.undefined
  var fill: js.UndefOr[FillType] = js.undefined
  var flex: js.UndefOr[grow | shrink | Boolean | AnonGrow] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var gap: js.UndefOr[GapType] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax] = js.undefined
  var hoverIndicator: js.UndefOr[BackgroundType | Boolean] = js.undefined
  var justify: js.UndefOr[around | between | center | end | evenly | start | stretch] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var overflow: js.UndefOr[auto | hidden | scroll | visible | AnonHorizontal | String] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var round: js.UndefOr[RoundType] = js.undefined
  var tag: js.UndefOr[PolymorphicType] = js.undefined
  var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax] = js.undefined
  var wrap: js.UndefOr[Boolean | reverse] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    align: start | center | end | baseline | stretch = null,
    alignContent: AlignContentType = null,
    alignSelf: AlignSelfType = null,
    animation: fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay | (js.Array[
      fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | AnonDelay
    ]) = null,
    as: PolymorphicType = null,
    background: BackgroundType = null,
    basis: BasisType = null,
    border: BorderType = null,
    direction: row | column | `row-responsive` | `row-reverse` | `column-reverse` = null,
    elevation: ElevationType = null,
    fill: FillType = null,
    flex: grow | shrink | Boolean | AnonGrow = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    gap: GapType = null,
    gridArea: GridAreaType = null,
    height: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax = null,
    hoverIndicator: BackgroundType | Boolean = null,
    justify: around | between | center | end | evenly | start | stretch = null,
    margin: MarginType = null,
    onClick: /* repeated */ js.Any => _ = null,
    overflow: auto | hidden | scroll | visible | AnonHorizontal | String = null,
    pad: PadType = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    round: RoundType = null,
    tag: PolymorphicType = null,
    width: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | AnonMax = null,
    wrap: Boolean | reverse = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverIndicator != null) __obj.updateDynamic("hoverIndicator")(hoverIndicator.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

