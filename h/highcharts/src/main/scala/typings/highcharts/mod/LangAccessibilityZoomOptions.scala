package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityZoomOptions extends StObject {
  
  var mapZoomIn: js.UndefOr[String] = js.undefined
  
  var mapZoomOut: js.UndefOr[String] = js.undefined
  
  var resetZoomButton: js.UndefOr[String] = js.undefined
}
object LangAccessibilityZoomOptions {
  
  inline def apply(): LangAccessibilityZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityZoomOptions]
  }
  
  extension [Self <: LangAccessibilityZoomOptions](x: Self) {
    
    inline def setMapZoomIn(value: String): Self = StObject.set(x, "mapZoomIn", value.asInstanceOf[js.Any])
    
    inline def setMapZoomInUndefined: Self = StObject.set(x, "mapZoomIn", js.undefined)
    
    inline def setMapZoomOut(value: String): Self = StObject.set(x, "mapZoomOut", value.asInstanceOf[js.Any])
    
    inline def setMapZoomOutUndefined: Self = StObject.set(x, "mapZoomOut", js.undefined)
    
    inline def setResetZoomButton(value: String): Self = StObject.set(x, "resetZoomButton", value.asInstanceOf[js.Any])
    
    inline def setResetZoomButtonUndefined: Self = StObject.set(x, "resetZoomButton", js.undefined)
  }
}
