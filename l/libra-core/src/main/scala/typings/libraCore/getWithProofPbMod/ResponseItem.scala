package typings.libraCore.getWithProofPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.getWithProofPbMod.ResponseItem.ResponseItemsCase
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem")
@js.native
class ResponseItem () extends Message {
  
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
    def apply(value: Double): js.UndefOr[ResponseItemsCase with Double] = js.native
    
    @js.native
    sealed trait GET_ACCOUNT_STATE_RESPONSE extends ResponseItemsCase
    /* 3 */ val GET_ACCOUNT_STATE_RESPONSE: typings.libraCore.getWithProofPbMod.ResponseItem.ResponseItemsCase.GET_ACCOUNT_STATE_RESPONSE with Double = js.native
    
    @js.native
    sealed trait GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE extends ResponseItemsCase
    /* 4 */ val GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE: typings.libraCore.getWithProofPbMod.ResponseItem.ResponseItemsCase.GET_ACCOUNT_TRANSACTION_BY_SEQUENCE_NUMBER_RESPONSE with Double = js.native
    
    @js.native
    sealed trait GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE extends ResponseItemsCase
    /* 5 */ val GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE: typings.libraCore.getWithProofPbMod.ResponseItem.ResponseItemsCase.GET_EVENTS_BY_EVENT_ACCESS_PATH_RESPONSE with Double = js.native
    
    @js.native
    sealed trait GET_TRANSACTIONS_RESPONSE extends ResponseItemsCase
    /* 6 */ val GET_TRANSACTIONS_RESPONSE: typings.libraCore.getWithProofPbMod.ResponseItem.ResponseItemsCase.GET_TRANSACTIONS_RESPONSE with Double = js.native
    
    @js.native
    sealed trait RESPONSEITEMS_NOT_SET extends ResponseItemsCase
    /* 0 */ val RESPONSEITEMS_NOT_SET: typings.libraCore.getWithProofPbMod.ResponseItem.ResponseItemsCase.RESPONSEITEMS_NOT_SET with Double = js.native
  }
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): ResponseItem = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: ResponseItem, reader: BinaryReader): ResponseItem = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: ResponseItem, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: ResponseItem): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var getAccountStateResponse: js.UndefOr[typings.libraCore.getWithProofPbMod.GetAccountStateResponse.AsObject] = js.native
    
    var getAccountTransactionBySequenceNumberResponse: js.UndefOr[
        typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse.AsObject
      ] = js.native
    
    var getEventsByEventAccessPathResponse: js.UndefOr[typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse.AsObject] = js.native
    
    var getTransactionsResponse: js.UndefOr[typings.libraCore.getWithProofPbMod.GetTransactionsResponse.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(): AsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAccountStateResponse(value: typings.libraCore.getWithProofPbMod.GetAccountStateResponse.AsObject): Self = StObject.set(x, "getAccountStateResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAccountStateResponseUndefined: Self = StObject.set(x, "getAccountStateResponse", js.undefined)
      
      @scala.inline
      def setGetAccountTransactionBySequenceNumberResponse(value: typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse.AsObject): Self = StObject.set(x, "getAccountTransactionBySequenceNumberResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAccountTransactionBySequenceNumberResponseUndefined: Self = StObject.set(x, "getAccountTransactionBySequenceNumberResponse", js.undefined)
      
      @scala.inline
      def setGetEventsByEventAccessPathResponse(value: typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse.AsObject): Self = StObject.set(x, "getEventsByEventAccessPathResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetEventsByEventAccessPathResponseUndefined: Self = StObject.set(x, "getEventsByEventAccessPathResponse", js.undefined)
      
      @scala.inline
      def setGetTransactionsResponse(value: typings.libraCore.getWithProofPbMod.GetTransactionsResponse.AsObject): Self = StObject.set(x, "getTransactionsResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTransactionsResponseUndefined: Self = StObject.set(x, "getTransactionsResponse", js.undefined)
    }
  }
}
