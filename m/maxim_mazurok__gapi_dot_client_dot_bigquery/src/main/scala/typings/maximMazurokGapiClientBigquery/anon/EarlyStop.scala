package typings.maximMazurokGapiClientBigquery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EarlyStop extends js.Object {
  
  var earlyStop: js.UndefOr[Boolean] = js.native
  
  var l1Reg: js.UndefOr[Double] = js.native
  
  var l2Reg: js.UndefOr[Double] = js.native
  
  var learnRate: js.UndefOr[Double] = js.native
  
  var learnRateStrategy: js.UndefOr[String] = js.native
  
  var lineSearchInitLearnRate: js.UndefOr[Double] = js.native
  
  var maxIteration: js.UndefOr[String] = js.native
  
  var minRelProgress: js.UndefOr[Double] = js.native
  
  var warmStart: js.UndefOr[Boolean] = js.native
}
object EarlyStop {
  
  @scala.inline
  def apply(): EarlyStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EarlyStop]
  }
  
  @scala.inline
  implicit class EarlyStopOps[Self <: EarlyStop] (val x: Self) extends AnyVal {
    
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
    def setEarlyStop(value: Boolean): Self = this.set("earlyStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarlyStop: Self = this.set("earlyStop", js.undefined)
    
    @scala.inline
    def setL1Reg(value: Double): Self = this.set("l1Reg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL1Reg: Self = this.set("l1Reg", js.undefined)
    
    @scala.inline
    def setL2Reg(value: Double): Self = this.set("l2Reg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL2Reg: Self = this.set("l2Reg", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = this.set("learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLearnRate: Self = this.set("learnRate", js.undefined)
    
    @scala.inline
    def setLearnRateStrategy(value: String): Self = this.set("learnRateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLearnRateStrategy: Self = this.set("learnRateStrategy", js.undefined)
    
    @scala.inline
    def setLineSearchInitLearnRate(value: Double): Self = this.set("lineSearchInitLearnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSearchInitLearnRate: Self = this.set("lineSearchInitLearnRate", js.undefined)
    
    @scala.inline
    def setMaxIteration(value: String): Self = this.set("maxIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIteration: Self = this.set("maxIteration", js.undefined)
    
    @scala.inline
    def setMinRelProgress(value: Double): Self = this.set("minRelProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRelProgress: Self = this.set("minRelProgress", js.undefined)
    
    @scala.inline
    def setWarmStart(value: Boolean): Self = this.set("warmStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarmStart: Self = this.set("warmStart", js.undefined)
  }
}
