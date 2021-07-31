package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a hash Client Id request resource.
  */
trait SchemaHashClientIdRequest extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object SchemaHashClientIdRequest {
  
  @scala.inline
  def apply(): SchemaHashClientIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHashClientIdRequest]
  }
  
  @scala.inline
  implicit class SchemaHashClientIdRequestMutableBuilder[Self <: SchemaHashClientIdRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
