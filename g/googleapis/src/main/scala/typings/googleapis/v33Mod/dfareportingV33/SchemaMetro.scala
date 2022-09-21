package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetro extends StObject {
  
  /**
    * Country code of the country to which this metro region belongs.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DART ID of the country to which this metro region belongs.
    */
  var countryDartId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DART ID of this metro region.
    */
  var dartId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DMA ID of this metro region. This is the ID used for targeting and generating reports, and is equivalent to metro_code.
    */
  var dmaId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#metro".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metro code of this metro region. This is equivalent to dma_id.
    */
  var metroCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this metro region.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetro {
  
  inline def apply(): SchemaMetro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetro]
  }
  
  extension [Self <: SchemaMetro](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCountryDartId(value: String): Self = StObject.set(x, "countryDartId", value.asInstanceOf[js.Any])
    
    inline def setCountryDartIdNull: Self = StObject.set(x, "countryDartId", null)
    
    inline def setCountryDartIdUndefined: Self = StObject.set(x, "countryDartId", js.undefined)
    
    inline def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    inline def setDartIdNull: Self = StObject.set(x, "dartId", null)
    
    inline def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    inline def setDmaId(value: String): Self = StObject.set(x, "dmaId", value.asInstanceOf[js.Any])
    
    inline def setDmaIdNull: Self = StObject.set(x, "dmaId", null)
    
    inline def setDmaIdUndefined: Self = StObject.set(x, "dmaId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetroCode(value: String): Self = StObject.set(x, "metroCode", value.asInstanceOf[js.Any])
    
    inline def setMetroCodeNull: Self = StObject.set(x, "metroCode", null)
    
    inline def setMetroCodeUndefined: Self = StObject.set(x, "metroCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
