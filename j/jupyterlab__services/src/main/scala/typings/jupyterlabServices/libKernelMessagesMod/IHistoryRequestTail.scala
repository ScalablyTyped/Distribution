package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHistoryRequestTail extends StObject {
  
  var hist_access_type: tail
  
  var n: Double
  
  var output: Boolean
  
  var raw: Boolean
}
object IHistoryRequestTail {
  
  inline def apply(n: Double, output: Boolean, raw: Boolean): IHistoryRequestTail = {
    val __obj = js.Dynamic.literal(hist_access_type = "tail", n = n.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestTail]
  }
  
  extension [Self <: IHistoryRequestTail](x: Self) {
    
    inline def setHist_access_type(value: tail): Self = StObject.set(x, "hist_access_type", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
