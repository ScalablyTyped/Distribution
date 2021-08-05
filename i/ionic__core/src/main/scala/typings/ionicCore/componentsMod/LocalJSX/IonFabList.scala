package typings.ionicCore.componentsMod.LocalJSX

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
  var activated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The side the fab list will show on relative to the main fab button.
    */
  var side: js.UndefOr[start | end | top | bottom] = js.undefined
}
object IonFabList {
  
  inline def apply(): IonFabList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonFabList]
  }
  
  extension [Self <: IonFabList](x: Self) {
    
    inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    inline def setSide(value: start | end | top | bottom): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
  }
}
