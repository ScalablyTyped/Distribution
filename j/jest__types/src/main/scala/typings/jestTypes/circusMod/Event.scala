package typings.jestTypes.circusMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jestTypes.circusMod.SyncEvent
  - typings.jestTypes.circusMod.AsyncEvent
*/
trait Event extends StObject
object Event {
  
  @scala.inline
  def `0`(): typings.jestTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(name = "include_test_location_in_result")
    __obj.asInstanceOf[typings.jestTypes.anon.`0`]
  }
  
  @scala.inline
  def `1`(test: TestEntry): typings.jestTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(name = "test_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`1`]
  }
  
  @scala.inline
  def `2`(test: TestEntry): typings.jestTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(name = "test_skip", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`2`]
  }
  
  @scala.inline
  def `3`(test: TestEntry): typings.jestTypes.anon.`3` = {
    val __obj = js.Dynamic.literal(name = "test_todo", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`3`]
  }
  
  @scala.inline
  def `4`(test: TestEntry): typings.jestTypes.anon.`4` = {
    val __obj = js.Dynamic.literal(name = "test_done", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.`4`]
  }
  
  @scala.inline
  def `5`(): typings.jestTypes.anon.`5` = {
    val __obj = js.Dynamic.literal(name = "run_start")
    __obj.asInstanceOf[typings.jestTypes.anon.`5`]
  }
  
  @scala.inline
  def `6`(): typings.jestTypes.anon.`6` = {
    val __obj = js.Dynamic.literal(name = "run_finish")
    __obj.asInstanceOf[typings.jestTypes.anon.`6`]
  }
  
  @scala.inline
  def `7`(): typings.jestTypes.anon.`7` = {
    val __obj = js.Dynamic.literal(name = "teardown")
    __obj.asInstanceOf[typings.jestTypes.anon.`7`]
  }
  
  @scala.inline
  def AsyncError(asyncError: Error, blockName: BlockName, mode: BlockMode): typings.jestTypes.anon.AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "start_describe_definition")
    __obj.asInstanceOf[typings.jestTypes.anon.AsyncError]
  }
  
  @scala.inline
  def BlockName(blockName: typings.jestTypes.circusMod.BlockName, mode: BlockMode): typings.jestTypes.anon.BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "finish_describe_definition")
    __obj.asInstanceOf[typings.jestTypes.anon.BlockName]
  }
  
  @scala.inline
  def DescribeBlock(hook: Hook): typings.jestTypes.anon.DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_success")
    __obj.asInstanceOf[typings.jestTypes.anon.DescribeBlock]
  }
  
  @scala.inline
  def DescribeBlockDescribeBlock(describeBlock: DescribeBlock): typings.jestTypes.anon.DescribeBlockDescribeBlock = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = "run_describe_finish")
    __obj.asInstanceOf[typings.jestTypes.anon.DescribeBlockDescribeBlock]
  }
  
  @scala.inline
  def DescribeBlockName(describeBlock: DescribeBlock): typings.jestTypes.anon.DescribeBlockName = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = "run_describe_start")
    __obj.asInstanceOf[typings.jestTypes.anon.DescribeBlockName]
  }
  
  @scala.inline
  def Error(error: Exception): typings.jestTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "error")
    __obj.asInstanceOf[typings.jestTypes.anon.Error]
  }
  
  @scala.inline
  def ErrorName(error: Exception, test: TestEntry): typings.jestTypes.anon.ErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "test_fn_failure", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.ErrorName]
  }
  
  @scala.inline
  def Fn(
    asyncError: Error,
    fn: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit],
    hookType: HookType
  ): typings.jestTypes.anon.Fn = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), hookType = hookType.asInstanceOf[js.Any], name = "add_hook")
    __obj.asInstanceOf[typings.jestTypes.anon.Fn]
  }
  
  @scala.inline
  def Hook(hook: typings.jestTypes.circusMod.Hook): typings.jestTypes.anon.Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_start")
    __obj.asInstanceOf[typings.jestTypes.anon.Hook]
  }
  
  @scala.inline
  def Mode(
    asyncError: Error,
    fn: /* done */ js.UndefOr[typings.jestTypes.globalMod.DoneFn] => js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit],
    testName: TestName
  ): typings.jestTypes.anon.Mode = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), name = "add_test", testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.Mode]
  }
  
  @scala.inline
  def Name(parentProcess: Process, runtimeGlobals: JestGlobals): typings.jestTypes.anon.Name = {
    val __obj = js.Dynamic.literal(name = "setup", parentProcess = parentProcess.asInstanceOf[js.Any], runtimeGlobals = runtimeGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.Name]
  }
  
  @scala.inline
  def NameTest(test: TestEntry): typings.jestTypes.anon.NameTest = {
    val __obj = js.Dynamic.literal(name = "test_fn_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.NameTest]
  }
  
  @scala.inline
  def NameTestTestEntry(test: TestEntry): typings.jestTypes.anon.NameTestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_retry", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.NameTestTestEntry]
  }
  
  @scala.inline
  def Test(error: String | Exception, hook: Hook): typings.jestTypes.anon.Test = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = "hook_failure")
    __obj.asInstanceOf[typings.jestTypes.anon.Test]
  }
  
  @scala.inline
  def TestTestEntry(test: TestEntry): typings.jestTypes.anon.TestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_fn_success", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jestTypes.anon.TestTestEntry]
  }
}
