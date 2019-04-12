package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeSubdomains extends js.Object {
  /**
    * a boolean specifying whether to add the includeSubDomains flag to the header.
    */
  var includeSubdomains: scala.Boolean
  /**
    * the max-age portion of the header, as a number. Default is 15768000.
    */
  var maxAge: scala.Double
  /**
    * a boolean specifying whether to add the 'preload' flag (used to submit domains inclusion in Chrome's HTTP Strict Transport Security (HSTS) preload list) to the header.
    */
  var preload: scala.Boolean
}

object Anon_IncludeSubdomains {
  @scala.inline
  def apply(includeSubdomains: scala.Boolean, maxAge: scala.Double, preload: scala.Boolean): Anon_IncludeSubdomains = {
    val __obj = js.Dynamic.literal(includeSubdomains = includeSubdomains, maxAge = maxAge, preload = preload)
  
    __obj.asInstanceOf[Anon_IncludeSubdomains]
  }
}

