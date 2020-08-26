package typings.ionic.ssoMod

import typings.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2FlowDeps extends js.Object {
  val client: IClient = js.native
}

object OAuth2FlowDeps {
  @scala.inline
  def apply(client: IClient): OAuth2FlowDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2FlowDeps]
  }
  @scala.inline
  implicit class OAuth2FlowDepsOps[Self <: OAuth2FlowDeps] (val x: Self) extends AnyVal {
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
  }
  
}

