package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Proxyauthorize extends js.Object {
  def proxy_authorize(srealm: java.lang.String): scala.Double
  def proxy_authorize_user(srealm: java.lang.String, suser: java.lang.String): scala.Double
  def www_authorize(srealm: java.lang.String): scala.Double
  def www_authorize_user(srealm: java.lang.String, suser: java.lang.String): scala.Double
}

object Anon_Proxyauthorize {
  @scala.inline
  def apply(
    proxy_authorize: java.lang.String => scala.Double,
    proxy_authorize_user: (java.lang.String, java.lang.String) => scala.Double,
    www_authorize: java.lang.String => scala.Double,
    www_authorize_user: (java.lang.String, java.lang.String) => scala.Double
  ): Anon_Proxyauthorize = {
    val __obj = js.Dynamic.literal(proxy_authorize = js.Any.fromFunction1(proxy_authorize), proxy_authorize_user = js.Any.fromFunction2(proxy_authorize_user), www_authorize = js.Any.fromFunction1(www_authorize), www_authorize_user = js.Any.fromFunction2(www_authorize_user))
  
    __obj.asInstanceOf[Anon_Proxyauthorize]
  }
}

