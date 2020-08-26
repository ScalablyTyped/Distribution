package typings.ionic.sessionMod

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDeps extends js.Object {
  val client: IClient = js.native
  val config: IConfig = js.native
}

object SessionDeps {
  @scala.inline
  def apply(client: IClient, config: IConfig): SessionDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionDeps]
  }
  @scala.inline
  implicit class SessionDepsOps[Self <: SessionDeps] (val x: Self) extends AnyVal {
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
    def setClient(value: IClient): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: IConfig): Self = this.set("config", value.asInstanceOf[js.Any])
  }
  
}

