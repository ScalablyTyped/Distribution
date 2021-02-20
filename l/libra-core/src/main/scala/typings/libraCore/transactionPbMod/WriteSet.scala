package typings.libraCore.transactionPbMod

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

@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet")
@js.native
class WriteSet () extends Message {
  
  def addWriteSet(): WriteOp = js.native
  def addWriteSet(value: js.UndefOr[scala.Nothing], index: Double): WriteOp = js.native
  def addWriteSet(value: WriteOp): WriteOp = js.native
  def addWriteSet(value: WriteOp, index: Double): WriteOp = js.native
  
  def clearWriteSetList(): Unit = js.native
  
  def getWriteSetList(): js.Array[WriteOp] = js.native
  
  def setWriteSetList(value: js.Array[WriteOp]): Unit = js.native
}
/* static members */
object WriteSet {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): WriteSet = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: WriteSet, reader: BinaryReader): WriteSet = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: WriteSet, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "WriteSet.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: WriteSet): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var writeSetList: js.Array[typings.libraCore.transactionPbMod.WriteOp.AsObject] = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(writeSetList: js.Array[typings.libraCore.transactionPbMod.WriteOp.AsObject]): AsObject = {
      val __obj = js.Dynamic.literal(writeSetList = writeSetList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWriteSetList(value: js.Array[typings.libraCore.transactionPbMod.WriteOp.AsObject]): Self = StObject.set(x, "writeSetList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteSetListVarargs(value: typings.libraCore.transactionPbMod.WriteOp.AsObject*): Self = StObject.set(x, "writeSetList", js.Array(value :_*))
    }
  }
}
