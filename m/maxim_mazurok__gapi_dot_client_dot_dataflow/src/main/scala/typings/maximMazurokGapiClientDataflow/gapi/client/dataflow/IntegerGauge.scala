package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerGauge extends js.Object {
  
  /** The time at which this value was measured. Measured as msecs from epoch. */
  var timestamp: js.UndefOr[String] = js.native
  
  /** The value of the variable represented by this gauge. */
  var value: js.UndefOr[SplitInt64] = js.native
}
object IntegerGauge {
  
  @scala.inline
  def apply(): IntegerGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerGauge]
  }
  
  @scala.inline
  implicit class IntegerGaugeOps[Self <: IntegerGauge] (val x: Self) extends AnyVal {
    
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
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setValue(value: SplitInt64): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
