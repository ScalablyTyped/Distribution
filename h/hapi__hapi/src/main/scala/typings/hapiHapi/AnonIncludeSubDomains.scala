package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeSubDomains extends js.Object {
  /**
    * a boolean specifying whether to add the includeSubDomains flag to the header.
    */
  var includeSubDomains: Boolean
  /**
    * the max-age portion of the header, as a number. Default is 15768000.
    */
  var maxAge: Double
  /**
    * a boolean specifying whether to add the 'preload' flag (used to submit domains inclusion in Chrome's HTTP Strict Transport Security (HSTS) preload list) to the header.
    */
  var preload: Boolean
}

object AnonIncludeSubDomains {
  @scala.inline
  def apply(includeSubDomains: Boolean, maxAge: Double, preload: Boolean): AnonIncludeSubDomains = {
    val __obj = js.Dynamic.literal(includeSubDomains = includeSubDomains.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeSubDomains]
  }
}

