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
  var hash: String
  /**
    * The full lower-cased host portion of the URL, including the port if
    * specified.
    */
  var host: String
  /**
    * The lower-cased host name portion of the host component without the
    * port included.
    */
  var hostname: String
  /**
    * The full URL string that was parsed with both the protocol and host
    * components converted to lower-case.
    */
  var href: String
  /**
    * The entire path section of the URL.
    */
  var pathname: String
  /**
    * The numeric port portion of the host component.
    */
  var port: String
  /**
    * Identifies the URL's lower-cased protocol scheme.
    */
  var protocol: String
  /**
    * The search element, including leading question mark (`'?'`), if any,
    * of the URL.
    */
  var search: js.UndefOr[String] = js.undefined
}

object IUrl {
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    href: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String = null
  ): IUrl = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUrl]
  }
}

