package typings.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItConcurrent extends It {
  
  def concurrent(testName: String, testFn: ConcurrentTestFn): Unit = js.native
  def concurrent(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
  @JSName("concurrent")
  var concurrent_Original: ItConcurrentExtended = js.native
}
