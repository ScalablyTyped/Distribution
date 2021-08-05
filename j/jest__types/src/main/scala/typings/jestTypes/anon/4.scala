package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_done
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`
  extends StObject
     with AsyncEvent {
  
  var name: test_done
  
  var test: TestEntry
}
object `4` {
  
  inline def apply(test: TestEntry): `4` = {
    val __obj = js.Dynamic.literal(name = "test_done", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setName(value: test_done): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
