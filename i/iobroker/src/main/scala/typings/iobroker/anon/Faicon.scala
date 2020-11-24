package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Faicon extends js.Object {
  
  /** Icon name for FontAwesome */
  var `fa-icon`: js.UndefOr[String] = js.native
  
  /** If true, the Tab is not reloaded when the configuration changes */
  var ignoreConfigUpdate: js.UndefOr[Boolean] = js.native
  
  /** Which URL should be loaded in the tab. Supports placeholders like http://%ip%:%port% */
  var link: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /** If true, only one instance of this tab will be created for all instances */
  var singleton: js.UndefOr[Boolean] = js.native
}
object Faicon {
  
  @scala.inline
  def apply(): Faicon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Faicon]
  }
  
  @scala.inline
  implicit class FaiconOps[Self <: Faicon] (val x: Self) extends AnyVal {
    
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
    def `setFa-icon`(value: String): Self = this.set("fa-icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFa-icon`: Self = this.set("fa-icon", js.undefined)
    
    @scala.inline
    def setIgnoreConfigUpdate(value: Boolean): Self = this.set("ignoreConfigUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreConfigUpdate: Self = this.set("ignoreConfigUpdate", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSingleton(value: Boolean): Self = this.set("singleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleton: Self = this.set("singleton", js.undefined)
  }
}
