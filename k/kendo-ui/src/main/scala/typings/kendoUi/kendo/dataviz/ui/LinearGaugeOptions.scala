package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGaugeOptions extends StObject {
  
  var gaugeArea: js.UndefOr[LinearGaugeGaugeArea] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pointer: js.UndefOr[js.Array[LinearGaugePointerItem]] = js.undefined
  
  var renderAs: js.UndefOr[String] = js.undefined
  
  var scale: js.UndefOr[LinearGaugeScale] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var transitions: js.UndefOr[Boolean] = js.undefined
}
object LinearGaugeOptions {
  
  inline def apply(): LinearGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinearGaugeOptions] (val x: Self) extends AnyVal {
    
    inline def setGaugeArea(value: LinearGaugeGaugeArea): Self = StObject.set(x, "gaugeArea", value.asInstanceOf[js.Any])
    
    inline def setGaugeAreaUndefined: Self = StObject.set(x, "gaugeArea", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPointer(value: js.Array[LinearGaugePointerItem]): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    inline def setPointerVarargs(value: LinearGaugePointerItem*): Self = StObject.set(x, "pointer", js.Array(value*))
    
    inline def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    inline def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    inline def setScale(value: LinearGaugeScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
  }
}
