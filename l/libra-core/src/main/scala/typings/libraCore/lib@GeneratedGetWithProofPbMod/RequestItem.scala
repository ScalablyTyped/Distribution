package typings.libraCore.`lib@GeneratedGetWithProofPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.`lib@GeneratedGetWithProofPbMod`.RequestItem.RequestedItemsCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem")
@js.native
open class RequestItem () extends Message {
  
  def clearGetAccountStateRequest(): Unit = js.native
  
  def clearGetAccountTransactionBySequenceNumberRequest(): Unit = js.native
  
  def clearGetEventsByEventAccessPathRequest(): Unit = js.native
  
  def clearGetTransactionsRequest(): Unit = js.native
  
  def getGetAccountStateRequest(): js.UndefOr[GetAccountStateRequest] = js.native
  
  def getGetAccountTransactionBySequenceNumberRequest(): js.UndefOr[GetAccountTransactionBySequenceNumberRequest] = js.native
  
  def getGetEventsByEventAccessPathRequest(): js.UndefOr[GetEventsByEventAccessPathRequest] = js.native
  
  def getGetTransactionsRequest(): js.UndefOr[GetTransactionsRequest] = js.native
  
  def getRequestedItemsCase(): RequestedItemsCase = js.native
  
  def hasGetAccountStateRequest(): Boolean = js.native
  
  def hasGetAccountTransactionBySequenceNumberRequest(): Boolean = js.native
  
  def hasGetEventsByEventAccessPathRequest(): Boolean = js.native
  
  def hasGetTransactionsRequest(): Boolean = js.native
  
  def setGetAccountStateRequest(): Unit = js.native
  def setGetAccountStateRequest(value: GetAccountStateRequest): Unit = js.native
  
  def setGetAccountTransactionBySequenceNumberRequest(): Unit = js.native
  def setGetAccountTransactionBySequenceNumberRequest(value: GetAccountTransactionBySequenceNumberRequest): Unit = js.native
  
  def setGetEventsByEventAccessPathRequest(): Unit = js.native
  def setGetEventsByEventAccessPathRequest(value: GetEventsByEventAccessPathRequest): Unit = js.native
  
  def setGetTransactionsRequest(): Unit = js.native
  def setGetTransactionsRequest(value: GetTransactionsRequest): Unit = js.native
}
/* static members */
object RequestItem {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait RequestedItemsCase extends StObject
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.RequestedItemsCase")
  @js.native
  object RequestedItemsCase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RequestedItemsCase & Double] = js.native
    
    @js.native
    sealed trait GET_ACCOUNT_STATE_REQUEST
      extends StObject
         with RequestedItemsCase
    /* 1 */ val GET_ACCOUNT_STATE_REQUEST: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.RequestItem.RequestedItemsCase.GET_ACCOUNT_STATE_REQUEST & Double = js.native
    
    @js.native
    sealed trait GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST
      extends StObject
         with RequestedItemsCase
    /* 2 */ val GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.RequestItem.RequestedItemsCase.GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_REQUEST & Double = js.native
    
    @js.native
    sealed trait GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST
      extends StObject
         with RequestedItemsCase
    /* 3 */ val GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.RequestItem.RequestedItemsCase.GET_EVENTS_BY_EVENT_ACCESS_PATH_REQUEST & Double = js.native
    
    @js.native
    sealed trait GET_TRANSACTIONS_REQUEST
      extends StObject
         with RequestedItemsCase
    /* 4 */ val GET_TRANSACTIONS_REQUEST: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.RequestItem.RequestedItemsCase.GET_TRANSACTIONS_REQUEST & Double = js.native
    
    @js.native
    sealed trait REQUESTEDITEMS_NOT_SET
      extends StObject
         with RequestedItemsCase
    /* 0 */ val REQUESTEDITEMS_NOT_SET: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.RequestItem.RequestedItemsCase.REQUESTEDITEMS_NOT_SET & Double = js.native
  }
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): RequestItem = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[RequestItem]
  
  inline def deserializeBinaryFromReader(message: RequestItem, reader: BinaryReader): RequestItem = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[RequestItem]
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "RequestItem.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: RequestItem, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: RequestItem): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var getAccountStateRequest: js.UndefOr[
        typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetAccountStateRequest.AsObject
      ] = js.undefined
    
    var getAccountTransactionBySequenceNumberRequest: js.UndefOr[
        typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetAccountTransactionBySequenceNumberRequest.AsObject
      ] = js.undefined
    
    var getEventsByEventAccessPathRequest: js.UndefOr[
        typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetEventsByEventAccessPathRequest.AsObject
      ] = js.undefined
    
    var getTransactionsRequest: js.UndefOr[
        typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetTransactionsRequest.AsObject
      ] = js.undefined
  }
  object AsObject {
    
    inline def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setGetAccountStateRequest(value: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetAccountStateRequest.AsObject): Self = StObject.set(x, "getAccountStateRequest", value.asInstanceOf[js.Any])
      
      inline def setGetAccountStateRequestUndefined: Self = StObject.set(x, "getAccountStateRequest", js.undefined)
      
      inline def setGetAccountTransactionBySequenceNumberRequest(
        value: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetAccountTransactionBySequenceNumberRequest.AsObject
      ): Self = StObject.set(x, "getAccountTransactionBySequenceNumberRequest", value.asInstanceOf[js.Any])
      
      inline def setGetAccountTransactionBySequenceNumberRequestUndefined: Self = StObject.set(x, "getAccountTransactionBySequenceNumberRequest", js.undefined)
      
      inline def setGetEventsByEventAccessPathRequest(
        value: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetEventsByEventAccessPathRequest.AsObject
      ): Self = StObject.set(x, "getEventsByEventAccessPathRequest", value.asInstanceOf[js.Any])
      
      inline def setGetEventsByEventAccessPathRequestUndefined: Self = StObject.set(x, "getEventsByEventAccessPathRequest", js.undefined)
      
      inline def setGetTransactionsRequest(value: typings.libraCore.`lib@GeneratedGetWithProofPbMod`.GetTransactionsRequest.AsObject): Self = StObject.set(x, "getTransactionsRequest", value.asInstanceOf[js.Any])
      
      inline def setGetTransactionsRequestUndefined: Self = StObject.set(x, "getTransactionsRequest", js.undefined)
    }
  }
}
