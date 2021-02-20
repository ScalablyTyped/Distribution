package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestTestEntry extends AsyncEvent {
  
  var name: test_fn_success = js.native
  
  var test: TestEntry = js.native
}
object TestTestEntry {
  
  @scala.inline
  def apply(name: test_fn_success, test: TestEntry): TestTestEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
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
