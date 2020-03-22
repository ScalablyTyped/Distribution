package typings.luminoApplication.mod.Application

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for application startup.
  */
trait IStartOptions extends js.Object {
  /**
    * The ID of the DOM node to host the application shell.
    *
    * #### Notes
    * If this is not provided, the document body will be the host.
    */
  var hostID: js.UndefOr[String] = js.undefined
  /**
    * The plugins to **not** activate on startup.
    *
    * #### Notes
    * This will override `startPlugins` and any `autoStart` plugins.
    */
  var ignorePlugins: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The plugins to activate on startup.
    *
    * #### Notes
    * These will be *in addition* to any `autoStart` plugins.
    */
  var startPlugins: js.UndefOr[js.Array[String]] = js.undefined
}

object IStartOptions {
  @scala.inline
  def apply(
    hostID: String = null,
    ignorePlugins: js.Array[String] = null,
    startPlugins: js.Array[String] = null
  ): IStartOptions = {
    val __obj = js.Dynamic.literal()
    if (hostID != null) __obj.updateDynamic("hostID")(hostID.asInstanceOf[js.Any])
    if (ignorePlugins != null) __obj.updateDynamic("ignorePlugins")(ignorePlugins.asInstanceOf[js.Any])
    if (startPlugins != null) __obj.updateDynamic("startPlugins")(startPlugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStartOptions]
  }
}

