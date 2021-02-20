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

@JSImport("libra-core/lib/@/generated/transaction_pb", "Program")
@js.native
class Program () extends Message {
  
  def addArguments(): TransactionArgument = js.native
  def addArguments(value: js.UndefOr[scala.Nothing], index: Double): TransactionArgument = js.native
  def addArguments(value: TransactionArgument): TransactionArgument = js.native
  def addArguments(value: TransactionArgument, index: Double): TransactionArgument = js.native
  
  def addModules(value: String): Uint8Array | String = js.native
  def addModules(value: String, index: Double): Uint8Array | String = js.native
  def addModules(value: Uint8Array): Uint8Array | String = js.native
  def addModules(value: Uint8Array, index: Double): Uint8Array | String = js.native
  
  def clearArgumentsList(): Unit = js.native
  
  def clearModulesList(): Unit = js.native
  
  def getArgumentsList(): js.Array[TransactionArgument] = js.native
  
  def getCode(): Uint8Array | String = js.native
  
  def getCode_asB64(): String = js.native
  
  def getCode_asU8(): Uint8Array = js.native
  
  def getModulesList(): js.Array[Uint8Array | String] = js.native
  
  def getModulesList_asB64(): js.Array[String] = js.native
  
  def getModulesList_asU8(): js.Array[Uint8Array] = js.native
  
  def setArgumentsList(value: js.Array[TransactionArgument]): Unit = js.native
  
  def setCode(value: String): Unit = js.native
  def setCode(value: Uint8Array): Unit = js.native
  
  def setModulesList(value: js.Array[Uint8Array | String]): Unit = js.native
}
/* static members */
object Program {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): Program = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: Program, reader: BinaryReader): Program = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: Program, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "Program.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: Program): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var argumentsList: js.Array[typings.libraCore.transactionPbMod.TransactionArgument.AsObject] = js.native
    
    var code: Uint8Array | String = js.native
    
    var modulesList: js.Array[Uint8Array | String] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      argumentsList: js.Array[typings.libraCore.transactionPbMod.TransactionArgument.AsObject],
      code: Uint8Array | String,
      modulesList: js.Array[Uint8Array | String]
    ): AsObject = {
      val __obj = js.Dynamic.literal(argumentsList = argumentsList.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], modulesList = modulesList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgumentsList(value: js.Array[typings.libraCore.transactionPbMod.TransactionArgument.AsObject]): Self = StObject.set(x, "argumentsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsListVarargs(value: typings.libraCore.transactionPbMod.TransactionArgument.AsObject*): Self = StObject.set(x, "argumentsList", js.Array(value :_*))
      
      @scala.inline
      def setCode(value: Uint8Array | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesList(value: js.Array[Uint8Array | String]): Self = StObject.set(x, "modulesList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesListVarargs(value: (Uint8Array | String)*): Self = StObject.set(x, "modulesList", js.Array(value :_*))
    }
  }
}
