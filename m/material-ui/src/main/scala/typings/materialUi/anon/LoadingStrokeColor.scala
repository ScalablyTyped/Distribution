package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingStrokeColor extends StObject {
  
  var loadingStrokeColor: js.UndefOr[String] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
}
object LoadingStrokeColor {
  
  inline def apply(): LoadingStrokeColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingStrokeColor]
  }
  
  extension [Self <: LoadingStrokeColor](x: Self) {
    
    inline def setLoadingStrokeColor(value: String): Self = StObject.set(x, "loadingStrokeColor", value.asInstanceOf[js.Any])
    
    inline def setLoadingStrokeColorUndefined: Self = StObject.set(x, "loadingStrokeColor", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
  }
}
