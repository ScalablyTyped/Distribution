package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeSubDomains extends js.Object {
  /**
    * a boolean specifying whether to add the includeSubDomains flag to the header.
    */
  var includeSubDomains: scala.Boolean
  /**
    * the max-age portion of the header, as a number. Default is 15768000.
    */
  var maxAge: scala.Double
  /**
    * a boolean specifying whether to add the 'preload' flag (used to submit domains inclusion in Chrome's HTTP Strict Transport Security (HSTS) preload list) to the header.
    */
  var preload: scala.Boolean
}

object Anon_IncludeSubDomains {
  @scala.inline
  def apply(includeSubDomains: scala.Boolean, maxAge: scala.Double, preload: scala.Boolean): Anon_IncludeSubDomains = {
    val __obj = js.Dynamic.literal(includeSubDomains = includeSubDomains, maxAge = maxAge, preload = preload)
  
    __obj.asInstanceOf[Anon_IncludeSubDomains]
  }
}

