package typings.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Objects
//
@js.native
trait TransactionObject extends js.Object {
  
  var address: String = js.native
  
  var attachmentTimestamp: Double = js.native
  
  var attachmentTimestampLowerBound: Double = js.native
  
  var attachmentTimestampUpperBound: Double = js.native
  
  var branchTransaction: String = js.native
  
  var bundle: Double = js.native
  
  var currentIndex: Double = js.native
  
  var hash: String = js.native
  
  var lastIndex: Double = js.native
  
  var nonce: String = js.native
  
  var signatureMessageFragment: String = js.native
  
  var tag: String = js.native
  
  var timestamp: Double = js.native
  
  var trunkTransaction: String = js.native
  
  var value: Double = js.native
}
object TransactionObject {
  
  @scala.inline
  def apply(
    address: String,
    attachmentTimestamp: Double,
    attachmentTimestampLowerBound: Double,
    attachmentTimestampUpperBound: Double,
    branchTransaction: String,
    bundle: Double,
    currentIndex: Double,
    hash: String,
    lastIndex: Double,
    nonce: String,
    signatureMessageFragment: String,
    tag: String,
    timestamp: Double,
    trunkTransaction: String,
    value: Double
  ): TransactionObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], attachmentTimestamp = attachmentTimestamp.asInstanceOf[js.Any], attachmentTimestampLowerBound = attachmentTimestampLowerBound.asInstanceOf[js.Any], attachmentTimestampUpperBound = attachmentTimestampUpperBound.asInstanceOf[js.Any], branchTransaction = branchTransaction.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], signatureMessageFragment = signatureMessageFragment.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trunkTransaction = trunkTransaction.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionObject]
  }
  
  @scala.inline
  implicit class TransactionObjectOps[Self <: TransactionObject] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTimestamp(value: Double): Self = this.set("attachmentTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTimestampLowerBound(value: Double): Self = this.set("attachmentTimestampLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTimestampUpperBound(value: Double): Self = this.set("attachmentTimestampUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchTransaction(value: String): Self = this.set("branchTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundle(value: Double): Self = this.set("bundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIndex(value: Double): Self = this.set("currentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastIndex(value: Double): Self = this.set("lastIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureMessageFragment(value: String): Self = this.set("signatureMessageFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrunkTransaction(value: String): Self = this.set("trunkTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
