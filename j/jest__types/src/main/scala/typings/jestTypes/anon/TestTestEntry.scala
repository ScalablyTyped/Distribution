package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestTestEntry
  extends StObject
     with AsyncEvent {
  
  var name: test_fn_success
  
  var test: TestEntry
}
object TestTestEntry {
  
  @scala.inline
  def apply(test: TestEntry): TestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_fn_success", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestTestEntry]
  }
  
  @scala.inline
  implicit class TestTestEntryMutableBuilder[Self <: TestTestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: test_fn_success): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
