package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveFolderMetadata extends StObject {
  
  /** The resource name of the folder or organization to move the folder to. */
  var destinationParent: js.UndefOr[String] = js.undefined
  
  /** The display name of the folder. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The resource name of the folder's parent. */
  var sourceParent: js.UndefOr[String] = js.undefined
}
object MoveFolderMetadata {
  
  inline def apply(): MoveFolderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveFolderMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveFolderMetadata] (val x: Self) extends AnyVal {
    
    inline def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setSourceParent(value: String): Self = StObject.set(x, "sourceParent", value.asInstanceOf[js.Any])
    
    inline def setSourceParentUndefined: Self = StObject.set(x, "sourceParent", js.undefined)
  }
}
