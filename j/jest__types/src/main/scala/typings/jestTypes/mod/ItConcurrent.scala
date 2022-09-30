package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItConcurrent
  extends StObject
     with It {
  
  def concurrent(testName: TestNameLike, testFn: ConcurrentTestFn): Unit = js.native
  def concurrent(testName: TestNameLike, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
  @JSName("concurrent")
  var concurrent_Original: ItConcurrentExtended = js.native
}
