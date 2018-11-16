package typings
package harmonyDashProxyLib.harmonyDashProxyMod.harmonyProxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConstructor
  extends ScalablyTyped.runtime.Instantiable2[/* target */ js.Object, /* handler */ ProxyHandler[js.Object], js.Object] {
  def revocable[T](target: T, handler: ProxyHandler[T]): harmonyDashProxyLib.Anon_Revoke[T] = js.native
}

