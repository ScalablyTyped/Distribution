package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation extends StObject {
  
  /** The resource name of the folder or organization we are either creating the folder under or moving the folder to. */
  var destinationParent: js.UndefOr[String] = js.undefined
  
  /** The display name of the folder. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The type of this operation. */
  var operationType: js.UndefOr[String] = js.undefined
  
  /** The resource name of the folder's parent. Only applicable when the operation_type is MOVE. */
  var sourceParent: js.UndefOr[String] = js.undefined
}
object CloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation {
  
  inline def apply(): CloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation]
  }
  
  extension [Self <: CloudresourcemanagerGoogleCloudResourcemanagerV2beta1FolderOperation](x: Self) {
    
    inline def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setSourceParent(value: String): Self = StObject.set(x, "sourceParent", value.asInstanceOf[js.Any])
    
    inline def setSourceParentUndefined: Self = StObject.set(x, "sourceParent", js.undefined)
  }
}
