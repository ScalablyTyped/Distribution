package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request to undelete an existing role.
  */
trait SchemaUndeleteRoleRequest extends StObject {
  
  /**
    * Used to perform a consistent read-modify-write.
    */
  var etag: js.UndefOr[String] = js.undefined
}
object SchemaUndeleteRoleRequest {
  
  @scala.inline
  def apply(): SchemaUndeleteRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteRoleRequest]
  }
  
  @scala.inline
  implicit class SchemaUndeleteRoleRequestMutableBuilder[Self <: SchemaUndeleteRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
