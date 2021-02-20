package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Account Permission List Response
  */
@js.native
trait SchemaAccountPermissionsListResponse extends StObject {
  
  /**
    * Account permission collection.
    */
  var accountPermissions: js.UndefOr[js.Array[SchemaAccountPermission]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAccountPermissionsListResponse {
  
  @scala.inline
  def apply(): SchemaAccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountPermissionsListResponse]
  }
  
  @scala.inline
  implicit class SchemaAccountPermissionsListResponseMutableBuilder[Self <: SchemaAccountPermissionsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountPermissions(value: js.Array[SchemaAccountPermission]): Self = StObject.set(x, "accountPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountPermissionsUndefined: Self = StObject.set(x, "accountPermissions", js.undefined)
    
    @scala.inline
    def setAccountPermissionsVarargs(value: SchemaAccountPermission*): Self = StObject.set(x, "accountPermissions", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
