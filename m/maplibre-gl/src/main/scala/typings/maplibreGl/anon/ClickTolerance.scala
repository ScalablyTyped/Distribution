package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickTolerance extends StObject {
  
  var clickTolerance: Double
}
object ClickTolerance {
  
  inline def apply(clickTolerance: Double): ClickTolerance = {
    val __obj = js.Dynamic.literal(clickTolerance = clickTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickTolerance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickTolerance] (val x: Self) extends AnyVal {
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
  }
}
