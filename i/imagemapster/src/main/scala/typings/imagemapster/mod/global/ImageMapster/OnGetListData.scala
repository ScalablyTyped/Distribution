package typings.imagemapster.mod.global.ImageMapster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGetListData extends js.Object {
  
  /**
    * array of areas that make up this group
    */
  var area: js.Array[_] = js.native
  
  /**
    * primary mapKey for this area or area group
    */
  var key: String = js.native
  
  var options: AreaRenderingOptions = js.native
  
  /**
    * mapValue for this area or group
    */
  var value: String = js.native
}
object OnGetListData {
  
  @scala.inline
  def apply(area: js.Array[_], key: String, options: AreaRenderingOptions, value: String): OnGetListData = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGetListData]
  }
  
  @scala.inline
  implicit class OnGetListDataOps[Self <: OnGetListData] (val x: Self) extends AnyVal {
    
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
    def setAreaVarargs(value: js.Any*): Self = this.set("area", js.Array(value :_*))
    
    @scala.inline
    def setArea(value: js.Array[_]): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: AreaRenderingOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
