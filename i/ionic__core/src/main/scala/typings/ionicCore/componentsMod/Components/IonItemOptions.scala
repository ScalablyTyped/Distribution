package typings.ionicCore.componentsMod.Components

import typings.ionicCore.mod.Side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonItemOptions extends StObject {
  
  def fireSwipeEvent(): js.Promise[Unit]
  
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: Side
}
object IonItemOptions {
  
  inline def apply(fireSwipeEvent: () => js.Promise[Unit], side: Side): IonItemOptions = {
    val __obj = js.Dynamic.literal(fireSwipeEvent = js.Any.fromFunction0(fireSwipeEvent), side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonItemOptions]
  }
  
  extension [Self <: IonItemOptions](x: Self) {
    
    inline def setFireSwipeEvent(value: () => js.Promise[Unit]): Self = StObject.set(x, "fireSwipeEvent", js.Any.fromFunction0(value))
    
    inline def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
