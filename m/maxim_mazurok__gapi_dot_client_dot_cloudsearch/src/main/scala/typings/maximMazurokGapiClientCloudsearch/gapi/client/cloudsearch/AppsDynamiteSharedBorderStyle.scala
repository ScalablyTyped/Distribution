package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedBorderStyle extends StObject {
  
  /** The corner radius for the border. */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  /** The colors to use when the type is `BORDER_TYPE_STROKE`. */
  var strokeColor: js.UndefOr[Color] = js.undefined
  
  /** The border type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedBorderStyle {
  
  inline def apply(): AppsDynamiteSharedBorderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedBorderStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedBorderStyle] (val x: Self) extends AnyVal {
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setStrokeColor(value: Color): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
