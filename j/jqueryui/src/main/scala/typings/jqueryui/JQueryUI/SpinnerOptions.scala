package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Spinner //////////////////////////////////////////////////
trait SpinnerOptions
  extends StObject
     with SpinnerEvents {
  
  var culture: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icons: js.UndefOr[js.Any] = js.undefined
  
  var incremental: js.UndefOr[js.Any] = js.undefined
  
  // boolean or ()
  var max: js.UndefOr[js.Any] = js.undefined
  
  // number or string
  var min: js.UndefOr[js.Any] = js.undefined
  
  // number or string
  var numberFormat: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[js.Any] = js.undefined
}
object SpinnerOptions {
  
  @scala.inline
  def apply(): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerOptions]
  }
  
  @scala.inline
  implicit class SpinnerOptionsMutableBuilder[Self <: SpinnerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIncremental(value: js.Any): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
    
    @scala.inline
    def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setStep(value: js.Any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
