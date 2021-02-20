package typings.libraCore.getWithProofPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures
import typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse")
@js.native
class UpdateToLatestLedgerResponse () extends Message {
  
  def addResponseItems(): ResponseItem = js.native
  def addResponseItems(value: js.UndefOr[scala.Nothing], index: Double): ResponseItem = js.native
  def addResponseItems(value: ResponseItem): ResponseItem = js.native
  def addResponseItems(value: ResponseItem, index: Double): ResponseItem = js.native
  
  def addValidatorChangeEvents(): ValidatorChangeEventWithProof = js.native
  def addValidatorChangeEvents(value: js.UndefOr[scala.Nothing], index: Double): ValidatorChangeEventWithProof = js.native
  def addValidatorChangeEvents(value: ValidatorChangeEventWithProof): ValidatorChangeEventWithProof = js.native
  def addValidatorChangeEvents(value: ValidatorChangeEventWithProof, index: Double): ValidatorChangeEventWithProof = js.native
  
  def clearLedgerInfoWithSigs(): Unit = js.native
  
  def clearResponseItemsList(): Unit = js.native
  
  def clearValidatorChangeEventsList(): Unit = js.native
  
  def getLedgerInfoWithSigs(): js.UndefOr[LedgerInfoWithSignatures] = js.native
  
  def getResponseItemsList(): js.Array[ResponseItem] = js.native
  
  def getValidatorChangeEventsList(): js.Array[ValidatorChangeEventWithProof] = js.native
  
  def hasLedgerInfoWithSigs(): Boolean = js.native
  
  def setLedgerInfoWithSigs(): Unit = js.native
  def setLedgerInfoWithSigs(value: LedgerInfoWithSignatures): Unit = js.native
  
  def setResponseItemsList(value: js.Array[ResponseItem]): Unit = js.native
  
  def setValidatorChangeEventsList(value: js.Array[ValidatorChangeEventWithProof]): Unit = js.native
}
/* static members */
object UpdateToLatestLedgerResponse {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): UpdateToLatestLedgerResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: UpdateToLatestLedgerResponse, reader: BinaryReader): UpdateToLatestLedgerResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: UpdateToLatestLedgerResponse, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "UpdateToLatestLedgerResponse.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: UpdateToLatestLedgerResponse): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var ledgerInfoWithSigs: js.UndefOr[typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject] = js.native
    
    var responseItemsList: js.Array[typings.libraCore.getWithProofPbMod.ResponseItem.AsObject] = js.native
    
    var validatorChangeEventsList: js.Array[typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(
      responseItemsList: js.Array[typings.libraCore.getWithProofPbMod.ResponseItem.AsObject],
      validatorChangeEventsList: js.Array[typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject]
    ): AsObject = {
      val __obj = js.Dynamic.literal(responseItemsList = responseItemsList.asInstanceOf[js.Any], validatorChangeEventsList = validatorChangeEventsList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLedgerInfoWithSigs(value: typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject): Self = StObject.set(x, "ledgerInfoWithSigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLedgerInfoWithSigsUndefined: Self = StObject.set(x, "ledgerInfoWithSigs", js.undefined)
      
      @scala.inline
      def setResponseItemsList(value: js.Array[typings.libraCore.getWithProofPbMod.ResponseItem.AsObject]): Self = StObject.set(x, "responseItemsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseItemsListVarargs(value: typings.libraCore.getWithProofPbMod.ResponseItem.AsObject*): Self = StObject.set(x, "responseItemsList", js.Array(value :_*))
      
      @scala.inline
      def setValidatorChangeEventsList(value: js.Array[typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject]): Self = StObject.set(x, "validatorChangeEventsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorChangeEventsListVarargs(value: typings.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof.AsObject*): Self = StObject.set(x, "validatorChangeEventsList", js.Array(value :_*))
    }
  }
}
