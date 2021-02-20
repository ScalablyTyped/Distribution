package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapProviderOptionsOutputDetails extends StObject {
  
  var addressdetails: js.UndefOr[`0` | `1`] = js.native
  
  var extratags: js.UndefOr[`0` | `1`] = js.native
  
  var namedetails: js.UndefOr[`0` | `1`] = js.native
}
object OpenStreetMapProviderOptionsOutputDetails {
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsOutputDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOutputDetails]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsOutputDetailsMutableBuilder[Self <: OpenStreetMapProviderOptionsOutputDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressdetails(value: `0` | `1`): Self = StObject.set(x, "addressdetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressdetailsUndefined: Self = StObject.set(x, "addressdetails", js.undefined)
    
    @scala.inline
    def setExtratags(value: `0` | `1`): Self = StObject.set(x, "extratags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtratagsUndefined: Self = StObject.set(x, "extratags", js.undefined)
    
    @scala.inline
    def setNamedetails(value: `0` | `1`): Self = StObject.set(x, "namedetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedetailsUndefined: Self = StObject.set(x, "namedetails", js.undefined)
  }
}
