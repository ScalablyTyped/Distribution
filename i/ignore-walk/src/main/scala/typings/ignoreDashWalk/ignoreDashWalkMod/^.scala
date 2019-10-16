package typings.ignoreDashWalk.ignoreDashWalkMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ignore-walk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[Set[String]] = js.native
  def apply(options: WalkerOptions): js.Promise[Set[String]] = js.native
  def apply(options: WalkerOptions, callback: js.Function1[/* results */ Set[String], Unit]): js.Promise[Set[String]] = js.native
}

