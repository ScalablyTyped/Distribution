package typings.imagemapster.imagemapsterMod._Global_.ImageMapster

import typings.imagemapster.imagemapsterMod._Global_.JQuery
import typings.imagemapster.imagemapsterStrings.asc
import typings.imagemapster.imagemapsterStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends RenderingOptions {
  /**
    *
    * define area-specific options; each object in the array must contain
    * a "key" property identifying a valid mapKey, and additional
    * rendering options specific to that area or group
    */
  var areas: js.UndefOr[js.Array[AreaRenderingOptions]] = js.undefined
  /**
    * a jQuery object whose elements are bound to the map.
    *
    * boundList can be any list of objects. To be bound to the map, they
    * must contain an attribute whose name is identified by the option
    * listKey, and whose value matches the value in an area tag's mapKey
    * attribute. If more than one element in the list has the same value,
    * the action will affect all matching elements.
    */
  var boundList: js.UndefOr[JQuery] = js.undefined
  /**
    * Clicking on a link should cause the browser to navigate to the href
    * whenever it's not a hash sign (#). Version 1.2.4.050 and later
    *
    * By default, ImageMapster will prevent the default browser behavior
    * in image maps, and "select" areas when they are clicked. If you want
    * to navigate to the url for an area, use this option. When enabled,
    * all areas that have an href attribute, and its value is not empty or
    * "#" (just a hashtag).
    *
    * When area grouping is used, if an href is present for any area in
    * the primary group, this will be used as the navigation target. This
    * way you don't need to copy the url for every area in groups, rather,
    * you can include it on just one, and clicking any area will cause the
    * appropraite navigation.
    */
  var clickNavigate: js.UndefOr[Boolean] = js.undefined
  /**
    * time (in milliseconds) to wait for images to load before giving up
    *
    * When first bound, ImageMapster has to wait for the source image,and
    * any altImage images to load before it can finish binding. This is
    * necessary because otherwise it's not alwasy possible to know the
    * native size of the images. After this period of time, ImageMapster
    * will give up. If you have particularly large pages or images, you
    * may want to increase this to account for long load times.
    */
  var configTimeout: js.UndefOr[Double] = js.undefined
  /**
    * an attribute on items in a boundList that corresponds to the value
    * of the mapKey attributes.
    *
    * This is used to synchronize the actions on the imagemap with the
    * actions on a boundList. Each value should match a value from the
    * imageMap mapKey tag. Any item in the boundList with missing or
    * mismatched data will be ignored.
    */
  var listKey: js.UndefOr[String] = js.undefined
  /**
    * attribute to set or remove when an area is selected or deselected
    *
    * If boundList is present, when a map area is selected, set or remove
    * this attribute on the list element that matches that area based on
    * their respective keys.
    */
  var listSelectedAttribute: js.UndefOr[String] = js.undefined
  /**
    * a class to add or remove when an area is selected or deselected
    *
    * If a boundList is present, when a map area is selected, this class
    * is added or removed from the corresponding list element. This can be
    * used to easily create any kind of associated action when areas on
    * the map are changed.
    */
  var listSelectedClass: js.UndefOr[String] = js.undefined
  /**
    * an attribute identifying each imagemap area.
    *
    * If specified, this refers to an attribute on the area tags that will
    * be used to group them logically. Any areas containing the same
    * mapKey will be considered part of a group, and rendered together
    * when any of these areas is activated. If you don't want this
    * functionality, ensure each key is unique. When mapKey is omitted,
    * then each area is considered to be independent from the other and no
    * grouping is applied.
    *
    * When mapKey is present, any area tags that are missing this
    * attribute will be excluded from the image map e ntirely. This is
    * functionally identical to setting staticState=false for these areas,
    * except they will be inaccessible through the API.
    *
    * ImageMapster will work with any attribute you identify as a key. If
    * you wish to maintain HTML compliance, it's recommeded that you use
    * attribute names starting with "data-", for example, data-mapkey. Any
    * such names are legal for the HTML5 document type. If you are using
    * older document types, the class attribute is part of the HTML spec
    * for area and will not cause any visual effects, so this is also a
    * good choice. It is not recommended to use id, since the values of
    * this attribute must be unique. title and alt also will cause
    * possibly undesired side effects.
    *
    * You can specify more than one value in the mapKey attribute,
    * separated by commas. This will cause an area to be a member of more
    * than one group. The area may have different options in the context
    * of each group. When the area is physically moused over, the first
    * key listed will identify the group that's effective for that action.
    */
  var mapKey: js.UndefOr[String] = js.undefined
  /**
    * an attribute on each area tag containing additional descriptive
    * information about an area.
    *
    * This option is applicable only when using onGetList. When set, the
    * data provided to the callback function will include the value of
    * this attribute for each group. This can be used to simplify building
    * a list with associated information, without having to match against
    * another resource. It also ties this information to the image map
    * itself. It is not required to use this option when using onGetList.
    *
    * For example, you could set mapValue: 'data-statename' to an imagemap
    * of the united states, and add an attribute to your areas that
    * provided the full name of each state, e.g. data-statename="Alaska".
    * This text would be included in the onGetList callback, and so you
    * could use it to construct an external list of states.
    *
    * If there are grouped areas (areas with the same key), then the value
    * from the first area found with data in this attribute will be used.
    */
  var mapValue: js.UndefOr[String] = js.undefined
  /**
    * delay removing highlight when mouse exits an area (1.2.5b36)
    *
    * Normally, when the user's mouse pointer exits an area, the highlight
    * effect is removed immediately. This behavior can be changed with
    * this option. Setting it to a positive number causes a delay of n
    * milliseconds before the effect is removed. Setting to -1 causes the
    * effect to remain active until another hotspot is entered (e.g., it
    * will only be removed when superceded by a different area being
    * highlighted).
    *
    * When using mouseoutDelay, the onMouseover event will still be fired
    * at the time the user's mouse pointer leaves the area. However, the
    * onStateChange event will be delayed until the highlight is actually
    * removed.
    *
    * Whether or not you are using mouseoutDelay, only one area can be
    * highlighted at a time. That is, whenever the mouse pointer moves
    * onto a new active area, any previously highlighted area will become
    * un-highlighted, regardless of any delay in effect. Hovering over a
    * new area will always supercede any delay and cause the new area (and
    * only the new area) to be highlighted at that time. So, for dense
    * imagemaps where most areas adjoin one another, this option may not
    * have much effect within the boundaries of the imagemap. Rather, it
    * is intended to help keep the higlights active for imagemaps that are
    * sparse, or have very small areas.
    */
  var mouseoutDelay: js.UndefOr[Double] = js.undefined
  /**
    * Treat areas containing the onhref attribute (or missing the href
    * attribute) as masks. This is true by default.
    *
    * Set this to "false" to disable automatic masking of these areas. You
    * can control them explicitly by creating independent groups for areas
    * you wish to mask and assigning the isMask area-specific option when
    * using this option.
    *
    * There are some things to be aware of when using nohref and masking:
    *
    * * You must put the area that include the nohref attribute before
    * other areas that overlap it, or it will be ignored.
    *
    * * You should also explicitly omit the href tag when using nohref.
    *
    * * Due to limitations in rendering with VML (e.g. Internet Explorer
    * 6-8), it is not possible to create a true mask, which would allow
    * the underlying image to show through the masked area. Instead, the
    * "masked" areas are rendered on top of the highlighted area in a
    * different color. This can be specified for each area (see the
    * fillColorMask option below) to create the best possible effect.
    */
  var noHrefIsMask: js.UndefOr[Boolean] = js.undefined
  /**
    * callback when a hotspot area is clicked. Return false to cancel
    * default select action, or true to navigate to the 'href'
    */
  /**
    * a callback when an area is clicked.:silent doautocmd FocusLost %
    *
    * This event occurs when the usual click event happens, but includes
    * data from the mapster about the area:
    *
    * This can be used to perform additional actions on a click without
    * binding another event and having to obtain information manually.
    */
  var onClick: js.UndefOr[js.Function1[/* data */ OnClickData, Unit]] = js.undefined
  /**
    * a callback when the mapster has finished initial configuration
    *
    * This event is fired when the mapster configuration completes. When
    * control execution continues after a first-time bind operation, the
    * mapster is not guaranteed to be configured, because images are
    * loaded asynchronously by web browsers. If a mapster is bound to an
    * image that is not yet loaded, it will attempt to rebind every 200
    * milliseconds. This event will be fired when it is eventually
    * successful, or the length of time specified by configTimeout is
    * exceeded (default of ten seconds).
    *
    * The altImage option will also increase the time needed to configure,
    * because the alternate image is loaded by the client at configure
    * time to ensure it is available immediately when needed.
    */
  var onConfigured: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.undefined
  /**
    * a callback on mapster initialization that provides summary data
    * about the image map, and expects a jQuery list to be returned.
    *
    * This callback allows you to dynamically provide a boundList based on
    * summary data from the imagemap itself, rather than providing the
    * list up front. The event passes an array of AreaData objects
    *
    * The client should return a jQuery object containing all the elements
    * that make up the bound list, the same as if it was assigned
    * manually.
    */
  var onGetList: js.UndefOr[js.Function1[/* data */ OnGetListData, JQuery]] = js.undefined
  /**
    * callback when mouse leavesd a bound area.
    *
    * Callback when the mouse leaves a bound area. The data structure
    * passed to the callback is the same as onMouseover.
    */
  var onMouseout: js.UndefOr[js.Function1[/* data */ OnMouseData, Unit]] = js.undefined
  /**
    * callback when mouse enters a bound area.
    *
    * This function is called when the mouse enters a bound area.
    */
  var onMouseover: js.UndefOr[js.Function1[/* data */ OnMouseData, Unit]] = js.undefined
  /**
    * callback when a toolTip is created
    *
    * This can be used to control tooltip closing behavior directly, if
    * desired.
    */
  var onShowToolTip: js.UndefOr[js.Function1[/* data */ OnShowToolTipData, Unit]] = js.undefined
  /**
    * callback when area state is changed (either highlight or select).
    *
    * onStateChange can be used to get more specific information than the
    * mouseover or click events.
    */
  var onStateChange: js.UndefOr[js.Function1[/* data */ OnStateChangeData, Unit]] = js.undefined
  /**
    * Automatically scale imagemaps to match the size of a
    * dynamically-scaled image.
    *
    * When you render an image, you can optionally define a size through
    * CSS or using the "height" and "width" attributes. If omitted, the
    * image will be displayed in its native size. If included, browsers
    * will automatically resize the image to display in the dimensions you
    * have provided.
    *
    * Starting with 1.1.3, ImageMapster will automatically recalculate all
    * area data to match the effective size of the image. This means that
    * you can set the size of your image to anything you want and
    * ImageMapster will work with no changes at all needed to the "area"
    * data.
    *
    * If this behavior is not desired for some reason, this can be
    * disabled by setting this option to false.
    */
  var scaleMap: js.UndefOr[Boolean] = js.undefined
  /**
    * enable tooltips
    *
    * When showToolTip is true, mapster will look for a property called
    * toolTip in the areas option for a an area. If present, a tool tip
    * dialog will be shown on mouseover for that area. It will
    * automatically be closed according to the behavior specified by
    * toolTipClose. This option does not apply at the item level, but
    * rather enables tooltips for the entire map. At the item level, only
    * the presence of tooltip data is necessary for a tooltip to appear.
    */
  var showToolTip: js.UndefOr[Boolean] = js.undefined
  /**
    * sort the values before calling onGetList
    *
    * If a non-false value or "asc" is passed, the list will be sorted in
    * ascending order by the area value from mapValue. If "desc" is
    * passed, the list will be sorted in descending order.
    */
  var sortList: js.UndefOr[Boolean | asc | desc] = js.undefined
  /**
    * specify the behavior that causes a toolTip to close.
    *
    * This option should be passed an array of strings that define the
    * events that cause active tooltips to close. The array can include
    * one or more of the following stings:
    *
    * 'area-mouseout' - tooltips close when the mouse pointer leaves the
    * area that activated it. This is the default.
    *
    * 'area-click' - tooltips close when another area (or the same one) is
    * clicked
    *
    * 'tooltip-click' - tooltips close when the tooltip itself is clicked
    * anywhere
    *
    * 'image-mouseout' - tooltips close when the mouse pointer leaves the
    * image itself.
    *
    * Under any circumstances, active tooltip will disappear when a new
    * one is created. You don't have to define an automatic closing
    * behavior; setting this option to an empty array will result in
    * tooltips never closing, leaving it to you to close them manually
    * though the tooltip method.
    */
  var toolTipClose: js.UndefOr[js.Array[ToolTipCloseEvent]] = js.undefined
  /**
    * HTML describing the popup that will be created for tooltips.
    *
    * A div with some simple styling is included as the default tooltip
    * container. This can be replaced with anything using this option.
    *
    * When tooltips are rendered, the code attempts to determine the best
    * place for it. It will try to position it in near the top-left part
    * of the area, and continue to try other corners in order to render it
    * within the confines of the container where the image map resides. If
    * it can't be placed within the image, it will be placed in the
    * lower-right corner and extend outside the image.
    */
  var toolTipContainer: js.UndefOr[String | JQuery] = js.undefined
  /**
    * add "classname" class to the wrapper created around the image, or
    * copy classes from the image if "true"
    */
  var wrapClass: js.UndefOr[String | Boolean] = js.undefined
  /**
    * add CSS to the wrapper created around the image
    */
  var wrapCss: js.UndefOr[String | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    altImage: String = null,
    altImageFill: js.UndefOr[Boolean] = js.undefined,
    altImageOpacity: Int | Double = null,
    altImageStroke: js.UndefOr[Boolean] = js.undefined,
    areas: js.Array[AreaRenderingOptions] = null,
    boundList: JQuery = null,
    clickNavigate: js.UndefOr[Boolean] = js.undefined,
    configTimeout: Int | Double = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    fadeDuration: Int | Double = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillColorMask: String = null,
    fillOpacity: Int | Double = null,
    highlight: js.UndefOr[Boolean] = js.undefined,
    isDeselectable: js.UndefOr[Boolean] = js.undefined,
    isSelectable: js.UndefOr[Boolean] = js.undefined,
    listKey: String = null,
    listSelectedAttribute: String = null,
    listSelectedClass: String = null,
    mapKey: String = null,
    mapValue: String = null,
    mouseoutDelay: Int | Double = null,
    noHrefIsMask: js.UndefOr[Boolean] = js.undefined,
    onClick: /* data */ OnClickData => Unit = null,
    onConfigured: /* success */ Boolean => Unit = null,
    onGetList: /* data */ OnGetListData => JQuery = null,
    onMouseout: /* data */ OnMouseData => Unit = null,
    onMouseover: /* data */ OnMouseData => Unit = null,
    onShowToolTip: /* data */ OnShowToolTipData => Unit = null,
    onStateChange: /* data */ OnStateChangeData => Unit = null,
    render_highlight: String | RenderingOptions = null,
    render_select: String | RenderingOptions = null,
    scaleMap: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    showToolTip: js.UndefOr[Boolean] = js.undefined,
    singleSelect: js.UndefOr[Boolean] = js.undefined,
    sortList: Boolean | asc | desc = null,
    staticState: js.UndefOr[Boolean] = js.undefined,
    stroke: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    toolTipClose: js.Array[ToolTipCloseEvent] = null,
    toolTipContainer: String | JQuery = null,
    wrapClass: String | Boolean = null,
    wrapCss: String | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (altImage != null) __obj.updateDynamic("altImage")(altImage)
    if (!js.isUndefined(altImageFill)) __obj.updateDynamic("altImageFill")(altImageFill)
    if (altImageOpacity != null) __obj.updateDynamic("altImageOpacity")(altImageOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(altImageStroke)) __obj.updateDynamic("altImageStroke")(altImageStroke)
    if (areas != null) __obj.updateDynamic("areas")(areas)
    if (boundList != null) __obj.updateDynamic("boundList")(boundList)
    if (!js.isUndefined(clickNavigate)) __obj.updateDynamic("clickNavigate")(clickNavigate)
    if (configTimeout != null) __obj.updateDynamic("configTimeout")(configTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (fadeDuration != null) __obj.updateDynamic("fadeDuration")(fadeDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillColorMask != null) __obj.updateDynamic("fillColorMask")(fillColorMask)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (!js.isUndefined(isDeselectable)) __obj.updateDynamic("isDeselectable")(isDeselectable)
    if (!js.isUndefined(isSelectable)) __obj.updateDynamic("isSelectable")(isSelectable)
    if (listKey != null) __obj.updateDynamic("listKey")(listKey)
    if (listSelectedAttribute != null) __obj.updateDynamic("listSelectedAttribute")(listSelectedAttribute)
    if (listSelectedClass != null) __obj.updateDynamic("listSelectedClass")(listSelectedClass)
    if (mapKey != null) __obj.updateDynamic("mapKey")(mapKey)
    if (mapValue != null) __obj.updateDynamic("mapValue")(mapValue)
    if (mouseoutDelay != null) __obj.updateDynamic("mouseoutDelay")(mouseoutDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(noHrefIsMask)) __obj.updateDynamic("noHrefIsMask")(noHrefIsMask)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onConfigured != null) __obj.updateDynamic("onConfigured")(js.Any.fromFunction1(onConfigured))
    if (onGetList != null) __obj.updateDynamic("onGetList")(js.Any.fromFunction1(onGetList))
    if (onMouseout != null) __obj.updateDynamic("onMouseout")(js.Any.fromFunction1(onMouseout))
    if (onMouseover != null) __obj.updateDynamic("onMouseover")(js.Any.fromFunction1(onMouseover))
    if (onShowToolTip != null) __obj.updateDynamic("onShowToolTip")(js.Any.fromFunction1(onShowToolTip))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (render_highlight != null) __obj.updateDynamic("render_highlight")(render_highlight.asInstanceOf[js.Any])
    if (render_select != null) __obj.updateDynamic("render_select")(render_select.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleMap)) __obj.updateDynamic("scaleMap")(scaleMap)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(showToolTip)) __obj.updateDynamic("showToolTip")(showToolTip)
    if (!js.isUndefined(singleSelect)) __obj.updateDynamic("singleSelect")(singleSelect)
    if (sortList != null) __obj.updateDynamic("sortList")(sortList.asInstanceOf[js.Any])
    if (!js.isUndefined(staticState)) __obj.updateDynamic("staticState")(staticState)
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (toolTipClose != null) __obj.updateDynamic("toolTipClose")(toolTipClose)
    if (toolTipContainer != null) __obj.updateDynamic("toolTipContainer")(toolTipContainer.asInstanceOf[js.Any])
    if (wrapClass != null) __obj.updateDynamic("wrapClass")(wrapClass.asInstanceOf[js.Any])
    if (wrapCss != null) __obj.updateDynamic("wrapCss")(wrapCss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

