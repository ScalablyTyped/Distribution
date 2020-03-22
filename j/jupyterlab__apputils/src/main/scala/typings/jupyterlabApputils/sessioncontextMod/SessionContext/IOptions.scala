package typings.jupyterlabApputils.sessioncontextMod.SessionContext

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabServices.sessionSessionMod.IManager
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a context.
  */
trait IOptions extends js.Object {
  /**
    * A kernel preference.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
  /**
    * The name of the session.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The initial path of the file.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * A session manager instance.
    */
  var sessionManager: IManager
  /**
    * A function to call when the session becomes busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
  /**
    * A kernel spec manager instance.
    */
  var specsManager: typings.jupyterlabServices.kernelspecKernelspecMod.IManager
  /**
    * The type of the session.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    sessionManager: IManager,
    specsManager: typings.jupyterlabServices.kernelspecKernelspecMod.IManager,
    kernelPreference: IKernelPreference = null,
    name: String = null,
    path: String = null,
    setBusy: () => IDisposable = null,
    `type`: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(sessionManager = sessionManager.asInstanceOf[js.Any], specsManager = specsManager.asInstanceOf[js.Any])
    if (kernelPreference != null) __obj.updateDynamic("kernelPreference")(kernelPreference.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (setBusy != null) __obj.updateDynamic("setBusy")(js.Any.fromFunction0(setBusy))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

