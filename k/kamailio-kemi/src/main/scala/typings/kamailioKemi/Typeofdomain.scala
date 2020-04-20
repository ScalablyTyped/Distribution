package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdomain extends js.Object {
  def is_domain_local(sdomain: String): Double
  def is_from_local(): Double
  def is_uri_host_local(): Double
  def lookup_domain(_sdomain: String): Double
  def lookup_domain_prefix(_sdomain: String, _sprefix: String): Double
}

object Typeofdomain {
  @scala.inline
  def apply(
    is_domain_local: String => Double,
    is_from_local: () => Double,
    is_uri_host_local: () => Double,
    lookup_domain: String => Double,
    lookup_domain_prefix: (String, String) => Double
  ): Typeofdomain = {
    val __obj = js.Dynamic.literal(is_domain_local = js.Any.fromFunction1(is_domain_local), is_from_local = js.Any.fromFunction0(is_from_local), is_uri_host_local = js.Any.fromFunction0(is_uri_host_local), lookup_domain = js.Any.fromFunction1(lookup_domain), lookup_domain_prefix = js.Any.fromFunction2(lookup_domain_prefix))
    __obj.asInstanceOf[Typeofdomain]
  }
}

