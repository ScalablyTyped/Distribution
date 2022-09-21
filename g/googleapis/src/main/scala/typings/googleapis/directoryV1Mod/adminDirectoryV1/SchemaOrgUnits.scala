package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrgUnits extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the API resource. For Org Unit resources, the type is `admin#directory#orgUnits`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of organizational unit objects.
    */
  var organizationUnits: js.UndefOr[js.Array[SchemaOrgUnit]] = js.undefined
}
object SchemaOrgUnits {
  
  inline def apply(): SchemaOrgUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgUnits]
  }
  
  extension [Self <: SchemaOrgUnits](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrganizationUnits(value: js.Array[SchemaOrgUnit]): Self = StObject.set(x, "organizationUnits", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUnitsUndefined: Self = StObject.set(x, "organizationUnits", js.undefined)
    
    inline def setOrganizationUnitsVarargs(value: SchemaOrgUnit*): Self = StObject.set(x, "organizationUnits", js.Array(value*))
  }
}
