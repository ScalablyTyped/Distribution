package typings.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleProps[T]
  extends GriddlePlugin
     with GriddleInitialState {
  
  var core: js.UndefOr[GriddlePlugin] = js.native
  
  var data: js.UndefOr[js.Array[T]] = js.native
  
  var plugins: js.UndefOr[js.Array[GriddlePlugin]] = js.native
  
  var storeKey: js.UndefOr[String] = js.native
}
object GriddleProps {
  
  @scala.inline
  def apply[T](): GriddleProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleProps[T]]
  }
  
  @scala.inline
  implicit class GriddlePropsOps[Self <: GriddleProps[_], T] (val x: Self with GriddleProps[T]) extends AnyVal {
    
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
    def setCore(value: GriddlePlugin): Self = this.set("core", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCore: Self = this.set("core", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: GriddlePlugin*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[GriddlePlugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setStoreKey(value: String): Self = this.set("storeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreKey: Self = this.set("storeKey", js.undefined)
  }
}
