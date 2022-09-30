package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jestTypes.mod.SyncEvent
  - typings.jestTypes.mod.AsyncEvent
*/
trait Event2 extends StObject
object Event2 {
  
  inline def `0`(): typings.jestTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(name = "include_test_location_in_result")
    __obj.asInstanceOf[typings.jestTypes.anon.`0`]
  }
  
  inline def `1`(test: TestEntry): typings.jestTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(name = "test_skip", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`1`]
  }
  
  inline def `2`(test: TestEntry): typings.jestTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(name = "test_todo", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`2`]
  }
  
  inline def `3`(test: TestEntry): typings.jestTypes.anon.`3` = {
    val __obj = js.Dynamic.literal(name = "test_done", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`3`]
  }
  
  inline def `4`(): typings.jestTypes.anon.`4` = {
    val __obj = js.Dynamic.literal(name = "run_start")
    __obj.asInstanceOf[typings.jestTypes.anon.`4`]
  }
  
  inline def `5`(): typings.jestTypes.anon.`5` = {
    val __obj = js.Dynamic.literal(name = "run_finish")
    __obj.asInstanceOf[typings.jestTypes.anon.`5`]
  }
  
  inline def `6`(): typings.jestTypes.anon.`6` = {
    val __obj = js.Dynamic.literal(name = "teardown")
    __obj.asInstanceOf[typings.jestTypes.anon.`6`]
  }
  
  inline def AsyncError(asyncError: js.Error, blockName: BlockName2, mode: BlockMode): typings.jestTypes.anon.AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "start_describe_definition")
    __obj.asInstanceOf[typings.jestTypes.anon.AsyncError]
  }
  
  inline def BlockName(blockName: BlockName2, mode: BlockMode): typings.jestTypes.anon.BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "finish_describe_definition")
    __obj.asInstanceOf[typings.jestTypes.anon.BlockName]
  }
  
  inline def Concurrent(asyncError: js.Error, concurrent: Boolean, failing: Boolean, fn: TestFn2, testName: TestName2): typings.jestTypes.anon.Concurrent = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], concurrent = concurrent.asInstanceOf[js.Any], failing = failing.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], name = "add_test", testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.Concurrent]
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
  
  inline def Error(error: String | Exception, hook: Hook): typings.jestTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = "hook_failure")
    __obj.asInstanceOf[typings.jestTypes.anon.Error]
  }
  
  inline def ErrorException(error: Exception): typings.jestTypes.anon.ErrorException = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "error")
    __obj.asInstanceOf[typings.jestTypes.anon.ErrorException]
  }
  
  inline def ErrorName(error: Exception, test: TestEntry): typings.jestTypes.anon.ErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "test_fn_failure", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.ErrorName]
  }
  
  inline def Fn(asyncError: js.Error, fn: HookFn2, hookType: HookType): typings.jestTypes.anon.Fn = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], hookType = hookType.asInstanceOf[js.Any], name = "add_hook")
    __obj.asInstanceOf[typings.jestTypes.anon.Fn]
  }
  
  inline def Hook(hook: typings.jestTypes.mod.Hook): typings.jestTypes.anon.Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_start")
    __obj.asInstanceOf[typings.jestTypes.anon.Hook]
  }
  
  inline def Name(parentProcess: Process, runtimeGlobals: JestGlobals): typings.jestTypes.anon.Name = {
    val __obj = js.Dynamic.literal(name = "setup", parentProcess = parentProcess.asInstanceOf[js.Any], runtimeGlobals = runtimeGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.Name]
  }
  
  inline def NameTest(test: TestEntry): typings.jestTypes.anon.NameTest = {
    val __obj = js.Dynamic.literal(name = "test_fn_success", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.NameTest]
  }
  
  inline def NameTestTestEntry(test: TestEntry): typings.jestTypes.anon.NameTestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.NameTestTestEntry]
  }
  
  inline def Test(test: TestEntry): typings.jestTypes.anon.Test = {
    val __obj = js.Dynamic.literal(name = "test_fn_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.Test]
  }
  
  inline def TestTestEntry(test: TestEntry): typings.jestTypes.anon.TestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_retry", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.TestTestEntry]
  }
}
