package typings.jqueryPnotify

import typings.jqueryPnotify.anon.Closerhover
import typings.jqueryPnotify.anon.Nonblock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNotifyOptions extends js.Object {
  
  /**
    * Additional classes to be added to the notice. (For custom styling.)
    */
  var addclass: js.UndefOr[String] = js.native
  
  /**
    * Speed at which the notice animates in and out. "slow", "def" or "normal", "fast" or number of milliseconds.
    */
  var animate_speed: js.UndefOr[String] = js.native
  
  /**
    * The animation to use when displaying and hiding the notice. "none" and "fade" are supported through CSS. 
    * Others are supported through the Animate module and Animate.css.
    */ 
  var animation: js.UndefOr[String] = js.native
  
  /**
    * Display the notice when it is created. Turn this off to add notifications to the history without displaying them.
    */
  var auto_display: js.UndefOr[Boolean] = js.native
  
  var buttons: js.UndefOr[Closerhover] = js.native
  
  /**
    * Support for PNotifyconfirm options
    */
  var confirm: js.UndefOr[PNotifyconfirm] = js.native
  
  /**
    * Class to be added to the notice for corner styling.
    */
  var cornerclass: js.UndefOr[String] = js.native
  
  /**
    * Delay in milliseconds before the notice is removed.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * After a delay, remove the notice, set to false for sticky note.
    */
  var hide: js.UndefOr[Boolean] = js.native
  
  /**
    * Display a pull down menu to redisplay previous notices, and place the notice in the history.
    */
  var history: js.UndefOr[Boolean] = js.native
  
  /**
    * Set icon to true to use the default icon for the selected style/type, false for no icon, or a string for your own icon class.
    */
  var icon: js.UndefOr[js.Any] = js.native
  
  /**
    * Change new lines to br tags.
    */
  var insert_brs: js.UndefOr[Boolean] = js.native
  
  /**
    * The various displayed text, helps facilitating internationalization.
    */
  var labels: js.UndefOr[PNotifyLabel] = js.native
  
  /**
    * Maximum number of notifications to have onscreen.
    */
  var maxonscreen: js.UndefOr[Double] = js.native
  
  /**
    * Minimum height of the notice. It will expand to fit content.
    */
  var min_height: js.UndefOr[String] = js.native
  
  /**
    * Reset the hide timer if the mouse moves over the notice.
    */
  var mouse_reset: js.UndefOr[Boolean] = js.native
  
  var nonblock: js.UndefOr[Nonblock] = js.native
  
  /**
    * Opacity of the notice.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Specify a specific duration of position animation
    */
  var position_animate_speed: js.UndefOr[Double] = js.native
  
  /**
    * Remove the notice's elements from the DOM after it is removed.
    */
  var remove: js.UndefOr[Boolean] = js.native
  
  /**
    * Display a drop shadow.
    */
  var shadow: js.UndefOr[Boolean] = js.native
  
  /**
    * The stack on which the notices will be placed. Also controls the direction the notices stack.
    */
  var stack: js.UndefOr[PNotifyStack] = js.native
  
  /**
    * What styling classes to use. (Can be either "brighttheme", "jqueryui", "bootstrap2", "bootstrap3", "fontawesome" or a custom style object)
    */
  var styling: js.UndefOr[StylingOptions] = js.native
  
  /**
    * The notice's text. Either boolean false or string
    */
  var text: js.UndefOr[String | Boolean] = js.native
  
  /**
    * Whether to escape the content of the text. (Not allow HTML.)
    */
  var text_escape: js.UndefOr[Boolean] = js.native
  
  /**
    * The notice's title. Either boolean false or string
    */
  var title: js.UndefOr[String | Boolean] = js.native
  
  /**
    * Whether to escape the content of the title. (Not allow HTML.)
    */
  var title_escape: js.UndefOr[Boolean] = js.native
  
  /**
    * Type of the notice. "notice", "info", "success", or "error".
    */
  var `type`: js.UndefOr[NoticeTypeOptions] = js.native
  
  /**
    * Width of the notice.
    */
  var width: js.UndefOr[String] = js.native
}
object PNotifyOptions {
  
  @scala.inline
  def apply(): PNotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyOptions]
  }
  
  @scala.inline
  implicit class PNotifyOptionsOps[Self <: PNotifyOptions] (val x: Self) extends AnyVal {
    
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
    def setAddclass(value: String): Self = this.set("addclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddclass: Self = this.set("addclass", js.undefined)
    
    @scala.inline
    def setAnimate_speed(value: String): Self = this.set("animate_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate_speed: Self = this.set("animate_speed", js.undefined)
    
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAuto_display(value: Boolean): Self = this.set("auto_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto_display: Self = this.set("auto_display", js.undefined)
    
    @scala.inline
    def setButtons(value: Closerhover): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setConfirm(value: PNotifyconfirm): Self = this.set("confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    
    @scala.inline
    def setCornerclass(value: String): Self = this.set("cornerclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerclass: Self = this.set("cornerclass", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setInsert_brs(value: Boolean): Self = this.set("insert_brs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert_brs: Self = this.set("insert_brs", js.undefined)
    
    @scala.inline
    def setLabels(value: PNotifyLabel): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMaxonscreen(value: Double): Self = this.set("maxonscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxonscreen: Self = this.set("maxonscreen", js.undefined)
    
    @scala.inline
    def setMin_height(value: String): Self = this.set("min_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin_height: Self = this.set("min_height", js.undefined)
    
    @scala.inline
    def setMouse_reset(value: Boolean): Self = this.set("mouse_reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouse_reset: Self = this.set("mouse_reset", js.undefined)
    
    @scala.inline
    def setNonblock(value: Nonblock): Self = this.set("nonblock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonblock: Self = this.set("nonblock", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPosition_animate_speed(value: Double): Self = this.set("position_animate_speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition_animate_speed: Self = this.set("position_animate_speed", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setStack(value: PNotifyStack): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setStyling(value: StylingOptions): Self = this.set("styling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyling: Self = this.set("styling", js.undefined)
    
    @scala.inline
    def setText(value: String | Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setText_escape(value: Boolean): Self = this.set("text_escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText_escape: Self = this.set("text_escape", js.undefined)
    
    @scala.inline
    def setTitle(value: String | Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitle_escape(value: Boolean): Self = this.set("title_escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle_escape: Self = this.set("title_escape", js.undefined)
    
    @scala.inline
    def setType(value: NoticeTypeOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
