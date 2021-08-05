package typings.jqueryKnob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryKnob {
  
  trait JQueryKnobOptions extends StObject {
    
    /**
      * arc size in degrees | default=360
      */
    var angleArc: js.UndefOr[Double] = js.undefined
    
    /**
      * starting angle in degrees | default=0
      */
    var angleOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * background color
      */
    var bgColor: js.UndefOr[String] = js.undefined
    
    /**
      * triggered on [esc] keydown
      */
    var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * executed at each change of the value
      */
    var change: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * display mode "cursor", cursor size could be changed passing a
      * numeric value to the option, default width is used when passing
      * boolean value "true" | default=gauge
      */
    var cursor: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * default=true | false=hide input
      */
    var displayInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default=false | true=displays the previous value with transparency
      */
    var displayPrevious: js.UndefOr[Boolean] = js.undefined
    
    /**
      * when drawing the canvas
      */
    var draw: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * foreground color
      */
    var fgColor: js.UndefOr[String] = js.undefined
    
    /**
      * font family
      */
    var font: js.UndefOr[String] = js.undefined
    
    /**
      * font weight
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * allows to format output (add unit %, ms...)
      */
    var format: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * dial height
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * input value (number) color
      */
    var inputColor: js.UndefOr[String] = js.undefined
    
    /**
      * gauge stroke endings | default=butt, round=rounded line endings
      */
    var lineCap: js.UndefOr[String] = js.undefined
    
    /**
      * max value | default=100
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * min value | default=0
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * disable input and events | default=false
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * executed on release
      */
    var release: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * direction of progression | default=clockwise
      */
    var rotation: js.UndefOr[String] = js.undefined
    
    /**
      * step size | default=1
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * stop at min & max on keydown/mousewheel | default=true
      */
    var stopper: js.UndefOr[Boolean] = js.undefined
    
    /**
      * gauge thickness
      */
    var thickness: js.UndefOr[Double] = js.undefined
    
    /**
      * dial width
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object JQueryKnobOptions {
    
    inline def apply(): JQueryKnobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JQueryKnobOptions]
    }
    
    extension [Self <: JQueryKnobOptions](x: Self) {
      
      inline def setAngleArc(value: Double): Self = StObject.set(x, "angleArc", value.asInstanceOf[js.Any])
      
      inline def setAngleArcUndefined: Self = StObject.set(x, "angleArc", js.undefined)
      
      inline def setAngleOffset(value: Double): Self = StObject.set(x, "angleOffset", value.asInstanceOf[js.Any])
      
      inline def setAngleOffsetUndefined: Self = StObject.set(x, "angleOffset", js.undefined)
      
      inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setChange(value: /* value */ Double => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setCursor(value: String | Boolean): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDisplayInput(value: Boolean): Self = StObject.set(x, "displayInput", value.asInstanceOf[js.Any])
      
      inline def setDisplayInputUndefined: Self = StObject.set(x, "displayInput", js.undefined)
      
      inline def setDisplayPrevious(value: Boolean): Self = StObject.set(x, "displayPrevious", value.asInstanceOf[js.Any])
      
      inline def setDisplayPreviousUndefined: Self = StObject.set(x, "displayPrevious", js.undefined)
      
      inline def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
      
      inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
      
      inline def setFgColor(value: String): Self = StObject.set(x, "fgColor", value.asInstanceOf[js.Any])
      
      inline def setFgColorUndefined: Self = StObject.set(x, "fgColor", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFormat(value: /* value */ Double => Unit): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInputColor(value: String): Self = StObject.set(x, "inputColor", value.asInstanceOf[js.Any])
      
      inline def setInputColorUndefined: Self = StObject.set(x, "inputColor", js.undefined)
      
      inline def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRelease(value: /* value */ Double => Unit): Self = StObject.set(x, "release", js.Any.fromFunction1(value))
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStopper(value: Boolean): Self = StObject.set(x, "stopper", value.asInstanceOf[js.Any])
      
      inline def setStopperUndefined: Self = StObject.set(x, "stopper", js.undefined)
      
      inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
