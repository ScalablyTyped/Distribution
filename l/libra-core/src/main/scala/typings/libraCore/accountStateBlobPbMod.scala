package typings.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.proofPbMod.AccountStateProof
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountStateBlobPbMod {
  
  @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob")
  @js.native
  class AccountStateBlob () extends Message {
    
    def getBlob(): Uint8Array | String = js.native
    
    def getBlob_asB64(): String = js.native
    
    def getBlob_asU8(): Uint8Array = js.native
    
    def setBlob(value: String): Unit = js.native
    def setBlob(value: Uint8Array): Unit = js.native
  }
  /* static members */
  object AccountStateBlob {
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def deserializeBinary(bytes: Uint8Array): AccountStateBlob = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[AccountStateBlob]
    
    @scala.inline
    def deserializeBinaryFromReader(message: AccountStateBlob, reader: BinaryReader): AccountStateBlob = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[AccountStateBlob]
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateBlob.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def serializeBinaryToWriter(message: AccountStateBlob, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def toObject(includeInstance: Boolean, msg: AccountStateBlob): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var blob: Uint8Array | String
    }
    object AsObject {
      
      @scala.inline
      def apply(blob: Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlob(value: Uint8Array | String): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof")
  @js.native
  class AccountStateWithProof () extends Message {
    
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
    
    @scala.inline
    def deserializeBinary(bytes: Uint8Array): AccountStateWithProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[AccountStateWithProof]
    
    @scala.inline
    def deserializeBinaryFromReader(message: AccountStateWithProof, reader: BinaryReader): AccountStateWithProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[AccountStateWithProof]
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    @scala.inline
    def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def serializeBinaryToWriter(message: AccountStateWithProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def toObject(includeInstance: Boolean, msg: AccountStateWithProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var blob: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateBlob.AsObject] = js.undefined
      
      var proof: js.UndefOr[typings.libraCore.proofPbMod.AccountStateProof.AsObject] = js.undefined
      
      var version: String
    }
    object AsObject {
      
      @scala.inline
      def apply(version: String): AsObject = {
        val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      @scala.inline
      implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlob(value: typings.libraCore.accountStateBlobPbMod.AccountStateBlob.AsObject): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
        
        @scala.inline
        def setProof(value: typings.libraCore.proofPbMod.AccountStateProof.AsObject): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProofUndefined: Self = StObject.set(x, "proof", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
}
