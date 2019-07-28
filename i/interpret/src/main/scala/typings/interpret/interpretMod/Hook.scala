package typings.interpret.interpretMod

import typings.interpret.Anon_Extension
import typings.interpret.Anon_Extensions
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hook extends js.Object {
  def apply(m: Anon_Extensions): js.Any = js.native
  def apply(m: NodeModule): js.Any = js.native
  def install(): Unit = js.native
  def install(m: Anon_Extension): Unit = js.native
}

