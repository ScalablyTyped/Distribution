package typings.jestTypes.circusMod

import typings.jestTypes.jestTypesStrings.hook_failure
import typings.jestTypes.jestTypesStrings.hook_start
import typings.jestTypes.jestTypesStrings.hook_success
import typings.jestTypes.jestTypesStrings.include_test_location_in_result
import typings.jestTypes.jestTypesStrings.run_describe_finish
import typings.jestTypes.jestTypesStrings.run_describe_start
import typings.jestTypes.jestTypesStrings.run_finish
import typings.jestTypes.jestTypesStrings.run_start
import typings.jestTypes.jestTypesStrings.setup
import typings.jestTypes.jestTypesStrings.teardown
import typings.jestTypes.jestTypesStrings.test_done
import typings.jestTypes.jestTypesStrings.test_fn_failure
import typings.jestTypes.jestTypesStrings.test_fn_start
import typings.jestTypes.jestTypesStrings.test_fn_success
import typings.jestTypes.jestTypesStrings.test_retry
import typings.jestTypes.jestTypesStrings.test_skip
import typings.jestTypes.jestTypesStrings.test_start
import typings.jestTypes.jestTypesStrings.test_todo
import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait AsyncEvent extends Event
object AsyncEvent {
  
  @scala.inline
  def Hook(hook: typings.jestTypes.circusMod.Hook, name: hook_start): AsyncEvent = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def DescribeBlockDescribeBlock(describeBlock: DescribeBlock, name: run_describe_finish): AsyncEvent = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `5`(name: run_start): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def ErrorName(error: Exception, name: test_fn_failure, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def TestTestEntry(name: test_fn_success, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def Test(error: String | Exception, hook: Hook, name: hook_failure): AsyncEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `0`(name: include_test_location_in_result): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def DescribeBlock(hook: Hook, name: hook_success): AsyncEvent = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `4`(name: test_done, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def NameTest(name: test_fn_start, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `6`(name: run_finish): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def DescribeBlockName(describeBlock: DescribeBlock, name: run_describe_start): AsyncEvent = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `3`(name: test_todo, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `1`(name: test_start, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def NameTestTestEntry(name: test_retry, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `7`(name: teardown): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def `2`(name: test_skip, test: TestEntry): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def Name(name: setup, parentProcess: Process, runtimeGlobals: JestGlobals): AsyncEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any], runtimeGlobals = runtimeGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
}
