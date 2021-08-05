package typings.headroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    /** when at bottom of scoll area */
    var bottom: js.UndefOr[String] = js.undefined
    
    /** when frozen method has been called */
    var frozen: js.UndefOr[String] = js.undefined
    
    /** when element is initialised */
    var initial: js.UndefOr[String] = js.undefined
    
    /** when not at bottom of scroll area */
    var notBottom: js.UndefOr[String] = js.undefined
    
    /** when below offset */
    var notTop: js.UndefOr[String] = js.undefined
    
    /** when scrolling up */
    var pinned: js.UndefOr[String] = js.undefined
    
    /** when above offset */
    var top: js.UndefOr[String] = js.undefined
    
    /** when scrolling down */
    var unpinned: js.UndefOr[String] = js.undefined
  }
  object Bottom {
    
    inline def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setFrozen(value: String): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      inline def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
      
      inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setNotBottom(value: String): Self = StObject.set(x, "notBottom", value.asInstanceOf[js.Any])
      
      inline def setNotBottomUndefined: Self = StObject.set(x, "notBottom", js.undefined)
      
      inline def setNotTop(value: String): Self = StObject.set(x, "notTop", value.asInstanceOf[js.Any])
      
      inline def setNotTopUndefined: Self = StObject.set(x, "notTop", js.undefined)
      
      inline def setPinned(value: String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setUnpinned(value: String): Self = StObject.set(x, "unpinned", value.asInstanceOf[js.Any])
      
      inline def setUnpinnedUndefined: Self = StObject.set(x, "unpinned", js.undefined)
    }
  }
  
  trait Down extends StObject {
    
    var down: js.UndefOr[Double] = js.undefined
    
    var up: js.UndefOr[Double] = js.undefined
  }
  object Down {
    
    inline def apply(): Down = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Down]
    }
    
    extension [Self <: Down](x: Self) {
      
      inline def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
}
