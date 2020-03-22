package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.DeepPartialPartialHeaders
import typings.mangopay2NodejsSdk.DeepPartialclientIdstring
import typings.mangopay2NodejsSdk.DeepPartialtimeoutnumber
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodOptionWithoutResponse extends MethodOptions {
  var resolveWithFullResponse: js.UndefOr[`false`] = js.undefined
}

object MethodOptionWithoutResponse {
  @scala.inline
  def apply(
    data: WithToJson[js.Object] | String = null,
    headers: DeepPartialPartialHeaders = null,
    parameters: FilterOptions with PaginationOptions = null,
    path: DeepPartialclientIdstring = null,
    requestConfig: DeepPartialtimeoutnumber = null,
    resolveWithFullResponse: `false` = null,
    responseConfig: DeepPartialtimeoutnumber = null
  ): MethodOptionWithoutResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (requestConfig != null) __obj.updateDynamic("requestConfig")(requestConfig.asInstanceOf[js.Any])
    if (resolveWithFullResponse != null) __obj.updateDynamic("resolveWithFullResponse")(resolveWithFullResponse.asInstanceOf[js.Any])
    if (responseConfig != null) __obj.updateDynamic("responseConfig")(responseConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodOptionWithoutResponse]
  }
}

