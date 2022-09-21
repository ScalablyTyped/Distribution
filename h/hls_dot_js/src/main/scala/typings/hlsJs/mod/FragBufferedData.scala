package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragBufferedData extends StObject {
  
  var frag: Fragment
  
  var id: String
  
  var part: Part | Null
  
  var stats: LoadStats
}
object FragBufferedData {
  
  inline def apply(frag: Fragment, id: String, stats: LoadStats): FragBufferedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], part = null)
    __obj.asInstanceOf[FragBufferedData]
  }
  
  extension [Self <: FragBufferedData](x: Self) {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
    
    inline def setStats(value: LoadStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
