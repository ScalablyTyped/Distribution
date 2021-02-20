package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericTextBoxOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ NumericTextBoxChangeEvent, Unit]] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  var decimals: js.UndefOr[Double] = js.native
  
  var downArrowText: js.UndefOr[String] = js.native
  
  var factor: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String | js.Function | NumericTextBoxLabel] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var restrictDecimals: js.UndefOr[Boolean] = js.native
  
  var round: js.UndefOr[Boolean] = js.native
  
  var spin: js.UndefOr[js.Function1[/* e */ NumericTextBoxSpinEvent, Unit]] = js.native
  
  var spinners: js.UndefOr[Boolean] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var upArrowText: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object NumericTextBoxOptions {
  
  @scala.inline
  def apply(): NumericTextBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericTextBoxOptions]
  }
  
  @scala.inline
  implicit class NumericTextBoxOptionsMutableBuilder[Self <: NumericTextBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ NumericTextBoxChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    @scala.inline
    def setDownArrowText(value: String): Self = StObject.set(x, "downArrowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownArrowTextUndefined: Self = StObject.set(x, "downArrowText", js.undefined)
    
    @scala.inline
    def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLabel(value: String | js.Function | NumericTextBoxLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRestrictDecimals(value: Boolean): Self = StObject.set(x, "restrictDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictDecimalsUndefined: Self = StObject.set(x, "restrictDecimals", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    @scala.inline
    def setSpin(value: /* e */ NumericTextBoxSpinEvent => Unit): Self = StObject.set(x, "spin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    
    @scala.inline
    def setSpinners(value: Boolean): Self = StObject.set(x, "spinners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinnersUndefined: Self = StObject.set(x, "spinners", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setUpArrowText(value: String): Self = StObject.set(x, "upArrowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpArrowTextUndefined: Self = StObject.set(x, "upArrowText", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
