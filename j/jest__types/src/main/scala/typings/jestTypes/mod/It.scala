package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait It
  extends StObject
     with ItBase {
  
  def only(testName: TestNameLike, fn: TestFn): Unit = js.native
  def only(testName: TestNameLike, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("only")
  var only_Original: ItBase = js.native
  
  def skip(testName: TestNameLike, fn: TestFn): Unit = js.native
  def skip(testName: TestNameLike, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("skip")
  var skip_Original: ItBase = js.native
  
  def todo(testName: TestNameLike): Unit = js.native
}
