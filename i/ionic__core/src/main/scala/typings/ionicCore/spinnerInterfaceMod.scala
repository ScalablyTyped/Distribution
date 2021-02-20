package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerInterfaceMod {
  
  @js.native
  trait SpinnerConfig extends StObject {
    
    var circles: js.UndefOr[Double] = js.native
    
    var dur: Double = js.native
    
    var elmDuration: js.UndefOr[Boolean] = js.native
    
    def fn(dur: Double, index: Double, total: Double): SpinnerData = js.native
    
    var lines: js.UndefOr[Double] = js.native
  }
  object SpinnerConfig {
    
    @scala.inline
    def apply(dur: Double, fn: (Double, Double, Double) => SpinnerData): SpinnerConfig = {
      val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn))
      __obj.asInstanceOf[SpinnerConfig]
    }
    
    @scala.inline
    implicit class SpinnerConfigMutableBuilder[Self <: SpinnerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircles(value: Double): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCirclesUndefined: Self = StObject.set(x, "circles", js.undefined)
      
      @scala.inline
      def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElmDuration(value: Boolean): Self = StObject.set(x, "elmDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElmDurationUndefined: Self = StObject.set(x, "elmDuration", js.undefined)
      
      @scala.inline
      def setFn(value: (Double, Double, Double) => SpinnerData): Self = StObject.set(x, "fn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    }
  }
  
  type SpinnerConfigs = StringDictionary[SpinnerConfig]
  
  @js.native
  trait SpinnerData extends StObject {
    
    var cx: js.UndefOr[Double] = js.native
    
    var cy: js.UndefOr[Double] = js.native
    
    var r: js.UndefOr[Double] = js.native
    
    var style: js.Any = js.native
    
    var transform: js.UndefOr[String] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
    
    var y1: js.UndefOr[Double] = js.native
    
    var y2: js.UndefOr[Double] = js.native
  }
  object SpinnerData {
    
    @scala.inline
    def apply(style: js.Any): SpinnerData = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpinnerData]
    }
    
    @scala.inline
    implicit class SpinnerDataMutableBuilder[Self <: SpinnerData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      @scala.inline
      def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
}
