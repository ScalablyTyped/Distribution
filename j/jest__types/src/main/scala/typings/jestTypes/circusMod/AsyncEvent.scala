package typings.jestTypes.circusMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jestTypes.anon.Name
  - typings.jestTypes.anon.`0`
  - typings.jestTypes.anon.Hook
  - typings.jestTypes.anon.DescribeBlock
  - typings.jestTypes.anon.Test
  - typings.jestTypes.anon.NameTest
  - typings.jestTypes.anon.TestTestEntry
  - typings.jestTypes.anon.ErrorName
  - typings.jestTypes.anon.NameTestTestEntry
  - typings.jestTypes.anon.`1`
  - typings.jestTypes.anon.`2`
  - typings.jestTypes.anon.`3`
  - typings.jestTypes.anon.`4`
  - typings.jestTypes.anon.DescribeBlockName
  - typings.jestTypes.anon.DescribeBlockDescribeBlock
  - typings.jestTypes.anon.`5`
  - typings.jestTypes.anon.`6`
  - typings.jestTypes.anon.`7`
*/
trait AsyncEvent
  extends StObject
     with Event
object AsyncEvent {
  
  inline def `0`(): typings.jestTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(name = "include_test_location_in_result")
    __obj.asInstanceOf[typings.jestTypes.anon.`0`]
  }
  
  inline def `1`(test: TestEntry): typings.jestTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(name = "test_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`1`]
  }
  
  inline def `2`(test: TestEntry): typings.jestTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(name = "test_skip", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`2`]
  }
  
  inline def `3`(test: TestEntry): typings.jestTypes.anon.`3` = {
    val __obj = js.Dynamic.literal(name = "test_todo", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`3`]
  }
  
  inline def `4`(test: TestEntry): typings.jestTypes.anon.`4` = {
    val __obj = js.Dynamic.literal(name = "test_done", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`4`]
  }
  
  inline def `5`(): typings.jestTypes.anon.`5` = {
    val __obj = js.Dynamic.literal(name = "run_start")
    __obj.asInstanceOf[typings.jestTypes.anon.`5`]
  }
  
  inline def `6`(): typings.jestTypes.anon.`6` = {
    val __obj = js.Dynamic.literal(name = "run_finish")
    __obj.asInstanceOf[typings.jestTypes.anon.`6`]
  }
  
  inline def `7`(): typings.jestTypes.anon.`7` = {
    val __obj = js.Dynamic.literal(name = "teardown")
    __obj.asInstanceOf[typings.jestTypes.anon.`7`]
  }
  
  inline def DescribeBlock(hook: Hook): typings.jestTypes.anon.DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_success")
    __obj.asInstanceOf[typings.jestTypes.anon.DescribeBlock]
  }
  
  inline def DescribeBlockDescribeBlock(describeBlock: DescribeBlock): typings.jestTypes.anon.DescribeBlockDescribeBlock = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = "run_describe_finish")
    __obj.asInstanceOf[typings.jestTypes.anon.DescribeBlockDescribeBlock]
  }
  
  inline def DescribeBlockName(describeBlock: DescribeBlock): typings.jestTypes.anon.DescribeBlockName = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = "run_describe_start")
    __obj.asInstanceOf[typings.jestTypes.anon.DescribeBlockName]
  }
  
  inline def ErrorName(error: Exception, test: TestEntry): typings.jestTypes.anon.ErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "test_fn_failure", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.ErrorName]
  }
  
  inline def Hook(hook: typings.jestTypes.circusMod.Hook): typings.jestTypes.anon.Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_start")
    __obj.asInstanceOf[typings.jestTypes.anon.Hook]
  }
  
  inline def Name(parentProcess: Process, runtimeGlobals: JestGlobals): typings.jestTypes.anon.Name = {
    val __obj = js.Dynamic.literal(name = "setup", parentProcess = parentProcess.asInstanceOf[js.Any], runtimeGlobals = runtimeGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.Name]
  }
  
  inline def NameTest(test: TestEntry): typings.jestTypes.anon.NameTest = {
    val __obj = js.Dynamic.literal(name = "test_fn_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.NameTest]
  }
  
  inline def NameTestTestEntry(test: TestEntry): typings.jestTypes.anon.NameTestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_retry", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.NameTestTestEntry]
  }
  
  inline def Test(error: String | Exception, hook: Hook): typings.jestTypes.anon.Test = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = "hook_failure")
    __obj.asInstanceOf[typings.jestTypes.anon.Test]
  }
  
  inline def TestTestEntry(test: TestEntry): typings.jestTypes.anon.TestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_fn_success", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.TestTestEntry]
  }
}
