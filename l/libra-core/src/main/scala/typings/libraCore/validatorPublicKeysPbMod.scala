package typings.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorPublicKeysPbMod {
  
  @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys")
  @js.native
  open class ValidatorPublicKeys () extends Message {
    
    def getAccountAddress(): js.typedarray.Uint8Array | String = js.native
    
    def getAccountAddress_asB64(): String = js.native
    
    def getAccountAddress_asU8(): js.typedarray.Uint8Array = js.native
    
    def getConsensusPublicKey(): js.typedarray.Uint8Array | String = js.native
    
    def getConsensusPublicKey_asB64(): String = js.native
    
    def getConsensusPublicKey_asU8(): js.typedarray.Uint8Array = js.native
    
    def getNetworkIdentityPublicKey(): js.typedarray.Uint8Array | String = js.native
    
    def getNetworkIdentityPublicKey_asB64(): String = js.native
    
    def getNetworkIdentityPublicKey_asU8(): js.typedarray.Uint8Array = js.native
    
    def getNetworkSigningPublicKey(): js.typedarray.Uint8Array | String = js.native
    
    def getNetworkSigningPublicKey_asB64(): String = js.native
    
    def getNetworkSigningPublicKey_asU8(): js.typedarray.Uint8Array = js.native
    
    def setAccountAddress(value: String): Unit = js.native
    def setAccountAddress(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setConsensusPublicKey(value: String): Unit = js.native
    def setConsensusPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setNetworkIdentityPublicKey(value: String): Unit = js.native
    def setNetworkIdentityPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setNetworkSigningPublicKey(value: String): Unit = js.native
    def setNetworkSigningPublicKey(value: js.typedarray.Uint8Array): Unit = js.native
  }
  /* static members */
  object ValidatorPublicKeys {
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): ValidatorPublicKeys = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ValidatorPublicKeys]
    
    inline def deserializeBinaryFromReader(message: ValidatorPublicKeys, reader: BinaryReader): ValidatorPublicKeys = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[ValidatorPublicKeys]
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: ValidatorPublicKeys, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: ValidatorPublicKeys): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var accountAddress: js.typedarray.Uint8Array | String
      
      var consensusPublicKey: js.typedarray.Uint8Array | String
      
      var networkIdentityPublicKey: js.typedarray.Uint8Array | String
      
      var networkSigningPublicKey: js.typedarray.Uint8Array | String
    }
    object AsObject {
      
      inline def apply(
        accountAddress: js.typedarray.Uint8Array | String,
        consensusPublicKey: js.typedarray.Uint8Array | String,
        networkIdentityPublicKey: js.typedarray.Uint8Array | String,
        networkSigningPublicKey: js.typedarray.Uint8Array | String
      ): AsObject = {
        val __obj = js.Dynamic.literal(accountAddress = accountAddress.asInstanceOf[js.Any], consensusPublicKey = consensusPublicKey.asInstanceOf[js.Any], networkIdentityPublicKey = networkIdentityPublicKey.asInstanceOf[js.Any], networkSigningPublicKey = networkSigningPublicKey.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setAccountAddress(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "accountAddress", value.asInstanceOf[js.Any])
        
        inline def setConsensusPublicKey(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "consensusPublicKey", value.asInstanceOf[js.Any])
        
        inline def setNetworkIdentityPublicKey(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "networkIdentityPublicKey", value.asInstanceOf[js.Any])
        
        inline def setNetworkSigningPublicKey(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "networkSigningPublicKey", value.asInstanceOf[js.Any])
      }
    }
  }
}
