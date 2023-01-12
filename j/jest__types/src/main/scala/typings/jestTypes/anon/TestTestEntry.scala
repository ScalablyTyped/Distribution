package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.test_retry
import typings.jestTypes.mod.AsyncEvent
import typings.jestTypes.mod.TestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestTestEntry
  extends StObject
     with AsyncEvent {
  
  var name: test_retry
  
  var test: TestEntry
}
object TestTestEntry {
  
  inline def apply(test: TestEntry): TestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_retry", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestTestEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestTestEntry] (val x: Self) extends AnyVal {
    
    inline def setName(value: test_retry): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
