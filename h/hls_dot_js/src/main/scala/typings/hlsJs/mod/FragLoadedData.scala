package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragLoadedData extends StObject {
  
  var frag: Fragment
  
  var networkDetails: Any
  
  var part: Part | Null
  
  var payload: js.typedarray.ArrayBuffer
}
object FragLoadedData {
  
  inline def apply(frag: Fragment, networkDetails: Any, payload: js.typedarray.ArrayBuffer): FragLoadedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], networkDetails = networkDetails.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], part = null)
    __obj.asInstanceOf[FragLoadedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragLoadedData] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setNetworkDetails(value: Any): Self = StObject.set(x, "networkDetails", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
    
    inline def setPayload(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
