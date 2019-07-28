package typings.grommet.componentsBoxMod

import typings.grommet.Anon_All
import typings.grommet.Anon_Auto
import typings.grommet.Anon_Bottom
import typings.grommet.Anon_BottomBottomleft
import typings.grommet.Anon_Color
import typings.grommet.Anon_Delay
import typings.grommet.Anon_Grow
import typings.grommet.grommetStrings.`1/2`
import typings.grommet.grommetStrings.`1/3`
import typings.grommet.grommetStrings.`1/4`
import typings.grommet.grommetStrings.`2/3`
import typings.grommet.grommetStrings.`2/4`
import typings.grommet.grommetStrings.`3/4`
import typings.grommet.grommetStrings.`column-reverse`
import typings.grommet.grommetStrings.`row-responsive`
import typings.grommet.grommetStrings.`row-reverse`
import typings.grommet.grommetStrings.all
import typings.grommet.grommetStrings.around
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.baseline
import typings.grommet.grommetStrings.between
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.column
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.evenly
import typings.grommet.grommetStrings.fadeIn
import typings.grommet.grommetStrings.fadeOut
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.grow
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.jiggle
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.pulse
import typings.grommet.grommetStrings.reverse
import typings.grommet.grommetStrings.right
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
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.visible
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.grommetStrings.zoomIn
import typings.grommet.grommetStrings.zoomOut
import typings.grommet.utilsMod.PolymorphicType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps extends js.Object {
  var a11yTitle: js.UndefOr[String] = js.undefined
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var alignContent: js.UndefOr[start | center | end | between | around | stretch] = js.undefined
  var alignSelf: js.UndefOr[start | center | end | stretch] = js.undefined
  var animation: js.UndefOr[
    fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Anon_Delay | (js.Array[
      fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Anon_Delay
    ])
  ] = js.undefined
  var as: js.UndefOr[PolymorphicType] = js.undefined
  var background: js.UndefOr[String | Anon_Color] = js.undefined
  var basis: js.UndefOr[
    xxsmall | xsmall | small | medium | large | xlarge | xxlarge | full | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | auto | String
  ] = js.undefined
  var border: js.UndefOr[Boolean | top | left | bottom | right | horizontal | vertical | all | Anon_All] = js.undefined
  var direction: js.UndefOr[row | column | `row-responsive` | `row-reverse` | `column-reverse`] = js.undefined
  var elevation: js.UndefOr[none | xsmall | small | medium | large | xlarge | String] = js.undefined
  var fill: js.UndefOr[horizontal | vertical | Boolean] = js.undefined
  var flex: js.UndefOr[grow | shrink | Boolean | Anon_Grow] = js.undefined
  var gap: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var gridArea: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
  var justify: js.UndefOr[start | center | between | around | evenly | end] = js.undefined
  var margin: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var overflow: js.UndefOr[auto | hidden | scroll | visible | Anon_Auto | String] = js.undefined
  var pad: js.UndefOr[none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var round: js.UndefOr[
    Boolean | xsmall | small | medium | large | xlarge | full | String | Anon_BottomBottomleft
  ] = js.undefined
  var tag: js.UndefOr[PolymorphicType] = js.undefined
  var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
  var wrap: js.UndefOr[Boolean | reverse] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    a11yTitle: String = null,
    align: start | center | end | baseline | stretch = null,
    alignContent: start | center | end | between | around | stretch = null,
    alignSelf: start | center | end | stretch = null,
    animation: fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Anon_Delay | (js.Array[
      fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Anon_Delay
    ]) = null,
    as: PolymorphicType = null,
    background: String | Anon_Color = null,
    basis: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | full | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | auto | String = null,
    border: Boolean | top | left | bottom | right | horizontal | vertical | all | Anon_All = null,
    direction: row | column | `row-responsive` | `row-reverse` | `column-reverse` = null,
    elevation: none | xsmall | small | medium | large | xlarge | String = null,
    fill: horizontal | vertical | Boolean = null,
    flex: grow | shrink | Boolean | Anon_Grow = null,
    gap: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    gridArea: String = null,
    height: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String = null,
    justify: start | center | between | around | evenly | end = null,
    margin: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    overflow: auto | hidden | scroll | visible | Anon_Auto | String = null,
    pad: none | xxsmall | xsmall | small | medium | large | xlarge | Anon_Bottom | String = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    round: Boolean | xsmall | small | medium | large | xlarge | full | String | Anon_BottomBottomleft = null,
    tag: PolymorphicType = null,
    width: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String = null,
    wrap: Boolean | reverse = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle)
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
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

