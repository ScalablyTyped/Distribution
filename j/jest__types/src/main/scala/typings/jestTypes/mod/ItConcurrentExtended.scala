package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItConcurrentExtended
  extends StObject
     with ItConcurrentBase {
  
  def only(testName: TestNameLike, testFn: ConcurrentTestFn): Unit = js.native
  def only(testName: TestNameLike, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
  @JSName("only")
  var only_Original: ItConcurrentBase = js.native
  
  def skip(testName: TestNameLike, testFn: ConcurrentTestFn): Unit = js.native
  def skip(testName: TestNameLike, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
  @JSName("skip")
  var skip_Original: ItConcurrentBase = js.native
}
