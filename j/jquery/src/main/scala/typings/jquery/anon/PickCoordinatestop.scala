package typings.jquery.anon

import typings.jquery.JQuery._CoordinatesPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<jquery.JQuery.Coordinates, 'top'> */
@js.native
trait PickCoordinatestop extends _CoordinatesPartial {
  
  var top: Double = js.native
}
object PickCoordinatestop {
  
  @scala.inline
  def apply(top: Double): PickCoordinatestop = {
    val __obj = js.Dynamic.literal(top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCoordinatestop]
  }
  
  @scala.inline
  implicit class PickCoordinatestopMutableBuilder[Self <: PickCoordinatestop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
