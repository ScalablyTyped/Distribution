package typings.libraCore.mempoolPbMod

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

@JSImport("libra-core/lib/@/generated/mempool_pb", "CommittedTransaction")
@js.native
class CommittedTransaction () extends Message {
  
  def getIsRejected(): Boolean = js.native
  
  def getSender(): Uint8Array | String = js.native
  
  def getSender_asB64(): String = js.native
  
  def getSender_asU8(): Uint8Array = js.native
  
  def getSequenceNumber(): String = js.native
  
  def setIsRejected(value: Boolean): Unit = js.native
  
  def setSender(value: String): Unit = js.native
  def setSender(value: Uint8Array): Unit = js.native
  
  def setSequenceNumber(value: String): Unit = js.native
}
/* static members */
object CommittedTransaction {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommittedTransaction")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deserializeBinary(bytes: Uint8Array): CommittedTransaction = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[CommittedTransaction]
  
  @scala.inline
  def deserializeBinaryFromReader(message: CommittedTransaction, reader: BinaryReader): CommittedTransaction = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[CommittedTransaction]
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommittedTransaction.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommittedTransaction.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serializeBinaryToWriter(message: CommittedTransaction, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def toObject(includeInstance: Boolean, msg: CommittedTransaction): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var isRejected: Boolean
    
    var sender: Uint8Array | String
    
    var sequenceNumber: String
  }
  object AsObject {
    
    @scala.inline
    def apply(isRejected: Boolean, sender: Uint8Array | String, sequenceNumber: String): AsObject = {
      val __obj = js.Dynamic.literal(isRejected = isRejected.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRejected(value: Boolean): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSender(value: Uint8Array | String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
}
