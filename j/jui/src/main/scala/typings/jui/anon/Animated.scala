package typings.jui.anon

import typings.jui.juiStrings.flat
import typings.jui.juiStrings.horizontal
import typings.jui.juiStrings.simple
import typings.jui.juiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animated extends StObject {
  
  // or true
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var event: js.UndefOr[Any] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  // or vertical,
  var min: js.UndefOr[Double] = js.undefined
  
  // simple or flat
  var orient: js.UndefOr[horizontal | vertical] = js.undefined
  
  var striped: js.UndefOr[Boolean] = js.undefined
  
  var tpl: js.UndefOr[Any] = js.undefined
  
  var `type`: js.UndefOr[simple | flat] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object Animated {
  
  inline def apply(): Animated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animated]
  }
  
  extension [Self <: Animated](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOrient(value: horizontal | vertical): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    inline def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
    
    inline def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
    
    inline def setTpl(value: Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    inline def setType(value: simple | flat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
