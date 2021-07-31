package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with AsyncEvent {
  
  var name: test_skip
  
  var test: TestEntry
}
object `2` {
  
  @scala.inline
  def apply(test: TestEntry): `2` = {
    val __obj = js.Dynamic.literal(name = "test_skip", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: test_skip): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
