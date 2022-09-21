package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditSitesRequest extends StObject {
  
  /**
    * The ID of the advertiser that owns the parent channel.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sites to create in batch, specified as a list of Sites.
    */
  var createdSites: js.UndefOr[js.Array[SchemaSite]] = js.undefined
  
  /**
    * The sites to delete in batch, specified as a list of site url_or_app_ids.
    */
  var deletedSites: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The ID of the partner that owns the parent channel.
    */
  var partnerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBulkEditSitesRequest {
  
  inline def apply(): SchemaBulkEditSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditSitesRequest]
  }
  
  extension [Self <: SchemaBulkEditSitesRequest](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCreatedSites(value: js.Array[SchemaSite]): Self = StObject.set(x, "createdSites", value.asInstanceOf[js.Any])
    
    inline def setCreatedSitesUndefined: Self = StObject.set(x, "createdSites", js.undefined)
    
    inline def setCreatedSitesVarargs(value: SchemaSite*): Self = StObject.set(x, "createdSites", js.Array(value*))
    
    inline def setDeletedSites(value: js.Array[String]): Self = StObject.set(x, "deletedSites", value.asInstanceOf[js.Any])
    
    inline def setDeletedSitesNull: Self = StObject.set(x, "deletedSites", null)
    
    inline def setDeletedSitesUndefined: Self = StObject.set(x, "deletedSites", js.undefined)
    
    inline def setDeletedSitesVarargs(value: String*): Self = StObject.set(x, "deletedSites", js.Array(value*))
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdNull: Self = StObject.set(x, "partnerId", null)
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
