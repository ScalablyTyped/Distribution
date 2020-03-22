package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typesMod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<{  clientId  :string,   apiVersion  :string,  readonly id  :string}> */
trait DeepPartialclientIdstring extends js.Object {
  var apiVersion: js.UndefOr[DeepPartial[String]] = js.undefined
  var clientId: js.UndefOr[DeepPartial[String]] = js.undefined
  var id: js.UndefOr[DeepPartial[String]] = js.undefined
}

object DeepPartialclientIdstring {
  @scala.inline
  def apply(
    apiVersion: DeepPartial[String] = null,
    clientId: DeepPartial[String] = null,
    id: DeepPartial[String] = null
  ): DeepPartialclientIdstring = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepPartialclientIdstring]
  }
}

