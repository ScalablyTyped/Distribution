package typings.got.mod

import typings.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalRequestOptions extends RequestOptions {
  @JSName("agent")
  var agent_InternalRequestOptions: js.UndefOr[js.Any] = js.native
  // Redeclare options with `any` type for allow specify types incompatible with http.RequestOptions.
  @JSName("timeout")
  var timeout_InternalRequestOptions: js.UndefOr[js.Any] = js.native
}

object InternalRequestOptions {
  @scala.inline
  def apply(): InternalRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalRequestOptions]
  }
  @scala.inline
  implicit class InternalRequestOptionsOps[Self <: InternalRequestOptions] (val x: Self) extends AnyVal {
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
    def setAgent(value: js.Any): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setTimeout(value: js.Any): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

