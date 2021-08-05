package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.center
import typings.ionicCore.ionicCoreStrings.end
import typings.ionicCore.ionicCoreStrings.start
import typings.ionicCore.ionicCoreStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonFab extends StObject {
  
  /**
    * If `true`, both the `ion-fab-button` and all `ion-fab-list` inside `ion-fab` will become active. That means `ion-fab-button` will become a `close` icon and `ion-fab-list` will become visible.
    */
  var activated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the fab will display on the edge of the header if `vertical` is `"top"`, and on the edge of the footer if it is `"bottom"`. Should be used with a `fixed` slot.
    */
  var edge: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Where to align the fab horizontally in the viewport.
    */
  var horizontal: js.UndefOr[start | end | center] = js.undefined
  
  /**
    * Where to align the fab vertically in the viewport.
    */
  var vertical: js.UndefOr[top | bottom | center] = js.undefined
}
object IonFab {
  
  inline def apply(): IonFab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonFab]
  }
  
  extension [Self <: IonFab](x: Self) {
    
    inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    inline def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setHorizontal(value: start | end | center): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    inline def setVertical(value: top | bottom | center): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
