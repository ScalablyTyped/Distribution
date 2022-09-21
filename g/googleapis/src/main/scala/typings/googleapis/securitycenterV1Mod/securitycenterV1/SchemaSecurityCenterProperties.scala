package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityCenterProperties extends StObject {
  
  /**
    * Contains a Folder message for each folder in the assets ancestry. The first folder is the deepest nested folder, and the last folder is the folder directly under the Organization.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.undefined
  
  /**
    * The user defined display name for this resource.
    */
  var resourceDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of the Google Cloud resource this asset represents. This field is immutable after create time. See: https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Owners of the Google Cloud resource.
    */
  var resourceOwners: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The full resource name of the immediate parent of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceParent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user defined display name for the parent of this resource.
    */
  var resourceParentDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of the project the resource belongs to. See: https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceProject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user defined display name for the project of this resource.
    */
  var resourceProjectDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the Google Cloud resource. Examples include: APPLICATION, PROJECT, and ORGANIZATION. This is a case insensitive field defined by Security Command Center and/or the producer of the resource and is immutable after create time.
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityCenterProperties {
  
  inline def apply(): SchemaSecurityCenterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityCenterProperties]
  }
  
  extension [Self <: SchemaSecurityCenterProperties](x: Self) {
    
    inline def setFolders(value: js.Array[SchemaFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: SchemaFolder*): Self = StObject.set(x, "folders", js.Array(value*))
    
    inline def setResourceDisplayName(value: String): Self = StObject.set(x, "resourceDisplayName", value.asInstanceOf[js.Any])
    
    inline def setResourceDisplayNameNull: Self = StObject.set(x, "resourceDisplayName", null)
    
    inline def setResourceDisplayNameUndefined: Self = StObject.set(x, "resourceDisplayName", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceOwners(value: js.Array[String]): Self = StObject.set(x, "resourceOwners", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnersNull: Self = StObject.set(x, "resourceOwners", null)
    
    inline def setResourceOwnersUndefined: Self = StObject.set(x, "resourceOwners", js.undefined)
    
    inline def setResourceOwnersVarargs(value: String*): Self = StObject.set(x, "resourceOwners", js.Array(value*))
    
    inline def setResourceParent(value: String): Self = StObject.set(x, "resourceParent", value.asInstanceOf[js.Any])
    
    inline def setResourceParentDisplayName(value: String): Self = StObject.set(x, "resourceParentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setResourceParentDisplayNameNull: Self = StObject.set(x, "resourceParentDisplayName", null)
    
    inline def setResourceParentDisplayNameUndefined: Self = StObject.set(x, "resourceParentDisplayName", js.undefined)
    
    inline def setResourceParentNull: Self = StObject.set(x, "resourceParent", null)
    
    inline def setResourceParentUndefined: Self = StObject.set(x, "resourceParent", js.undefined)
    
    inline def setResourceProject(value: String): Self = StObject.set(x, "resourceProject", value.asInstanceOf[js.Any])
    
    inline def setResourceProjectDisplayName(value: String): Self = StObject.set(x, "resourceProjectDisplayName", value.asInstanceOf[js.Any])
    
    inline def setResourceProjectDisplayNameNull: Self = StObject.set(x, "resourceProjectDisplayName", null)
    
    inline def setResourceProjectDisplayNameUndefined: Self = StObject.set(x, "resourceProjectDisplayName", js.undefined)
    
    inline def setResourceProjectNull: Self = StObject.set(x, "resourceProject", null)
    
    inline def setResourceProjectUndefined: Self = StObject.set(x, "resourceProject", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
