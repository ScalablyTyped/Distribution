package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.hook_success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBlock extends AsyncEvent {
  
  var describeBlock: js.UndefOr[typings.jestTypes.circusMod.DescribeBlock] = js.native
  
  var hook: typings.jestTypes.circusMod.Hook = js.native
  
  var name: hook_success = js.native
  
  var test: js.UndefOr[TestEntry] = js.native
}
object DescribeBlock {
  
  @scala.inline
  def apply(hook: typings.jestTypes.circusMod.Hook, name: hook_success): DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlock]
  }
  
  @scala.inline
  implicit class DescribeBlockMutableBuilder[Self <: DescribeBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribeBlock(value: typings.jestTypes.circusMod.DescribeBlock): Self = StObject.set(x, "describeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribeBlockUndefined: Self = StObject.set(x, "describeBlock", js.undefined)
    
    @scala.inline
    def setHook(value: typings.jestTypes.circusMod.Hook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: hook_success): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
