package typings.jestTypes.circusMod

import typings.jestTypes.jestTypesStrings.test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestEntry extends js.Object {
  
  var asyncError: Exception = js.native
  
  var duration: js.UndefOr[Double | Null] = js.native
  
  var errors: js.Array[TestError] = js.native
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  def fn(done: typings.jestTypes.globalMod.DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  @JSName("fn")
  var fn_Original: TestFn = js.native
  
  var invocations: Double = js.native
  
  var mode: TestMode = js.native
  
  var name: TestName = js.native
  
  var parent: DescribeBlock = js.native
  
  var startedAt: js.UndefOr[Double | Null] = js.native
  
  var status: js.UndefOr[TestStatus | Null] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var `type`: test = js.native
}
