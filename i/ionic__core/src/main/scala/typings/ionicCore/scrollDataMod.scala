package typings.ionicCore

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollDataMod {
  
  @JSImport("@ionic/core/dist/types/utils/input-shims/hacks/scroll-data", "getScrollData")
  @js.native
  def getScrollData(componentEl: HTMLElement, contentEl: HTMLElement, keyboardHeight: Double): ScrollData = js.native
  
  @js.native
  trait ScrollData extends StObject {
    
    var inputSafeY: Double = js.native
    
    var scrollAmount: Double = js.native
    
    var scrollDuration: Double = js.native
    
    var scrollPadding: Double = js.native
  }
  object ScrollData {
    
    @scala.inline
    def apply(inputSafeY: Double, scrollAmount: Double, scrollDuration: Double, scrollPadding: Double): ScrollData = {
      val __obj = js.Dynamic.literal(inputSafeY = inputSafeY.asInstanceOf[js.Any], scrollAmount = scrollAmount.asInstanceOf[js.Any], scrollDuration = scrollDuration.asInstanceOf[js.Any], scrollPadding = scrollPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollData]
    }
    
    @scala.inline
    implicit class ScrollDataMutableBuilder[Self <: ScrollData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputSafeY(value: Double): Self = StObject.set(x, "inputSafeY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollAmount(value: Double): Self = StObject.set(x, "scrollAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPadding(value: Double): Self = StObject.set(x, "scrollPadding", value.asInstanceOf[js.Any])
    }
  }
}
