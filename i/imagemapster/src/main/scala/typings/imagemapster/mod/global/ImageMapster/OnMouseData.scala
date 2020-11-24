package typings.imagemapster.mod.global.ImageMapster

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMouseData extends js.Object {
  
  var e: JQueryEventObject = js.native
  
  /**
    * area key
    */
  var key: String = js.native
  
  var options: AreaRenderingOptions = js.native
  
  /**
    * true if area is currently selected
    */
  var selected: Boolean = js.native
}
object OnMouseData {
  
  @scala.inline
  def apply(e: JQueryEventObject, key: String, options: AreaRenderingOptions, selected: Boolean): OnMouseData = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMouseData]
  }
  
  @scala.inline
  implicit class OnMouseDataOps[Self <: OnMouseData] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: AreaRenderingOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
