package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInfotypesList
  extends StObject
     with StandardParameters {
  
  /**
    * filter to only return infoTypes supported by certain parts of the API. Defaults to supported_by=INSPECT.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * BCP-47 language code for localized infoType friendly names. If omitted, or if localized strings are not available, en-US strings will be returned.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. This field has no effect.
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * The parent resource name. The format of this value is as follows: locations/ LOCATION_ID
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceInfotypesList {
  
  inline def apply(): ParamsResourceInfotypesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInfotypesList]
  }
  
  extension [Self <: ParamsResourceInfotypesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
