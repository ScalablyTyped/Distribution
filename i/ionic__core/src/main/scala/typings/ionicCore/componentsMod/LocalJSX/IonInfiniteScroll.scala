package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.top
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonInfiniteScroll extends StObject {
  
  /**
    * If `true`, the infinite scroll will be hidden and scroll event listeners will be removed.  Set this to true to disable the infinite scroll from actively trying to receive new data while scrolling. This is useful when it is known that there is no more data that can be added, and the infinite scroll is no longer needed.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Emitted when the scroll reaches the threshold distance. From within your infinite handler, you must call the infinite scroll's `complete()` method when your async operation has completed.
    */
  var onIonInfinite: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * The position of the infinite scroll element. The value can be either `top` or `bottom`.
    */
  var position: js.UndefOr[top | bottom] = js.undefined
  
  /**
    * The threshold distance from the bottom of the content to call the `infinite` output event when scrolled. The threshold value can be either a percent, or in pixels. For example, use the value of `10%` for the `infinite` output event to get called when the user has scrolled 10% from the bottom of the page. Use the value `100px` when the scroll is within 100 pixels from the bottom of the page.
    */
  var threshold: js.UndefOr[String] = js.undefined
}
object IonInfiniteScroll {
  
  inline def apply(): IonInfiniteScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonInfiniteScroll]
  }
  
  extension [Self <: IonInfiniteScroll](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnIonInfinite(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonInfinite", js.Any.fromFunction1(value))
    
    inline def setOnIonInfiniteUndefined: Self = StObject.set(x, "onIonInfinite", js.undefined)
    
    inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
