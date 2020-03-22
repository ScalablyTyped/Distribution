package typings.jupyterlabApputils.sessioncontextMod.ISessionContext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A kernel preference.
  *
  * #### Notes
  * Preferences for a kernel are considered in the order `id`, `name`,
  * `language`. If no matching kernels can be found and `autoStartDefault` is
  * `true`, then the default kernel for the server is preferred.
  */
trait IKernelPreference extends js.Object {
  /**
    * Automatically start the default kernel if no other matching kernel is
    * found (default `true`).
    */
  val autoStartDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * A kernel can be started (default `true`).
    */
  val canStart: js.UndefOr[Boolean] = js.undefined
  /**
    * The id of an existing kernel.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The preferred kernel language.
    */
  val language: js.UndefOr[String] = js.undefined
  /**
    * The name of the kernel.
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * A kernel should be started automatically (default `true`).
    */
  val shouldStart: js.UndefOr[Boolean] = js.undefined
  /**
    * Shut down the session when session context is disposed (default `false`).
    */
  val shutdownOnDispose: js.UndefOr[Boolean] = js.undefined
}

object IKernelPreference {
  @scala.inline
  def apply(
    autoStartDefault: js.UndefOr[Boolean] = js.undefined,
    canStart: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    language: String = null,
    name: String = null,
    shouldStart: js.UndefOr[Boolean] = js.undefined,
    shutdownOnDispose: js.UndefOr[Boolean] = js.undefined
  ): IKernelPreference = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStartDefault)) __obj.updateDynamic("autoStartDefault")(autoStartDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(canStart)) __obj.updateDynamic("canStart")(canStart.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldStart)) __obj.updateDynamic("shouldStart")(shouldStart.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownOnDispose)) __obj.updateDynamic("shutdownOnDispose")(shutdownOnDispose.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelPreference]
  }
}

