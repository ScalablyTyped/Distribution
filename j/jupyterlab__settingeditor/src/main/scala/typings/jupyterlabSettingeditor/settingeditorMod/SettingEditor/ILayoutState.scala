package typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The layout state for the setting editor.
  */
@js.native
trait ILayoutState extends JSONObject {
  
  /**
    * The layout state for a plugin editor container.
    */
  var container: IPluginLayout = js.native
  
  /**
    * The relative sizes of the plugin list and plugin editor.
    */
  var sizes: js.Array[Double] = js.native
}
object ILayoutState {
  
  @scala.inline
  def apply(container: IPluginLayout, sizes: js.Array[Double]): ILayoutState = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayoutState]
  }
  
  @scala.inline
  implicit class ILayoutStateOps[Self <: ILayoutState] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: IPluginLayout): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesVarargs(value: Double*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
