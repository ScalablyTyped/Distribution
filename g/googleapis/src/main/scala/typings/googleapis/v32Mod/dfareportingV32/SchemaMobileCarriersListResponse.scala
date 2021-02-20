package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mobile Carrier List Response
  */
@js.native
trait SchemaMobileCarriersListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileCarriersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Mobile carrier collection.
    */
  var mobileCarriers: js.UndefOr[js.Array[SchemaMobileCarrier]] = js.native
}
object SchemaMobileCarriersListResponse {
  
  @scala.inline
  def apply(): SchemaMobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileCarriersListResponse]
  }
  
  @scala.inline
  implicit class SchemaMobileCarriersListResponseMutableBuilder[Self <: SchemaMobileCarriersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMobileCarriers(value: js.Array[SchemaMobileCarrier]): Self = StObject.set(x, "mobileCarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileCarriersUndefined: Self = StObject.set(x, "mobileCarriers", js.undefined)
    
    @scala.inline
    def setMobileCarriersVarargs(value: SchemaMobileCarrier*): Self = StObject.set(x, "mobileCarriers", js.Array(value :_*))
  }
}
