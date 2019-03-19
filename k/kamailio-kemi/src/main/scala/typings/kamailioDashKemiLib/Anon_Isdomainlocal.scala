package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Isdomainlocal extends js.Object {
  def is_domain_local(sdomain: java.lang.String): scala.Double
  def is_from_local(): scala.Double
  def is_uri_host_local(): scala.Double
  def lookup_domain(_sdomain: java.lang.String): scala.Double
  def lookup_domain_prefix(_sdomain: java.lang.String, _sprefix: java.lang.String): scala.Double
}

object Anon_Isdomainlocal {
  @scala.inline
  def apply(
    is_domain_local: java.lang.String => scala.Double,
    is_from_local: () => scala.Double,
    is_uri_host_local: () => scala.Double,
    lookup_domain: java.lang.String => scala.Double,
    lookup_domain_prefix: (java.lang.String, java.lang.String) => scala.Double
  ): Anon_Isdomainlocal = {
    val __obj = js.Dynamic.literal(is_domain_local = js.Any.fromFunction1(is_domain_local), is_from_local = js.Any.fromFunction0(is_from_local), is_uri_host_local = js.Any.fromFunction0(is_uri_host_local), lookup_domain = js.Any.fromFunction1(lookup_domain), lookup_domain_prefix = js.Any.fromFunction2(lookup_domain_prefix))
  
    __obj.asInstanceOf[Anon_Isdomainlocal]
  }
}

