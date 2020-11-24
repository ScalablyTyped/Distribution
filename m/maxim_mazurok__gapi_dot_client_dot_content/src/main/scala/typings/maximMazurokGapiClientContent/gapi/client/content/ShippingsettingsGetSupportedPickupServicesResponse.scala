package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingsettingsGetSupportedPickupServicesResponse extends js.Object {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#shippingsettingsGetSupportedPickupServicesResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** A list of supported pickup services. May be empty. */
  var pickupServices: js.UndefOr[js.Array[PickupServicesPickupService]] = js.native
}
object ShippingsettingsGetSupportedPickupServicesResponse {
  
  @scala.inline
  def apply(): ShippingsettingsGetSupportedPickupServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsGetSupportedPickupServicesResponse]
  }
  
  @scala.inline
  implicit class ShippingsettingsGetSupportedPickupServicesResponseOps[Self <: ShippingsettingsGetSupportedPickupServicesResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPickupServicesVarargs(value: PickupServicesPickupService*): Self = this.set("pickupServices", js.Array(value :_*))
    
    @scala.inline
    def setPickupServices(value: js.Array[PickupServicesPickupService]): Self = this.set("pickupServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickupServices: Self = this.set("pickupServices", js.undefined)
  }
}
