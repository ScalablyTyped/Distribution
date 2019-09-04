package typings.atJestTypes.buildCircusMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hook extends js.Object {
  var asyncError: Error = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  var parent: DescribeBlock = js.native
  var timeout: js.UndefOr[Double | Null] = js.native
  var `type`: HookType = js.native
  def fn(): js.UndefOr[js.Promise[_] | Null] = js.native
  def fn(done: DoneFn): js.UndefOr[js.Promise[_] | Null] = js.native
}

