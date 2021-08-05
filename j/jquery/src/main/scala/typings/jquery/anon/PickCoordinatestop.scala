package typings.jquery.anon

import typings.jquery.JQuery._CoordinatesPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<jquery.JQuery.Coordinates, 'top'> */
trait PickCoordinatestop
  extends StObject
     with _CoordinatesPartial {
  
  var top: Double
}
object PickCoordinatestop {
  
  inline def apply(top: Double): PickCoordinatestop = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCoordinatestop]
  }
  
  extension [Self <: PickCoordinatestop](x: Self) {
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
