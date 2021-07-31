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
  
  var event: js.UndefOr[js.Any] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  // or vertical,
  var min: js.UndefOr[Double] = js.undefined
  
  // simple or flat
  var orient: js.UndefOr[horizontal | vertical] = js.undefined
  
  var striped: js.UndefOr[Boolean] = js.undefined
  
  var tpl: js.UndefOr[js.Any] = js.undefined
  
  var `type`: js.UndefOr[simple | flat] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object Animated {
  
  @scala.inline
  def apply(): Animated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animated]
  }
  
  @scala.inline
  implicit class AnimatedMutableBuilder[Self <: Animated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setOrient(value: horizontal | vertical): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setStriped(value: Boolean): Self = StObject.set(x, "striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripedUndefined: Self = StObject.set(x, "striped", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    @scala.inline
    def setType(value: simple | flat): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
