package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait HistogramConstr extends StObject {
    
    var histogramConstr: HistogramConstructor
  }
  object HistogramConstr {
    
    inline def apply(histogramConstr: HistogramConstructor): HistogramConstr = {
      val __obj = js.Dynamic.literal(histogramConstr = histogramConstr.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistogramConstr]
    }
    
    extension [Self <: HistogramConstr](x: Self) {
      
      inline def setHistogramConstr(value: HistogramConstructor): Self = StObject.set(x, "histogramConstr", value.asInstanceOf[js.Any])
    }
  }
}
