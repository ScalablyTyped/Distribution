package typings.libraCore.`lib@GeneratedMempoolPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion")
@js.native
open class TransactionExclusion () extends Message {
  
  def getSender(): js.typedarray.Uint8Array | String = js.native
  
  def getSender_asB64(): String = js.native
  
  def getSender_asU8(): js.typedarray.Uint8Array = js.native
  
  def getSequenceNumber(): String = js.native
  
  def setSender(value: String): Unit = js.native
  def setSender(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setSequenceNumber(value: String): Unit = js.native
}
/* static members */
object TransactionExclusion {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): TransactionExclusion = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[TransactionExclusion]
  
  inline def deserializeBinaryFromReader(message: TransactionExclusion, reader: BinaryReader): TransactionExclusion = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TransactionExclusion]
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: TransactionExclusion, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: TransactionExclusion): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var sender: js.typedarray.Uint8Array | String
    
    var sequenceNumber: String
  }
  object AsObject {
    
    inline def apply(sender: js.typedarray.Uint8Array | String, sequenceNumber: String): AsObject = {
      val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setSender(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
}
