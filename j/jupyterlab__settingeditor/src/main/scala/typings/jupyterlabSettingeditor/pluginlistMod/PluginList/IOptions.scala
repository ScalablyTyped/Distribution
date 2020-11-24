package typings.jupyterlabSettingeditor.pluginlistMod.PluginList

import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The instantiation options for a plugin list.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * A function that allows for asynchronously confirming a selection.
    *
    * #### Notest
    * If the promise returned by the function resolves, then the selection will
    * succeed and emit an event. If the promise rejects, the selection is not
    * made.
    */
  def confirm(): js.Promise[Unit] = js.native
  
  /**
    * The setting registry for the plugin list.
    */
  var registry: ISettingRegistry = js.native
}
object IOptions {
  
  @scala.inline
  def apply(confirm: () => js.Promise[Unit], registry: ISettingRegistry): IOptions = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction0(confirm), registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setConfirm(value: () => js.Promise[Unit]): Self = this.set("confirm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegistry(value: ISettingRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
  }
}
