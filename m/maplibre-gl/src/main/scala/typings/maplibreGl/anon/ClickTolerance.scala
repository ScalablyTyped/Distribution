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
  
  extension [Self <: ClickTolerance](x: Self) {
    
    inline def setClickTolerance(value: Double): Self = StObject.set(x, "clickTolerance", value.asInstanceOf[js.Any])
  }
}
