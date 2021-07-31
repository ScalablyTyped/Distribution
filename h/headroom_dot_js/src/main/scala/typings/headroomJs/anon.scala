package typings.headroomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    /**
      * when at bottom of scroll area
      * @default 'headroom--bottom'
      */
    var bottom: js.UndefOr[String] = js.undefined
    
    /**
      * when frozen method has been called
      * @default 'headroom--frozen'
      */
    var frozen: js.UndefOr[String] = js.undefined
    
    /**
      * when element is initialised
      * @default 'headroom'
      */
    var initial: js.UndefOr[String] = js.undefined
    
    /**
      * when not at bottom of scroll area
      * @default 'headroom--not-bottom'
      */
    var notBottom: js.UndefOr[String] = js.undefined
    
    /**
      * when below offset
      * @default 'headroom--not-top'
      */
    var notTop: js.UndefOr[String] = js.undefined
    
    /**
      * when scrolling up
      * @default 'headroom--pinned'
      */
    var pinned: js.UndefOr[String] = js.undefined
    
    /**
      * when above offset
      * @default 'headroom--top'
      */
    var top: js.UndefOr[String] = js.undefined
    
    /**
      * when scrolling down
      * @default 'headroom--unpinned'
      */
    var unpinned: js.UndefOr[String] = js.undefined
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
}
