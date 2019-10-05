package typings.atJupyterlabApputils.libClientsessionMod.ClientSession

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession.IKernelPreference
import typings.atJupyterlabServices.libKernelKernelMod.Kernel.ISpecModels
import typings.atJupyterlabServices.libSessionSessionMod.Session.IModel
import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for populating a kernel selector.
  */
trait IKernelSearch extends js.Object {
  /**
    * The kernel preference.
    */
  var preference: IKernelPreference
  /**
    * The current running sessions.
    */
  var sessions: js.UndefOr[IterableOrArrayLike[IModel]] = js.undefined
  /**
    * The Kernel specs.
    */
  var specs: ISpecModels | Null
}

object IKernelSearch {
  @scala.inline
  def apply(
    preference: IKernelPreference,
    sessions: IterableOrArrayLike[IModel] = null,
    specs: ISpecModels = null
  ): IKernelSearch = {
    val __obj = js.Dynamic.literal(preference = preference)
    if (sessions != null) __obj.updateDynamic("sessions")(sessions.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs)
    __obj.asInstanceOf[IKernelSearch]
  }
}

