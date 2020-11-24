package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedResource extends js.Object {
  
  var usableSubnetworks: UsableSubnetworksResource = js.native
}
object AggregatedResource {
  
  @scala.inline
  def apply(usableSubnetworks: UsableSubnetworksResource): AggregatedResource = {
    val __obj = js.Dynamic.literal(usableSubnetworks = usableSubnetworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedResource]
  }
  
  @scala.inline
  implicit class AggregatedResourceOps[Self <: AggregatedResource] (val x: Self) extends AnyVal {
    
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
    def setUsableSubnetworks(value: UsableSubnetworksResource): Self = this.set("usableSubnetworks", value.asInstanceOf[js.Any])
  }
}
