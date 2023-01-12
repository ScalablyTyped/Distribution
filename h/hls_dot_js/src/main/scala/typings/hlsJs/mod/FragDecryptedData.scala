package typings.hlsJs.mod

import typings.hlsJs.anon.Tdecrypt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragDecryptedData extends StObject {
  
  var frag: Fragment
  
  var payload: js.typedarray.ArrayBuffer
  
  var stats: Tdecrypt
}
object FragDecryptedData {
  
  inline def apply(frag: Fragment, payload: js.typedarray.ArrayBuffer, stats: Tdecrypt): FragDecryptedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragDecryptedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragDecryptedData] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Tdecrypt): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
