package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceSitesRequest extends StObject {
  
  /**
    * The ID of the advertiser that owns the parent channel.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sites that will replace the existing sites assigned to the channel, specified as a list of Sites.
    */
  var newSites: js.UndefOr[js.Array[SchemaSite]] = js.undefined
  
  /**
    * The ID of the partner that owns the parent channel.
    */
  var partnerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplaceSitesRequest {
  
  inline def apply(): SchemaReplaceSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceSitesRequest]
  }
  
  extension [Self <: SchemaReplaceSitesRequest](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setNewSites(value: js.Array[SchemaSite]): Self = StObject.set(x, "newSites", value.asInstanceOf[js.Any])
    
    inline def setNewSitesUndefined: Self = StObject.set(x, "newSites", js.undefined)
    
    inline def setNewSitesVarargs(value: SchemaSite*): Self = StObject.set(x, "newSites", js.Array(value*))
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdNull: Self = StObject.set(x, "partnerId", null)
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
