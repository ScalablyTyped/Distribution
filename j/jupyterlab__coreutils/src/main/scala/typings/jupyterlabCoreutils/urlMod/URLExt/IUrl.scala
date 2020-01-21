package typings.jupyterlabCoreutils.urlMod.URLExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a URL object
  */
trait IUrl extends js.Object {
  /**
    * The "fragment" portion of the URL including the leading ASCII hash
    * `(#)` character
    */
  var hash: js.UndefOr[String] = js.undefined
  /**
    * The full lower-cased host portion of the URL, including the port if
    * specified.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * The lower-cased host name portion of the host component without the
    * port included.
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * The full URL string that was parsed with both the protocol and host
    * components converted to lower-case.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * The entire path section of the URL.
    */
  var pathname: js.UndefOr[String] = js.undefined
  /**
    * The numeric port portion of the host component.
    */
  var port: js.UndefOr[String] = js.undefined
  /**
    * Identifies the URL's lower-cased protocol scheme.
    */
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * The search element, including leading question mark (`'?'`), if any,
    * of the URL.
    */
  var search: js.UndefOr[String] = js.undefined
}

object IUrl {
  @scala.inline
  def apply(
    hash: String = null,
    host: String = null,
    hostname: String = null,
    href: String = null,
    pathname: String = null,
    port: String = null,
    protocol: String = null,
    search: String = null
  ): IUrl = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUrl]
  }
}

