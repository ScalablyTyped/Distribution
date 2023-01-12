package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCardV1BorderStyle extends StObject {
  
  /** The corner radius for the border. */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  /** The colors to use when the type is `BORDER_TYPE_STROKE`. */
  var strokeColor: js.UndefOr[Color] = js.undefined
  
  /** The border type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleAppsCardV1BorderStyle {
  
  inline def apply(): GoogleAppsCardV1BorderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCardV1BorderStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAppsCardV1BorderStyle] (val x: Self) extends AnyVal {
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setStrokeColor(value: Color): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
