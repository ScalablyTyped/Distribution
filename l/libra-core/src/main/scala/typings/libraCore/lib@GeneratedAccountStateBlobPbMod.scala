package typings.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.`lib@GeneratedProofPbMod`.AccountStateProof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `lib@GeneratedAccountStateBlobPbMod` {
  
  @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob")
  @js.native
  open class AccountStateBlob () extends Message {
    
    def getBlob(): js.typedarray.Uint8Array | String = js.native
    
    def getBlob_asB64(): String = js.native
    
    def getBlob_asU8(): js.typedarray.Uint8Array = js.native
    
    def setBlob(value: String): Unit = js.native
    def setBlob(value: js.typedarray.Uint8Array): Unit = js.native
  }
  /* static members */
  object AccountStateBlob {
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): AccountStateBlob = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[AccountStateBlob]
    
    inline def deserializeBinaryFromReader(message: AccountStateBlob, reader: BinaryReader): AccountStateBlob = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[AccountStateBlob]
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: AccountStateBlob, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: AccountStateBlob): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var blob: js.typedarray.Uint8Array | String
    }
    object AsObject {
      
      inline def apply(blob: js.typedarray.Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        inline def setBlob(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof")
  @js.native
  open class AccountStateWithProof () extends Message {
    
    def clearBlob(): Unit = js.native
    
    def clearProof(): Unit = js.native
    
    def getBlob(): js.UndefOr[AccountStateBlob] = js.native
    
    def getProof(): js.UndefOr[AccountStateProof] = js.native
    
    def getVersion(): String = js.native
    
    def hasBlob(): Boolean = js.native
    
    def hasProof(): Boolean = js.native
    
    def setBlob(): Unit = js.native
    def setBlob(value: AccountStateBlob): Unit = js.native
    
    def setProof(): Unit = js.native
    def setProof(value: AccountStateProof): Unit = js.native
    
    def setVersion(value: String): Unit = js.native
  }
  /* static members */
  object AccountStateWithProof {
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): AccountStateWithProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[AccountStateWithProof]
    
    inline def deserializeBinaryFromReader(message: AccountStateWithProof, reader: BinaryReader): AccountStateWithProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[AccountStateWithProof]
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: AccountStateWithProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: AccountStateWithProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var blob: js.UndefOr[typings.libraCore.`lib@GeneratedAccountStateBlobPbMod`.AccountStateBlob.AsObject] = js.undefined
      
      var proof: js.UndefOr[typings.libraCore.`lib@GeneratedProofPbMod`.AccountStateProof.AsObject] = js.undefined
      
      var version: String
    }
    object AsObject {
      
      inline def apply(version: String): AsObject = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        inline def setBlob(value: typings.libraCore.`lib@GeneratedAccountStateBlobPbMod`.AccountStateBlob.AsObject): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
        
        inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
        
        inline def setProof(value: typings.libraCore.`lib@GeneratedProofPbMod`.AccountStateProof.AsObject): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
        
        inline def setProofUndefined: Self = StObject.set(x, "proof", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
}
