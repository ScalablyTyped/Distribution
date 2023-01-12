package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleOptions extends StObject {
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var unit: js.UndefOr[Unit] = js.undefined
}
object ScaleOptions {
  
  inline def apply(): ScaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
