package typings
package atJupyterlabDocmanagerLib.libManagerMod.DocumentManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a document manager.
  */
trait IOptions extends js.Object {
  /**
    * A service manager instance.
    */
  var manager: atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager
  /**
    * A widget opener for sibling widgets.
    */
  var opener: IWidgetOpener
  /**
    * A document registry instance.
    */
  var registry: atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.DocumentRegistry
  /**
    * A function called when a kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable]] = js.undefined
  /**
    * A promise for when to start using the manager.
    */
  var when: js.UndefOr[js.Promise[scala.Unit]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    manager: atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager,
    opener: IWidgetOpener,
    registry: atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.DocumentRegistry,
    setBusy: () => atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = null,
    when: js.Promise[scala.Unit] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager, opener = opener, registry = registry)
    if (setBusy != null) __obj.updateDynamic("setBusy")(js.Any.fromFunction0(setBusy))
    if (when != null) __obj.updateDynamic("when")(when)
    __obj.asInstanceOf[IOptions]
  }
}

