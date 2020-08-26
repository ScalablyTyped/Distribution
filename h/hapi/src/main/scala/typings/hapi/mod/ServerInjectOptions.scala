package typings.hapi.mod

import typings.hapi.anon.Artifacts
import typings.shot.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerInjectOptions extends RequestOptions {
  /**
    * allows access to routes with config.isInternal set to true. Defaults to false.
    */
  var allowInternals: js.UndefOr[Boolean] = js.native
  /**
    * sets the initial value of request.app, defaults to {}.
    */
  var app: js.UndefOr[ApplicationState] = js.native
  /**
    * Authentication bypass options.
    */
  var auth: js.UndefOr[Artifacts] = js.native
  /**
    * sets the initial value of request.plugins, defaults to {}.
    */
  var plugins: js.UndefOr[PluginsStates] = js.native
}

object ServerInjectOptions {
  @scala.inline
  def apply(url: String): ServerInjectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInjectOptions]
  }
  @scala.inline
  implicit class ServerInjectOptionsOps[Self <: ServerInjectOptions] (val x: Self) extends AnyVal {
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
    def setAllowInternals(value: Boolean): Self = this.set("allowInternals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInternals: Self = this.set("allowInternals", js.undefined)
    @scala.inline
    def setApp(value: ApplicationState): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setAuth(value: Artifacts): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setPlugins(value: PluginsStates): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
  
}

