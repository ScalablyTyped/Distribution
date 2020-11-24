package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProducerOptions extends js.Object {
  
  var ackTimeoutMs: js.UndefOr[Double] = js.native
  
  var partitionerType: js.UndefOr[Double] = js.native
  
  var requireAcks: js.UndefOr[Double] = js.native
}
object ProducerOptions {
  
  @scala.inline
  def apply(): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerOptions]
  }
  
  @scala.inline
  implicit class ProducerOptionsOps[Self <: ProducerOptions] (val x: Self) extends AnyVal {
    
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
    def setAckTimeoutMs(value: Double): Self = this.set("ackTimeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAckTimeoutMs: Self = this.set("ackTimeoutMs", js.undefined)
    
    @scala.inline
    def setPartitionerType(value: Double): Self = this.set("partitionerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionerType: Self = this.set("partitionerType", js.undefined)
    
    @scala.inline
    def setRequireAcks(value: Double): Self = this.set("requireAcks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireAcks: Self = this.set("requireAcks", js.undefined)
  }
}
