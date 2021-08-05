package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a mobile carrier that can be targeted by ads.
  */
trait SchemaMobileCarrier extends StObject {
  
  /**
    * Country code of the country to which this mobile carrier belongs.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * DART ID of the country to which this mobile carrier belongs.
    */
  var countryDartId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this mobile carrier.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileCarrier&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this mobile carrier.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaMobileCarrier {
  
  inline def apply(): SchemaMobileCarrier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileCarrier]
  }
  
  extension [Self <: SchemaMobileCarrier](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCountryDartId(value: String): Self = StObject.set(x, "countryDartId", value.asInstanceOf[js.Any])
    
    inline def setCountryDartIdUndefined: Self = StObject.set(x, "countryDartId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
