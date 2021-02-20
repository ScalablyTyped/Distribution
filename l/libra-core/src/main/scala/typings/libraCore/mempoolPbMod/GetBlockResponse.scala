package typings.libraCore.mempoolPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionPbMod.SignedTransactionsBlock
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockResponse")
@js.native
class GetBlockResponse () extends Message {
  
  def clearBlock(): Unit = js.native
  
  def getBlock(): js.UndefOr[SignedTransactionsBlock] = js.native
  
  def hasBlock(): Boolean = js.native
  
  def setBlock(): Unit = js.native
  def setBlock(value: SignedTransactionsBlock): Unit = js.native
}
/* static members */
object GetBlockResponse {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockResponse.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): GetBlockResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockResponse.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: GetBlockResponse, reader: BinaryReader): GetBlockResponse = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockResponse.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: GetBlockResponse, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockResponse.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: GetBlockResponse): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var block: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransactionsBlock.AsObject] = js.native
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
      def setBlock(value: typings.libraCore.transactionPbMod.SignedTransactionsBlock.AsObject): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    }
  }
}
