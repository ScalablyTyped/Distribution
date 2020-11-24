package typings.jestTypes.circusMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hook extends js.Object {
  
  var asyncError: Error = js.native
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  def fn(done: typings.jestTypes.globalMod.DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  
  var parent: DescribeBlock = js.native
  
  var timeout: js.UndefOr[Double | Null] = js.native
  
  var `type`: HookType = js.native
}
