package typings.inboxsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// // Undocummented
// var IMPL_VERSION: string;
// var LOADER_VERSION: string;
// var destroyed: boolean; //: false
// var Logger: {
//   error: () => any;
//   event: () => any;
// };
@js.native
trait LoadOptions extends js.Object {
  
  var appIconUrl: js.UndefOr[String] = js.native
  
  var appName: js.UndefOr[String] = js.native
  
  var suppressAddonTitle: js.UndefOr[String] = js.native
}
object LoadOptions {
  
  @scala.inline
  def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  @scala.inline
  implicit class LoadOptionsOps[Self <: LoadOptions] (val x: Self) extends AnyVal {
    
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
    def setAppIconUrl(value: String): Self = this.set("appIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppIconUrl: Self = this.set("appIconUrl", js.undefined)
    
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    
    @scala.inline
    def setSuppressAddonTitle(value: String): Self = this.set("suppressAddonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressAddonTitle: Self = this.set("suppressAddonTitle", js.undefined)
  }
}
