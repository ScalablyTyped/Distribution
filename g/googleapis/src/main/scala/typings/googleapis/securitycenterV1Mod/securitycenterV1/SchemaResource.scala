package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResource extends StObject {
  
  /**
    * The human readable name of the resource.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains a Folder message for each folder in the assets ancestry. The first folder is the deepest nested folder, and the last folder is the folder directly under the Organization.
    */
  var folders: js.UndefOr[js.Array[SchemaFolder]] = js.undefined
  
  /**
    * The full resource name of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human readable name of resource's parent.
    */
  var parentDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of resource's parent.
    */
  var parentName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project ID that the resource belongs to.
    */
  var projectDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of project that the resource belongs to.
    */
  var projectName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource type of the resource.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaResource {
  
  inline def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  
  extension [Self <: SchemaResource](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFolders(value: js.Array[SchemaFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    inline def setFoldersVarargs(value: SchemaFolder*): Self = StObject.set(x, "folders", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentDisplayName(value: String): Self = StObject.set(x, "parentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setParentDisplayNameNull: Self = StObject.set(x, "parentDisplayName", null)
    
    inline def setParentDisplayNameUndefined: Self = StObject.set(x, "parentDisplayName", js.undefined)
    
    inline def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
    
    inline def setParentNameNull: Self = StObject.set(x, "parentName", null)
    
    inline def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
    
    inline def setProjectDisplayName(value: String): Self = StObject.set(x, "projectDisplayName", value.asInstanceOf[js.Any])
    
    inline def setProjectDisplayNameNull: Self = StObject.set(x, "projectDisplayName", null)
    
    inline def setProjectDisplayNameUndefined: Self = StObject.set(x, "projectDisplayName", js.undefined)
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameNull: Self = StObject.set(x, "projectName", null)
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
