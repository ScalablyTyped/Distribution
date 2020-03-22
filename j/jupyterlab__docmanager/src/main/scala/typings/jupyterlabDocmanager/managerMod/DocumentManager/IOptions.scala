package typings.jupyterlabDocmanager.managerMod.DocumentManager

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.luminoDisposable.mod.IDisposable
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
  var manager: IManager
  /**
    * A widget opener for sibling widgets.
    */
  var opener: IWidgetOpener
  /**
    * A document registry instance.
    */
  var registry: DocumentRegistry
  /**
    * The provider for session dialogs.
    */
  var sessionDialogs: js.UndefOr[IDialogs] = js.undefined
  /**
    * A function called when a kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
  /**
    * A promise for when to start using the manager.
    */
  var when: js.UndefOr[js.Promise[Unit]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    manager: IManager,
    opener: IWidgetOpener,
    registry: DocumentRegistry,
    sessionDialogs: IDialogs = null,
    setBusy: () => IDisposable = null,
    when: js.Promise[Unit] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], opener = opener.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
    if (sessionDialogs != null) __obj.updateDynamic("sessionDialogs")(sessionDialogs.asInstanceOf[js.Any])
    if (setBusy != null) __obj.updateDynamic("setBusy")(js.Any.fromFunction0(setBusy))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

