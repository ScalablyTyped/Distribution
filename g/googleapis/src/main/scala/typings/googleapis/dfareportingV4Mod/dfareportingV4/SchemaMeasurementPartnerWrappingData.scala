package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMeasurementPartnerWrappingData extends StObject {
  
  /**
    * Placement wrapping status.
    */
  var linkStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Measurement partner used for wrapping the placement.
    */
  var measurementPartner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Measurement mode for the wrapped placement.
    */
  var tagWrappingMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tag provided by the measurement partner during wrapping.
    */
  var wrappedTag: js.UndefOr[String | Null] = js.undefined
}
object SchemaMeasurementPartnerWrappingData {
  
  inline def apply(): SchemaMeasurementPartnerWrappingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMeasurementPartnerWrappingData]
  }
  
  extension [Self <: SchemaMeasurementPartnerWrappingData](x: Self) {
    
    inline def setLinkStatus(value: String): Self = StObject.set(x, "linkStatus", value.asInstanceOf[js.Any])
    
    inline def setLinkStatusNull: Self = StObject.set(x, "linkStatus", null)
    
    inline def setLinkStatusUndefined: Self = StObject.set(x, "linkStatus", js.undefined)
    
    inline def setMeasurementPartner(value: String): Self = StObject.set(x, "measurementPartner", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPartnerNull: Self = StObject.set(x, "measurementPartner", null)
    
    inline def setMeasurementPartnerUndefined: Self = StObject.set(x, "measurementPartner", js.undefined)
    
    inline def setTagWrappingMode(value: String): Self = StObject.set(x, "tagWrappingMode", value.asInstanceOf[js.Any])
    
    inline def setTagWrappingModeNull: Self = StObject.set(x, "tagWrappingMode", null)
    
    inline def setTagWrappingModeUndefined: Self = StObject.set(x, "tagWrappingMode", js.undefined)
    
    inline def setWrappedTag(value: String): Self = StObject.set(x, "wrappedTag", value.asInstanceOf[js.Any])
    
    inline def setWrappedTagNull: Self = StObject.set(x, "wrappedTag", null)
    
    inline def setWrappedTagUndefined: Self = StObject.set(x, "wrappedTag", js.undefined)
  }
}
