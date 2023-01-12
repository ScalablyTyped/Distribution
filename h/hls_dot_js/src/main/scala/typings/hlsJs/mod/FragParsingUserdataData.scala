package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragParsingUserdataData extends StObject {
  
  var details: LevelDetails
  
  var frag: Fragment
  
  var id: String
  
  var samples: js.Array[UserdataSample]
}
object FragParsingUserdataData {
  
  inline def apply(details: LevelDetails, frag: Fragment, id: String, samples: js.Array[UserdataSample]): FragParsingUserdataData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragParsingUserdataData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragParsingUserdataData] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSamples(value: js.Array[UserdataSample]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesVarargs(value: UserdataSample*): Self = StObject.set(x, "samples", js.Array(value*))
  }
}
