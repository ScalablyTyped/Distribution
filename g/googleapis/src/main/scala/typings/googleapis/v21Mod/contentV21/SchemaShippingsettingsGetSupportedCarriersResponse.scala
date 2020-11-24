package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaShippingsettingsGetSupportedCarriersResponse extends js.Object {
  
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
  implicit class SchemaShippingsettingsGetSupportedCarriersResponseOps[Self <: SchemaShippingsettingsGetSupportedCarriersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCarriersVarargs(value: SchemaCarriersCarrier*): Self = this.set("carriers", js.Array(value :_*))
    
    @scala.inline
    def setCarriers(value: js.Array[SchemaCarriersCarrier]): Self = this.set("carriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarriers: Self = this.set("carriers", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
