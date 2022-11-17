package typings.materialUiCore.anon

import typings.materialUiCore.sliderSliderMod.Mark
import typings.materialUiCore.sliderSliderMod.ValueLabelProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabel extends StObject {
  
  var ThumbComponent: js.UndefOr[ElementType[HTMLAttributes[HTMLSpanElement]]] = js.undefined
  
  var ValueLabelComponent: js.UndefOr[ElementType[ValueLabelProps]] = js.undefined
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var `aria-valuetext`: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr["primary" | "secondary"] = js.undefined
  
  var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var getAriaLabel: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  
  var getAriaValueText: js.UndefOr[js.Function2[/* value */ Double, /* index */ Double, String]] = js.undefined
  
  var marks: js.UndefOr[Boolean | js.Array[Mark]] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onChange: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[js.Object], /* value */ Double | js.Array[Double], Unit]
  ] = js.undefined
  
  var onChangeCommitted: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[js.Object], /* value */ Double | js.Array[Double], Unit]
  ] = js.undefined
  
  var orientation: js.UndefOr["horizontal" | "vertical"] = js.undefined
  
  var scale: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  
  var step: js.UndefOr[Double | Null] = js.undefined
  
  var track: js.UndefOr["normal" | false | "inverted"] = js.undefined
  
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var valueLabelDisplay: js.UndefOr["on" | "auto" | "off"] = js.undefined
  
  var valueLabelFormat: js.UndefOr[String | (js.Function2[/* value */ Double, /* index */ Double, ReactNode])] = js.undefined
}
object Arialabel {
  
  inline def apply(): Arialabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arialabel]
  }
  
  extension [Self <: Arialabel](x: Self) {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
    
    inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
    
    inline def setColor(value: "primary" | "secondary"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDefaultValue(value: Double | js.Array[Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: Double*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setGetAriaLabel(value: /* index */ Double => String): Self = StObject.set(x, "getAriaLabel", js.Any.fromFunction1(value))
    
    inline def setGetAriaLabelUndefined: Self = StObject.set(x, "getAriaLabel", js.undefined)
    
    inline def setGetAriaValueText(value: (/* value */ Double, /* index */ Double) => String): Self = StObject.set(x, "getAriaValueText", js.Any.fromFunction2(value))
    
    inline def setGetAriaValueTextUndefined: Self = StObject.set(x, "getAriaValueText", js.undefined)
    
    inline def setMarks(value: Boolean | js.Array[Mark]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setMarksVarargs(value: Mark*): Self = StObject.set(x, "marks", js.Array(value*))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChange(value: (/* event */ ChangeEvent[js.Object], /* value */ Double | js.Array[Double]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeCommitted(value: (/* event */ ChangeEvent[js.Object], /* value */ Double | js.Array[Double]) => Unit): Self = StObject.set(x, "onChangeCommitted", js.Any.fromFunction2(value))
    
    inline def setOnChangeCommittedUndefined: Self = StObject.set(x, "onChangeCommitted", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOrientation(value: "horizontal" | "vertical"): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setScale(value: /* value */ Double => Double): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setThumbComponent(value: ElementType[HTMLAttributes[HTMLSpanElement]]): Self = StObject.set(x, "ThumbComponent", value.asInstanceOf[js.Any])
    
    inline def setThumbComponentUndefined: Self = StObject.set(x, "ThumbComponent", js.undefined)
    
    inline def setTrack(value: "normal" | false | "inverted"): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    
    inline def setValue(value: Double | js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueLabelComponent(value: ElementType[ValueLabelProps]): Self = StObject.set(x, "ValueLabelComponent", value.asInstanceOf[js.Any])
    
    inline def setValueLabelComponentUndefined: Self = StObject.set(x, "ValueLabelComponent", js.undefined)
    
    inline def setValueLabelDisplay(value: "on" | "auto" | "off"): Self = StObject.set(x, "valueLabelDisplay", value.asInstanceOf[js.Any])
    
    inline def setValueLabelDisplayUndefined: Self = StObject.set(x, "valueLabelDisplay", js.undefined)
    
    inline def setValueLabelFormat(value: String | (js.Function2[/* value */ Double, /* index */ Double, ReactNode])): Self = StObject.set(x, "valueLabelFormat", value.asInstanceOf[js.Any])
    
    inline def setValueLabelFormatFunction2(value: (/* value */ Double, /* index */ Double) => ReactNode): Self = StObject.set(x, "valueLabelFormat", js.Any.fromFunction2(value))
    
    inline def setValueLabelFormatUndefined: Self = StObject.set(x, "valueLabelFormat", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
