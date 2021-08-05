package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameTest
  extends StObject
     with AsyncEvent {
  
  var name: test_fn_start
  
  var test: TestEntry
}
object NameTest {
  
  inline def apply(test: TestEntry): NameTest = {
    val __obj = js.Dynamic.literal(name = "test_fn_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTest]
  }
  
  extension [Self <: NameTest](x: Self) {
    
    inline def setName(value: test_fn_start): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
