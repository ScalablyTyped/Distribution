package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEncounteredLoginScreen extends StObject {
  
  /**
    * Number of encountered distinct login screens.
    */
  var distinctScreens: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Subset of login screens.
    */
  var screenIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaEncounteredLoginScreen {
  
  inline def apply(): SchemaEncounteredLoginScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncounteredLoginScreen]
  }
  
  extension [Self <: SchemaEncounteredLoginScreen](x: Self) {
    
    inline def setDistinctScreens(value: Double): Self = StObject.set(x, "distinctScreens", value.asInstanceOf[js.Any])
    
    inline def setDistinctScreensNull: Self = StObject.set(x, "distinctScreens", null)
    
    inline def setDistinctScreensUndefined: Self = StObject.set(x, "distinctScreens", js.undefined)
    
    inline def setScreenIds(value: js.Array[String]): Self = StObject.set(x, "screenIds", value.asInstanceOf[js.Any])
    
    inline def setScreenIdsNull: Self = StObject.set(x, "screenIds", null)
    
    inline def setScreenIdsUndefined: Self = StObject.set(x, "screenIds", js.undefined)
    
    inline def setScreenIdsVarargs(value: String*): Self = StObject.set(x, "screenIds", js.Array(value*))
  }
}
