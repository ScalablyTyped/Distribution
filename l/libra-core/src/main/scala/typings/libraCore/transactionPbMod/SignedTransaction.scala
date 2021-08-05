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
  
  inline def deserializeBinary(bytes: Uint8Array): SignedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SignedTransaction]
  
  inline def deserializeBinaryFromReader(message: SignedTransaction, reader: BinaryReader): SignedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[SignedTransaction]
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: SignedTransaction, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: SignedTransaction): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var rawTxnBytes: Uint8Array | String
    
    var senderPublicKey: Uint8Array | String
    
    var senderSignature: Uint8Array | String
  }
  object AsObject {
    
    inline def apply(
      rawTxnBytes: Uint8Array | String,
      senderPublicKey: Uint8Array | String,
      senderSignature: Uint8Array | String
    ): AsObject = {
      val __obj = js.Dynamic.literal(rawTxnBytes = rawTxnBytes.asInstanceOf[js.Any], senderPublicKey = senderPublicKey.asInstanceOf[js.Any], senderSignature = senderSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setRawTxnBytes(value: Uint8Array | String): Self = StObject.set(x, "rawTxnBytes", value.asInstanceOf[js.Any])
      
      inline def setSenderPublicKey(value: Uint8Array | String): Self = StObject.set(x, "senderPublicKey", value.asInstanceOf[js.Any])
      
      inline def setSenderSignature(value: Uint8Array | String): Self = StObject.set(x, "senderSignature", value.asInstanceOf[js.Any])
    }
  }
}
