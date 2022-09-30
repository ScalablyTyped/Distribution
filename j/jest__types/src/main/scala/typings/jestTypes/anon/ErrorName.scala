package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.test_fn_failure
import typings.jestTypes.mod.AsyncEvent
import typings.jestTypes.mod.Exception
import typings.jestTypes.mod.TestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorName
  extends StObject
     with AsyncEvent {
  
  var error: Exception
  
  var name: test_fn_failure
  
  var test: TestEntry
}
object ErrorName {
  
  inline def apply(error: Exception, test: TestEntry): ErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "test_fn_failure", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorName]
  }
  
  extension [Self <: ErrorName](x: Self) {
    
    inline def setError(value: Exception): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setName(value: test_fn_failure): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
