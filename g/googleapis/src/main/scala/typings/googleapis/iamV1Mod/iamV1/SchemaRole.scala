package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRole extends StObject {
  
  /**
    * The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. A human-readable description for the role.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used to perform a consistent read-modify-write.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The names of the permissions this role grants when bound in an IAM policy.
    */
  var includedPermissions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID\}/roles/logging.viewer for custom roles.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
    */
  var stage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaRole {
  
  inline def apply(): SchemaRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRole]
  }
  
  extension [Self <: SchemaRole](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setIncludedPermissions(value: js.Array[String]): Self = StObject.set(x, "includedPermissions", value.asInstanceOf[js.Any])
    
    inline def setIncludedPermissionsNull: Self = StObject.set(x, "includedPermissions", null)
    
    inline def setIncludedPermissionsUndefined: Self = StObject.set(x, "includedPermissions", js.undefined)
    
    inline def setIncludedPermissionsVarargs(value: String*): Self = StObject.set(x, "includedPermissions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageNull: Self = StObject.set(x, "stage", null)
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
