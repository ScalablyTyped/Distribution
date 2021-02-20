package typings.jqueryKnob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryKnob {
  
  @js.native
  trait JQueryKnobOptions extends StObject {
    
    /**
      * arc size in degrees | default=360
      */
    var angleArc: js.UndefOr[Double] = js.native
    
    /**
      * starting angle in degrees | default=0
      */
    var angleOffset: js.UndefOr[Double] = js.native
    
    /**
      * background color
      */
    var bgColor: js.UndefOr[String] = js.native
    
    /**
      * triggered on [esc] keydown
      */
    var cancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * executed at each change of the value
      */
    var change: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * display mode "cursor", cursor size could be changed passing a
      * numeric value to the option, default width is used when passing
      * boolean value "true" | default=gauge
      */
    var cursor: js.UndefOr[String | Boolean] = js.native
    
    /**
      * default=true | false=hide input
      */
    var displayInput: js.UndefOr[Boolean] = js.native
    
    /**
      * default=false | true=displays the previous value with transparency
      */
    var displayPrevious: js.UndefOr[Boolean] = js.native
    
    /**
      * when drawing the canvas
      */
    var draw: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * foreground color
      */
    var fgColor: js.UndefOr[String] = js.native
    
    /**
      * font family
      */
    var font: js.UndefOr[String] = js.native
    
    /**
      * font weight
      */
    var fontWeight: js.UndefOr[String] = js.native
    
    /**
      * allows to format output (add unit %, ms...)
      */
    var format: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * dial height
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * input value (number) color
      */
    var inputColor: js.UndefOr[String] = js.native
    
    /**
      * gauge stroke endings | default=butt, round=rounded line endings
      */
    var lineCap: js.UndefOr[String] = js.native
    
    /**
      * max value | default=100
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * min value | default=0
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * disable input and events | default=false
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * executed on release
      */
    var release: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    /**
      * direction of progression | default=clockwise
      */
    var rotation: js.UndefOr[String] = js.native
    
    /**
      * step size | default=1
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * stop at min & max on keydown/mousewheel | default=true
      */
    var stopper: js.UndefOr[Boolean] = js.native
    
    /**
      * gauge thickness
      */
    var thickness: js.UndefOr[Double] = js.native
    
    /**
      * dial width
      */
    var width: js.UndefOr[Double] = js.native
  }
  object JQueryKnobOptions {
    
    @scala.inline
    def apply(): JQueryKnobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JQueryKnobOptions]
    }
    
    @scala.inline
    implicit class JQueryKnobOptionsMutableBuilder[Self <: JQueryKnobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngleArc(value: Double): Self = StObject.set(x, "angleArc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleArcUndefined: Self = StObject.set(x, "angleArc", js.undefined)
      
      @scala.inline
      def setAngleOffset(value: Double): Self = StObject.set(x, "angleOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleOffsetUndefined: Self = StObject.set(x, "angleOffset", js.undefined)
      
      @scala.inline
      def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setChange(value: /* value */ Double => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCursor(value: String | Boolean): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setDisplayInput(value: Boolean): Self = StObject.set(x, "displayInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayInputUndefined: Self = StObject.set(x, "displayInput", js.undefined)
      
      @scala.inline
      def setDisplayPrevious(value: Boolean): Self = StObject.set(x, "displayPrevious", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayPreviousUndefined: Self = StObject.set(x, "displayPrevious", js.undefined)
      
      @scala.inline
      def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
      
      @scala.inline
      def setFgColor(value: String): Self = StObject.set(x, "fgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgColorUndefined: Self = StObject.set(x, "fgColor", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFormat(value: /* value */ Double => Unit): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInputColor(value: String): Self = StObject.set(x, "inputColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputColorUndefined: Self = StObject.set(x, "inputColor", js.undefined)
      
      @scala.inline
      def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRelease(value: /* value */ Double => Unit): Self = StObject.set(x, "release", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStopper(value: Boolean): Self = StObject.set(x, "stopper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopperUndefined: Self = StObject.set(x, "stopper", js.undefined)
      
      @scala.inline
      def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
