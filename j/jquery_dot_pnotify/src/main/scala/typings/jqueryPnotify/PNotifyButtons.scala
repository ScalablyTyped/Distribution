package typings.jqueryPnotify

import typings.jqueryPnotify.anon.Close
import typings.jqueryPnotify.anon.Closer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PNotifyButtons extends StObject {
  
  /**
    * The classes to use for button icons. Leave them null to use the classes from the styling you're using.
    */
  var classes: js.UndefOr[Closer] = js.undefined
  
  /**
    * Provide a button for the user to manually close the notice.
    */
  var closer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only show the closer button on hover.
    */
  var closer_hover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The various displayed text, helps facilitating internationalization.
    */
  var labels: js.UndefOr[Close] = js.undefined
  
  /**
    * Show the buttons even when the nonblock module is in use.
    */
  var show_on_nonblock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provide a button for the user to manually stick the notice.
    */
  var sticker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only show the sticker button on hover.
    */
  var sticker_hover: js.UndefOr[Boolean] = js.undefined
}
object PNotifyButtons {
  
  inline def apply(): PNotifyButtons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyButtons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PNotifyButtons] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: Closer): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setCloser(value: Boolean): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
    
    inline def setCloserUndefined: Self = StObject.set(x, "closer", js.undefined)
    
    inline def setCloser_hover(value: Boolean): Self = StObject.set(x, "closer_hover", value.asInstanceOf[js.Any])
    
    inline def setCloser_hoverUndefined: Self = StObject.set(x, "closer_hover", js.undefined)
    
    inline def setLabels(value: Close): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setShow_on_nonblock(value: Boolean): Self = StObject.set(x, "show_on_nonblock", value.asInstanceOf[js.Any])
    
    inline def setShow_on_nonblockUndefined: Self = StObject.set(x, "show_on_nonblock", js.undefined)
    
    inline def setSticker(value: Boolean): Self = StObject.set(x, "sticker", value.asInstanceOf[js.Any])
    
    inline def setStickerUndefined: Self = StObject.set(x, "sticker", js.undefined)
    
    inline def setSticker_hover(value: Boolean): Self = StObject.set(x, "sticker_hover", value.asInstanceOf[js.Any])
    
    inline def setSticker_hoverUndefined: Self = StObject.set(x, "sticker_hover", js.undefined)
  }
}
