package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coordinate extends js.Object {
  
  var canonical: CanonicalCoordinate = js.native
  
  var key: Double = js.native
  
  var wrap: Double = js.native
}
object Coordinate {
  
  @scala.inline
  def apply(canonical: CanonicalCoordinate, key: Double, wrap: Double): Coordinate = {
    val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinate]
  }
  
  @scala.inline
  implicit class CoordinateOps[Self <: Coordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanonical(value: CanonicalCoordinate): Self = this.set("canonical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrap(value: Double): Self = this.set("wrap", value.asInstanceOf[js.Any])
  }
}
