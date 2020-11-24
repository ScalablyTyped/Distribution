package typings.jestTypes.anon

import typings.jestTypes.circusMod.HookFn
import typings.jestTypes.circusMod.HookType
import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.globalMod.DoneFn
import typings.jestTypes.jestTypesStrings.add_hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn extends SyncEvent {
  
  var asyncError: typings.std.Error = js.native
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  def fn(done: DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  
  var hookType: HookType = js.native
  
  var name: add_hook = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
