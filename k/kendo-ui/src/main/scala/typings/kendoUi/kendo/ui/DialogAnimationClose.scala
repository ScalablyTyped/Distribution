package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogAnimationClose extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var effects: js.UndefOr[String] = js.undefined
}
object DialogAnimationClose {
  
  inline def apply(): DialogAnimationClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogAnimationClose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogAnimationClose] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEffects(value: String): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
  }
}
