package typings.jquery.anon

import typings.jquery.JQuery._CoordinatesPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<jquery.JQuery.Coordinates, 'left'> */
@js.native
trait PickCoordinatesleft extends _CoordinatesPartial {
  
  var left: Double = js.native
}
object PickCoordinatesleft {
  
  @scala.inline
  def apply(left: Double): PickCoordinatesleft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCoordinatesleft]
  }
  
  @scala.inline
  implicit class PickCoordinatesleftMutableBuilder[Self <: PickCoordinatesleft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
  }
}
