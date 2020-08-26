package typings.jupyterlabCoreutils.urlMod.URLExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a URL object
  */
@js.native
trait IUrl extends js.Object {
  /**
    * The "fragment" portion of the URL including the leading ASCII hash
    * `(#)` character
    */
  var hash: String = js.native
  /**
    * The full lower-cased host portion of the URL, including the port if
    * specified.
    */
  var host: String = js.native
  /**
    * The lower-cased host name portion of the host component without the
    * port included.
    */
  var hostname: String = js.native
  /**
    * The full URL string that was parsed with both the protocol and host
    * components converted to lower-case.
    */
  var href: String = js.native
  /**
    * The entire path section of the URL.
    */
  var pathname: String = js.native
  /**
    * The numeric port portion of the host component.
    */
  var port: String = js.native
  /**
    * Identifies the URL's lower-cased protocol scheme.
    */
  var protocol: String = js.native
  /**
    * The search element, including leading question mark (`'?'`), if any,
    * of the URL.
    */
  var search: js.UndefOr[String] = js.native
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
    protocol: String
  ): IUrl = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUrl]
  }
  @scala.inline
  implicit class IUrlOps[Self <: IUrl] (val x: Self) extends AnyVal {
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
  
}

