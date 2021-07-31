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
  
  @scala.inline
  def apply(): MoveFolderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveFolderMetadata]
  }
  
  @scala.inline
  implicit class MoveFolderMetadataMutableBuilder[Self <: MoveFolderMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setSourceParent(value: String): Self = StObject.set(x, "sourceParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceParentUndefined: Self = StObject.set(x, "sourceParent", js.undefined)
  }
}
