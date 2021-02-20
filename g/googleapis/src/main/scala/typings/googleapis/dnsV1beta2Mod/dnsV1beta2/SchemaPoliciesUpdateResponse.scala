package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPoliciesUpdateResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  
  var policy: js.UndefOr[SchemaPolicy] = js.native
}
object SchemaPoliciesUpdateResponse {
  
  @scala.inline
  def apply(): SchemaPoliciesUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoliciesUpdateResponse]
  }
  
  @scala.inline
  implicit class SchemaPoliciesUpdateResponseMutableBuilder[Self <: SchemaPoliciesUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
