package typings.httpProxy.anon

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<node.url.Url> */
trait PartialUrl extends js.Object {
  var auth: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String | ParsedUrlQuery] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var slashes: js.UndefOr[Boolean] = js.undefined
}

object PartialUrl {
  @scala.inline
  def apply(
    auth: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
    href: String = null,
    path: String = null,
    pathname: String = null,
    port: String = null,
    protocol: String = null,
    query: String | ParsedUrlQuery = null,
    search: String = null,
    slashes: js.UndefOr[Boolean] = js.undefined
  ): PartialUrl = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUrl]
  }
}

