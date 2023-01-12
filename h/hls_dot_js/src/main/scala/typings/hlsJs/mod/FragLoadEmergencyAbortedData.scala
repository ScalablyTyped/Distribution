package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragLoadEmergencyAbortedData extends StObject {
  
  var frag: Fragment
  
  var part: Part | Null
  
  var stats: LoaderStats
}
object FragLoadEmergencyAbortedData {
  
  inline def apply(frag: Fragment, stats: LoaderStats): FragLoadEmergencyAbortedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], part = null)
    __obj.asInstanceOf[FragLoadEmergencyAbortedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragLoadEmergencyAbortedData] (val x: Self) extends AnyVal {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
    
    inline def setStats(value: LoaderStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
