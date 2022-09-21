package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelSectionTargeting extends StObject {
  
  /**
    * The country the channel section is targeting.
    */
  var countries: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The language the channel section is targeting.
    */
  var languages: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The region the channel section is targeting.
    */
  var regions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaChannelSectionTargeting {
  
  inline def apply(): SchemaChannelSectionTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionTargeting]
  }
  
  extension [Self <: SchemaChannelSectionTargeting](x: Self) {
    
    inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    inline def setCountriesNull: Self = StObject.set(x, "countries", null)
    
    inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
    
    inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
    
    inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesNull: Self = StObject.set(x, "languages", null)
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value*))
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsNull: Self = StObject.set(x, "regions", null)
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
  }
}
