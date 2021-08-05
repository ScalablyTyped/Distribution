package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenStreetMapProviderOptionsOutputDetails extends StObject {
  
  var addressdetails: js.UndefOr[`0` | `1`] = js.undefined
  
  var extratags: js.UndefOr[`0` | `1`] = js.undefined
  
  var namedetails: js.UndefOr[`0` | `1`] = js.undefined
}
object OpenStreetMapProviderOptionsOutputDetails {
  
  inline def apply(): OpenStreetMapProviderOptionsOutputDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOutputDetails]
  }
  
  extension [Self <: OpenStreetMapProviderOptionsOutputDetails](x: Self) {
    
    inline def setAddressdetails(value: `0` | `1`): Self = StObject.set(x, "addressdetails", value.asInstanceOf[js.Any])
    
    inline def setAddressdetailsUndefined: Self = StObject.set(x, "addressdetails", js.undefined)
    
    inline def setExtratags(value: `0` | `1`): Self = StObject.set(x, "extratags", value.asInstanceOf[js.Any])
    
    inline def setExtratagsUndefined: Self = StObject.set(x, "extratags", js.undefined)
    
    inline def setNamedetails(value: `0` | `1`): Self = StObject.set(x, "namedetails", value.asInstanceOf[js.Any])
    
    inline def setNamedetailsUndefined: Self = StObject.set(x, "namedetails", js.undefined)
  }
}
