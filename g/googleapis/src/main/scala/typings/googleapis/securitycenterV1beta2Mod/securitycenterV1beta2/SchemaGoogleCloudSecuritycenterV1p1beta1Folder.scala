package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1p1beta1Folder extends StObject {
  
  /**
    * Full resource name of this folder. See: https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceFolder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user defined display name for this folder.
    */
  var resourceFolderDisplayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1p1beta1Folder {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1p1beta1Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1p1beta1Folder]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1p1beta1Folder](x: Self) {
    
    inline def setResourceFolder(value: String): Self = StObject.set(x, "resourceFolder", value.asInstanceOf[js.Any])
    
    inline def setResourceFolderDisplayName(value: String): Self = StObject.set(x, "resourceFolderDisplayName", value.asInstanceOf[js.Any])
    
    inline def setResourceFolderDisplayNameNull: Self = StObject.set(x, "resourceFolderDisplayName", null)
    
    inline def setResourceFolderDisplayNameUndefined: Self = StObject.set(x, "resourceFolderDisplayName", js.undefined)
    
    inline def setResourceFolderNull: Self = StObject.set(x, "resourceFolder", null)
    
    inline def setResourceFolderUndefined: Self = StObject.set(x, "resourceFolder", js.undefined)
  }
}
