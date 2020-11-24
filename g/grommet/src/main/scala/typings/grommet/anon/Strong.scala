package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strong extends js.Object {
  
  var medium: js.UndefOr[Double] = js.native
  
  var strong: js.UndefOr[Double] = js.native
  
  var weak: js.UndefOr[Double] = js.native
}
object Strong {
  
  @scala.inline
  def apply(): Strong = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Strong]
  }
  
  @scala.inline
  implicit class StrongOps[Self <: Strong] (val x: Self) extends AnyVal {
    
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
    def setMedium(value: Double): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedium: Self = this.set("medium", js.undefined)
    
    @scala.inline
    def setStrong(value: Double): Self = this.set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    
    @scala.inline
    def setWeak(value: Double): Self = this.set("weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeak: Self = this.set("weak", js.undefined)
  }
}
