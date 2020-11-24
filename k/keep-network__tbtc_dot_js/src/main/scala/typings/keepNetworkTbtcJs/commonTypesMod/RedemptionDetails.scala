package typings.keepNetworkTbtcJs.commonTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedemptionDetails extends js.Object {
  
  var digest: String = js.native
  
  var outpoint: String = js.native
  
  var redeemerOutputScript: String = js.native
  
  var requestedFee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  
  var utxoValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
}
object RedemptionDetails {
  
  @scala.inline
  def apply(
    digest: String,
    outpoint: String,
    redeemerOutputScript: String,
    requestedFee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
    utxoValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): RedemptionDetails = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], outpoint = outpoint.asInstanceOf[js.Any], redeemerOutputScript = redeemerOutputScript.asInstanceOf[js.Any], requestedFee = requestedFee.asInstanceOf[js.Any], utxoValue = utxoValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedemptionDetails]
  }
  
  @scala.inline
  implicit class RedemptionDetailsOps[Self <: RedemptionDetails] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: String): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpoint(value: String): Self = this.set("outpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedeemerOutputScript(value: String): Self = this.set("redeemerOutputScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedFee(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): Self = this.set("requestedFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtxoValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): Self = this.set("utxoValue", value.asInstanceOf[js.Any])
  }
}
