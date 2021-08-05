package typings.ionicCore

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollDataMod {
  
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScrollData(componentEl: HTMLElement, contentEl: HTMLElement, keyboardHeight: Double): ScrollData = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollData")(componentEl.asInstanceOf[js.Any], contentEl.asInstanceOf[js.Any], keyboardHeight.asInstanceOf[js.Any])).asInstanceOf[ScrollData]
  
  trait ScrollData extends StObject {
    
    var inputSafeY: Double
    
    var scrollAmount: Double
    
    var scrollDuration: Double
    
    var scrollPadding: Double
  }
  object ScrollData {
    
    inline def apply(inputSafeY: Double, scrollAmount: Double, scrollDuration: Double, scrollPadding: Double): ScrollData = {
      val __obj = js.Dynamic.literal(inputSafeY = inputSafeY.asInstanceOf[js.Any], scrollAmount = scrollAmount.asInstanceOf[js.Any], scrollDuration = scrollDuration.asInstanceOf[js.Any], scrollPadding = scrollPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollData]
    }
    
    extension [Self <: ScrollData](x: Self) {
      
      inline def setInputSafeY(value: Double): Self = StObject.set(x, "inputSafeY", value.asInstanceOf[js.Any])
      
      inline def setScrollAmount(value: Double): Self = StObject.set(x, "scrollAmount", value.asInstanceOf[js.Any])
      
      inline def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      inline def setScrollPadding(value: Double): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
    }
  }
}
