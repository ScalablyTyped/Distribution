package typings.keepNetworkTbtcJs.depositMod

import typings.keepNetworkTbtcJs.anon.RequiredConfirmations
import typings.keepNetworkTbtcJs.bitcoinHelpersMod.FoundTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoSubmitState extends js.Object {
  
  var fundingConfirmations: js.Promise[RequiredConfirmations] = js.native
  
  var fundingTransaction: js.Promise[FoundTransaction] = js.native
  
  var mintedTBTC: js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
  ] = js.native
  
  var proofTransaction: js.Promise[_] = js.native
}
object AutoSubmitState {
  
  @scala.inline
  def apply(
    fundingConfirmations: js.Promise[RequiredConfirmations],
    fundingTransaction: js.Promise[FoundTransaction],
    mintedTBTC: js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
    ],
    proofTransaction: js.Promise[_]
  ): AutoSubmitState = {
    val __obj = js.Dynamic.literal(fundingConfirmations = fundingConfirmations.asInstanceOf[js.Any], fundingTransaction = fundingTransaction.asInstanceOf[js.Any], mintedTBTC = mintedTBTC.asInstanceOf[js.Any], proofTransaction = proofTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSubmitState]
  }
  
  @scala.inline
  implicit class AutoSubmitStateOps[Self <: AutoSubmitState] (val x: Self) extends AnyVal {
    
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
    def setFundingConfirmations(value: js.Promise[RequiredConfirmations]): Self = this.set("fundingConfirmations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFundingTransaction(value: js.Promise[FoundTransaction]): Self = this.set("fundingTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMintedTBTC(
      value: js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
        ]
    ): Self = this.set("mintedTBTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofTransaction(value: js.Promise[_]): Self = this.set("proofTransaction", value.asInstanceOf[js.Any])
  }
}
