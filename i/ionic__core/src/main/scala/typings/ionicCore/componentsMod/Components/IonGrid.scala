package typings.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonGrid extends StObject {
  
  /**
    * If `true`, the grid will have a fixed width based on the screen size.
    */
  var fixed: Boolean
}
object IonGrid {
  
  inline def apply(fixed: Boolean): IonGrid = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonGrid]
  }
  
  extension [Self <: IonGrid](x: Self) {
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
  }
}
