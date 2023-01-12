package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteFormatMetadata extends StObject {
  
  /**
    * Font color is set if and only if format_type is FONT_COLOR. The components are stored as (alpha << 24) | (red << 16) | (green << 8) | blue. Clients should always set the alpha
    * component to 0xFF. NEXT TAG: 3
    */
  var fontColor: js.UndefOr[Double] = js.undefined
  
  /** LINT.ThenChange(//depot/google3/apps/dynamite/v1/web/datakeys/annotated_span.proto) */
  var formatType: js.UndefOr[String] = js.undefined
}
object AppsDynamiteFormatMetadata {
  
  inline def apply(): AppsDynamiteFormatMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteFormatMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteFormatMetadata] (val x: Self) extends AnyVal {
    
    inline def setFontColor(value: Double): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
  }
}
