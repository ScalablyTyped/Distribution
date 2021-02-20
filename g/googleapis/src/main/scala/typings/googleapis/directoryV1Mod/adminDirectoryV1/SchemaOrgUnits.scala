package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List Organization Units operation in Directory
  * API.
  */
@js.native
trait SchemaOrgUnits extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * List of user objects.
    */
  var organizationUnits: js.UndefOr[js.Array[SchemaOrgUnit]] = js.native
}
object SchemaOrgUnits {
  
  @scala.inline
  def apply(): SchemaOrgUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgUnits]
  }
  
  @scala.inline
  implicit class SchemaOrgUnitsMutableBuilder[Self <: SchemaOrgUnits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOrganizationUnits(value: js.Array[SchemaOrgUnit]): Self = StObject.set(x, "organizationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUnitsUndefined: Self = StObject.set(x, "organizationUnits", js.undefined)
    
    @scala.inline
    def setOrganizationUnitsVarargs(value: SchemaOrgUnit*): Self = StObject.set(x, "organizationUnits", js.Array(value :_*))
  }
}
