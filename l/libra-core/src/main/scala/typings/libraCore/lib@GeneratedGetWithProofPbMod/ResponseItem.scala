package typings.libraCore.`lib@GeneratedGetWithProofPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.ResponseItemsCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem")
@js.native
open class ResponseItem () extends Message {
  
  def clearGetAccountStateResponse(): Unit = js.native
  
  def clearGetAccountTransactionBySequenceNumberResponse(): Unit = js.native
  
  def clearGetEventsByEventAccessPathResponse(): Unit = js.native
  
  def clearGetTransactionsResponse(): Unit = js.native
  
  def getGetAccountStateResponse(): js.UndefOr[GetAccountStateResponse] = js.native
  
  def getGetAccountTransactionBySequenceNumberResponse(): js.UndefOr[GetAccountTransactionBySequenceNumberResponse] = js.native
  
  def getGetEventsByEventAccessPathResponse(): js.UndefOr[GetEventsByEventAccessPathResponse] = js.native
  
  def getGetTransactionsResponse(): js.UndefOr[GetTransactionsResponse] = js.native
  
  def getResponseItemsCase(): ResponseItemsCase = js.native
  
  def hasGetAccountStateResponse(): Boolean = js.native
  
  def hasGetAccountTransactionBySequenceNumberResponse(): Boolean = js.native
  
  def hasGetEventsByEventAccessPathResponse(): Boolean = js.native
  
  def hasGetTransactionsResponse(): Boolean = js.native
  
  def setGetAccountStateResponse(): Unit = js.native
  def setGetAccountStateResponse(value: GetAccountStateResponse): Unit = js.native
  
  def setGetAccountTransactionBySequenceNumberResponse(): Unit = js.native
  def setGetAccountTransactionBySequenceNumberResponse(value: GetAccountTransactionBySequenceNumberResponse): Unit = js.native
  
  def setGetEventsByEventAccessPathResponse(): Unit = js.native
  def setGetEventsByEventAccessPathResponse(value: GetEventsByEventAccessPathResponse): Unit = js.native
  
  def setGetTransactionsResponse(): Unit = js.native
  def setGetTransactionsResponse(value: GetTransactionsResponse): Unit = js.native
}
/* static members */
object ResponseItem {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ResponseItemsCase extends StObject
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.ResponseItemsCase")
  @js.native
  object ResponseItemsCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResponseItemsCase & Double] = js.native
    
    @js.native
    sealed trait GET_ACCOUNT_STATE_RESPONSE
      extends StObject
         with ResponseItemsCase
    /* 3 */ val GET_ACCOUNT_STATE_RESPONSE: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.ResponseItemsCase.GET_ACCOUNT_STATE_RESPONSE & Double = js.native
    
    @js.native
    sealed trait GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE
      extends StObject
         with ResponseItemsCase
    /* 4 */ val GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.ResponseItemsCase.GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE & Double = js.native
    
    @js.native
    sealed trait GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE
      extends StObject
         with ResponseItemsCase
    /* 5 */ val GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.ResponseItemsCase.GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE & Double = js.native
    
    @js.native
    sealed trait GET_TRANSACTIONS_RESPONSE
      extends StObject
         with ResponseItemsCase
    /* 6 */ val GET_TRANSACTIONS_RESPONSE: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.ResponseItemsCase.GET_TRANSACTIONS_RESPONSE & Double = js.native
    
    @js.native
    sealed trait RESPONSEITEMS_NOT_SET
      extends StObject
         with ResponseItemsCase
    /* 0 */ val RESPONSEITEMS_NOT_SET: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.ResponseItem.ResponseItemsCase.RESPONSEITEMS_NOT_SET & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): ResponseItem = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ResponseItem]
  
  inline def deserializeBinaryFromReader(message: ResponseItem, reader: BinaryReader): ResponseItem = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ResponseItem]
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: ResponseItem, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: ResponseItem): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var getAccountStateResponse: js.UndefOr[
        typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetAccountStateResponse.AsObject
      ] = js.undefined
    
    var getAccountTransactionBySequenceNumberResponse: js.UndefOr[
        typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetAccountTransactionBySequenceNumberResponse.AsObject
      ] = js.undefined
    
    var getEventsByEventAccessPathResponse: js.UndefOr[
        typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetEventsByEventAccessPathResponse.AsObject
      ] = js.undefined
    
    var getTransactionsResponse: js.UndefOr[
        typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetTransactionsResponse.AsObject
      ] = js.undefined
  }
  object AsObject {
    
    inline def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setGetAccountStateResponse(value: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetAccountStateResponse.AsObject): Self = StObject.set(x, "getAccountStateResponse", value.asInstanceOf[js.Any])
      
      inline def setGetAccountStateResponseUndefined: Self = StObject.set(x, "getAccountStateResponse", js.undefined)
      
      inline def setGetAccountTransactionBySequenceNumberResponse(
        value: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetAccountTransactionBySequenceNumberResponse.AsObject
      ): Self = StObject.set(x, "getAccountTransactionBySequenceNumberResponse", value.asInstanceOf[js.Any])
      
      inline def setGetAccountTransactionBySequenceNumberResponseUndefined: Self = StObject.set(x, "getAccountTransactionBySequenceNumberResponse", js.undefined)
      
      inline def setGetEventsByEventAccessPathResponse(
        value: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetEventsByEventAccessPathResponse.AsObject
      ): Self = StObject.set(x, "getEventsByEventAccessPathResponse", value.asInstanceOf[js.Any])
      
      inline def setGetEventsByEventAccessPathResponseUndefined: Self = StObject.set(x, "getEventsByEventAccessPathResponse", js.undefined)
      
      inline def setGetTransactionsResponse(value: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetTransactionsResponse.AsObject): Self = StObject.set(x, "getTransactionsResponse", value.asInstanceOf[js.Any])
      
      inline def setGetTransactionsResponseUndefined: Self = StObject.set(x, "getTransactionsResponse", js.undefined)
    }
  }
}
