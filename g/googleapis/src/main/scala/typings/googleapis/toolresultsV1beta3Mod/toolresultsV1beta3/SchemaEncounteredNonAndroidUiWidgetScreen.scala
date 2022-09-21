package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEncounteredNonAndroidUiWidgetScreen extends StObject {
  
  /**
    * Number of encountered distinct screens with non Android UI widgets.
    */
  var distinctScreens: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Subset of screens which contain non Android UI widgets.
    */
  var screenIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaEncounteredNonAndroidUiWidgetScreen {
  
  inline def apply(): SchemaEncounteredNonAndroidUiWidgetScreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEncounteredNonAndroidUiWidgetScreen]
  }
  
  extension [Self <: SchemaEncounteredNonAndroidUiWidgetScreen](x: Self) {
    
    inline def setDistinctScreens(value: Double): Self = StObject.set(x, "distinctScreens", value.asInstanceOf[js.Any])
    
    inline def setDistinctScreensNull: Self = StObject.set(x, "distinctScreens", null)
    
    inline def setDistinctScreensUndefined: Self = StObject.set(x, "distinctScreens", js.undefined)
    
    inline def setScreenIds(value: js.Array[String]): Self = StObject.set(x, "screenIds", value.asInstanceOf[js.Any])
    
    inline def setScreenIdsNull: Self = StObject.set(x, "screenIds", null)
    
    inline def setScreenIdsUndefined: Self = StObject.set(x, "screenIds", js.undefined)
    
    inline def setScreenIdsVarargs(value: String*): Self = StObject.set(x, "screenIds", js.Array(value*))
  }
}
