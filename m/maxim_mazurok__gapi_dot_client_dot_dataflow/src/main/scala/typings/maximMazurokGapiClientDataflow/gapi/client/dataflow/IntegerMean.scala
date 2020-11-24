package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerMean extends js.Object {
  
  /** The number of values being aggregated. */
  var count: js.UndefOr[SplitInt64] = js.native
  
  /** The sum of all values being aggregated. */
  var sum: js.UndefOr[SplitInt64] = js.native
}
object IntegerMean {
  
  @scala.inline
  def apply(): IntegerMean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerMean]
  }
  
  @scala.inline
  implicit class IntegerMeanOps[Self <: IntegerMean] (val x: Self) extends AnyVal {
    
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
    def setCount(value: SplitInt64): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setSum(value: SplitInt64): Self = this.set("sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
  }
}
