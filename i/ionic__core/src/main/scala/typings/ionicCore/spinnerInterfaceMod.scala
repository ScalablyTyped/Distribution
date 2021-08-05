package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerInterfaceMod {
  
  trait SpinnerConfig extends StObject {
    
    var circles: js.UndefOr[Double] = js.undefined
    
    var dur: Double
    
    var elmDuration: js.UndefOr[Boolean] = js.undefined
    
    def fn(dur: Double, index: Double, total: Double): SpinnerData
    
    var lines: js.UndefOr[Double] = js.undefined
  }
  object SpinnerConfig {
    
    inline def apply(dur: Double, fn: (Double, Double, Double) => SpinnerData): SpinnerConfig = {
      val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn))
      __obj.asInstanceOf[SpinnerConfig]
    }
    
    extension [Self <: SpinnerConfig](x: Self) {
      
      inline def setCircles(value: Double): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
      
      inline def setCirclesUndefined: Self = StObject.set(x, "circles", js.undefined)
      
      inline def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      inline def setElmDuration(value: Boolean): Self = StObject.set(x, "elmDuration", value.asInstanceOf[js.Any])
      
      inline def setElmDurationUndefined: Self = StObject.set(x, "elmDuration", js.undefined)
      
      inline def setFn(value: (Double, Double, Double) => SpinnerData): Self = StObject.set(x, "fn", js.Any.fromFunction3(value))
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    }
  }
  
  type SpinnerConfigs = StringDictionary[SpinnerConfig]
  
  trait SpinnerData extends StObject {
    
    var cx: js.UndefOr[Double] = js.undefined
    
    var cy: js.UndefOr[Double] = js.undefined
    
    var r: js.UndefOr[Double] = js.undefined
    
    var style: js.Any
    
    var transform: js.UndefOr[String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var y1: js.UndefOr[Double] = js.undefined
    
    var y2: js.UndefOr[Double] = js.undefined
  }
  object SpinnerData {
    
    inline def apply(style: js.Any): SpinnerData = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpinnerData]
    }
    
    extension [Self <: SpinnerData](x: Self) {
      
      inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
}
