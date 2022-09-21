package typings.googleapis.ideahubV1betaMod.ideahubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSearchIdeahubV1betaAvailableLocale extends StObject {
  
  /**
    * A string in BCP 47 format, without a resource prefix.
    */
  var locale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string in BCP 47 format, prefixed with the platform and property name, and "locales/". Format: platforms/{platform\}/properties/{property\}/locales/{locale\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSearchIdeahubV1betaAvailableLocale {
  
  inline def apply(): SchemaGoogleSearchIdeahubV1betaAvailableLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSearchIdeahubV1betaAvailableLocale]
  }
  
  extension [Self <: SchemaGoogleSearchIdeahubV1betaAvailableLocale](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
