package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a city that can be targeted by ads.
  */
trait SchemaCity extends StObject {
  
  /**
    * Country code of the country to which this city belongs.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * DART ID of the country to which this city belongs.
    */
  var countryDartId: js.UndefOr[String] = js.undefined
  
  /**
    * DART ID of this city. This is the ID used for targeting and generating
    * reports.
    */
  var dartId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#city&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Metro region code of the metro region (DMA) to which this city belongs.
    */
  var metroCode: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the metro region (DMA) to which this city belongs.
    */
  var metroDmaId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this city.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Region code of the region to which this city belongs.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * DART ID of the region to which this city belongs.
    */
  var regionDartId: js.UndefOr[String] = js.undefined
}
object SchemaCity {
  
  inline def apply(): SchemaCity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCity]
  }
  
  extension [Self <: SchemaCity](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCountryDartId(value: String): Self = StObject.set(x, "countryDartId", value.asInstanceOf[js.Any])
    
    inline def setCountryDartIdUndefined: Self = StObject.set(x, "countryDartId", js.undefined)
    
    inline def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    inline def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetroCode(value: String): Self = StObject.set(x, "metroCode", value.asInstanceOf[js.Any])
    
    inline def setMetroCodeUndefined: Self = StObject.set(x, "metroCode", js.undefined)
    
    inline def setMetroDmaId(value: String): Self = StObject.set(x, "metroDmaId", value.asInstanceOf[js.Any])
    
    inline def setMetroDmaIdUndefined: Self = StObject.set(x, "metroDmaId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setRegionDartId(value: String): Self = StObject.set(x, "regionDartId", value.asInstanceOf[js.Any])
    
    inline def setRegionDartIdUndefined: Self = StObject.set(x, "regionDartId", js.undefined)
  }
}
