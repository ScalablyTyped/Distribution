package typings.libp2pRecord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@libp2p/record.@libp2p/record/dist/src/record.Record> */
  trait PartialRecord extends StObject {
    
    var key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var timeReceived: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialRecord {
    
    inline def apply(): PartialRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRecord] (val x: Self) extends AnyVal {
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTimeReceived(value: String): Self = StObject.set(x, "timeReceived", value.asInstanceOf[js.Any])
      
      inline def setTimeReceivedUndefined: Self = StObject.set(x, "timeReceived", js.undefined)
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
