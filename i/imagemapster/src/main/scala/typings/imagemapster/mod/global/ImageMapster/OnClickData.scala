package typings.imagemapster.mod.global.ImageMapster

import typings.imagemapster.mod.global.JQuery
import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnClickData extends js.Object {
  
  var e: JQueryEventObject = js.native
  
  /**
    * mapKey for this area
    */
  var key: String = js.native
  
  /**
    * $(item) from boundList
    */
  var listTarget: js.UndefOr[JQuery] = js.native
  
  var selected: Boolean = js.native
}
object OnClickData {
  
  @scala.inline
  def apply(e: JQueryEventObject, key: String, selected: Boolean): OnClickData = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
  
  @scala.inline
  implicit class OnClickDataOps[Self <: OnClickData] (val x: Self) extends AnyVal {
    
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
    def setE(value: JQueryEventObject): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTarget(value: JQuery): Self = this.set("listTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListTarget: Self = this.set("listTarget", js.undefined)
  }
}
