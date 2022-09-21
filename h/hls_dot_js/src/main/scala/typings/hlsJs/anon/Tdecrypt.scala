package typings.hlsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tdecrypt extends StObject {
  
  var tdecrypt: Double
  
  var tstart: Double
}
object Tdecrypt {
  
  inline def apply(tdecrypt: Double, tstart: Double): Tdecrypt = {
    val __obj = js.Dynamic.literal(tdecrypt = tdecrypt.asInstanceOf[js.Any], tstart = tstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tdecrypt]
  }
  
  extension [Self <: Tdecrypt](x: Self) {
    
    inline def setTdecrypt(value: Double): Self = StObject.set(x, "tdecrypt", value.asInstanceOf[js.Any])
    
    inline def setTstart(value: Double): Self = StObject.set(x, "tstart", value.asInstanceOf[js.Any])
  }
}
