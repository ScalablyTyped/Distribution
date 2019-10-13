package typings.imagemapster.imagemapsterMod._Global_.ImageMapster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingOptions extends js.Object {
  /**
    * Use an alternate image of the same size as the imagemap as the
    * source for highlight or select effects.
    *
    * When specified, the mapster will highlight areas using the image
    * data obtained from the same area in an alternate image, instead of
    * using a fill effect to highlight or select the area. This feature is
    * currently available in browsers with HTML5 canvas support. In
    * practical terms, this means it will work in all commonly used
    * browsers except IE 8 or lower.
    *
    * If this feature is enabled when an unsupported browser is used, it
    * will fall back to the normal highlight method.
    *
    * The fill, stroke and opacity effects can be specified independently
    * from those used for the normal higlight effect. This ensures that
    * when your page is viewed with a non-supported browser, you can still
    * control the rendering as would be appropriate for a normal
    * fill/stroke effect, which may be different from when you're using an
    * alternate image.
    */
  var altImage: js.UndefOr[String] = js.undefined
  var altImageFill: js.UndefOr[Boolean] = js.undefined
  var altImageOpacity: js.UndefOr[Double] = js.undefined
  var altImageStroke: js.UndefOr[Boolean] = js.undefined
  /**
    * fade effect - can only be applied to "render_highlight".
    *
    * Use a fade effect when highlighting areas on mouseover.
    */
  var fade: js.UndefOr[Boolean] = js.undefined
  /**
    * The duration of the fade-in effect, in milliseconds.
    */
  var fadeDuration: js.UndefOr[Double] = js.undefined
  /**
    * Areas should be flood-filled when moused over or highlighted.
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /**
    * The color used for flood fill.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  var fillColorMask: js.UndefOr[String] = js.undefined
  /**
    * The opacity of the fill. This is a number from 0 to 1.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * highlight areas on mouseover. When null (default), the behavior is
    * disabled for mobile browsers. You can explicitly enable or disable
    * it by setting this option to a boolean value.
    */
  var highlight: js.UndefOr[Boolean] = js.undefined
  /**
    * the map or area on the map can be deselected.
    *
    * Normally true, this option can be used to prevent users from
    * unselecting items once they have been selected. When combined with
    * singleSelect, the effect is that one and only one option can be
    * selected at any given time. Users cannot deselect the active option.
    * This provides a menu-like functionality. It is possible for zero
    * items to be selected if this is the default state (or the only
    * selected item is deselected programatically).
    */
  var isDeselectable: js.UndefOr[Boolean] = js.undefined
  /**
    * the map or an area on the map can be selected (or deselected).
    *
    * When true, the image map will function like a multiple-select menu.
    * Users can click any area to select or deselect it. When applied to
    * the entire map, it determines whether or not the click-selection
    * functionality is enabled. When applied to an area, it determines
    * whether that individual area (or group) can be selected. By default,
    * the map and all areas are selectable.
    */
  var isSelectable: js.UndefOr[Boolean] = js.undefined
  /**
    * The options below control the way highlighted areas are rendered.
    * Each can be applied globally to the map, or to each element, using
    * the areas option to pass area-specific options. These options apply
    * to either highlighted or selected areas. Highlighting occurs when
    * the mouse enters an area on the image map. Selection occurs when an
    * area is clicked, and selection is enabled. These options will be
    * applied to both situations if present in the root of the options
    * object. They can also be applied to one or the other situations
    * specifically using the render_highlight and render_select options.
    */
  var render_highlight: js.UndefOr[String | RenderingOptions] = js.undefined
  var render_select: js.UndefOr[String | RenderingOptions] = js.undefined
  /**
    * initial selection state of an area.
    *
    * The area in question is selected. To set default selections when
    * creating a new mapster, use this option for a specific area (see
    * above).
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * only one area can be selected at a time
    *
    * When true, only one or zero areas can be selected at any given time.
    * If an area is selected and the user selects another area, the
    * previously selected area will become deselected. Unlike
    * "staticState", this property cannot be overridden by setting areas
    * programatically, only one (or zero) areas can ever be selected when
    * this option is true.
    */
  var singleSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * the map or area is permanently in a selected or deselected state.
    *
    * When true or false, the map or area to which this option applies
    * will be permanently selected or deselected. Typically this is more
    * useful applied to individual areas that you want to exclude from the
    * interactive part of the map.
    *
    * staticState forces an area to be always selected or deselected. If
    * set, this will supercede isSelectable. Something with a staticState
    * will always be in that state and it cannot be changed by the user.
    * Note that when setting states programatically, this option will not
    * be honored; it only affects user interaction.
    */
  var staticState: js.UndefOr[Boolean] = js.undefined
  /**
    * Areas should be outlined when moused over or highlighted.
    */
  var stroke: js.UndefOr[Boolean] = js.undefined
  /**
    * The color of the outline.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  /**
    * The opacity of the outline.
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The width of the outline.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object RenderingOptions {
  @scala.inline
  def apply(
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
    isDeselectable: js.UndefOr[Boolean] = js.undefined,
    isSelectable: js.UndefOr[Boolean] = js.undefined,
    render_highlight: String | RenderingOptions = null,
    render_select: String | RenderingOptions = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    singleSelect: js.UndefOr[Boolean] = js.undefined,
    staticState: js.UndefOr[Boolean] = js.undefined,
    stroke: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null
  ): RenderingOptions = {
    val __obj = js.Dynamic.literal()
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
    if (!js.isUndefined(isDeselectable)) __obj.updateDynamic("isDeselectable")(isDeselectable)
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
    __obj.asInstanceOf[RenderingOptions]
  }
}

