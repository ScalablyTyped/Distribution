package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.test_start
import typings.jestTypes.mod.AsyncEvent
import typings.jestTypes.mod.TestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameTestTestEntry
  extends StObject
     with AsyncEvent {
  
  var name: test_start
  
  var test: TestEntry
}
object NameTestTestEntry {
  
  inline def apply(test: TestEntry): NameTestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTestTestEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameTestTestEntry] (val x: Self) extends AnyVal {
    
    inline def setName(value: test_start): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
