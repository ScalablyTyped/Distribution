package typings.libraCore.mempoolPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse")
@js.native
class HealthCheckResponse () extends Message {
  
  def getIsHealthy(): Boolean = js.native
  
  def setIsHealthy(value: Boolean): Unit = js.native
}
/* static members */
object HealthCheckResponse {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): HealthCheckResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: HealthCheckResponse, reader: BinaryReader): HealthCheckResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: HealthCheckResponse, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: HealthCheckResponse): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var isHealthy: Boolean = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(isHealthy: Boolean): AsObject = {
      val __obj = js.Dynamic.literal(isHealthy = isHealthy.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHealthy(value: Boolean): Self = StObject.set(x, "isHealthy", value.asInstanceOf[js.Any])
    }
  }
}
