package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typesMod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<{  clientId :string,   apiVersion :string,  readonly id :string}> */
@js.native
trait DeepPartialclientIdstring extends js.Object {
  var apiVersion: js.UndefOr[DeepPartial[String]] = js.native
  var clientId: js.UndefOr[DeepPartial[String]] = js.native
  var id: js.UndefOr[DeepPartial[String]] = js.native
}

object DeepPartialclientIdstring {
  @scala.inline
  def apply(): DeepPartialclientIdstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialclientIdstring]
  }
  @scala.inline
  implicit class DeepPartialclientIdstringOps[Self <: DeepPartialclientIdstring] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: DeepPartial[String]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setClientId(value: DeepPartial[String]): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setId(value: DeepPartial[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

