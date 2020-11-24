package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpiresAt extends js.Object {
  
  var expiresAt: js.UndefOr[scala.Nothing] = js.native
  
  var expiresIn: js.UndefOr[Double] = js.native
}
object ExpiresAt {
  
  @scala.inline
  def apply(): ExpiresAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpiresAt]
  }
  
  @scala.inline
  implicit class ExpiresAtOps[Self <: ExpiresAt] (val x: Self) extends AnyVal {
    
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
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
  }
}
