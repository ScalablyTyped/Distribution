package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofauthRadius extends js.Object {
  def proxy_authorize(srealm: String): Double
  def proxy_authorize_user(srealm: String, suser: String): Double
  def www_authorize(srealm: String): Double
  def www_authorize_user(srealm: String, suser: String): Double
}

object TypeofauthRadius {
  @scala.inline
  def apply(
    proxy_authorize: String => Double,
    proxy_authorize_user: (String, String) => Double,
    www_authorize: String => Double,
    www_authorize_user: (String, String) => Double
  ): TypeofauthRadius = {
    val __obj = js.Dynamic.literal(proxy_authorize = js.Any.fromFunction1(proxy_authorize), proxy_authorize_user = js.Any.fromFunction2(proxy_authorize_user), www_authorize = js.Any.fromFunction1(www_authorize), www_authorize_user = js.Any.fromFunction2(www_authorize_user))
  
    __obj.asInstanceOf[TypeofauthRadius]
  }
}

