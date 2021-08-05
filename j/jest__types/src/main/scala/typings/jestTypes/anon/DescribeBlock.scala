package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.circusMod.TestEntry
import typings.jestTypes.jestTypesStrings.hook_success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBlock
  extends StObject
     with AsyncEvent {
  
  var describeBlock: js.UndefOr[typings.jestTypes.circusMod.DescribeBlock] = js.undefined
  
  var hook: typings.jestTypes.circusMod.Hook
  
  var name: hook_success
  
  var test: js.UndefOr[TestEntry] = js.undefined
}
object DescribeBlock {
  
  inline def apply(hook: typings.jestTypes.circusMod.Hook): DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_success")
    __obj.asInstanceOf[DescribeBlock]
  }
  
  extension [Self <: DescribeBlock](x: Self) {
    
    inline def setDescribeBlock(value: typings.jestTypes.circusMod.DescribeBlock): Self = StObject.set(x, "describeBlock", value.asInstanceOf[js.Any])
    
    inline def setDescribeBlockUndefined: Self = StObject.set(x, "describeBlock", js.undefined)
    
    inline def setHook(value: typings.jestTypes.circusMod.Hook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setName(value: hook_success): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
