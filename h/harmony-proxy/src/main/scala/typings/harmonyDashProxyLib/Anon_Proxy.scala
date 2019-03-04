package typings
package harmonyDashProxyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Proxy[T] extends js.Object {
  var proxy: T
  def revoke(): scala.Unit
}

object Anon_Proxy {
  @scala.inline
  def apply[T](proxy: T, revoke: js.Function0[scala.Unit]): Anon_Proxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = revoke)
  
    __obj.asInstanceOf[Anon_Proxy[T]]
  }
}

