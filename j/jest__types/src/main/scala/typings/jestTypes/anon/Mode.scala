package typings.jestTypes.anon

import typings.jestTypes.circusMod.SyncEvent
import typings.jestTypes.circusMod.TestFn
import typings.jestTypes.circusMod.TestMode
import typings.jestTypes.circusMod.TestName
import typings.jestTypes.globalMod.DoneFn
import typings.jestTypes.jestTypesStrings.add_test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends SyncEvent {
  
  var asyncError: typings.std.Error = js.native
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  def fn(done: DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  @JSName("fn")
  var fn_Original: TestFn = js.native
  
  var mode: js.UndefOr[TestMode] = js.native
  
  var name: add_test = js.native
  
  var testName: TestName = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
