package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaShippingsettingsGetSupportedCarriersResponse extends StObject {
  
  /**
    * A list of supported carriers. May be empty.
    */
  var carriers: js.UndefOr[js.Array[SchemaCarriersCarrier]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsGetSupportedCarriersResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaShippingsettingsGetSupportedCarriersResponse {
  
  @scala.inline
  def apply(): SchemaShippingsettingsGetSupportedCarriersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsGetSupportedCarriersResponse]
  }
  
  @scala.inline
  implicit class SchemaShippingsettingsGetSupportedCarriersResponseMutableBuilder[Self <: SchemaShippingsettingsGetSupportedCarriersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarriers(value: js.Array[SchemaCarriersCarrier]): Self = StObject.set(x, "carriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarriersUndefined: Self = StObject.set(x, "carriers", js.undefined)
    
    @scala.inline
    def setCarriersVarargs(value: SchemaCarriersCarrier*): Self = StObject.set(x, "carriers", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
