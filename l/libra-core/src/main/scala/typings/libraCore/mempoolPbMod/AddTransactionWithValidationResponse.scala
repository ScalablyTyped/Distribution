package typings.libraCore.mempoolPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse")
@js.native
class AddTransactionWithValidationResponse () extends Message {
  
  def clearStatus(): Unit = js.native
  
  def getCurrentVersion(): String = js.native
  
  def getStatus(): js.UndefOr[MempoolAddTransactionStatus] = js.native
  
  def hasStatus(): Boolean = js.native
  
  def setCurrentVersion(value: String): Unit = js.native
  
  def setStatus(): Unit = js.native
  def setStatus(value: MempoolAddTransactionStatus): Unit = js.native
}
/* static members */
object AddTransactionWithValidationResponse {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: Uint8Array): AddTransactionWithValidationResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[AddTransactionWithValidationResponse]
  
  inline def deserializeBinaryFromReader(message: AddTransactionWithValidationResponse, reader: BinaryReader): AddTransactionWithValidationResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[AddTransactionWithValidationResponse]
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "AddTransactionWithValidationResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: AddTransactionWithValidationResponse, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: AddTransactionWithValidationResponse): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var currentVersion: String
    
    var status: js.UndefOr[typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject] = js.undefined
  }
  object AsObject {
    
    inline def apply(currentVersion: String): AsObject = {
      val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: typings.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus.AsObject): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
