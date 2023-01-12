package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.add_test
import typings.jestTypes.mod.SyncEvent
import typings.jestTypes.mod.TestFn2
import typings.jestTypes.mod.TestMode
import typings.jestTypes.mod.TestName2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Concurrent
  extends StObject
     with SyncEvent {
  
  var asyncError: js.Error
  
  var concurrent: Boolean
  
  var failing: Boolean
  
  var fn: TestFn2
  
  var mode: js.UndefOr[TestMode] = js.undefined
  
  var name: add_test
  
  var testName: TestName2
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Concurrent {
  
  inline def apply(asyncError: js.Error, concurrent: Boolean, failing: Boolean, fn: TestFn2, testName: TestName2): Concurrent = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], concurrent = concurrent.asInstanceOf[js.Any], failing = failing.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], name = "add_test", testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concurrent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Concurrent] (val x: Self) extends AnyVal {
    
    inline def setAsyncError(value: js.Error): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    inline def setConcurrent(value: Boolean): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
    
    inline def setFailing(value: Boolean): Self = StObject.set(x, "failing", value.asInstanceOf[js.Any])
    
    inline def setFn(value: TestFn2): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setMode(value: TestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: add_test): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTestName(value: TestName2): Self = StObject.set(x, "testName", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
