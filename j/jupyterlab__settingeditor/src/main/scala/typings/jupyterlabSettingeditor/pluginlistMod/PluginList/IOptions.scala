package typings.jupyterlabSettingeditor.pluginlistMod.PluginList

import typings.jupyterlabCoreutils.tokensMod.ISettingRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a plugin list.
  */
trait IOptions extends js.Object {
  /**
    * The setting registry for the plugin list.
    */
  var registry: ISettingRegistry
  /**
    * A function that allows for asynchronously confirming a selection.
    *
    * #### Notest
    * If the promise returned by the function resolves, then the selection will
    * succeed and emit an event. If the promise rejects, the selection is not
    * made.
    */
  def confirm(): js.Promise[Unit]
}

object IOptions {
  @scala.inline
  def apply(confirm: () => js.Promise[Unit], registry: ISettingRegistry): IOptions = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction0(confirm), registry = registry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

