package typings.jupyterlabExtensionmanager.companionsMod

import typings.jupyterlabExtensionmanager.anon.Discovery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJupyterLabPackageData extends js.Object {
  
  var jupyterlab: js.UndefOr[Discovery] = js.native
}
object IJupyterLabPackageData {
  
  @scala.inline
  def apply(): IJupyterLabPackageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJupyterLabPackageData]
  }
  
  @scala.inline
  implicit class IJupyterLabPackageDataOps[Self <: IJupyterLabPackageData] (val x: Self) extends AnyVal {
    
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
    def setJupyterlab(value: Discovery): Self = this.set("jupyterlab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJupyterlab: Self = this.set("jupyterlab", js.undefined)
  }
}
