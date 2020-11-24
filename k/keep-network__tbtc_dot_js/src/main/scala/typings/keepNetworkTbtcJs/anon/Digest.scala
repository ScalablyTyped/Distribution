package typings.keepNetworkTbtcJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Digest extends js.Object {
  
  var _digest: String = js.native
  
  var _outpoint: String = js.native
  
  var _redeemerOutputScript: String = js.native
  
  var _requestedFee: String = js.native
  
  var _utxoValue: String = js.native
}
object Digest {
  
  @scala.inline
  def apply(
    _digest: String,
    _outpoint: String,
    _redeemerOutputScript: String,
    _requestedFee: String,
    _utxoValue: String
  ): Digest = {
    val __obj = js.Dynamic.literal(_digest = _digest.asInstanceOf[js.Any], _outpoint = _outpoint.asInstanceOf[js.Any], _redeemerOutputScript = _redeemerOutputScript.asInstanceOf[js.Any], _requestedFee = _requestedFee.asInstanceOf[js.Any], _utxoValue = _utxoValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
  
  @scala.inline
  implicit class DigestOps[Self <: Digest] (val x: Self) extends AnyVal {
    
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
    def set_digest(value: String): Self = this.set("_digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_outpoint(value: String): Self = this.set("_outpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_redeemerOutputScript(value: String): Self = this.set("_redeemerOutputScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_requestedFee(value: String): Self = this.set("_requestedFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_utxoValue(value: String): Self = this.set("_utxoValue", value.asInstanceOf[js.Any])
  }
}
