package typings.atJestTypes

import typings.atJestTypes.atJestTypesStrings.add_hook
import typings.atJestTypes.buildCircusMod.DoneFn
import typings.atJestTypes.buildCircusMod.Event
import typings.atJestTypes.buildCircusMod.HookFn
import typings.atJestTypes.buildCircusMod.HookType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Addhook extends Event {
  var asyncError: Error = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  var hookType: HookType = js.native
  var name: add_hook = js.native
  var timeout: js.UndefOr[Double] = js.native
  def fn(): js.UndefOr[js.Promise[_] | Null] = js.native
  def fn(done: DoneFn): js.UndefOr[js.Promise[_] | Null] = js.native
}

