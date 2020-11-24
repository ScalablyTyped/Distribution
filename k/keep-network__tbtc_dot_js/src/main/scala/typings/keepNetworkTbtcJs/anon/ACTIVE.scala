package typings.keepNetworkTbtcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ACTIVE extends js.Object {
  
  var ACTIVE: Double = js.native
  
  var AWAITING_BTC_FUNDING_PROOF: Double = js.native
  
  var AWAITING_SIGNER_SETUP: Double = js.native
  
  var AWAITING_WITHDRAWAL_PROOF: Double = js.native
  
  var AWAITING_WITHDRAWAL_SIGNATURE: Double = js.native
  
  var COURTESY_CALL: Double = js.native
  
  var FAILED_SETUP: Double = js.native
  
  var FRAUD_LIQUIDATION_IN_PROGRESS: Double = js.native
  
  var LIQUIDATED: Double = js.native
  
  var LIQUIDATION_IN_PROGRESS: Double = js.native
  
  var REDEEMED: Double = js.native
  
  var START: Double = js.native
}
object ACTIVE {
  
  @scala.inline
  def apply(
    ACTIVE: Double,
    AWAITING_BTC_FUNDING_PROOF: Double,
    AWAITING_SIGNER_SETUP: Double,
    AWAITING_WITHDRAWAL_PROOF: Double,
    AWAITING_WITHDRAWAL_SIGNATURE: Double,
    COURTESY_CALL: Double,
    FAILED_SETUP: Double,
    FRAUD_LIQUIDATION_IN_PROGRESS: Double,
    LIQUIDATED: Double,
    LIQUIDATION_IN_PROGRESS: Double,
    REDEEMED: Double,
    START: Double
  ): ACTIVE = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], AWAITING_BTC_FUNDING_PROOF = AWAITING_BTC_FUNDING_PROOF.asInstanceOf[js.Any], AWAITING_SIGNER_SETUP = AWAITING_SIGNER_SETUP.asInstanceOf[js.Any], AWAITING_WITHDRAWAL_PROOF = AWAITING_WITHDRAWAL_PROOF.asInstanceOf[js.Any], AWAITING_WITHDRAWAL_SIGNATURE = AWAITING_WITHDRAWAL_SIGNATURE.asInstanceOf[js.Any], COURTESY_CALL = COURTESY_CALL.asInstanceOf[js.Any], FAILED_SETUP = FAILED_SETUP.asInstanceOf[js.Any], FRAUD_LIQUIDATION_IN_PROGRESS = FRAUD_LIQUIDATION_IN_PROGRESS.asInstanceOf[js.Any], LIQUIDATED = LIQUIDATED.asInstanceOf[js.Any], LIQUIDATION_IN_PROGRESS = LIQUIDATION_IN_PROGRESS.asInstanceOf[js.Any], REDEEMED = REDEEMED.asInstanceOf[js.Any], START = START.asInstanceOf[js.Any])
    __obj.asInstanceOf[ACTIVE]
  }
  
  @scala.inline
  implicit class ACTIVEOps[Self <: ACTIVE] (val x: Self) extends AnyVal {
    
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
    def setACTIVE(value: Double): Self = this.set("ACTIVE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWAITING_BTC_FUNDING_PROOF(value: Double): Self = this.set("AWAITING_BTC_FUNDING_PROOF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWAITING_SIGNER_SETUP(value: Double): Self = this.set("AWAITING_SIGNER_SETUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWAITING_WITHDRAWAL_PROOF(value: Double): Self = this.set("AWAITING_WITHDRAWAL_PROOF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWAITING_WITHDRAWAL_SIGNATURE(value: Double): Self = this.set("AWAITING_WITHDRAWAL_SIGNATURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOURTESY_CALL(value: Double): Self = this.set("COURTESY_CALL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAILED_SETUP(value: Double): Self = this.set("FAILED_SETUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFRAUD_LIQUIDATION_IN_PROGRESS(value: Double): Self = this.set("FRAUD_LIQUIDATION_IN_PROGRESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLIQUIDATED(value: Double): Self = this.set("LIQUIDATED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLIQUIDATION_IN_PROGRESS(value: Double): Self = this.set("LIQUIDATION_IN_PROGRESS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREDEEMED(value: Double): Self = this.set("REDEEMED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART(value: Double): Self = this.set("START", value.asInstanceOf[js.Any])
  }
}
