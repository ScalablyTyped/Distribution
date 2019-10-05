package typings.atJestTypes.buildCircusMod

import typings.atJestTypes.atJestTypesStrings.add_hook
import typings.atJestTypes.atJestTypesStrings.add_test
import typings.atJestTypes.atJestTypesStrings.error
import typings.atJestTypes.atJestTypesStrings.finish_describe_definition
import typings.atJestTypes.atJestTypesStrings.hook_failure
import typings.atJestTypes.atJestTypesStrings.hook_start
import typings.atJestTypes.atJestTypesStrings.hook_success
import typings.atJestTypes.atJestTypesStrings.include_test_location_in_result
import typings.atJestTypes.atJestTypesStrings.run_describe_finish
import typings.atJestTypes.atJestTypesStrings.run_describe_start
import typings.atJestTypes.atJestTypesStrings.run_finish
import typings.atJestTypes.atJestTypesStrings.run_start
import typings.atJestTypes.atJestTypesStrings.setup
import typings.atJestTypes.atJestTypesStrings.start_describe_definition
import typings.atJestTypes.atJestTypesStrings.teardown
import typings.atJestTypes.atJestTypesStrings.test_done
import typings.atJestTypes.atJestTypesStrings.test_fn_failure
import typings.atJestTypes.atJestTypesStrings.test_fn_start
import typings.atJestTypes.atJestTypesStrings.test_fn_success
import typings.atJestTypes.atJestTypesStrings.test_retry
import typings.atJestTypes.atJestTypesStrings.test_skip
import typings.atJestTypes.atJestTypesStrings.test_start
import typings.atJestTypes.atJestTypesStrings.test_todo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var asyncError: js.UndefOr[Error] = js.undefined
  var blockName: js.UndefOr[BlockName] = js.undefined
  var describeBlock: js.UndefOr[DescribeBlock] = js.undefined
  var error: js.UndefOr[Exception | String] = js.undefined
  var fn: js.UndefOr[HookFn | TestFn] = js.undefined
  var hook: js.UndefOr[Hook] = js.undefined
  var hookType: js.UndefOr[HookType] = js.undefined
  var mode: js.UndefOr[BlockMode | TestMode] = js.undefined
  var name: js.UndefOr[
    add_hook | add_test | error | finish_describe_definition | hook_failure | hook_start | hook_success | include_test_location_in_result | run_describe_finish | run_describe_start | run_finish | run_start | setup | start_describe_definition | teardown | test_done | test_fn_failure | test_fn_start | test_fn_success | test_retry | test_skip | test_start | test_todo
  ] = js.undefined
  var parentProcess: js.UndefOr[Process] = js.undefined
  var test: js.UndefOr[TestEntry] = js.undefined
  var testName: js.UndefOr[TestName] = js.undefined
  var testNamePattern: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    asyncError: Error = null,
    blockName: BlockName = null,
    describeBlock: DescribeBlock = null,
    error: String | Exception = null,
    fn: /* done */ js.UndefOr[DoneFn] => js.UndefOr[js.Promise[js.Any] | Null] = null,
    hook: Hook = null,
    hookType: HookType = null,
    mode: BlockMode = null,
    name: include_test_location_in_result = null,
    parentProcess: Process = null,
    test: TestEntry = null,
    testName: TestName = null,
    testNamePattern: String = null,
    timeout: Int | Double = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (asyncError != null) __obj.updateDynamic("asyncError")(asyncError)
    if (blockName != null) __obj.updateDynamic("blockName")(blockName)
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction1(fn))
    if (hook != null) __obj.updateDynamic("hook")(hook)
    if (hookType != null) __obj.updateDynamic("hookType")(hookType)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentProcess != null) __obj.updateDynamic("parentProcess")(parentProcess)
    if (test != null) __obj.updateDynamic("test")(test)
    if (testName != null) __obj.updateDynamic("testName")(testName)
    if (testNamePattern != null) __obj.updateDynamic("testNamePattern")(testNamePattern)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

