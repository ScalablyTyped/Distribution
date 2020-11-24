package typings.ledgerhqHwTransport.mod

import typings.ledgerhqHwTransport.ledgerhqHwTransportStrings.add
import typings.ledgerhqHwTransport.ledgerhqHwTransportStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescriptorEvent[Descriptor] extends js.Object {
  
  var descriptor: Descriptor = js.native
  
  var device: js.UndefOr[Device] = js.native
  
  var `type`: add | remove = js.native
}
object DescriptorEvent {
  
  @scala.inline
  def apply[Descriptor](descriptor: Descriptor, `type`: add | remove): DescriptorEvent[Descriptor] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorEvent[Descriptor]]
  }
  
  @scala.inline
  implicit class DescriptorEventOps[Self <: DescriptorEvent[_], Descriptor] (val x: Self with DescriptorEvent[Descriptor]) extends AnyVal {
    
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
    def setDescriptor(value: Descriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: add | remove): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Device): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
  }
}
