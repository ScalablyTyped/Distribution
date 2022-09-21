package typings.libraCore.getWithProofPbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.libraCore.accountStateBlobPbMod.AccountStateWithProof
import typings.libraCore.eventsPbMod.EventWithProof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse")
@js.native
open class GetEventsByEventAccessPathResponse () extends Message {
  
  def addEventsWithProof(): EventWithProof = js.native
  def addEventsWithProof(value: Unit, index: Double): EventWithProof = js.native
  def addEventsWithProof(value: EventWithProof): EventWithProof = js.native
  def addEventsWithProof(value: EventWithProof, index: Double): EventWithProof = js.native
  
  def clearEventsWithProofList(): Unit = js.native
  
  def clearProofOfLatestEvent(): Unit = js.native
  
  def getEventsWithProofList(): js.Array[EventWithProof] = js.native
  
  def getProofOfLatestEvent(): js.UndefOr[AccountStateWithProof] = js.native
  
  def hasProofOfLatestEvent(): Boolean = js.native
  
  def setEventsWithProofList(value: js.Array[EventWithProof]): Unit = js.native
  
  def setProofOfLatestEvent(): Unit = js.native
  def setProofOfLatestEvent(value: AccountStateWithProof): Unit = js.native
}
/* static members */
object GetEventsByEventAccessPathResponse {
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): GetEventsByEventAccessPathResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[GetEventsByEventAccessPathResponse]
  
  inline def deserializeBinaryFromReader(message: GetEventsByEventAccessPathResponse, reader: BinaryReader): GetEventsByEventAccessPathResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[GetEventsByEventAccessPathResponse]
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: GetEventsByEventAccessPathResponse, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: GetEventsByEventAccessPathResponse): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var eventsWithProofList: js.Array[typings.libraCore.eventsPbMod.EventWithProof.AsObject]
    
    var proofOfLatestEvent: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.undefined
  }
  object AsObject {
    
    inline def apply(eventsWithProofList: js.Array[typings.libraCore.eventsPbMod.EventWithProof.AsObject]): AsObject = {
      val __obj = js.Dynamic.literal(eventsWithProofList = eventsWithProofList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setEventsWithProofList(value: js.Array[typings.libraCore.eventsPbMod.EventWithProof.AsObject]): Self = StObject.set(x, "eventsWithProofList", value.asInstanceOf[js.Any])
      
      inline def setEventsWithProofListVarargs(value: typings.libraCore.eventsPbMod.EventWithProof.AsObject*): Self = StObject.set(x, "eventsWithProofList", js.Array(value*))
      
      inline def setProofOfLatestEvent(value: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject): Self = StObject.set(x, "proofOfLatestEvent", value.asInstanceOf[js.Any])
      
      inline def setProofOfLatestEventUndefined: Self = StObject.set(x, "proofOfLatestEvent", js.undefined)
    }
  }
}
