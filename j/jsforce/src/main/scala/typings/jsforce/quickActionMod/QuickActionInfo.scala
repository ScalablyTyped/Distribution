package typings.jsforce.quickActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickActionInfo extends js.Object {
  
  /** Label of the action */
  var label: String = js.native
  
  /** Name of the action */
  var name: String = js.native
  
  /** Type of the action (e.g. Create, Update, Post, LogACall) */
  var `type`: String = js.native
  
  /** Endpoint URL information of the action */
  var urls: js.Object = js.native
}
object QuickActionInfo {
  
  @scala.inline
  def apply(label: String, name: String, `type`: String, urls: js.Object): QuickActionInfo = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickActionInfo]
  }
  
  @scala.inline
  implicit class QuickActionInfoOps[Self <: QuickActionInfo] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrls(value: js.Object): Self = this.set("urls", value.asInstanceOf[js.Any])
  }
}
