package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_retry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameTestTestEntry
  extends StObject
     with AsyncEvent {
  
  var name: test_retry
  
  var test: TestEntry
}
object NameTestTestEntry {
  
  inline def apply(test: TestEntry): NameTestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_retry", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTestTestEntry]
  }
  
  extension [Self <: NameTestTestEntry](x: Self) {
    
    inline def setName(value: test_retry): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
