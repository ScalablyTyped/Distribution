package typings.jsreportXlsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<jsreport-xlsx.jsreport-xlsx.Options> */
  trait PartialOptions extends StObject {
    
    var addBufferSize: js.UndefOr[Double] = js.undefined
    
    var escapeAmp: js.UndefOr[Boolean] = js.undefined
    
    var numberOfParsedAddIterations: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setAddBufferSize(value: Double): Self = StObject.set(x, "addBufferSize", value.asInstanceOf[js.Any])
      
      inline def setAddBufferSizeUndefined: Self = StObject.set(x, "addBufferSize", js.undefined)
      
      inline def setEscapeAmp(value: Boolean): Self = StObject.set(x, "escapeAmp", value.asInstanceOf[js.Any])
      
      inline def setEscapeAmpUndefined: Self = StObject.set(x, "escapeAmp", js.undefined)
      
      inline def setNumberOfParsedAddIterations(value: Double): Self = StObject.set(x, "numberOfParsedAddIterations", value.asInstanceOf[js.Any])
      
      inline def setNumberOfParsedAddIterationsUndefined: Self = StObject.set(x, "numberOfParsedAddIterations", js.undefined)
    }
  }
}
