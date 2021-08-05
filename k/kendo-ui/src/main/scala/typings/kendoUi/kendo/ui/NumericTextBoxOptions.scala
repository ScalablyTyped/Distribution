package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericTextBoxOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ NumericTextBoxChangeEvent, Unit]] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
  
  var decimals: js.UndefOr[Double] = js.undefined
  
  var downArrowText: js.UndefOr[String] = js.undefined
  
  var factor: js.UndefOr[Double] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String | js.Function | NumericTextBoxLabel] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var restrictDecimals: js.UndefOr[Boolean] = js.undefined
  
  var round: js.UndefOr[Boolean] = js.undefined
  
  var spin: js.UndefOr[js.Function1[/* e */ NumericTextBoxSpinEvent, Unit]] = js.undefined
  
  var spinners: js.UndefOr[Boolean] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var upArrowText: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object NumericTextBoxOptions {
  
  inline def apply(): NumericTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericTextBoxOptions]
  }
  
  extension [Self <: NumericTextBoxOptions](x: Self) {
    
    inline def setChange(value: /* e */ NumericTextBoxChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setDownArrowText(value: String): Self = StObject.set(x, "downArrowText", value.asInstanceOf[js.Any])
    
    inline def setDownArrowTextUndefined: Self = StObject.set(x, "downArrowText", js.undefined)
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLabel(value: String | js.Function | NumericTextBoxLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRestrictDecimals(value: Boolean): Self = StObject.set(x, "restrictDecimals", value.asInstanceOf[js.Any])
    
    inline def setRestrictDecimalsUndefined: Self = StObject.set(x, "restrictDecimals", js.undefined)
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setSpin(value: /* e */ NumericTextBoxSpinEvent => Unit): Self = StObject.set(x, "spin", js.Any.fromFunction1(value))
    
    inline def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    
    inline def setSpinners(value: Boolean): Self = StObject.set(x, "spinners", value.asInstanceOf[js.Any])
    
    inline def setSpinnersUndefined: Self = StObject.set(x, "spinners", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setUpArrowText(value: String): Self = StObject.set(x, "upArrowText", value.asInstanceOf[js.Any])
    
    inline def setUpArrowTextUndefined: Self = StObject.set(x, "upArrowText", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
