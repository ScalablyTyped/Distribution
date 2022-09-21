package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBulkEditAssignedInventorySourcesRequest extends StObject {
  
  /**
    * The ID of the advertiser that owns the parent inventory source group. The parent partner does not have access to these assigned inventory sources.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The assigned inventory sources to create in bulk, specified as a list of AssignedInventorySources.
    */
  var createdAssignedInventorySources: js.UndefOr[js.Array[SchemaAssignedInventorySource]] = js.undefined
  
  /**
    * The IDs of the assigned inventory sources to delete in bulk, specified as a list of assigned_inventory_source_ids.
    */
  var deletedAssignedInventorySources: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The ID of the partner that owns the inventory source group. Only this partner has write access to these assigned inventory sources.
    */
  var partnerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBulkEditAssignedInventorySourcesRequest {
  
  inline def apply(): SchemaBulkEditAssignedInventorySourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBulkEditAssignedInventorySourcesRequest]
  }
  
  extension [Self <: SchemaBulkEditAssignedInventorySourcesRequest](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCreatedAssignedInventorySources(value: js.Array[SchemaAssignedInventorySource]): Self = StObject.set(x, "createdAssignedInventorySources", value.asInstanceOf[js.Any])
    
    inline def setCreatedAssignedInventorySourcesUndefined: Self = StObject.set(x, "createdAssignedInventorySources", js.undefined)
    
    inline def setCreatedAssignedInventorySourcesVarargs(value: SchemaAssignedInventorySource*): Self = StObject.set(x, "createdAssignedInventorySources", js.Array(value*))
    
    inline def setDeletedAssignedInventorySources(value: js.Array[String]): Self = StObject.set(x, "deletedAssignedInventorySources", value.asInstanceOf[js.Any])
    
    inline def setDeletedAssignedInventorySourcesNull: Self = StObject.set(x, "deletedAssignedInventorySources", null)
    
    inline def setDeletedAssignedInventorySourcesUndefined: Self = StObject.set(x, "deletedAssignedInventorySources", js.undefined)
    
    inline def setDeletedAssignedInventorySourcesVarargs(value: String*): Self = StObject.set(x, "deletedAssignedInventorySources", js.Array(value*))
    
    inline def setPartnerId(value: String): Self = StObject.set(x, "partnerId", value.asInstanceOf[js.Any])
    
    inline def setPartnerIdNull: Self = StObject.set(x, "partnerId", null)
    
    inline def setPartnerIdUndefined: Self = StObject.set(x, "partnerId", js.undefined)
  }
}
