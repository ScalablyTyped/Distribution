package typings.ipify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Custom API endpoint.
  		@default 'https://api6.ipify.org'
  		*/
  val endpoint: js.UndefOr[String] = js.native
  /**
  		Use the IPv6 API endpoint. The IPv6 endpoint will return an IPv6 address if available, IPv4 address otherwise.
  		Setting the `endpoint` option will override this.
  		@default true
  		*/
  val useIPv6: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setUseIPv6(value: Boolean): Self = this.set("useIPv6", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseIPv6: Self = this.set("useIPv6", js.undefined)
  }
  
}

