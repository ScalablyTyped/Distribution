package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.Exception
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_failure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorName extends AsyncEvent {
  
  var error: Exception = js.native
  
  var name: test_fn_failure = js.native
  
  var test: TestEntry = js.native
}
object ErrorName {
  
  @scala.inline
  def apply(error: Exception, name: test_fn_failure, test: TestEntry): ErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorName]
  }
  
  @scala.inline
  implicit class ErrorNameMutableBuilder[Self <: ErrorName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Exception): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: test_fn_failure): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
