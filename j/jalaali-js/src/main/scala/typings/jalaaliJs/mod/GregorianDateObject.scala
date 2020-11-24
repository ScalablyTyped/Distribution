package typings.jalaaliJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GregorianDateObject extends js.Object {
  
  /** Gregorian day */
  var gd: Double = js.native
  
  /** Gregorian month */
  var gm: Double = js.native
  
  /** Gregorian year */
  var gy: Double = js.native
}
object GregorianDateObject {
  
  @scala.inline
  def apply(gd: Double, gm: Double, gy: Double): GregorianDateObject = {
    val __obj = js.Dynamic.literal(gd = gd.asInstanceOf[js.Any], gm = gm.asInstanceOf[js.Any], gy = gy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GregorianDateObject]
  }
  
  @scala.inline
  implicit class GregorianDateObjectOps[Self <: GregorianDateObject] (val x: Self) extends AnyVal {
    
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
    def setGd(value: Double): Self = this.set("gd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGm(value: Double): Self = this.set("gm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGy(value: Double): Self = this.set("gy", value.asInstanceOf[js.Any])
  }
}
