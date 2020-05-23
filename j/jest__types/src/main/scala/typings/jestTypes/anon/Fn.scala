package typings.jestTypes.anon

import typings.jestTypes.circusMod.DoneFn
import typings.jestTypes.circusMod.Event
import typings.jestTypes.circusMod.HookFn
import typings.jestTypes.circusMod.HookType
import typings.jestTypes.jestTypesStrings.add_hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn extends Event {
  var asyncError: typings.std.Error = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  var hookType: HookType = js.native
  var name: add_hook = js.native
  var timeout: js.UndefOr[Double] = js.native
  def fn(): js.UndefOr[js.Promise[_] | Null] = js.native
  def fn(done: DoneFn): js.UndefOr[js.Promise[_] | Null] = js.native
}

