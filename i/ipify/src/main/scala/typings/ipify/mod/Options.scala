package typings.ipify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Custom API endpoint.
  		@default 'https://api6.ipify.org'
  		*/
  val endpoint: js.UndefOr[String] = js.undefined
  /**
  		Use the IPv6 API endpoint. The IPv6 endpoint will return an IPv6 address if available, IPv4 address otherwise.
  		Setting the `endpoint` option will override this.
  		@default true
  		*/
  val useIPv6: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(endpoint: String = null, useIPv6: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(useIPv6)) __obj.updateDynamic("useIPv6")(useIPv6.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

