package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction")
@js.native
class SignedTransaction () extends Message {
  
  def getRawTxnBytes(): Uint8Array | String = js.native
  
  def getRawTxnBytes_asB64(): String = js.native
  
  def getRawTxnBytes_asU8(): Uint8Array = js.native
  
  def getSenderPublicKey(): Uint8Array | String = js.native
  
  def getSenderPublicKey_asB64(): String = js.native
  
  def getSenderPublicKey_asU8(): Uint8Array = js.native
  
  def getSenderSignature(): Uint8Array | String = js.native
  
  def getSenderSignature_asB64(): String = js.native
  
  def getSenderSignature_asU8(): Uint8Array = js.native
  
  def setRawTxnBytes(value: String): Unit = js.native
  def setRawTxnBytes(value: Uint8Array): Unit = js.native
  
  def setSenderPublicKey(value: String): Unit = js.native
  def setSenderPublicKey(value: Uint8Array): Unit = js.native
  
  def setSenderSignature(value: String): Unit = js.native
  def setSenderSignature(value: Uint8Array): Unit = js.native
}
/* static members */
object SignedTransaction {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): SignedTransaction = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: SignedTransaction, reader: BinaryReader): SignedTransaction = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: SignedTransaction, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: SignedTransaction): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var rawTxnBytes: Uint8Array | String = js.native
    
    var senderPublicKey: Uint8Array | String = js.native
    
    var senderSignature: Uint8Array | String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      rawTxnBytes: Uint8Array | String,
      senderPublicKey: Uint8Array | String,
      senderSignature: Uint8Array | String
    ): AsObject = {
      val __obj = js.Dynamic.literal(rawTxnBytes = rawTxnBytes.asInstanceOf[js.Any], senderPublicKey = senderPublicKey.asInstanceOf[js.Any], senderSignature = senderSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawTxnBytes(value: Uint8Array | String): Self = StObject.set(x, "rawTxnBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderPublicKey(value: Uint8Array | String): Self = StObject.set(x, "senderPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderSignature(value: Uint8Array | String): Self = StObject.set(x, "senderSignature", value.asInstanceOf[js.Any])
    }
  }
}
