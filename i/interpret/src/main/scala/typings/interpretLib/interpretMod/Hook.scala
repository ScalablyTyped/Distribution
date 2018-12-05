package typings
package interpretLib.interpretMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hook extends js.Object {
  def apply(m: interpretLib.Anon_Extensions): js.Any = js.native
  def apply(m: nodeLib.NodeModule): js.Any = js.native
  def install(): scala.Unit = js.native
  def install(m: interpretLib.Anon_Key): scala.Unit = js.native
}

