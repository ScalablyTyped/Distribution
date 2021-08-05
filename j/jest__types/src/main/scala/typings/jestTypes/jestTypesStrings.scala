package typings.jestTypes

import typings.jestTypes.circusMod.HookType
import typings.jestTypes.circusMod.SharedHookType
import typings.jestTypes.circusMod.TestStatus
import typings.jestTypes.circusMod._BlockMode
import typings.jestTypes.configMod.CoverageProvider
import typings.jestTypes.configMod.CoverageReporterName
import typings.jestTypes.configMod.NotifyMode
import typings.jestTypes.configMod.SnapshotUpdateState
import typings.jestTypes.configMod.Timers
import typings.jestTypes.testResultMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestTypesStrings {
  
  @js.native
  sealed trait Array extends StObject
  inline def Array: Array = "Array".asInstanceOf[Array]
  
  @js.native
  sealed trait ArrayBuffer extends StObject
  inline def ArrayBuffer: ArrayBuffer = "ArrayBuffer".asInstanceOf[ArrayBuffer]
  
  @js.native
  sealed trait Boolean extends StObject
  inline def Boolean: Boolean = "Boolean".asInstanceOf[Boolean]
  
  @js.native
  sealed trait Buffer extends StObject
  inline def Buffer: Buffer = "Buffer".asInstanceOf[Buffer]
  
  @js.native
  sealed trait DataView extends StObject
  inline def DataView: DataView = "DataView".asInstanceOf[DataView]
  
  @js.native
  sealed trait Date extends StObject
  inline def Date: Date = "Date".asInstanceOf[Date]
  
  @js.native
  sealed trait Error extends StObject
  inline def Error: Error = "Error".asInstanceOf[Error]
  
  @js.native
  sealed trait EvalError extends StObject
  inline def EvalError: EvalError = "EvalError".asInstanceOf[EvalError]
  
  @js.native
  sealed trait Float32Array extends StObject
  inline def Float32Array: Float32Array = "Float32Array".asInstanceOf[Float32Array]
  
  @js.native
  sealed trait Float64Array extends StObject
  inline def Float64Array: Float64Array = "Float64Array".asInstanceOf[Float64Array]
  
  @js.native
  sealed trait Function extends StObject
  inline def Function: Function = "Function".asInstanceOf[Function]
  
  @js.native
  sealed trait Infinity extends StObject
  inline def Infinity: Infinity = "Infinity".asInstanceOf[Infinity]
  
  @js.native
  sealed trait Int16Array extends StObject
  inline def Int16Array: Int16Array = "Int16Array".asInstanceOf[Int16Array]
  
  @js.native
  sealed trait Int32Array extends StObject
  inline def Int32Array: Int32Array = "Int32Array".asInstanceOf[Int32Array]
  
  @js.native
  sealed trait Int8Array extends StObject
  inline def Int8Array: Int8Array = "Int8Array".asInstanceOf[Int8Array]
  
  @js.native
  sealed trait Intl extends StObject
  inline def Intl: Intl = "Intl".asInstanceOf[Intl]
  
  @js.native
  sealed trait JSON extends StObject
  inline def JSON: JSON = "JSON".asInstanceOf[JSON]
  
  @js.native
  sealed trait Map extends StObject
  inline def Map: Map = "Map".asInstanceOf[Map]
  
  @js.native
  sealed trait Math extends StObject
  inline def Math: Math = "Math".asInstanceOf[Math]
  
  @js.native
  sealed trait NaN extends StObject
  inline def NaN: NaN = "NaN".asInstanceOf[NaN]
  
  @js.native
  sealed trait Number extends StObject
  inline def Number: Number = "Number".asInstanceOf[Number]
  
  @js.native
  sealed trait Object extends StObject
  inline def Object: Object = "Object".asInstanceOf[Object]
  
  @js.native
  sealed trait Promise extends StObject
  inline def Promise: Promise = "Promise".asInstanceOf[Promise]
  
  @js.native
  sealed trait RangeError extends StObject
  inline def RangeError: RangeError = "RangeError".asInstanceOf[RangeError]
  
  @js.native
  sealed trait ReferenceError extends StObject
  inline def ReferenceError: ReferenceError = "ReferenceError".asInstanceOf[ReferenceError]
  
  @js.native
  sealed trait RegExp extends StObject
  inline def RegExp: RegExp = "RegExp".asInstanceOf[RegExp]
  
  @js.native
  sealed trait Set extends StObject
  inline def Set: Set = "Set".asInstanceOf[Set]
  
  @js.native
  sealed trait String extends StObject
  inline def String: String = "String".asInstanceOf[String]
  
  @js.native
  sealed trait Symbol extends StObject
  inline def Symbol: Symbol = "Symbol".asInstanceOf[Symbol]
  
  @js.native
  sealed trait SyntaxError extends StObject
  inline def SyntaxError: SyntaxError = "SyntaxError".asInstanceOf[SyntaxError]
  
  @js.native
  sealed trait TypeError extends StObject
  inline def TypeError: TypeError = "TypeError".asInstanceOf[TypeError]
  
  @js.native
  sealed trait URIError extends StObject
  inline def URIError: URIError = "URIError".asInstanceOf[URIError]
  
  @js.native
  sealed trait Uint16Array extends StObject
  inline def Uint16Array: Uint16Array = "Uint16Array".asInstanceOf[Uint16Array]
  
  @js.native
  sealed trait Uint32Array extends StObject
  inline def Uint32Array: Uint32Array = "Uint32Array".asInstanceOf[Uint32Array]
  
  @js.native
  sealed trait Uint8Array extends StObject
  inline def Uint8Array: Uint8Array = "Uint8Array".asInstanceOf[Uint8Array]
  
  @js.native
  sealed trait Uint8ClampedArray extends StObject
  inline def Uint8ClampedArray: Uint8ClampedArray = "Uint8ClampedArray".asInstanceOf[Uint8ClampedArray]
  
  @js.native
  sealed trait WeakMap extends StObject
  inline def WeakMap: WeakMap = "WeakMap".asInstanceOf[WeakMap]
  
  @js.native
  sealed trait WeakSet extends StObject
  inline def WeakSet: WeakSet = "WeakSet".asInstanceOf[WeakSet]
  
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
  sealed trait change
    extends StObject
       with NotifyMode
  inline def change: change = "change".asInstanceOf[change]
  
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
  sealed trait decodeURI extends StObject
  inline def decodeURI: decodeURI = "decodeURI".asInstanceOf[decodeURI]
  
  @js.native
  sealed trait decodeURIComponent extends StObject
  inline def decodeURIComponent: decodeURIComponent = "decodeURIComponent".asInstanceOf[decodeURIComponent]
  
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
  sealed trait encodeURI extends StObject
  inline def encodeURI: encodeURI = "encodeURI".asInstanceOf[encodeURI]
  
  @js.native
  sealed trait encodeURIComponent extends StObject
  inline def encodeURIComponent: encodeURIComponent = "encodeURIComponent".asInstanceOf[encodeURIComponent]
  
  @js.native
  sealed trait error_ extends StObject
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait eval extends StObject
  inline def eval: eval = "eval".asInstanceOf[eval]
  
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
  sealed trait fake
    extends StObject
       with Timers
  inline def fake: fake = "fake".asInstanceOf[fake]
  
  @js.native
  sealed trait finish_describe_definition extends StObject
  inline def finish_describe_definition: finish_describe_definition = "finish_describe_definition".asInstanceOf[finish_describe_definition]
  
  @js.native
  sealed trait global extends StObject
  inline def global: global = "global".asInstanceOf[global]
  
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
  sealed trait isFinite extends StObject
  inline def isFinite: isFinite = "isFinite".asInstanceOf[isFinite]
  
  @js.native
  sealed trait isNaN extends StObject
  inline def isNaN: isNaN = "isNaN".asInstanceOf[isNaN]
  
  @js.native
  sealed trait `jest-runner` extends StObject
  inline def `jest-runner`: `jest-runner` = "jest-runner".asInstanceOf[`jest-runner`]
  
  @js.native
  sealed trait `json-summary`
    extends StObject
       with CoverageReporterName
  inline def `json-summary`: `json-summary` = "json-summary".asInstanceOf[`json-summary`]
  
  @js.native
  sealed trait json_
    extends StObject
       with CoverageReporterName
  inline def json_ : json_ = "json".asInstanceOf[json_]
  
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
  sealed trait legacy
    extends StObject
       with Timers
  inline def legacy: legacy = "legacy".asInstanceOf[legacy]
  
  @js.native
  sealed trait modern
    extends StObject
       with Timers
  inline def modern: modern = "modern".asInstanceOf[modern]
  
  @js.native
  sealed trait `new`
    extends StObject
       with SnapshotUpdateState
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
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
  sealed trait parseFloat extends StObject
  inline def parseFloat: parseFloat = "parseFloat".asInstanceOf[parseFloat]
  
  @js.native
  sealed trait parseInt extends StObject
  inline def parseInt: parseInt = "parseInt".asInstanceOf[parseInt]
  
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
  sealed trait queueMicrotask extends StObject
  inline def queueMicrotask: queueMicrotask = "queueMicrotask".asInstanceOf[queueMicrotask]
  
  @js.native
  sealed trait real
    extends StObject
       with Timers
  inline def real: real = "real".asInstanceOf[real]
  
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
  sealed trait undefined extends StObject
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait v8
    extends StObject
       with CoverageProvider
  inline def v8: v8 = "v8".asInstanceOf[v8]
  
  @js.native
  sealed trait v8debug extends StObject
  inline def v8debug: v8debug = "v8debug".asInstanceOf[v8debug]
}
