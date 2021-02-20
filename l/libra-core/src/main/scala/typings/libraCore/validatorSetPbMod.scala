package typings.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorSetPbMod {
  
  @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet")
  @js.native
  class ValidatorSet () extends Message {
    
    def addValidatorPublicKeys(): ValidatorPublicKeys = js.native
    def addValidatorPublicKeys(value: js.UndefOr[scala.Nothing], index: Double): ValidatorPublicKeys = js.native
    def addValidatorPublicKeys(value: ValidatorPublicKeys): ValidatorPublicKeys = js.native
    def addValidatorPublicKeys(value: ValidatorPublicKeys, index: Double): ValidatorPublicKeys = js.native
    
    def clearValidatorPublicKeysList(): Unit = js.native
    
    def getValidatorPublicKeysList(): js.Array[ValidatorPublicKeys] = js.native
    
    def setValidatorPublicKeysList(value: js.Array[ValidatorPublicKeys]): Unit = js.native
  }
  /* static members */
  object ValidatorSet {
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.deserializeBinary")
    @js.native
    def deserializeBinary(bytes: Uint8Array): ValidatorSet = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.deserializeBinaryFromReader")
    @js.native
    def deserializeBinaryFromReader(message: ValidatorSet, reader: BinaryReader): ValidatorSet = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.serializeBinaryToWriter")
    @js.native
    def serializeBinaryToWriter(message: ValidatorSet, writer: BinaryWriter): Unit = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet.toObject")
    @js.native
    def toObject(includeInstance: Boolean, msg: ValidatorSet): AsObject = js.native
    
    @js.native
    trait AsObject extends StObject {
      
      var validatorPublicKeysList: js.Array[typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject] = js.native
    }
    object AsObject {
      
      @scala.inline
      def apply(
        validatorPublicKeysList: js.Array[typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]
      ): AsObject = {
        val __obj = js.Dynamic.literal(validatorPublicKeysList = validatorPublicKeysList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setValidatorPublicKeysList(value: js.Array[typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject]): Self = StObject.set(x, "validatorPublicKeysList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidatorPublicKeysListVarargs(value: typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys.AsObject*): Self = StObject.set(x, "validatorPublicKeysList", js.Array(value :_*))
      }
    }
  }
}
