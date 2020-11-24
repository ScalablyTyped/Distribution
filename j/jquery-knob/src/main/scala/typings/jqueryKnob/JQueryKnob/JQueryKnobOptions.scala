package typings.jqueryKnob.JQueryKnob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryKnobOptions extends js.Object {
  
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
  implicit class JQueryKnobOptionsOps[Self <: JQueryKnobOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAngleArc(value: Double): Self = this.set("angleArc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleArc: Self = this.set("angleArc", js.undefined)
    
    @scala.inline
    def setAngleOffset(value: Double): Self = this.set("angleOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleOffset: Self = this.set("angleOffset", js.undefined)
    
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setChange(value: /* value */ Double => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCursor(value: String | Boolean): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDisplayInput(value: Boolean): Self = this.set("displayInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayInput: Self = this.set("displayInput", js.undefined)
    
    @scala.inline
    def setDisplayPrevious(value: Boolean): Self = this.set("displayPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayPrevious: Self = this.set("displayPrevious", js.undefined)
    
    @scala.inline
    def setDraw(value: () => Unit): Self = this.set("draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDraw: Self = this.set("draw", js.undefined)
    
    @scala.inline
    def setFgColor(value: String): Self = this.set("fgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFgColor: Self = this.set("fgColor", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setFormat(value: /* value */ Double => Unit): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInputColor(value: String): Self = this.set("inputColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputColor: Self = this.set("inputColor", js.undefined)
    
    @scala.inline
    def setLineCap(value: String): Self = this.set("lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCap: Self = this.set("lineCap", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRelease(value: /* value */ Double => Unit): Self = this.set("release", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    
    @scala.inline
    def setRotation(value: String): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStopper(value: Boolean): Self = this.set("stopper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopper: Self = this.set("stopper", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
