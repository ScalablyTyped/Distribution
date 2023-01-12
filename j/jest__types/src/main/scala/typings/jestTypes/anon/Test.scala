package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.test_fn_start
import typings.jestTypes.mod.AsyncEvent
import typings.jestTypes.mod.TestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Test
  extends StObject
     with AsyncEvent {
  
  var name: test_fn_start
  
  var test: TestEntry
}
object Test {
  
  inline def apply(test: TestEntry): Test = {
    val __obj = js.Dynamic.literal(name = "test_fn_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Test]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
    
    inline def setName(value: test_fn_start): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
