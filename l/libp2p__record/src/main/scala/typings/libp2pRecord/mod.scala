package typings.libp2pRecord

import typings.libp2pRecord.anon.Key
import typings.libp2pRecord.distSrcRecordMod.Record
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/record", "Libp2pRecord")
  @js.native
  open class Libp2pRecord protected () extends StObject {
    def this(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, timeReceived: js.Date) = this()
    
    var key: js.typedarray.Uint8Array = js.native
    
    /**
      * Return the object format ready to be given to the protobuf library.
      */
    def prepareSerialize(): Key = js.native
    
    def serialize(): js.typedarray.Uint8Array = js.native
    
    var timeReceived: js.Date = js.native
    
    var value: js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object Libp2pRecord {
    
    @JSImport("@libp2p/record", "Libp2pRecord")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decode a protobuf encoded record
      */
    inline def deserialize(raw: js.typedarray.Uint8Array): Libp2pRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(raw.asInstanceOf[js.Any]).asInstanceOf[Libp2pRecord]
    inline def deserialize(raw: Uint8ArrayList): Libp2pRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(raw.asInstanceOf[js.Any]).asInstanceOf[Libp2pRecord]
    
    /**
      * Create a record from the raw object returned from the protobuf library
      */
    inline def fromDeserialized(obj: Record): Libp2pRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDeserialized")(obj.asInstanceOf[js.Any]).asInstanceOf[Libp2pRecord]
  }
}
