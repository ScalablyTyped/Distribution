package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHistoryRequestRange extends StObject {
  
  var hist_access_type: range
  
  var output: Boolean
  
  var raw: Boolean
  
  var session: Double
  
  var start: Double
  
  var stop: Double
}
object IHistoryRequestRange {
  
  inline def apply(output: Boolean, raw: Boolean, session: Double, start: Double, stop: Double): IHistoryRequestRange = {
    val __obj = js.Dynamic.literal(hist_access_type = "range", output = output.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestRange]
  }
  
  extension [Self <: IHistoryRequestRange](x: Self) {
    
    inline def setHist_access_type(value: range): Self = StObject.set(x, "hist_access_type", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Double): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
