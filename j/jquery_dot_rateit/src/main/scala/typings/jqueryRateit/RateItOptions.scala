package typings.jqueryRateit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateItOptions extends StObject {
  
  var backingfld: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var ispreset: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[RateItMode] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var resetable: js.UndefOr[Boolean] = js.undefined
  
  var starheight: js.UndefOr[Double] = js.undefined
  
  var starwidth: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object RateItOptions {
  
  inline def apply(): RateItOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateItOptions]
  }
  
  extension [Self <: RateItOptions](x: Self) {
    
    inline def setBackingfld(value: String): Self = StObject.set(x, "backingfld", value.asInstanceOf[js.Any])
    
    inline def setBackingfldUndefined: Self = StObject.set(x, "backingfld", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIspreset(value: Boolean): Self = StObject.set(x, "ispreset", value.asInstanceOf[js.Any])
    
    inline def setIspresetUndefined: Self = StObject.set(x, "ispreset", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMode(value: RateItMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setResetable(value: Boolean): Self = StObject.set(x, "resetable", value.asInstanceOf[js.Any])
    
    inline def setResetableUndefined: Self = StObject.set(x, "resetable", js.undefined)
    
    inline def setStarheight(value: Double): Self = StObject.set(x, "starheight", value.asInstanceOf[js.Any])
    
    inline def setStarheightUndefined: Self = StObject.set(x, "starheight", js.undefined)
    
    inline def setStarwidth(value: Double): Self = StObject.set(x, "starwidth", value.asInstanceOf[js.Any])
    
    inline def setStarwidthUndefined: Self = StObject.set(x, "starwidth", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
