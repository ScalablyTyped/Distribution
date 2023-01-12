package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkEditSitesRequest extends StObject {
  
  /** The ID of the advertiser that owns the parent channel. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** The sites to create in batch, specified as a list of Sites. */
  var createdSites: js.UndefOr[js.Array[Site]] = js.undefined
  
  /** The sites to delete in batch, specified as a list of site url_or_app_ids. */
  var deletedSites: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The ID of the partner that owns the parent channel. */
  var partnerId: js.UndefOr[String] = js.undefined
}
object BulkEditSitesRequest {
  
  inline def apply(): BulkEditSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEditSitesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkEditSitesRequest] (val x: Self) extends AnyVal {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCreatedSites(value: js.Array[Site]): Self = StObject.set(x, "createdSites", value.asInstanceOf[js.Any])
    
    inline def setCreatedSitesUndefined: Self = StObject.set(x, "createdSites", js.undefined)
    
    inline def setCreatedSitesVarargs(value: Site*): Self = StObject.set(x, "createdSites", js.Array(value*))
    
    inline def setDeletedSites(value: js.Array[String]): Self = StObject.set(x, "deletedSites", value.asInstanceOf[js.Any])
    
    inline def setDeletedSitesUndefined: Self = StObject.set(x, "deletedSites", js.undefined)
    
    inline def setDeletedSitesVarargs(value: String*): Self = StObject.set(x, "deletedSites", js.Array(value*))
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
