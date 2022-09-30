package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.hook_failure
import typings.jestTypes.mod.AsyncEvent
import typings.jestTypes.mod.Exception
import typings.jestTypes.mod.TestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with AsyncEvent {
  
  var describeBlock: js.UndefOr[typings.jestTypes.mod.DescribeBlock] = js.undefined
  
  var error: String | Exception
  
  var hook: typings.jestTypes.mod.Hook
  
  var name: hook_failure
  
  var test: js.UndefOr[TestEntry] = js.undefined
}
object Error {
  
  inline def apply(error: String | Exception, hook: typings.jestTypes.mod.Hook): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = "hook_failure")
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setDescribeBlock(value: typings.jestTypes.mod.DescribeBlock): Self = StObject.set(x, "describeBlock", value.asInstanceOf[js.Any])
    
    inline def setDescribeBlockUndefined: Self = StObject.set(x, "describeBlock", js.undefined)
    
    inline def setError(value: String | Exception): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setHook(value: typings.jestTypes.mod.Hook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setName(value: hook_failure): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
