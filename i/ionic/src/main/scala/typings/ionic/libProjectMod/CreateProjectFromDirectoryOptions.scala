package typings.ionic.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectFromDirectoryOptions extends js.Object {
  
  var logErrors: js.UndefOr[Boolean] = js.native
}
object CreateProjectFromDirectoryOptions {
  
  @scala.inline
  def apply(): CreateProjectFromDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectFromDirectoryOptions]
  }
  
  @scala.inline
  implicit class CreateProjectFromDirectoryOptionsOps[Self <: CreateProjectFromDirectoryOptions] (val x: Self) extends AnyVal {
    
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
    def setLogErrors(value: Boolean): Self = this.set("logErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogErrors: Self = this.set("logErrors", js.undefined)
  }
}
