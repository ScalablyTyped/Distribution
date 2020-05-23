package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.anon.DeepPartialPartialHeaders
import typings.mangopay2NodejsSdk.anon.DeepPartialclientIdstring
import typings.mangopay2NodejsSdk.anon.DeepPartialtimeoutnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.RequestOptions> */
trait MethodOptions extends js.Object {
  var data: js.UndefOr[WithToJson[js.Object] | String] = js.undefined
  var headers: js.UndefOr[DeepPartialPartialHeaders] = js.undefined
  var parameters: js.UndefOr[FilterOptions with PaginationOptions] = js.undefined
  var path: js.UndefOr[DeepPartialclientIdstring] = js.undefined
  var requestConfig: js.UndefOr[DeepPartialtimeoutnumber] = js.undefined
  var responseConfig: js.UndefOr[DeepPartialtimeoutnumber] = js.undefined
}

object MethodOptions {
  @scala.inline
  def apply(
    data: WithToJson[js.Object] | String = null,
    headers: DeepPartialPartialHeaders = null,
    parameters: FilterOptions with PaginationOptions = null,
    path: DeepPartialclientIdstring = null,
    requestConfig: DeepPartialtimeoutnumber = null,
    responseConfig: DeepPartialtimeoutnumber = null
  ): MethodOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (requestConfig != null) __obj.updateDynamic("requestConfig")(requestConfig.asInstanceOf[js.Any])
    if (responseConfig != null) __obj.updateDynamic("responseConfig")(responseConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodOptions]
  }
}

