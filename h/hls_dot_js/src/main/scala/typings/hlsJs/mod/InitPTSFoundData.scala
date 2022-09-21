package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitPTSFoundData extends StObject {
  
  var frag: Fragment
  
  var id: String
  
  var initPTS: Double
  
  var timescale: Double
}
object InitPTSFoundData {
  
  inline def apply(frag: Fragment, id: String, initPTS: Double, timescale: Double): InitPTSFoundData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initPTS = initPTS.asInstanceOf[js.Any], timescale = timescale.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitPTSFoundData]
  }
  
  extension [Self <: InitPTSFoundData](x: Self) {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitPTS(value: Double): Self = StObject.set(x, "initPTS", value.asInstanceOf[js.Any])
    
    inline def setTimescale(value: Double): Self = StObject.set(x, "timescale", value.asInstanceOf[js.Any])
  }
}
