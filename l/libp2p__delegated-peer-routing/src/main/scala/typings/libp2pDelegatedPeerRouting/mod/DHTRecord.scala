package typings.libp2pDelegatedPeerRouting.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DHTRecord extends StObject {
  
  var key: js.typedarray.Uint8Array
  
  var timeReceived: js.UndefOr[js.Date] = js.undefined
  
  var value: js.typedarray.Uint8Array
}
object DHTRecord {
  
  inline def apply(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): DHTRecord = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DHTRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DHTRecord] (val x: Self) extends AnyVal {
    
    inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTimeReceived(value: js.Date): Self = StObject.set(x, "timeReceived", value.asInstanceOf[js.Any])
    
    inline def setTimeReceivedUndefined: Self = StObject.set(x, "timeReceived", js.undefined)
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
