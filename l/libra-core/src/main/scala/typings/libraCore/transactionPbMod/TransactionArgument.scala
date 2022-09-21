package typings.libraCore.transactionPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionPbMod.TransactionArgument.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument")
@js.native
open class TransactionArgument () extends Message {
  
  def getData(): js.typedarray.Uint8Array | String = js.native
  
  def getData_asB64(): String = js.native
  
  def getData_asU8(): js.typedarray.Uint8Array = js.native
  
  def getType(): ArgType = js.native
  
  def setData(value: String): Unit = js.native
  def setData(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setType(value: ArgType): Unit = js.native
}
/* static members */
object TransactionArgument {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ArgType extends StObject
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.ArgType")
  @js.native
  object ArgType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ArgType & Double] = js.native
    
    @js.native
    sealed trait ADDRESS
      extends StObject
         with ArgType
    /* 1 */ val ADDRESS: typings.libraCore.transactionPbMod.TransactionArgument.ArgType.ADDRESS & Double = js.native
    
    @js.native
    sealed trait BYTEARRAY
      extends StObject
         with ArgType
    /* 3 */ val BYTEARRAY: typings.libraCore.transactionPbMod.TransactionArgument.ArgType.BYTEARRAY & Double = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with ArgType
    /* 2 */ val STRING: typings.libraCore.transactionPbMod.TransactionArgument.ArgType.STRING & Double = js.native
    
    @js.native
    sealed trait U64
      extends StObject
         with ArgType
    /* 0 */ val U64: typings.libraCore.transactionPbMod.TransactionArgument.ArgType.U64 & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): TransactionArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[TransactionArgument]
  
  inline def deserializeBinaryFromReader(message: TransactionArgument, reader: BinaryReader): TransactionArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[TransactionArgument]
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: TransactionArgument, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: TransactionArgument): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var data: js.typedarray.Uint8Array | String
    
    var `type`: ArgType
  }
  object AsObject {
    
    inline def apply(data: js.typedarray.Uint8Array | String, `type`: ArgType): AsObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: ArgType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
