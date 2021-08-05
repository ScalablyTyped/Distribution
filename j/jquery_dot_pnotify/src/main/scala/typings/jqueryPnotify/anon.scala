package typings.jqueryPnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    var close: js.UndefOr[String] = js.undefined
    
    var stick: js.UndefOr[String] = js.undefined
    
    var unstick: js.UndefOr[String] = js.undefined
  }
  object Close {
    
    inline def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setStick(value: String): Self = StObject.set(x, "stick", value.asInstanceOf[js.Any])
      
      inline def setStickUndefined: Self = StObject.set(x, "stick", js.undefined)
      
      inline def setUnstick(value: String): Self = StObject.set(x, "unstick", value.asInstanceOf[js.Any])
      
      inline def setUnstickUndefined: Self = StObject.set(x, "unstick", js.undefined)
    }
  }
  
  trait Closer extends StObject {
    
    var closer: js.UndefOr[String] = js.undefined
    
    var pin_down: js.UndefOr[String] = js.undefined
    
    var pin_up: js.UndefOr[String] = js.undefined
  }
  object Closer {
    
    inline def apply(): Closer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Closer]
    }
    
    extension [Self <: Closer](x: Self) {
      
      inline def setCloser(value: String): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
      
      inline def setCloserUndefined: Self = StObject.set(x, "closer", js.undefined)
      
      inline def setPin_down(value: String): Self = StObject.set(x, "pin_down", value.asInstanceOf[js.Any])
      
      inline def setPin_downUndefined: Self = StObject.set(x, "pin_down", js.undefined)
      
      inline def setPin_up(value: String): Self = StObject.set(x, "pin_up", value.asInstanceOf[js.Any])
      
      inline def setPin_upUndefined: Self = StObject.set(x, "pin_up", js.undefined)
    }
  }
  
  trait Closerhover extends StObject {
    
    /**
      * Provide a button for the user to manually close the notice.
      */
    var closer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only show the closer button on hover.
      */
    var closer_hover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Provide a button for the user to manually stick the notice.
      */
    var sticker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only show the sticker button on hover.
      */
    var sticker_hover: js.UndefOr[Boolean] = js.undefined
  }
  object Closerhover {
    
    inline def apply(): Closerhover = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Closerhover]
    }
    
    extension [Self <: Closerhover](x: Self) {
      
      inline def setCloser(value: Boolean): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
      
      inline def setCloserUndefined: Self = StObject.set(x, "closer", js.undefined)
      
      inline def setCloser_hover(value: Boolean): Self = StObject.set(x, "closer_hover", value.asInstanceOf[js.Any])
      
      inline def setCloser_hoverUndefined: Self = StObject.set(x, "closer_hover", js.undefined)
      
      inline def setSticker(value: Boolean): Self = StObject.set(x, "sticker", value.asInstanceOf[js.Any])
      
      inline def setStickerUndefined: Self = StObject.set(x, "sticker", js.undefined)
      
      inline def setSticker_hover(value: Boolean): Self = StObject.set(x, "sticker_hover", value.asInstanceOf[js.Any])
      
      inline def setSticker_hoverUndefined: Self = StObject.set(x, "sticker_hover", js.undefined)
    }
  }
  
  trait Nonblock extends StObject {
    
    /**
      * Create a non-blocking notice. It lets the user click elements underneath it.
      */
    var nonblock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The opacity of the notice (if it's non-blocking) when the mouse is over it.
      */
    var nonblock_opacity: js.UndefOr[Double] = js.undefined
  }
  object Nonblock {
    
    inline def apply(): Nonblock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Nonblock]
    }
    
    extension [Self <: Nonblock](x: Self) {
      
      inline def setNonblock(value: Boolean): Self = StObject.set(x, "nonblock", value.asInstanceOf[js.Any])
      
      inline def setNonblockUndefined: Self = StObject.set(x, "nonblock", js.undefined)
      
      inline def setNonblock_opacity(value: Double): Self = StObject.set(x, "nonblock_opacity", value.asInstanceOf[js.Any])
      
      inline def setNonblock_opacityUndefined: Self = StObject.set(x, "nonblock_opacity", js.undefined)
    }
  }
}
