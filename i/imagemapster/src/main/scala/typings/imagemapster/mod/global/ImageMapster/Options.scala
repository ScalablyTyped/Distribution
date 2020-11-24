package typings.imagemapster.mod.global.ImageMapster

import typings.imagemapster.imagemapsterStrings.asc
import typings.imagemapster.imagemapsterStrings.desc
import typings.imagemapster.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends RenderingOptions {
  
  /**
    *
    * define area-specific options; each object in the array must contain
    * a "key" property identifying a valid mapKey, and additional
    * rendering options specific to that area or group
    */
  var areas: js.UndefOr[js.Array[AreaRenderingOptions]] = js.native
  
  /**
    * a jQuery object whose elements are bound to the map.
    *
    * boundList can be any list of objects. To be bound to the map, they
    * must contain an attribute whose name is identified by the option
    * listKey, and whose value matches the value in an area tag's mapKey
    * attribute. If more than one element in the list has the same value,
    * the action will affect all matching elements.
    */
  var boundList: js.UndefOr[JQuery] = js.native
  
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
  var clickNavigate: js.UndefOr[Boolean] = js.native
  
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
  var configTimeout: js.UndefOr[Double] = js.native
  
  /**
    * an attribute on items in a boundList that corresponds to the value
    * of the mapKey attributes.
    *
    * This is used to synchronize the actions on the imagemap with the
    * actions on a boundList. Each value should match a value from the
    * imageMap mapKey tag. Any item in the boundList with missing or
    * mismatched data will be ignored.
    */
  var listKey: js.UndefOr[String] = js.native
  
  /**
    * attribute to set or remove when an area is selected or deselected
    *
    * If boundList is present, when a map area is selected, set or remove
    * this attribute on the list element that matches that area based on
    * their respective keys.
    */
  var listSelectedAttribute: js.UndefOr[String] = js.native
  
  /**
    * a class to add or remove when an area is selected or deselected
    *
    * If a boundList is present, when a map area is selected, this class
    * is added or removed from the corresponding list element. This can be
    * used to easily create any kind of associated action when areas on
    * the map are changed.
    */
  var listSelectedClass: js.UndefOr[String] = js.native
  
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
  var mapKey: js.UndefOr[String] = js.native
  
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
  var mapValue: js.UndefOr[String] = js.native
  
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
  var mouseoutDelay: js.UndefOr[Double] = js.native
  
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
  var noHrefIsMask: js.UndefOr[Boolean] = js.native
  
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
  var onClick: js.UndefOr[js.Function1[/* data */ OnClickData, Unit]] = js.native
  
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
  var onConfigured: js.UndefOr[js.Function1[/* success */ Boolean, Unit]] = js.native
  
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
  var onGetList: js.UndefOr[js.Function1[/* data */ OnGetListData, JQuery]] = js.native
  
  /**
    * callback when mouse leavesd a bound area.
    *
    * Callback when the mouse leaves a bound area. The data structure
    * passed to the callback is the same as onMouseover.
    */
  var onMouseout: js.UndefOr[js.Function1[/* data */ OnMouseData, Unit]] = js.native
  
  /**
    * callback when mouse enters a bound area.
    *
    * This function is called when the mouse enters a bound area.
    */
  var onMouseover: js.UndefOr[js.Function1[/* data */ OnMouseData, Unit]] = js.native
  
  /**
    * callback when a toolTip is created
    *
    * This can be used to control tooltip closing behavior directly, if
    * desired.
    */
  var onShowToolTip: js.UndefOr[js.Function1[/* data */ OnShowToolTipData, Unit]] = js.native
  
  /**
    * callback when area state is changed (either highlight or select).
    *
    * onStateChange can be used to get more specific information than the
    * mouseover or click events.
    */
  var onStateChange: js.UndefOr[js.Function1[/* data */ OnStateChangeData, Unit]] = js.native
  
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
  var scaleMap: js.UndefOr[Boolean] = js.native
  
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
  var showToolTip: js.UndefOr[Boolean] = js.native
  
  /**
    * sort the values before calling onGetList
    *
    * If a non-false value or "asc" is passed, the list will be sorted in
    * ascending order by the area value from mapValue. If "desc" is
    * passed, the list will be sorted in descending order.
    */
  var sortList: js.UndefOr[Boolean | asc | desc] = js.native
  
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
  var toolTipClose: js.UndefOr[js.Array[ToolTipCloseEvent]] = js.native
  
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
  var toolTipContainer: js.UndefOr[String | JQuery] = js.native
  
  /**
    * add "classname" class to the wrapper created around the image, or
    * copy classes from the image if "true"
    */
  var wrapClass: js.UndefOr[String | Boolean] = js.native
  
  /**
    * add CSS to the wrapper created around the image
    */
  var wrapCss: js.UndefOr[String | Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAreasVarargs(value: AreaRenderingOptions*): Self = this.set("areas", js.Array(value :_*))
    
    @scala.inline
    def setAreas(value: js.Array[AreaRenderingOptions]): Self = this.set("areas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreas: Self = this.set("areas", js.undefined)
    
    @scala.inline
    def setBoundList(value: JQuery): Self = this.set("boundList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundList: Self = this.set("boundList", js.undefined)
    
    @scala.inline
    def setClickNavigate(value: Boolean): Self = this.set("clickNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickNavigate: Self = this.set("clickNavigate", js.undefined)
    
    @scala.inline
    def setConfigTimeout(value: Double): Self = this.set("configTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigTimeout: Self = this.set("configTimeout", js.undefined)
    
    @scala.inline
    def setListKey(value: String): Self = this.set("listKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListKey: Self = this.set("listKey", js.undefined)
    
    @scala.inline
    def setListSelectedAttribute(value: String): Self = this.set("listSelectedAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListSelectedAttribute: Self = this.set("listSelectedAttribute", js.undefined)
    
    @scala.inline
    def setListSelectedClass(value: String): Self = this.set("listSelectedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListSelectedClass: Self = this.set("listSelectedClass", js.undefined)
    
    @scala.inline
    def setMapKey(value: String): Self = this.set("mapKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapKey: Self = this.set("mapKey", js.undefined)
    
    @scala.inline
    def setMapValue(value: String): Self = this.set("mapValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapValue: Self = this.set("mapValue", js.undefined)
    
    @scala.inline
    def setMouseoutDelay(value: Double): Self = this.set("mouseoutDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseoutDelay: Self = this.set("mouseoutDelay", js.undefined)
    
    @scala.inline
    def setNoHrefIsMask(value: Boolean): Self = this.set("noHrefIsMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoHrefIsMask: Self = this.set("noHrefIsMask", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* data */ OnClickData => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnConfigured(value: /* success */ Boolean => Unit): Self = this.set("onConfigured", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnConfigured: Self = this.set("onConfigured", js.undefined)
    
    @scala.inline
    def setOnGetList(value: /* data */ OnGetListData => JQuery): Self = this.set("onGetList", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGetList: Self = this.set("onGetList", js.undefined)
    
    @scala.inline
    def setOnMouseout(value: /* data */ OnMouseData => Unit): Self = this.set("onMouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseout: Self = this.set("onMouseout", js.undefined)
    
    @scala.inline
    def setOnMouseover(value: /* data */ OnMouseData => Unit): Self = this.set("onMouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseover: Self = this.set("onMouseover", js.undefined)
    
    @scala.inline
    def setOnShowToolTip(value: /* data */ OnShowToolTipData => Unit): Self = this.set("onShowToolTip", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShowToolTip: Self = this.set("onShowToolTip", js.undefined)
    
    @scala.inline
    def setOnStateChange(value: /* data */ OnStateChangeData => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    
    @scala.inline
    def setScaleMap(value: Boolean): Self = this.set("scaleMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleMap: Self = this.set("scaleMap", js.undefined)
    
    @scala.inline
    def setShowToolTip(value: Boolean): Self = this.set("showToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToolTip: Self = this.set("showToolTip", js.undefined)
    
    @scala.inline
    def setSortList(value: Boolean | asc | desc): Self = this.set("sortList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortList: Self = this.set("sortList", js.undefined)
    
    @scala.inline
    def setToolTipCloseVarargs(value: ToolTipCloseEvent*): Self = this.set("toolTipClose", js.Array(value :_*))
    
    @scala.inline
    def setToolTipClose(value: js.Array[ToolTipCloseEvent]): Self = this.set("toolTipClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTipClose: Self = this.set("toolTipClose", js.undefined)
    
    @scala.inline
    def setToolTipContainer(value: String | JQuery): Self = this.set("toolTipContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTipContainer: Self = this.set("toolTipContainer", js.undefined)
    
    @scala.inline
    def setWrapClass(value: String | Boolean): Self = this.set("wrapClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapClass: Self = this.set("wrapClass", js.undefined)
    
    @scala.inline
    def setWrapCss(value: String | Boolean): Self = this.set("wrapCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapCss: Self = this.set("wrapCss", js.undefined)
  }
}
