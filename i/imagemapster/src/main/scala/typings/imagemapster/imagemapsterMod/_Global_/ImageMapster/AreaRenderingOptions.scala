package typings.imagemapster.imagemapsterMod._Global_.ImageMapster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaRenderingOptions extends RenderingOptions {
  /**
    * when rendering an area or area group, also render the areas in the
    * other group (or groups) specified
    *
    * This is an area-specific option that allows you to create
    * supergroups. A supergroup is a collection of groups that will all be
    * highlighted simultaneously, but only when the area that defines the
    * supergroup is moused over or activated through code.
    *
    * When the area for which this option has been set is activated, all
    * the areas specified in the includeKeys list will also be rendered.
    * This is a one-way relationship. Defining a supergroup in an area
    * causes all the other groups to be highlighted, but not the other way
    * around.
    *
    * A typical use of this is to define areas that you want to be
    * highlighted when the mouse enters some specific area, but that you
    * do not want to be highlighted on their own if the target area is
    * moused over. This could be a hidden menu, for example: you want the
    * menu to display when the hotspot is moused over, but when it's
    * hidden, mousing over the menu area itself should have no effect.
    */
  var includeKeys: js.UndefOr[String] = js.undefined
  /**
    * the area is a mask rather than a highlighted area.
    *
    * Normally, every area in an imagemap is an active area, and would be
    * highlighted when moused over (unless its behavior was otherwise
    * specified with staticState). The isMask option allows you to
    * identify an area as being a mask. When a mask is part of an area
    * group, the masked area will be specifically excluded from the
    * rendering of a highlight or selected state.
    *
    * This is usually used in conjunction, or instead of, the nohref
    * attribute of the area tag. When nohref is specified on an area tag,
    * that area is specifically excluded from the hotspot of any area that
    * encompasses it. It will not respond to mouse events, and will not be
    * highlighted. This can be used to create "holes" in hotspots. By
    * default, ImageMapster will treat any area with nohref or no href tag
    * as masks, the same as if this option had been applied.
    *
    * Sometimes you won't be able to use nohref to identify something as a
    * mask, for example, if you intend to re-use an area has both a mask,
    * and an independent hotspot. This would be typical if you wanted to a
    * selectable area that was completely included within another
    * selectable area, but functioned independently, such as concentric
    * circles. In this case, you would need to identify the inner circle
    * as both a mask, and a hotspot. The nohref attribute would make it
    * not act as a hotspot, and only function as a mask. You couldn't also
    * select the inner area. You can solve this problem by including the
    * inner circle in two different groups - one group which is a mask for
    * the main area, and another which is an independent selectable area.
    * You can specify different options for each group, so even though
    * it's just one area, it can function as two completely independent
    * ones.
    *
    * There may also be situations where you do not want an area marked
    * with nohref to be treated as a mask. For example, given "area1" and
    * "area2," you may want to create a configuration where mousing over
    * "area1" causes both "area1" and "area2" to be highlighted, but
    * "area2" should not be highlighted on its own when it is moused over.
    * In this situation, you'll need to use "nohref" to prevent the hover
    * behavior for the area, but you still want it to be treated normally
    * when it's rendered as a result of mousing over "area1." You can
    * accomplish this using the noHrefIsMask global option, below.
    *
    * Generally, masked areas will appear as a window to the underlying
    * image. If stroke is in effect, the stroke will be rendered for the
    * mask as well as the areas, to create both inner and outer borders.
    * You can always specifically enable or disable this, or any other
    * effect, for any area as desired.
    *
    */
  var isMask: js.UndefOr[Boolean] = js.undefined
  var key: String
  /**
    * tool tip data for an area
    *
    * When this area-specific option is present and showToolTips = true, a
    * toolTipContainer will be created this will be inserted into it,
    * either as inner text (if only text as passed) or as HTML if a jQuery
    * object is passed. In order to pass anything other than plain text
    * using this option you must use a jQuery object. Any string will be
    * treated as plain text (and special characters rendered correctly).
    */
  var toolTip: js.UndefOr[String] = js.undefined
}

object AreaRenderingOptions {
  @scala.inline
  def apply(
    key: String,
    altImage: String = null,
    altImageFill: js.UndefOr[Boolean] = js.undefined,
    altImageOpacity: Int | Double = null,
    altImageStroke: js.UndefOr[Boolean] = js.undefined,
    fade: js.UndefOr[Boolean] = js.undefined,
    fadeDuration: Int | Double = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillColorMask: String = null,
    fillOpacity: Int | Double = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    includeKeys: String = null,
    isDeselectable: js.UndefOr[Boolean] = js.undefined,
    isMask: js.UndefOr[Boolean] = js.undefined,
    isSelectable: js.UndefOr[Boolean] = js.undefined,
    render_highlight: String | RenderingOptions = null,
    render_select: String | RenderingOptions = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    singleSelect: js.UndefOr[Boolean] = js.undefined,
    staticState: js.UndefOr[Boolean] = js.undefined,
    stroke: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    toolTip: String = null
  ): AreaRenderingOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (altImage != null) __obj.updateDynamic("altImage")(altImage)
    if (!js.isUndefined(altImageFill)) __obj.updateDynamic("altImageFill")(altImageFill)
    if (altImageOpacity != null) __obj.updateDynamic("altImageOpacity")(altImageOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(altImageStroke)) __obj.updateDynamic("altImageStroke")(altImageStroke)
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (fadeDuration != null) __obj.updateDynamic("fadeDuration")(fadeDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillColorMask != null) __obj.updateDynamic("fillColorMask")(fillColorMask)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (includeKeys != null) __obj.updateDynamic("includeKeys")(includeKeys)
    if (!js.isUndefined(isDeselectable)) __obj.updateDynamic("isDeselectable")(isDeselectable)
    if (!js.isUndefined(isMask)) __obj.updateDynamic("isMask")(isMask)
    if (!js.isUndefined(isSelectable)) __obj.updateDynamic("isSelectable")(isSelectable)
    if (render_highlight != null) __obj.updateDynamic("render_highlight")(render_highlight.asInstanceOf[js.Any])
    if (render_select != null) __obj.updateDynamic("render_select")(render_select.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(singleSelect)) __obj.updateDynamic("singleSelect")(singleSelect)
    if (!js.isUndefined(staticState)) __obj.updateDynamic("staticState")(staticState)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip)
    __obj.asInstanceOf[AreaRenderingOptions]
  }
}

