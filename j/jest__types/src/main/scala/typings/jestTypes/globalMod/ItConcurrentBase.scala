package typings.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItConcurrentBase extends js.Object {
  
  def apply(testName: String, testFn: ConcurrentTestFn): Unit = js.native
  def apply(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
  
  var each: Each[ConcurrentTestFn] = js.native
}
