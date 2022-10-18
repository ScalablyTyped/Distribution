package typings.libraCore.`lib@GeneratedTransactionPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/transaction_pb", "Program")
@js.native
open class Program () extends Message {
  
  def addArguments(): TransactionArgument = js.native
  def addArguments(value: Unit, index: Double): TransactionArgument = js.native
  def addArguments(value: TransactionArgument): TransactionArgument = js.native
  def addArguments(value: TransactionArgument, index: Double): TransactionArgument = js.native
  
  def addModules(value: String): js.typedarray.Uint8Array | String = js.native
  def addModules(value: String, index: Double): js.typedarray.Uint8Array | String = js.native
  def addModules(value: js.typedarray.Uint8Array): js.typedarray.Uint8Array | String = js.native
  def addModules(value: js.typedarray.Uint8Array, index: Double): js.typedarray.Uint8Array | String = js.native
  
  def clearArgumentsList(): Unit = js.native
  
  def clearModulesList(): Unit = js.native
  
  def getArgumentsList(): js.Array[TransactionArgument] = js.native
  
  def getCode(): js.typedarray.Uint8Array | String = js.native
  
  def getCode_asB64(): String = js.native
  
  def getCode_asU8(): js.typedarray.Uint8Array = js.native
  
  def getModulesList(): js.Array[js.typedarray.Uint8Array | String] = js.native
  
  def getModulesList_asB64(): js.Array[String] = js.native
  
  def getModulesList_asU8(): js.Array[js.typedarray.Uint8Array] = js.native
  
  def setArgumentsList(value: js.Array[TransactionArgument]): Unit = js.native
  
  def setCode(value: String): Unit = js.native
  def setCode(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setModulesList(value: js.Array[js.typedarray.Uint8Array | String]): Unit = js.native
}
/* static members */
object Program {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Program]
  
  inline def deserializeBinaryFromReader(message: Program, reader: BinaryReader): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: Program, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: Program): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var argumentsList: js.Array[typings.libraCore.`lib@GeneratedTransactionPbMod`.TransactionArgument.AsObject]
    
    var code: js.typedarray.Uint8Array | String
    
    var modulesList: js.Array[js.typedarray.Uint8Array | String]
  }
  object AsObject {
    
    inline def apply(
      argumentsList: js.Array[typings.libraCore.`lib@GeneratedTransactionPbMod`.TransactionArgument.AsObject],
      code: js.typedarray.Uint8Array | String,
      modulesList: js.Array[js.typedarray.Uint8Array | String]
    ): AsObject = {
      val __obj = js.Dynamic.literal(argumentsList = argumentsList.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], modulesList = modulesList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setArgumentsList(value: js.Array[typings.libraCore.`lib@GeneratedTransactionPbMod`.TransactionArgument.AsObject]): Self = StObject.set(x, "argumentsList", value.asInstanceOf[js.Any])
      
      inline def setArgumentsListVarargs(value: typings.libraCore.`lib@GeneratedTransactionPbMod`.TransactionArgument.AsObject*): Self = StObject.set(x, "argumentsList", js.Array(value*))
      
      inline def setCode(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setModulesList(value: js.Array[js.typedarray.Uint8Array | String]): Self = StObject.set(x, "modulesList", value.asInstanceOf[js.Any])
      
      inline def setModulesListVarargs(value: (js.typedarray.Uint8Array | String)*): Self = StObject.set(x, "modulesList", js.Array(value*))
    }
  }
}
