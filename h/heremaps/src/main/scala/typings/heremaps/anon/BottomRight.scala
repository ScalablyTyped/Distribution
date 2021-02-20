package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomRight extends StObject {
  
  var BottomRight: Longitude = js.native
  
  var TopLeft: Longitude = js.native
}
object BottomRight {
  
  @scala.inline
  def apply(BottomRight: Longitude, TopLeft: Longitude): BottomRight = {
    val __obj = js.Dynamic.literal(BottomRight = BottomRight.asInstanceOf[js.Any], TopLeft = TopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRight]
  }
  
  @scala.inline
  implicit class BottomRightMutableBuilder[Self <: BottomRight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomRight(value: Longitude): Self = StObject.set(x, "BottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLeft(value: Longitude): Self = StObject.set(x, "TopLeft", value.asInstanceOf[js.Any])
  }
}
