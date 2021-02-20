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

@JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState")
@js.native
class AccountState () extends Message {
  
  def getAddress(): Uint8Array | String = js.native
  
  def getAddress_asB64(): String = js.native
  
  def getAddress_asU8(): Uint8Array = js.native
  
  def getBlob(): Uint8Array | String = js.native
  
  def getBlob_asB64(): String = js.native
  
  def getBlob_asU8(): Uint8Array = js.native
  
  def setAddress(value: String): Unit = js.native
  def setAddress(value: Uint8Array): Unit = js.native
  
  def setBlob(value: String): Unit = js.native
  def setBlob(value: Uint8Array): Unit = js.native
}
/* static members */
object AccountState {
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState.deserializeBinary")
  @js.native
  def deserializeBinary(bytes: Uint8Array): AccountState = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState.deserializeBinaryFromReader")
  @js.native
  def deserializeBinaryFromReader(message: AccountState, reader: BinaryReader): AccountState = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  @scala.inline
  def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState.serializeBinaryToWriter")
  @js.native
  def serializeBinaryToWriter(message: AccountState, writer: BinaryWriter): Unit = js.native
  
  @JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState.toObject")
  @js.native
  def toObject(includeInstance: Boolean, msg: AccountState): AsObject = js.native
  
  @js.native
  trait AsObject extends StObject {
    
    var address: Uint8Array | String = js.native
    
    var blob: Uint8Array | String = js.native
  }
  object AsObject {
    
    @scala.inline
    def apply(address: Uint8Array | String, blob: Uint8Array | String): AsObject = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    @scala.inline
    implicit class AsObjectMutableBuilder[Self <: AsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Uint8Array | String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlob(value: Uint8Array | String): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    }
  }
}
