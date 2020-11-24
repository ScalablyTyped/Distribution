package typings.jestTypes.anon

import typings.jestTypes.globalMod.Each
import typings.jestTypes.globalMod.ItConcurrentBase
import typings.jestTypes.globalMod.TestFn
import typings.jestTypes.globalMod.TestName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @jest/types.@jest/types/build/Global.ItBase & {  concurrent :@jest/types.@jest/types/build/Global.ItConcurrentBase | undefined} */
@js.native
trait ItBaseconcurrentItConcurr extends js.Object {
  
  def apply(testName: TestName, fn: TestFn): Unit = js.native
  def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  
  var concurrent: js.UndefOr[ItConcurrentBase] = js.native
  
  var each: Each[TestFn] = js.native
}
