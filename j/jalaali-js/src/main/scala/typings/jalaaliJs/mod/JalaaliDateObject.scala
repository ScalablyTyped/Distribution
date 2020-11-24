package typings.jalaaliJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JalaaliDateObject extends js.Object {
  
  /** Jalaali day */
  var jd: Double = js.native
  
  /** Jalaali month */
  var jm: Double = js.native
  
  /** Jalaali year */
  var jy: Double = js.native
}
object JalaaliDateObject {
  
  @scala.inline
  def apply(jd: Double, jm: Double, jy: Double): JalaaliDateObject = {
    val __obj = js.Dynamic.literal(jd = jd.asInstanceOf[js.Any], jm = jm.asInstanceOf[js.Any], jy = jy.asInstanceOf[js.Any])
    __obj.asInstanceOf[JalaaliDateObject]
  }
  
  @scala.inline
  implicit class JalaaliDateObjectOps[Self <: JalaaliDateObject] (val x: Self) extends AnyVal {
    
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
    def setJd(value: Double): Self = this.set("jd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJm(value: Double): Self = this.set("jm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJy(value: Double): Self = this.set("jy", value.asInstanceOf[js.Any])
  }
}
