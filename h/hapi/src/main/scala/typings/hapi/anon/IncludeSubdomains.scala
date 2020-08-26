package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeSubdomains extends js.Object {
  /**
    * a boolean specifying whether to add the includeSubDomains flag to the header.
    */
  var includeSubdomains: Boolean = js.native
  /**
    * the max-age portion of the header, as a number. Default is 15768000.
    */
  var maxAge: Double = js.native
  /**
    * a boolean specifying whether to add the 'preload' flag (used to submit domains inclusion in Chrome's HTTP Strict Transport Security (HSTS) preload list) to the header.
    */
  var preload: Boolean = js.native
}

object IncludeSubdomains {
  @scala.inline
  def apply(includeSubdomains: Boolean, maxAge: Double, preload: Boolean): IncludeSubdomains = {
    val __obj = js.Dynamic.literal(includeSubdomains = includeSubdomains.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSubdomains]
  }
  @scala.inline
  implicit class IncludeSubdomainsOps[Self <: IncludeSubdomains] (val x: Self) extends AnyVal {
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
    def setIncludeSubdomains(value: Boolean): Self = this.set("includeSubdomains", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
  
}

