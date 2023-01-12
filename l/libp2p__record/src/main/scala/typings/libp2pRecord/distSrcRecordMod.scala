package typings.libp2pRecord

import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRecordMod {
  
  trait Record extends StObject {
    
    var key: js.typedarray.Uint8Array
    
    var timeReceived: String
    
    var value: js.typedarray.Uint8Array
  }
  object Record {
    
    inline def apply(key: js.typedarray.Uint8Array, timeReceived: String, value: js.typedarray.Uint8Array): Record = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], timeReceived = timeReceived.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Record]
    }
    
    @JSImport("@libp2p/record/dist/src/record", "Record")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Record] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Record]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Record = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Record]
    inline def decode(buf: Uint8ArrayList): Record = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Record]
    
    inline def encode(obj: Record): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTimeReceived(value: String): Self = StObject.set(x, "timeReceived", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
