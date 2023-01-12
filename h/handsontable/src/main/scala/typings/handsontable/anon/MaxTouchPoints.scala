package typings.handsontable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxTouchPoints extends StObject {
  
  var maxTouchPoints: js.UndefOr[Double] = js.undefined
}
object MaxTouchPoints {
  
  inline def apply(): MaxTouchPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTouchPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxTouchPoints] (val x: Self) extends AnyVal {
    
    inline def setMaxTouchPoints(value: Double): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
    
    inline def setMaxTouchPointsUndefined: Self = StObject.set(x, "maxTouchPoints", js.undefined)
  }
}
