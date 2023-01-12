package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveFolderRequest extends StObject {
  
  /** Required. The resource name of the folder or organization which should be the folder's new parent. Must be of the form `folders/{folder_id}` or `organizations/{org_id}`. */
  var destinationParent: js.UndefOr[String] = js.undefined
}
object MoveFolderRequest {
  
  inline def apply(): MoveFolderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveFolderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveFolderRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationParent(value: String): Self = StObject.set(x, "destinationParent", value.asInstanceOf[js.Any])
    
    inline def setDestinationParentUndefined: Self = StObject.set(x, "destinationParent", js.undefined)
  }
}
