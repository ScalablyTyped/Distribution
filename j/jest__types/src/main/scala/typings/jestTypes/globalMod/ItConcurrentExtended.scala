package typings.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItConcurrentExtended extends ItConcurrentBase {
  
  def only(testName: String, testFn: ConcurrentTestFn): Unit = js.native
  def only(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
  @JSName("only")
  var only_Original: ItConcurrentBase = js.native
  
  def skip(testName: String, testFn: ConcurrentTestFn): Unit = js.native
  def skip(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
  @JSName("skip")
  var skip_Original: ItConcurrentBase = js.native
}
