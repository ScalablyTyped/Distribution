package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsFibonacciTypeLineOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
}
object AnnotationsFibonacciTypeLineOptions {
  
  inline def apply(): AnnotationsFibonacciTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsFibonacciTypeLineOptions]
  }
  
  extension [Self <: AnnotationsFibonacciTypeLineOptions](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
