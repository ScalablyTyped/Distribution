package typings.jqueryPnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Close extends StObject {
    
    var close: js.UndefOr[String] = js.native
    
    var stick: js.UndefOr[String] = js.native
    
    var unstick: js.UndefOr[String] = js.native
  }
  object Close {
    
    @scala.inline
    def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setStick(value: String): Self = StObject.set(x, "stick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickUndefined: Self = StObject.set(x, "stick", js.undefined)
      
      @scala.inline
      def setUnstick(value: String): Self = StObject.set(x, "unstick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstickUndefined: Self = StObject.set(x, "unstick", js.undefined)
    }
  }
  
  @js.native
  trait Closer extends StObject {
    
    var closer: js.UndefOr[String] = js.native
    
    var pin_down: js.UndefOr[String] = js.native
    
    var pin_up: js.UndefOr[String] = js.native
  }
  object Closer {
    
    @scala.inline
    def apply(): Closer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Closer]
    }
    
    @scala.inline
    implicit class CloserMutableBuilder[Self <: Closer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloser(value: String): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloserUndefined: Self = StObject.set(x, "closer", js.undefined)
      
      @scala.inline
      def setPin_down(value: String): Self = StObject.set(x, "pin_down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPin_downUndefined: Self = StObject.set(x, "pin_down", js.undefined)
      
      @scala.inline
      def setPin_up(value: String): Self = StObject.set(x, "pin_up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPin_upUndefined: Self = StObject.set(x, "pin_up", js.undefined)
    }
  }
  
  @js.native
  trait Closerhover extends StObject {
    
    /**
      * Provide a button for the user to manually close the notice.
      */
    var closer: js.UndefOr[Boolean] = js.native
    
    /**
      * Only show the closer button on hover.
      */
    var closer_hover: js.UndefOr[Boolean] = js.native
    
    /**
      * Provide a button for the user to manually stick the notice.
      */
    var sticker: js.UndefOr[Boolean] = js.native
    
    /**
      * Only show the sticker button on hover.
      */
    var sticker_hover: js.UndefOr[Boolean] = js.native
  }
  object Closerhover {
    
    @scala.inline
    def apply(): Closerhover = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Closerhover]
    }
    
    @scala.inline
    implicit class CloserhoverMutableBuilder[Self <: Closerhover] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloser(value: Boolean): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloserUndefined: Self = StObject.set(x, "closer", js.undefined)
      
      @scala.inline
      def setCloser_hover(value: Boolean): Self = StObject.set(x, "closer_hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloser_hoverUndefined: Self = StObject.set(x, "closer_hover", js.undefined)
      
      @scala.inline
      def setSticker(value: Boolean): Self = StObject.set(x, "sticker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickerUndefined: Self = StObject.set(x, "sticker", js.undefined)
      
      @scala.inline
      def setSticker_hover(value: Boolean): Self = StObject.set(x, "sticker_hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSticker_hoverUndefined: Self = StObject.set(x, "sticker_hover", js.undefined)
    }
  }
  
  @js.native
  trait Nonblock extends StObject {
    
    /**
      * Create a non-blocking notice. It lets the user click elements underneath it.
      */
    var nonblock: js.UndefOr[Boolean] = js.native
    
    /**
      * The opacity of the notice (if it's non-blocking) when the mouse is over it.
      */
    var nonblock_opacity: js.UndefOr[Double] = js.native
  }
  object Nonblock {
    
    @scala.inline
    def apply(): Nonblock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Nonblock]
    }
    
    @scala.inline
    implicit class NonblockMutableBuilder[Self <: Nonblock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonblock(value: Boolean): Self = StObject.set(x, "nonblock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonblockUndefined: Self = StObject.set(x, "nonblock", js.undefined)
      
      @scala.inline
      def setNonblock_opacity(value: Double): Self = StObject.set(x, "nonblock_opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonblock_opacityUndefined: Self = StObject.set(x, "nonblock_opacity", js.undefined)
    }
  }
}
