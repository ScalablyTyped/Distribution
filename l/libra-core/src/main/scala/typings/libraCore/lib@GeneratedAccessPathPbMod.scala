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

object `lib@GeneratedAccessPathPbMod` {
  
  @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
  @js.native
  open class AccessPath () extends Message {
    
    def getAddress(): js.typedarray.Uint8Array | String = js.native
    
    def getAddress_asB64(): String = js.native
    
    def getAddress_asU8(): js.typedarray.Uint8Array = js.native
    
    def getPath(): js.typedarray.Uint8Array | String = js.native
    
    def getPath_asB64(): String = js.native
    
    def getPath_asU8(): js.typedarray.Uint8Array = js.native
    
    def setAddress(value: String): Unit = js.native
    def setAddress(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setPath(value: String): Unit = js.native
    def setPath(value: js.typedarray.Uint8Array): Unit = js.native
  }
  /* static members */
  object AccessPath {
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): AccessPath = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[AccessPath]
    
    inline def deserializeBinaryFromReader(message: AccessPath, reader: BinaryReader): AccessPath = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[AccessPath]
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: AccessPath, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: AccessPath): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var address: js.typedarray.Uint8Array | String
      
      var path: js.typedarray.Uint8Array | String
    }
    object AsObject {
      
      inline def apply(address: js.typedarray.Uint8Array | String, path: js.typedarray.Uint8Array | String): AsObject = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setAddress(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setPath(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
  }
}
