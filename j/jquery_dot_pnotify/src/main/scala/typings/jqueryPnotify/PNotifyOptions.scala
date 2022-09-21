package typings.jqueryPnotify

import typings.jqueryPnotify.anon.Closerhover
import typings.jqueryPnotify.anon.Nonblock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PNotifyOptions extends StObject {
  
  /**
    * Additional classes to be added to the notice. (For custom styling.)
    */
  var addclass: js.UndefOr[String] = js.undefined
  
  /**
    * Speed at which the notice animates in and out. "slow", "def" or "normal", "fast" or number of milliseconds.
    */
  var animate_speed: js.UndefOr[String] = js.undefined
  
  /**
    * The animation to use when displaying and hiding the notice. "none" and "fade" are supported through CSS. 
    * Others are supported through the Animate module and Animate.css.
    */ 
  var animation: js.UndefOr[String] = js.undefined
  
  /**
    * Display the notice when it is created. Turn this off to add notifications to the history without displaying them.
    */
  var auto_display: js.UndefOr[Boolean] = js.undefined
  
  var buttons: js.UndefOr[Closerhover] = js.undefined
  
  /**
    * Support for PNotifyconfirm options
    */
  var confirm: js.UndefOr[PNotifyconfirm] = js.undefined
  
  /**
    * Class to be added to the notice for corner styling.
    */
  var cornerclass: js.UndefOr[String] = js.undefined
  
  /**
    * Delay in milliseconds before the notice is removed.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * After a delay, remove the notice, set to false for sticky note.
    */
  var hide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Display a pull down menu to redisplay previous notices, and place the notice in the history.
    */
  var history: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set icon to true to use the default icon for the selected style/type, false for no icon, or a string for your own icon class.
    */
  var icon: js.UndefOr[Any] = js.undefined
  
  /**
    * Change new lines to br tags.
    */
  var insert_brs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The various displayed text, helps facilitating internationalization.
    */
  var labels: js.UndefOr[PNotifyLabel] = js.undefined
  
  /**
    * Maximum number of notifications to have onscreen.
    */
  var maxonscreen: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum height of the notice. It will expand to fit content.
    */
  var min_height: js.UndefOr[String] = js.undefined
  
  /**
    * Reset the hide timer if the mouse moves over the notice.
    */
  var mouse_reset: js.UndefOr[Boolean] = js.undefined
  
  var nonblock: js.UndefOr[Nonblock] = js.undefined
  
  /**
    * Opacity of the notice.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify a specific duration of position animation
    */
  var position_animate_speed: js.UndefOr[Double] = js.undefined
  
  /**
    * Remove the notice's elements from the DOM after it is removed.
    */
  var remove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Display a drop shadow.
    */
  var shadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The stack on which the notices will be placed. Also controls the direction the notices stack.
    */
  var stack: js.UndefOr[PNotifyStack] = js.undefined
  
  /**
    * What styling classes to use. (Can be either "brighttheme", "jqueryui", "bootstrap2", "bootstrap3", "fontawesome" or a custom style object)
    */
  var styling: js.UndefOr[StylingOptions] = js.undefined
  
  /**
    * The notice's text. Either boolean false or string
    */
  var text: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * Whether to escape the content of the text. (Not allow HTML.)
    */
  var text_escape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The notice's title. Either boolean false or string
    */
  var title: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * Whether to escape the content of the title. (Not allow HTML.)
    */
  var title_escape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of the notice. "notice", "info", "success", or "error".
    */
  var `type`: js.UndefOr[NoticeTypeOptions] = js.undefined
  
  /**
    * Width of the notice.
    */
  var width: js.UndefOr[String] = js.undefined
}
object PNotifyOptions {
  
  inline def apply(): PNotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyOptions]
  }
  
  extension [Self <: PNotifyOptions](x: Self) {
    
    inline def setAddclass(value: String): Self = StObject.set(x, "addclass", value.asInstanceOf[js.Any])
    
    inline def setAddclassUndefined: Self = StObject.set(x, "addclass", js.undefined)
    
    inline def setAnimate_speed(value: String): Self = StObject.set(x, "animate_speed", value.asInstanceOf[js.Any])
    
    inline def setAnimate_speedUndefined: Self = StObject.set(x, "animate_speed", js.undefined)
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAuto_display(value: Boolean): Self = StObject.set(x, "auto_display", value.asInstanceOf[js.Any])
    
    inline def setAuto_displayUndefined: Self = StObject.set(x, "auto_display", js.undefined)
    
    inline def setButtons(value: Closerhover): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setConfirm(value: PNotifyconfirm): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    
    inline def setCornerclass(value: String): Self = StObject.set(x, "cornerclass", value.asInstanceOf[js.Any])
    
    inline def setCornerclassUndefined: Self = StObject.set(x, "cornerclass", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInsert_brs(value: Boolean): Self = StObject.set(x, "insert_brs", value.asInstanceOf[js.Any])
    
    inline def setInsert_brsUndefined: Self = StObject.set(x, "insert_brs", js.undefined)
    
    inline def setLabels(value: PNotifyLabel): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMaxonscreen(value: Double): Self = StObject.set(x, "maxonscreen", value.asInstanceOf[js.Any])
    
    inline def setMaxonscreenUndefined: Self = StObject.set(x, "maxonscreen", js.undefined)
    
    inline def setMin_height(value: String): Self = StObject.set(x, "min_height", value.asInstanceOf[js.Any])
    
    inline def setMin_heightUndefined: Self = StObject.set(x, "min_height", js.undefined)
    
    inline def setMouse_reset(value: Boolean): Self = StObject.set(x, "mouse_reset", value.asInstanceOf[js.Any])
    
    inline def setMouse_resetUndefined: Self = StObject.set(x, "mouse_reset", js.undefined)
    
    inline def setNonblock(value: Nonblock): Self = StObject.set(x, "nonblock", value.asInstanceOf[js.Any])
    
    inline def setNonblockUndefined: Self = StObject.set(x, "nonblock", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPosition_animate_speed(value: Double): Self = StObject.set(x, "position_animate_speed", value.asInstanceOf[js.Any])
    
    inline def setPosition_animate_speedUndefined: Self = StObject.set(x, "position_animate_speed", js.undefined)
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setStack(value: PNotifyStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStyling(value: StylingOptions): Self = StObject.set(x, "styling", value.asInstanceOf[js.Any])
    
    inline def setStylingUndefined: Self = StObject.set(x, "styling", js.undefined)
    
    inline def setText(value: String | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setText_escape(value: Boolean): Self = StObject.set(x, "text_escape", value.asInstanceOf[js.Any])
    
    inline def setText_escapeUndefined: Self = StObject.set(x, "text_escape", js.undefined)
    
    inline def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitle_escape(value: Boolean): Self = StObject.set(x, "title_escape", value.asInstanceOf[js.Any])
    
    inline def setTitle_escapeUndefined: Self = StObject.set(x, "title_escape", js.undefined)
    
    inline def setType(value: NoticeTypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
