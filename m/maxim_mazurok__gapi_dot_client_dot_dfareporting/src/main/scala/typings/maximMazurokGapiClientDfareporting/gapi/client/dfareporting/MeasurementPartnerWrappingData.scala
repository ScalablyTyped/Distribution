package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasurementPartnerWrappingData extends StObject {
  
  /** Placement wrapping status. */
  var linkStatus: js.UndefOr[String] = js.undefined
  
  /** Measurement partner used for wrapping the placement. */
  var measurementPartner: js.UndefOr[String] = js.undefined
  
  /** Measurement mode for the wrapped placement. */
  var tagWrappingMode: js.UndefOr[String] = js.undefined
  
  /** Tag provided by the measurement partner during wrapping. */
  var wrappedTag: js.UndefOr[String] = js.undefined
}
object MeasurementPartnerWrappingData {
  
  inline def apply(): MeasurementPartnerWrappingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasurementPartnerWrappingData]
  }
  
  extension [Self <: MeasurementPartnerWrappingData](x: Self) {
    
    inline def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    inline def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
    
    inline def setMeasurementPartner(value: String): Self = StObject.set(x, "measurementPartner", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPartnerUndefined: Self = StObject.set(x, "measurementPartner", js.undefined)
    
    inline def setTagWrappingMode(value: String): Self = StObject.set(x, "tagWrappingMode", value.asInstanceOf[js.Any])
    
    inline def setTagWrappingModeUndefined: Self = StObject.set(x, "tagWrappingMode", js.undefined)
    
    inline def setWrappedTag(value: String): Self = StObject.set(x, "wrappedTag", value.asInstanceOf[js.Any])
    
    inline def setWrappedTagUndefined: Self = StObject.set(x, "wrappedTag", js.undefined)
  }
}
