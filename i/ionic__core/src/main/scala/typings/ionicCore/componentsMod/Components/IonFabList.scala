package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.bottom
import typings.ionicCore.ionicCoreStrings.end
import typings.ionicCore.ionicCoreStrings.start
import typings.ionicCore.ionicCoreStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonFabList extends StObject {
  
  /**
    * If `true`, the fab list will show all fab buttons in the list.
    */
  var activated: Boolean
  
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: start | end | top | bottom
}
object IonFabList {
  
  inline def apply(activated: Boolean, side: start | end | top | bottom): IonFabList = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonFabList]
  }
  
  extension [Self <: IonFabList](x: Self) {
    
    inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setSide(value: start | end | top | bottom): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
