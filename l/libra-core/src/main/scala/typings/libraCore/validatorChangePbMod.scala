package typings.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.eventsPbMod.EventWithProof
import typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorChangePbMod {
  
  @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
  @js.native
  class ValidatorChangeEventWithProof () extends Message {
    
    def clearEventWithProof(): Unit = js.native
    
    def clearLedgerInfoWithSigs(): Unit = js.native
    
    def getEventWithProof(): js.UndefOr[EventWithProof] = js.native
    
    def getLedgerInfoWithSigs(): js.UndefOr[LedgerInfoWithSignatures] = js.native
    
    def hasEventWithProof(): Boolean = js.native
    
    def hasLedgerInfoWithSigs(): Boolean = js.native
    
    def setEventWithProof(): Unit = js.native
    def setEventWithProof(value: EventWithProof): Unit = js.native
    
    def setLedgerInfoWithSigs(): Unit = js.native
    def setLedgerInfoWithSigs(value: LedgerInfoWithSignatures): Unit = js.native
  }
  /* static members */
  object ValidatorChangeEventWithProof {
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def deserializeBinary(bytes: Uint8Array): ValidatorChangeEventWithProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ValidatorChangeEventWithProof]
    
    @scala.inline
    def deserializeBinaryFromReader(message: ValidatorChangeEventWithProof, reader: BinaryReader): ValidatorChangeEventWithProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ValidatorChangeEventWithProof]
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def serializeBinaryToWriter(message: ValidatorChangeEventWithProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def toObject(includeInstance: Boolean, msg: ValidatorChangeEventWithProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var eventWithProof: js.UndefOr[typings.libraCore.eventsPbMod.EventWithProof.AsObject] = js.undefined
      
      var ledgerInfoWithSigs: js.UndefOr[typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject] = js.undefined
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
        def setEventWithProof(value: typings.libraCore.eventsPbMod.EventWithProof.AsObject): Self = StObject.set(x, "eventWithProof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventWithProofUndefined: Self = StObject.set(x, "eventWithProof", js.undefined)
        
        @scala.inline
        def setLedgerInfoWithSigs(value: typings.libraCore.ledgerInfoPbMod.LedgerInfoWithSignatures.AsObject): Self = StObject.set(x, "ledgerInfoWithSigs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLedgerInfoWithSigsUndefined: Self = StObject.set(x, "ledgerInfoWithSigs", js.undefined)
      }
    }
  }
}
