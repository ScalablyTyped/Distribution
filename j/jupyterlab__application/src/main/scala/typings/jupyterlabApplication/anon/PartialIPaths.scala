package typings.jupyterlabApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/application.@jupyterlab/application/lib/frontend.JupyterFrontEnd.IPaths> */
@js.native
trait PartialIPaths extends js.Object {
  
  var directories: js.UndefOr[AppSettings] = js.native
  
  var urls: js.UndefOr[App] = js.native
}
object PartialIPaths {
  
  @scala.inline
  def apply(): PartialIPaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIPaths]
  }
  
  @scala.inline
  implicit class PartialIPathsOps[Self <: PartialIPaths] (val x: Self) extends AnyVal {
    
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
    def setDirectories(value: AppSettings): Self = this.set("directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    
    @scala.inline
    def setUrls(value: App): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
}
