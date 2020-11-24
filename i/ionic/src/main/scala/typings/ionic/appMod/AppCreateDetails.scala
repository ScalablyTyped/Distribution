package typings.ionic.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppCreateDetails extends js.Object {
  
  val name: String = js.native
  
  val org_id: js.UndefOr[String] = js.native
}
object AppCreateDetails {
  
  @scala.inline
  def apply(name: String): AppCreateDetails = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCreateDetails]
  }
  
  @scala.inline
  implicit class AppCreateDetailsOps[Self <: AppCreateDetails] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_id(value: String): Self = this.set("org_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrg_id: Self = this.set("org_id", js.undefined)
  }
}
