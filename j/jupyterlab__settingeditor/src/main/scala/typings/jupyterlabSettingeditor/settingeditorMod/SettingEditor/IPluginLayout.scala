package typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The layout information that is stored and restored from the state database.
  */
@js.native
trait IPluginLayout extends JSONObject {
  
  /**
    * The current plugin being displayed.
    */
  var plugin: String = js.native
  
  var sizes: js.Array[Double] = js.native
}
object IPluginLayout {
  
  @scala.inline
  def apply(plugin: String, sizes: js.Array[Double]): IPluginLayout = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginLayout]
  }
  
  @scala.inline
  implicit class IPluginLayoutOps[Self <: IPluginLayout] (val x: Self) extends AnyVal {
    
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
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesVarargs(value: Double*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
