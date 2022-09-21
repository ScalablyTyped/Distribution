package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragParsedData extends StObject {
  
  var frag: Fragment
  
  var part: Part | Null
}
object FragParsedData {
  
  inline def apply(frag: Fragment): FragParsedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], part = null)
    __obj.asInstanceOf[FragParsedData]
  }
  
  extension [Self <: FragParsedData](x: Self) {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
  }
}
