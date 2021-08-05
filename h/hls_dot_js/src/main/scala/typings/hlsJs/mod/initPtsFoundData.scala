package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait initPtsFoundData extends StObject {
  
  var d: String
  
  var frag: Fragment
  
  var initPTS: Double
}
object initPtsFoundData {
  
  inline def apply(d: String, frag: Fragment, initPTS: Double): initPtsFoundData = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], initPTS = initPTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[initPtsFoundData]
  }
  
  extension [Self <: initPtsFoundData](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setInitPTS(value: Double): Self = StObject.set(x, "initPTS", value.asInstanceOf[js.Any])
  }
}
