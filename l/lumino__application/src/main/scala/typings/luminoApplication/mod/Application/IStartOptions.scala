package typings.luminoApplication.mod.Application

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for application startup.
  */
@js.native
trait IStartOptions extends js.Object {
  /**
    * The ID of the DOM node to host the application shell.
    *
    * #### Notes
    * If this is not provided, the document body will be the host.
    */
  var hostID: js.UndefOr[String] = js.native
  /**
    * The plugins to **not** activate on startup.
    *
    * #### Notes
    * This will override `startPlugins` and any `autoStart` plugins.
    */
  var ignorePlugins: js.UndefOr[js.Array[String]] = js.native
  /**
    * The plugins to activate on startup.
    *
    * #### Notes
    * These will be *in addition* to any `autoStart` plugins.
    */
  var startPlugins: js.UndefOr[js.Array[String]] = js.native
}

object IStartOptions {
  @scala.inline
  def apply(): IStartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStartOptions]
  }
  @scala.inline
  implicit class IStartOptionsOps[Self <: IStartOptions] (val x: Self) extends AnyVal {
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
    def setHostID(value: String): Self = this.set("hostID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostID: Self = this.set("hostID", js.undefined)
    @scala.inline
    def setIgnorePluginsVarargs(value: String*): Self = this.set("ignorePlugins", js.Array(value :_*))
    @scala.inline
    def setIgnorePlugins(value: js.Array[String]): Self = this.set("ignorePlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePlugins: Self = this.set("ignorePlugins", js.undefined)
    @scala.inline
    def setStartPluginsVarargs(value: String*): Self = this.set("startPlugins", js.Array(value :_*))
    @scala.inline
    def setStartPlugins(value: js.Array[String]): Self = this.set("startPlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPlugins: Self = this.set("startPlugins", js.undefined)
  }
  
}

