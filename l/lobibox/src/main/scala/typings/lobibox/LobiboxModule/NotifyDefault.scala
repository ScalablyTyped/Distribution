package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyDefault extends StObject {
  
  // Image source string
  var closable: js.UndefOr[Boolean] = js.undefined
  
  // Show timer indicator
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  // Set this to true if you want notification not to be shown until previous notification is closed. This is useful for notification queues
  var continueDelayOnInactiveTab: js.UndefOr[Boolean] = js.undefined
  
  // Make notifications closable
  var delay: js.UndefOr[Double] = js.undefined
  
  // Hide notification after this time (in miliseconds)
  var delayIndicator: js.UndefOr[Boolean] = js.undefined
  
  // Show animation class.
  var hideClass: js.UndefOr[String] = js.undefined
  
  // Hide animation class.
  var icon: js.UndefOr[Boolean] = js.undefined
  
  // Message of notification
  var img: js.UndefOr[String] = js.undefined
  
  // Icon of notification. Leave as is for default icon or set custom string
  var msg: js.UndefOr[String] = js.undefined
  
  // Continue delay when browser tab is inactive
  // Events
  var onClick: js.UndefOr[js.Function] = js.undefined
  
  // Place to show notification. Available options: "top left", "top right", "bottom left", "bottom right"
  var onClickUrl: js.UndefOr[String] = js.undefined
  
  // Sound of notification. Set this false to disable sound. Leave as is for default sound or set custom soud path
  var position: js.UndefOr[String] = js.undefined
  
  // The url which will be opened when notification is clicked
  var showAfterPrevious: js.UndefOr[Boolean] = js.undefined
  
  // Default extension for all sounds
  var showClass: js.UndefOr[String] = js.undefined
  
  // Title of notification. If you do not include the title in options it will automatically takes its value
  //from Lobibox.notify.OPTIONS object depending of the type of the notifications or set custom string. Set this false to disable title
  var size: js.UndefOr[String] = js.undefined
  
  // Width of notification box
  var sound: js.UndefOr[Boolean] = js.undefined
  
  // The folder path where sounds are located
  var soundExt: js.UndefOr[String] = js.undefined
  
  // normal, mini, large
  var soundPath: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String | Boolean] = js.undefined
  
  // Close notifications by clicking on them
  var width: js.UndefOr[Double] = js.undefined
}
object NotifyDefault {
  
  inline def apply(): NotifyDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyDefault]
  }
  
  extension [Self <: NotifyDefault](x: Self) {
    
    inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setContinueDelayOnInactiveTab(value: Boolean): Self = StObject.set(x, "continueDelayOnInactiveTab", value.asInstanceOf[js.Any])
    
    inline def setContinueDelayOnInactiveTabUndefined: Self = StObject.set(x, "continueDelayOnInactiveTab", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayIndicator(value: Boolean): Self = StObject.set(x, "delayIndicator", value.asInstanceOf[js.Any])
    
    inline def setDelayIndicatorUndefined: Self = StObject.set(x, "delayIndicator", js.undefined)
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setHideClass(value: String): Self = StObject.set(x, "hideClass", value.asInstanceOf[js.Any])
    
    inline def setHideClassUndefined: Self = StObject.set(x, "hideClass", js.undefined)
    
    inline def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
    
    inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnClickUrl(value: String): Self = StObject.set(x, "onClickUrl", value.asInstanceOf[js.Any])
    
    inline def setOnClickUrlUndefined: Self = StObject.set(x, "onClickUrl", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowAfterPrevious(value: Boolean): Self = StObject.set(x, "showAfterPrevious", value.asInstanceOf[js.Any])
    
    inline def setShowAfterPreviousUndefined: Self = StObject.set(x, "showAfterPrevious", js.undefined)
    
    inline def setShowClass(value: String): Self = StObject.set(x, "showClass", value.asInstanceOf[js.Any])
    
    inline def setShowClassUndefined: Self = StObject.set(x, "showClass", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundExt(value: String): Self = StObject.set(x, "soundExt", value.asInstanceOf[js.Any])
    
    inline def setSoundExtUndefined: Self = StObject.set(x, "soundExt", js.undefined)
    
    inline def setSoundPath(value: String): Self = StObject.set(x, "soundPath", value.asInstanceOf[js.Any])
    
    inline def setSoundPathUndefined: Self = StObject.set(x, "soundPath", js.undefined)
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    inline def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
