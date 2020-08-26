package typings.hapi.mod

import typings.hapi.anon.Vhost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerRegisterOptions extends js.Object {
  /**
    * if true, subsequent registrations of the same plugin are skipped without error. Cannot be used with plugin options. Defaults to false. If not set to true, an error will be thrown the second
    * time a plugin is registered on the server.
    */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * modifiers applied to each route added by the plugin:
    */
  var routes: js.UndefOr[Vhost] = js.native
}

object ServerRegisterOptions {
  @scala.inline
  def apply(): ServerRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerRegisterOptions]
  }
  @scala.inline
  implicit class ServerRegisterOptionsOps[Self <: ServerRegisterOptions] (val x: Self) extends AnyVal {
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
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setRoutes(value: Vhost): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
  }
  
}

