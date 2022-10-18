package typings.libraCore.`lib@GeneratedGetWithProofPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest")
@js.native
open class GetAccountTransactionBySequenceNumberRequest () extends Message {
  
  def getAccount(): js.typedarray.Uint8Array | String = js.native
  
  def getAccount_asB64(): String = js.native
  
  def getAccount_asU8(): js.typedarray.Uint8Array = js.native
  
  def getFetchEvents(): Boolean = js.native
  
  def getSequenceNumber(): String = js.native
  
  def setAccount(value: String): Unit = js.native
  def setAccount(value: js.typedarray.Uint8Array): Unit = js.native
  
  def setFetchEvents(value: Boolean): Unit = js.native
  
  def setSequenceNumber(value: String): Unit = js.native
}
/* static members */
object GetAccountTransactionBySequenceNumberRequest {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): GetAccountTransactionBySequenceNumberRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[GetAccountTransactionBySequenceNumberRequest]
  
  inline def deserializeBinaryFromReader(message: GetAccountTransactionBySequenceNumberRequest, reader: BinaryReader): GetAccountTransactionBySequenceNumberRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[GetAccountTransactionBySequenceNumberRequest]
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: GetAccountTransactionBySequenceNumberRequest, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: GetAccountTransactionBySequenceNumberRequest): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var account: js.typedarray.Uint8Array | String
    
    var fetchEvents: Boolean
    
    var sequenceNumber: String
  }
  object AsObject {
    
    inline def apply(account: js.typedarray.Uint8Array | String, fetchEvents: Boolean, sequenceNumber: String): AsObject = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], fetchEvents = fetchEvents.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setAccount(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setFetchEvents(value: Boolean): Self = StObject.set(x, "fetchEvents", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    }
  }
}
