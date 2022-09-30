package typings.jestTypes

import typings.jestTypes.mod.CoverageProvider
import typings.jestTypes.mod.CoverageReporterName
import typings.jestTypes.mod.FakeableAPI
import typings.jestTypes.mod.HookType
import typings.jestTypes.mod.NotifyMode
import typings.jestTypes.mod.SharedHookType
import typings.jestTypes.mod.SnapshotUpdateState
import typings.jestTypes.mod.Status
import typings.jestTypes.mod.TestStatus
import typings.jestTypes.mod._BlockMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestTypesStrings {
  
  @js.native
  sealed trait Date
    extends StObject
       with FakeableAPI
  inline def Date: Date = "Date".asInstanceOf[Date]
  
  @js.native
  sealed trait add_hook extends StObject
  inline def add_hook: add_hook = "add_hook".asInstanceOf[add_hook]
  
  @js.native
  sealed trait add_test extends StObject
  inline def add_test: add_test = "add_test".asInstanceOf[add_test]
  
  @js.native
  sealed trait afterAll
    extends StObject
       with HookType
       with SharedHookType
  inline def afterAll: afterAll = "afterAll".asInstanceOf[afterAll]
  
  @js.native
  sealed trait afterEach
    extends StObject
       with HookType
  inline def afterEach: afterEach = "afterEach".asInstanceOf[afterEach]
  
  @js.native
  sealed trait all
    extends StObject
       with SnapshotUpdateState
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait always
    extends StObject
       with NotifyMode
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait babel
    extends StObject
       with CoverageProvider
  inline def babel: babel = "babel".asInstanceOf[babel]
  
  @js.native
  sealed trait beforeAll
    extends StObject
       with HookType
       with SharedHookType
  inline def beforeAll: beforeAll = "beforeAll".asInstanceOf[beforeAll]
  
  @js.native
  sealed trait beforeEach
    extends StObject
       with HookType
  inline def beforeEach: beforeEach = "beforeEach".asInstanceOf[beforeEach]
  
  @js.native
  sealed trait cancelAnimationFrame
    extends StObject
       with FakeableAPI
  inline def cancelAnimationFrame: cancelAnimationFrame = "cancelAnimationFrame".asInstanceOf[cancelAnimationFrame]
  
  @js.native
  sealed trait cancelIdleCallback
    extends StObject
       with FakeableAPI
  inline def cancelIdleCallback: cancelIdleCallback = "cancelIdleCallback".asInstanceOf[cancelIdleCallback]
  
  @js.native
  sealed trait change
    extends StObject
       with NotifyMode
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait clearImmediate
    extends StObject
       with FakeableAPI
  inline def clearImmediate: clearImmediate = "clearImmediate".asInstanceOf[clearImmediate]
  
  @js.native
  sealed trait clearInterval
    extends StObject
       with FakeableAPI
  inline def clearInterval: clearInterval = "clearInterval".asInstanceOf[clearInterval]
  
  @js.native
  sealed trait clearTimeout
    extends StObject
       with FakeableAPI
  inline def clearTimeout: clearTimeout = "clearTimeout".asInstanceOf[clearTimeout]
  
  @js.native
  sealed trait clover
    extends StObject
       with CoverageReporterName
  inline def clover: clover = "clover".asInstanceOf[clover]
  
  @js.native
  sealed trait cobertura
    extends StObject
       with CoverageReporterName
  inline def cobertura: cobertura = "cobertura".asInstanceOf[cobertura]
  
  @js.native
  sealed trait describeBlock extends StObject
  inline def describeBlock: describeBlock = "describeBlock".asInstanceOf[describeBlock]
  
  @js.native
  sealed trait disabled
    extends StObject
       with Status
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait done
    extends StObject
       with TestStatus
  inline def done: done = "done".asInstanceOf[done]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait failed
    extends StObject
       with Status
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait failure
    extends StObject
       with NotifyMode
  inline def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait `failure-change`
    extends StObject
       with NotifyMode
  inline def `failure-change`: `failure-change` = "failure-change".asInstanceOf[`failure-change`]
  
  @js.native
  sealed trait finish_describe_definition extends StObject
  inline def finish_describe_definition: finish_describe_definition = "finish_describe_definition".asInstanceOf[finish_describe_definition]
  
  @js.native
  sealed trait hook_failure extends StObject
  inline def hook_failure: hook_failure = "hook_failure".asInstanceOf[hook_failure]
  
  @js.native
  sealed trait hook_start extends StObject
  inline def hook_start: hook_start = "hook_start".asInstanceOf[hook_start]
  
  @js.native
  sealed trait hook_success extends StObject
  inline def hook_success: hook_success = "hook_success".asInstanceOf[hook_success]
  
  @js.native
  sealed trait hrtime
    extends StObject
       with FakeableAPI
  inline def hrtime: hrtime = "hrtime".asInstanceOf[hrtime]
  
  @js.native
  sealed trait html
    extends StObject
       with CoverageReporterName
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait `html-spa`
    extends StObject
       with CoverageReporterName
  inline def `html-spa`: `html-spa` = "html-spa".asInstanceOf[`html-spa`]
  
  @js.native
  sealed trait include_test_location_in_result extends StObject
  inline def include_test_location_in_result: include_test_location_in_result = "include_test_location_in_result".asInstanceOf[include_test_location_in_result]
  
  @js.native
  sealed trait json
    extends StObject
       with CoverageReporterName
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait `json-summary`
    extends StObject
       with CoverageReporterName
  inline def `json-summary`: `json-summary` = "json-summary".asInstanceOf[`json-summary`]
  
  @js.native
  sealed trait lcov
    extends StObject
       with CoverageReporterName
  inline def lcov: lcov = "lcov".asInstanceOf[lcov]
  
  @js.native
  sealed trait lcovonly
    extends StObject
       with CoverageReporterName
  inline def lcovonly: lcovonly = "lcovonly".asInstanceOf[lcovonly]
  
  @js.native
  sealed trait `new`
    extends StObject
       with SnapshotUpdateState
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait nextTick
    extends StObject
       with FakeableAPI
  inline def nextTick: nextTick = "nextTick".asInstanceOf[nextTick]
  
  @js.native
  sealed trait none
    extends StObject
       with SnapshotUpdateState
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait only
    extends StObject
       with _BlockMode
  inline def only: only = "only".asInstanceOf[only]
  
  @js.native
  sealed trait passed
    extends StObject
       with Status
  inline def passed: passed = "passed".asInstanceOf[passed]
  
  @js.native
  sealed trait pending
    extends StObject
       with Status
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait performance
    extends StObject
       with FakeableAPI
  inline def performance: performance = "performance".asInstanceOf[performance]
  
  @js.native
  sealed trait queueMicrotask
    extends StObject
       with FakeableAPI
  inline def queueMicrotask: queueMicrotask = "queueMicrotask".asInstanceOf[queueMicrotask]
  
  @js.native
  sealed trait requestAnimationFrame
    extends StObject
       with FakeableAPI
  inline def requestAnimationFrame: requestAnimationFrame = "requestAnimationFrame".asInstanceOf[requestAnimationFrame]
  
  @js.native
  sealed trait requestIdleCallback
    extends StObject
       with FakeableAPI
  inline def requestIdleCallback: requestIdleCallback = "requestIdleCallback".asInstanceOf[requestIdleCallback]
  
  @js.native
  sealed trait run_describe_finish extends StObject
  inline def run_describe_finish: run_describe_finish = "run_describe_finish".asInstanceOf[run_describe_finish]
  
  @js.native
  sealed trait run_describe_start extends StObject
  inline def run_describe_start: run_describe_start = "run_describe_start".asInstanceOf[run_describe_start]
  
  @js.native
  sealed trait run_finish extends StObject
  inline def run_finish: run_finish = "run_finish".asInstanceOf[run_finish]
  
  @js.native
  sealed trait run_start extends StObject
  inline def run_start: run_start = "run_start".asInstanceOf[run_start]
  
  @js.native
  sealed trait setImmediate
    extends StObject
       with FakeableAPI
  inline def setImmediate: setImmediate = "setImmediate".asInstanceOf[setImmediate]
  
  @js.native
  sealed trait setInterval
    extends StObject
       with FakeableAPI
  inline def setInterval: setInterval = "setInterval".asInstanceOf[setInterval]
  
  @js.native
  sealed trait setTimeout
    extends StObject
       with FakeableAPI
  inline def setTimeout: setTimeout = "setTimeout".asInstanceOf[setTimeout]
  
  @js.native
  sealed trait setup extends StObject
  inline def setup: setup = "setup".asInstanceOf[setup]
  
  @js.native
  sealed trait skip
    extends StObject
       with TestStatus
       with _BlockMode
  inline def skip: skip = "skip".asInstanceOf[skip]
  
  @js.native
  sealed trait skipped
    extends StObject
       with Status
  inline def skipped: skipped = "skipped".asInstanceOf[skipped]
  
  @js.native
  sealed trait start_describe_definition extends StObject
  inline def start_describe_definition: start_describe_definition = "start_describe_definition".asInstanceOf[start_describe_definition]
  
  @js.native
  sealed trait success
    extends StObject
       with NotifyMode
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait `success-change`
    extends StObject
       with NotifyMode
  inline def `success-change`: `success-change` = "success-change".asInstanceOf[`success-change`]
  
  @js.native
  sealed trait teamcity
    extends StObject
       with CoverageReporterName
  inline def teamcity: teamcity = "teamcity".asInstanceOf[teamcity]
  
  @js.native
  sealed trait teardown extends StObject
  inline def teardown: teardown = "teardown".asInstanceOf[teardown]
  
  @js.native
  sealed trait test extends StObject
  inline def test: test = "test".asInstanceOf[test]
  
  @js.native
  sealed trait test_done extends StObject
  inline def test_done: test_done = "test_done".asInstanceOf[test_done]
  
  @js.native
  sealed trait test_fn_failure extends StObject
  inline def test_fn_failure: test_fn_failure = "test_fn_failure".asInstanceOf[test_fn_failure]
  
  @js.native
  sealed trait test_fn_start extends StObject
  inline def test_fn_start: test_fn_start = "test_fn_start".asInstanceOf[test_fn_start]
  
  @js.native
  sealed trait test_fn_success extends StObject
  inline def test_fn_success: test_fn_success = "test_fn_success".asInstanceOf[test_fn_success]
  
  @js.native
  sealed trait test_retry extends StObject
  inline def test_retry: test_retry = "test_retry".asInstanceOf[test_retry]
  
  @js.native
  sealed trait test_skip extends StObject
  inline def test_skip: test_skip = "test_skip".asInstanceOf[test_skip]
  
  @js.native
  sealed trait test_start extends StObject
  inline def test_start: test_start = "test_start".asInstanceOf[test_start]
  
  @js.native
  sealed trait test_todo extends StObject
  inline def test_todo: test_todo = "test_todo".asInstanceOf[test_todo]
  
  @js.native
  sealed trait text
    extends StObject
       with CoverageReporterName
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `text-lcov`
    extends StObject
       with CoverageReporterName
  inline def `text-lcov`: `text-lcov` = "text-lcov".asInstanceOf[`text-lcov`]
  
  @js.native
  sealed trait `text-summary`
    extends StObject
       with CoverageReporterName
  inline def `text-summary`: `text-summary` = "text-summary".asInstanceOf[`text-summary`]
  
  @js.native
  sealed trait todo
    extends StObject
       with Status
       with TestStatus
       with _BlockMode
  inline def todo: todo = "todo".asInstanceOf[todo]
  
  @js.native
  sealed trait v8
    extends StObject
       with CoverageProvider
  inline def v8: v8 = "v8".asInstanceOf[v8]
}
