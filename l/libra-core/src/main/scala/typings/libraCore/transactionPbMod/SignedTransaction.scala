package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction")
@js.native
open class SignedTransaction () extends Message {
  
  def getRawTxnBytes(): js.typedarray.Uint8Array | String = js.native
  
  def getRawTxnBytes_asB64(): String = js.native
  
  def getRawTxnBytes_asU8(): js.typedarray.Uint8Array = js.native
  
  def getSenderPublicKey(): js.typedarray.Uint8Array | String = js.native
  
  def getSenderPublicKey_asB64(): String = js.native
  
  def getSenderPublicKey_asU8(): js.typedarray.Uint8Array = js.native
  
  def getSenderSignature(): js.typedarray.Uint8Array | String = js.native
  
  def getSenderSignature_asB64(): String = js.native
  
  def getSenderSignature_asU8(): js.typedarray.Uint8Array = js.native
  
  def setRawTxnBytes(value: String): Unit = js.native
  def setRawTxnBytes(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setSenderPublicKey(value: String): Unit = js.native
  def setSenderPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setSenderSignature(value: String): Unit = js.native
  def setSenderSignature(value: js.typedarray.Uint8Array): Unit = js.native
}
/* static members */
object SignedTransaction {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): SignedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SignedTransaction]
  
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
    
    var rawTxnBytes: js.typedarray.Uint8Array | String
    
    var senderPublicKey: js.typedarray.Uint8Array | String
    
    var senderSignature: js.typedarray.Uint8Array | String
  }
  object AsObject {
    
    inline def apply(
      rawTxnBytes: js.typedarray.Uint8Array | String,
      senderPublicKey: js.typedarray.Uint8Array | String,
      senderSignature: js.typedarray.Uint8Array | String
    ): AsObject = {
      val __obj = js.Dynamic.literal(rawTxnBytes = rawTxnBytes.asInstanceOf[js.Any], senderPublicKey = senderPublicKey.asInstanceOf[js.Any], senderSignature = senderSignature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setRawTxnBytes(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "rawTxnBytes", value.asInstanceOf[js.Any])
      
      inline def setSenderPublicKey(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "senderPublicKey", value.asInstanceOf[js.Any])
      
      inline def setSenderSignature(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "senderSignature", value.asInstanceOf[js.Any])
    }
  }
}
