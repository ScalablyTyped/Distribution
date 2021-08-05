package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List Organization Units operation in Directory
  * API.
  */
trait SchemaOrgUnits extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * List of user objects.
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
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrganizationUnits(value: js.Array[SchemaOrgUnit]): Self = StObject.set(x, "organizationUnits", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUnitsUndefined: Self = StObject.set(x, "organizationUnits", js.undefined)
    
    inline def setOrganizationUnitsVarargs(value: SchemaOrgUnit*): Self = StObject.set(x, "organizationUnits", js.Array(value :_*))
  }
}
