package typings.inversifyRestifyUtils.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions
  extends typings.restify.mod.ServerOptions {
  var defaultRoot: js.UndefOr[String] = js.native
}

object ServerOptions {
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
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
    def setDefaultRoot(value: String): Self = this.set("defaultRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRoot: Self = this.set("defaultRoot", js.undefined)
  }
  
}

