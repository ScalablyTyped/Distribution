package typings
package lightDashMyDashRequestLib.lightDashMyDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectOptions extends js.Object {
  var authority: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[nodeLib.httpMod.IncomingHttpHeaders | nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
  var method: js.UndefOr[HTTPMethods] = js.undefined
  var payload: js.UndefOr[InjectPayload] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var remoteAddress: js.UndefOr[java.lang.String] = js.undefined
  var server: js.UndefOr[nodeLib.httpMod.Server] = js.undefined
  var simulate: js.UndefOr[lightDashMyDashRequestLib.Anon_Close] = js.undefined
  var url: java.lang.String | lightDashMyDashRequestLib.Anon_Hostname
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

object InjectOptions {
  @scala.inline
  def apply(
    url: java.lang.String | lightDashMyDashRequestLib.Anon_Hostname,
    authority: java.lang.String = null,
    headers: nodeLib.httpMod.IncomingHttpHeaders | nodeLib.httpMod.OutgoingHttpHeaders = null,
    method: HTTPMethods = null,
    payload: InjectPayload = null,
    query: java.lang.String = null,
    remoteAddress: java.lang.String = null,
    server: nodeLib.httpMod.Server = null,
    simulate: lightDashMyDashRequestLib.Anon_Close = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined
  ): InjectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress)
    if (server != null) __obj.updateDynamic("server")(server)
    if (simulate != null) __obj.updateDynamic("simulate")(simulate)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[InjectOptions]
  }
}

