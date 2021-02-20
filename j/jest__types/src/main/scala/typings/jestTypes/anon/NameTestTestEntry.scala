package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_retry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameTestTestEntry extends AsyncEvent {
  
  var name: test_retry = js.native
  
  var test: TestEntry = js.native
}
object NameTestTestEntry {
  
  @scala.inline
  def apply(name: test_retry, test: TestEntry): NameTestTestEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTestTestEntry]
  }
  
  @scala.inline
  implicit class NameTestTestEntryMutableBuilder[Self <: NameTestTestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: test_retry): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
