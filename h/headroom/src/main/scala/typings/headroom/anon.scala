package typings.headroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bottom extends StObject {
    
    /** when at bottom of scoll area */
    var bottom: js.UndefOr[String] = js.native
    
    /** when frozen method has been called */
    var frozen: js.UndefOr[String] = js.native
    
    /** when element is initialised */
    var initial: js.UndefOr[String] = js.native
    
    /** when not at bottom of scroll area */
    var notBottom: js.UndefOr[String] = js.native
    
    /** when below offset */
    var notTop: js.UndefOr[String] = js.native
    
    /** when scrolling up */
    var pinned: js.UndefOr[String] = js.native
    
    /** when above offset */
    var top: js.UndefOr[String] = js.native
    
    /** when scrolling down */
    var unpinned: js.UndefOr[String] = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setFrozen(value: String): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
      
      @scala.inline
      def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setNotBottom(value: String): Self = StObject.set(x, "notBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBottomUndefined: Self = StObject.set(x, "notBottom", js.undefined)
      
      @scala.inline
      def setNotTop(value: String): Self = StObject.set(x, "notTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotTopUndefined: Self = StObject.set(x, "notTop", js.undefined)
      
      @scala.inline
      def setPinned(value: String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setUnpinned(value: String): Self = StObject.set(x, "unpinned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnpinnedUndefined: Self = StObject.set(x, "unpinned", js.undefined)
    }
  }
  
  @js.native
  trait Down extends StObject {
    
    var down: js.UndefOr[Double] = js.native
    
    var up: js.UndefOr[Double] = js.native
  }
  object Down {
    
    @scala.inline
    def apply(): Down = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Down]
    }
    
    @scala.inline
    implicit class DownMutableBuilder[Self <: Down] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
}
