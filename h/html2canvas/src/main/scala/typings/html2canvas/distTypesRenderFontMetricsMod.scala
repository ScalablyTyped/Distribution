package typings.html2canvas

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderFontMetricsMod {
  
  @JSImport("html2canvas/dist/types/render/font-metrics", "FontMetrics")
  @js.native
  open class FontMetrics protected () extends StObject {
    def this(document: Document) = this()
    
    /* private */ val _data: Any = js.native
    
    /* private */ val _document: Any = js.native
    
    def getMetrics(fontFamily: String, fontSize: String): FontMetric = js.native
    
    /* private */ var parseMetrics: Any = js.native
  }
  
  trait FontMetric extends StObject {
    
    var baseline: Double
    
    var middle: Double
  }
  object FontMetric {
    
    inline def apply(baseline: Double, middle: Double): FontMetric = {
      val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontMetric]
    }
    
    extension [Self <: FontMetric](x: Self) {
      
      inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setMiddle(value: Double): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    }
  }
}
