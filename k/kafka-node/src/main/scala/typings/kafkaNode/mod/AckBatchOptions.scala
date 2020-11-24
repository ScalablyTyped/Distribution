package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AckBatchOptions extends js.Object {
  
  var noAckBatchAge: Double | Null = js.native
  
  var noAckBatchSize: Double | Null = js.native
}
object AckBatchOptions {
  
  @scala.inline
  def apply(): AckBatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AckBatchOptions]
  }
  
  @scala.inline
  implicit class AckBatchOptionsOps[Self <: AckBatchOptions] (val x: Self) extends AnyVal {
    
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
    def setNoAckBatchAge(value: Double): Self = this.set("noAckBatchAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAckBatchAgeNull: Self = this.set("noAckBatchAge", null)
    
    @scala.inline
    def setNoAckBatchSize(value: Double): Self = this.set("noAckBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAckBatchSizeNull: Self = this.set("noAckBatchSize", null)
  }
}
