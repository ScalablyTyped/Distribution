package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrgUnit extends StObject {
  
  /**
    * Determines if a sub-organizational unit can inherit the settings of the parent organization. The default value is `false`, meaning a sub-organizational unit inherits the settings of the nearest parent organizational unit. For more information on inheritance and users in an organization structure, see the [administration help center](https://support.google.com/a/answer/4352075).
    */
  var blockInheritance: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Description of the organizational unit.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the API resource. For Orgunits resources, the value is `admin#directory#orgUnit`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The organizational unit's path name. For example, an organizational unit's name within the /corp/support/sales_support parent path is sales_support. Required.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of the organizational unit.
    */
  var orgUnitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full path to the organizational unit. The `orgUnitPath` is a derived property. When listed, it is derived from `parentOrgunitPath` and organizational unit's `name`. For example, for an organizational unit named 'apps' under parent organization '/engineering', the orgUnitPath is '/engineering/apps'. In order to edit an `orgUnitPath`, either update the name of the organization or the `parentOrgunitPath`. A user's organizational unit determines which Google Workspace services the user has access to. If the user is moved to a new organization, the user's access changes. For more information about organization structures, see the [administration help center](https://support.google.com/a/answer/4352075). For more information about moving a user to a different organization, see [Update a user](/admin-sdk/directory/v1/guides/manage-users.html#update_user).
    */
  var orgUnitPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of the parent organizational unit. Required, unless `parentOrgUnitPath` is set.
    */
  var parentOrgUnitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The organizational unit's parent path. For example, /corp/sales is the parent path for /corp/sales/sales_support organizational unit. Required, unless `parentOrgUnitId` is set.
    */
  var parentOrgUnitPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrgUnit {
  
  inline def apply(): SchemaOrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgUnit]
  }
  
  extension [Self <: SchemaOrgUnit](x: Self) {
    
    inline def setBlockInheritance(value: Boolean): Self = StObject.set(x, "blockInheritance", value.asInstanceOf[js.Any])
    
    inline def setBlockInheritanceNull: Self = StObject.set(x, "blockInheritance", null)
    
    inline def setBlockInheritanceUndefined: Self = StObject.set(x, "blockInheritance", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdNull: Self = StObject.set(x, "orgUnitId", null)
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setOrgUnitPath(value: String): Self = StObject.set(x, "orgUnitPath", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitPathNull: Self = StObject.set(x, "orgUnitPath", null)
    
    inline def setOrgUnitPathUndefined: Self = StObject.set(x, "orgUnitPath", js.undefined)
    
    inline def setParentOrgUnitId(value: String): Self = StObject.set(x, "parentOrgUnitId", value.asInstanceOf[js.Any])
    
    inline def setParentOrgUnitIdNull: Self = StObject.set(x, "parentOrgUnitId", null)
    
    inline def setParentOrgUnitIdUndefined: Self = StObject.set(x, "parentOrgUnitId", js.undefined)
    
    inline def setParentOrgUnitPath(value: String): Self = StObject.set(x, "parentOrgUnitPath", value.asInstanceOf[js.Any])
    
    inline def setParentOrgUnitPathNull: Self = StObject.set(x, "parentOrgUnitPath", null)
    
    inline def setParentOrgUnitPathUndefined: Self = StObject.set(x, "parentOrgUnitPath", js.undefined)
  }
}
