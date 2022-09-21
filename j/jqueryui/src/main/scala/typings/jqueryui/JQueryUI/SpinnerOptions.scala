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
  
  var icons: js.UndefOr[Any] = js.undefined
  
  var incremental: js.UndefOr[Any] = js.undefined
  
  // boolean or ()
  var max: js.UndefOr[Any] = js.undefined
  
  // number or string
  var min: js.UndefOr[Any] = js.undefined
  
  // number or string
  var numberFormat: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Any] = js.undefined
}
object SpinnerOptions {
  
  inline def apply(): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerOptions]
  }
  
  extension [Self <: SpinnerOptions](x: Self) {
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcons(value: Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIncremental(value: Any): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
    
    inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
    
    inline def setMax(value: Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setStep(value: Any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
