package typings.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonBackdrop extends StObject {
  
  /**
    * If `true`, the backdrop will stop propagation on tap.
    */
  var stopPropagation: Boolean
  
  /**
    * If `true`, the backdrop will can be clicked and will emit the `ionBackdropTap` event.
    */
  var tappable: Boolean
  
  /**
    * If `true`, the backdrop will be visible.
    */
  var visible: Boolean
}
object IonBackdrop {
  
  inline def apply(stopPropagation: Boolean, tappable: Boolean, visible: Boolean): IonBackdrop = {
    val __obj = js.Dynamic.literal(stopPropagation = stopPropagation.asInstanceOf[js.Any], tappable = tappable.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonBackdrop]
  }
  
  extension [Self <: IonBackdrop](x: Self) {
    
    inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setTappable(value: Boolean): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
