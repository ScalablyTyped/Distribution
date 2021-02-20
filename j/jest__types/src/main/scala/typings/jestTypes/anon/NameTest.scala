package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.test_fn_start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameTest extends AsyncEvent {
  
  var name: test_fn_start = js.native
  
  var test: TestEntry = js.native
}
object NameTest {
  
  @scala.inline
  def apply(name: test_fn_start, test: TestEntry): NameTest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameTest]
  }
  
  @scala.inline
  implicit class NameTestMutableBuilder[Self <: NameTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: test_fn_start): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
