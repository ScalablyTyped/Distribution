package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCitiesList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only cities from these countries.
    */
  var countryDartIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only cities with these DART IDs.
    */
  var dartIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only cities with names starting with this prefix.
    */
  var namePrefix: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Select only cities from these regions.
    */
  var regionDartIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceCitiesList {
  
  inline def apply(): ParamsResourceCitiesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCitiesList]
  }
  
  extension [Self <: ParamsResourceCitiesList](x: Self) {
    
    inline def setCountryDartIds(value: js.Array[String]): Self = StObject.set(x, "countryDartIds", value.asInstanceOf[js.Any])
    
    inline def setCountryDartIdsUndefined: Self = StObject.set(x, "countryDartIds", js.undefined)
    
    inline def setCountryDartIdsVarargs(value: String*): Self = StObject.set(x, "countryDartIds", js.Array(value*))
    
    inline def setDartIds(value: js.Array[String]): Self = StObject.set(x, "dartIds", value.asInstanceOf[js.Any])
    
    inline def setDartIdsUndefined: Self = StObject.set(x, "dartIds", js.undefined)
    
    inline def setDartIdsVarargs(value: String*): Self = StObject.set(x, "dartIds", js.Array(value*))
    
    inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setRegionDartIds(value: js.Array[String]): Self = StObject.set(x, "regionDartIds", value.asInstanceOf[js.Any])
    
    inline def setRegionDartIdsUndefined: Self = StObject.set(x, "regionDartIds", js.undefined)
    
    inline def setRegionDartIdsVarargs(value: String*): Self = StObject.set(x, "regionDartIds", js.Array(value*))
  }
}
