package typings.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSOAuth2Def extends HelloJSOAuthDef {
  var grant: js.UndefOr[String] = js.native
  var response_type: js.UndefOr[HelloJSTokenResponseType] = js.native
}

object HelloJSOAuth2Def {
  @scala.inline
  def apply(version: String | Double): HelloJSOAuth2Def = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSOAuth2Def]
  }
  @scala.inline
  implicit class HelloJSOAuth2DefOps[Self <: HelloJSOAuth2Def] (val x: Self) extends AnyVal {
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
    def setGrant(value: String): Self = this.set("grant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrant: Self = this.set("grant", js.undefined)
    @scala.inline
    def setResponse_type(value: HelloJSTokenResponseType): Self = this.set("response_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
  }
  
}

