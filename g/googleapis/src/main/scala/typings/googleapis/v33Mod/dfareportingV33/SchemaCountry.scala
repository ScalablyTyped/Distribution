package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCountry extends StObject {
  
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DART ID of this country. This is the ID used for targeting and generating reports.
    */
  var dartId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#country".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this country.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether ad serving supports secure servers in this country.
    */
  var sslEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCountry {
  
  inline def apply(): SchemaCountry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountry]
  }
  
  extension [Self <: SchemaCountry](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setDartId(value: String): Self = StObject.set(x, "dartId", value.asInstanceOf[js.Any])
    
    inline def setDartIdNull: Self = StObject.set(x, "dartId", null)
    
    inline def setDartIdUndefined: Self = StObject.set(x, "dartId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    inline def setSslEnabledNull: Self = StObject.set(x, "sslEnabled", null)
    
    inline def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
  }
}
