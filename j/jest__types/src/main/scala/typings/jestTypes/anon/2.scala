package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.test_todo
import typings.jestTypes.mod.AsyncEvent
import typings.jestTypes.mod.TestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with AsyncEvent {
  
  var name: test_todo
  
  var test: TestEntry
}
object `2` {
  
  inline def apply(test: TestEntry): `2` = {
    val __obj = js.Dynamic.literal(name = "test_todo", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setName(value: test_todo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
