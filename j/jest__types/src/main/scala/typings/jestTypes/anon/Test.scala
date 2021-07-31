package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.Exception
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.hook_failure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Test
  extends StObject
     with AsyncEvent {
  
  var describeBlock: js.UndefOr[typings.jestTypes.circusMod.DescribeBlock] = js.undefined
  
  var error: String | Exception
  
  var hook: typings.jestTypes.circusMod.Hook
  
  var name: hook_failure
  
  var test: js.UndefOr[TestEntry] = js.undefined
}
object Test {
  
  @scala.inline
  def apply(error: String | Exception, hook: typings.jestTypes.circusMod.Hook): Test = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = "hook_failure")
    __obj.asInstanceOf[Test]
  }
  
  @scala.inline
  implicit class TestMutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribeBlock(value: typings.jestTypes.circusMod.DescribeBlock): Self = StObject.set(x, "describeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribeBlockUndefined: Self = StObject.set(x, "describeBlock", js.undefined)
    
    @scala.inline
    def setError(value: String | Exception): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHook(value: typings.jestTypes.circusMod.Hook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: hook_failure): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
