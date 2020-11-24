package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Optedstate extends js.Object {
  
  var opted_state: js.UndefOr[String] = js.native
}
object Optedstate {
  
  @scala.inline
  def apply(): Optedstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optedstate]
  }
  
  @scala.inline
  implicit class OptedstateOps[Self <: Optedstate] (val x: Self) extends AnyVal {
    
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
    def setOpted_state(value: String): Self = this.set("opted_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpted_state: Self = this.set("opted_state", js.undefined)
  }
}
