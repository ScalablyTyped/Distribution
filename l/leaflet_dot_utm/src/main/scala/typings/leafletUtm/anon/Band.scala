package typings.leafletUtm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Band extends js.Object {
  
  var band: String = js.native
  
  var southHemi: Boolean = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
  
  var zone: Double = js.native
}
object Band {
  
  @scala.inline
  def apply(band: String, southHemi: Boolean, x: Double, y: Double, zone: Double): Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], southHemi = southHemi.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Band]
  }
  
  @scala.inline
  implicit class BandOps[Self <: Band] (val x: Self) extends AnyVal {
    
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
    def setBand(value: String): Self = this.set("band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSouthHemi(value: Boolean): Self = this.set("southHemi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZone(value: Double): Self = this.set("zone", value.asInstanceOf[js.Any])
  }
}
