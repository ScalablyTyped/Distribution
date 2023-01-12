package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.test_skip
import typings.jestTypes.mod.AsyncEvent
import typings.jestTypes.mod.TestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with AsyncEvent {
  
  var name: test_skip
  
  var test: TestEntry
}
object `1` {
  
  inline def apply(test: TestEntry): `1` = {
    val __obj = js.Dynamic.literal(name = "test_skip", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setName(value: test_skip): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
