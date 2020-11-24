package typings.jestTypes.globalMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import typings.node.NodeJS.Immediate
import typings.node.NodeJS.Timeout
import typings.node.anon.TypeofBuffer
import typings.std.ArrayBufferConstructor
import typings.std.ArrayBufferLike
import typings.std.DataViewConstructor
import typings.std.Error
import typings.std.EvalError
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Iterable
import typings.std.MapConstructor
import typings.std.PromiseConstructor
import typings.std.RangeError
import typings.std.ReferenceError
import typings.std.RegExp
import typings.std.SetConstructor
import typings.std.SyntaxError
import typings.std.TypeError
import typings.std.URIError
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import typings.std.Uint8ClampedArrayConstructor
import typings.std.WeakMapConstructor
import typings.std.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @jest/types.@jest/types/build/Global.GlobalAdditions */
/* Inlined parent std.Omit<node.NodeJS.Global, keyof @jest/types.@jest/types/build/Global.GlobalAdditions> */
@js.native
trait Global
  extends /* extras */ StringDictionary[js.Any] {
  
  def Array(): js.Array[_] = js.native
  
  var ArrayBuffer: ArrayBufferConstructor with (Instantiable1[/* byteLength */ Double, typings.std.global.ArrayBuffer]) = js.native
  
  @JSName("Array")
  var Array_Original: js.Function0[js.Array[_]] = js.native
  
  def Boolean[T](): scala.Boolean = js.native
  @JSName("Boolean")
  var Boolean_Original: js.Function0[Boolean] = js.native
  
  var Buffer: TypeofBuffer = js.native
  
  var DataView: DataViewConstructor with (Instantiable1[/* buffer */ ArrayBufferLike, typings.std.global.DataView]) = js.native
  
  def Date(): String = js.native
  @JSName("Date")
  var Date_Original: js.Function0[String] = js.native
  
  def Error(): typings.std.Error = js.native
  @JSName("Error")
  var Error_Original: js.Function0[Error] = js.native
  
  def EvalError(): typings.std.EvalError = js.native
  @JSName("EvalError")
  var EvalError_Original: js.Function0[EvalError] = js.native
  
  var Float32Array: Float32ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Float32Array]) = js.native
  
  var Float64Array: Float64ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Float64Array]) = js.native
  
  def Function(args: String*): js.Function = js.native
  @JSName("Function")
  var Function_Original: js.Function1[/* repeated */ String, js.Function] = js.native
  
  var Infinity: Double = js.native
  
  var Int16Array: Int16ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Int16Array]) = js.native
  
  var Int32Array: Int32ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Int32Array]) = js.native
  
  var Int8Array: Int8ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Int8Array]) = js.native
  
  var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any = js.native
  
  var JSON: typings.std.JSON = js.native
  
  var Map: MapConstructor = js.native
  
  var Math: typings.std.Math = js.native
  
  var NaN: Double = js.native
  
  def Number(): Double = js.native
  @JSName("Number")
  var Number_Original: js.Function0[Double] = js.native
  
  def Object(): js.Any = js.native
  @JSName("Object")
  var Object_Original: js.Function0[_] = js.native
  
  var Promise: PromiseConstructor with (Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]), 
        Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ], 
    typings.std.global.Promise[js.Object]
  ]) = js.native
  
  def RangeError(): typings.std.RangeError = js.native
  @JSName("RangeError")
  var RangeError_Original: js.Function0[RangeError] = js.native
  
  def ReferenceError(): typings.std.ReferenceError = js.native
  @JSName("ReferenceError")
  var ReferenceError_Original: js.Function0[ReferenceError] = js.native
  
  def RegExp(pattern: typings.std.RegExp): typings.std.RegExp = js.native
  @JSName("RegExp")
  var RegExp_Original: js.Function1[/* pattern */ RegExp, RegExp] = js.native
  
  var Set: SetConstructor = js.native
  
  def String(): java.lang.String = js.native
  @JSName("String")
  var String_Original: js.Function0[String] = js.native
  
  var Symbol: js.Function = js.native
  
  def SyntaxError(): typings.std.SyntaxError = js.native
  @JSName("SyntaxError")
  var SyntaxError_Original: js.Function0[SyntaxError] = js.native
  
  def TypeError(): typings.std.TypeError = js.native
  @JSName("TypeError")
  var TypeError_Original: js.Function0[TypeError] = js.native
  
  def URIError(): typings.std.URIError = js.native
  @JSName("URIError")
  var URIError_Original: js.Function0[URIError] = js.native
  
  var Uint16Array: Uint16ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Uint16Array]) = js.native
  
  var Uint32Array: Uint32ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Uint32Array]) = js.native
  
  var Uint8Array: Uint8ArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Uint8Array]) = js.native
  
  var Uint8ClampedArray: Uint8ClampedArrayConstructor with (Instantiable1[/* elements */ Iterable[Double], typings.std.global.Uint8ClampedArray]) = js.native
  
  var WeakMap: WeakMapConstructor = js.native
  
  var WeakSet: WeakSetConstructor = js.native
  
  var __coverage__ : CoverageMapData = js.native
  
  def afterAll(fn: HookFn): Unit = js.native
  def afterAll(fn: HookFn, timeout: Double): Unit = js.native
  @JSName("afterAll")
  var afterAll_Original: HookBase = js.native
  
  def afterEach(fn: HookFn): Unit = js.native
  def afterEach(fn: HookFn, timeout: Double): Unit = js.native
  @JSName("afterEach")
  var afterEach_Original: HookBase = js.native
  
  def beforeAll(fn: HookFn): Unit = js.native
  def beforeAll(fn: HookFn, timeout: Double): Unit = js.native
  @JSName("beforeAll")
  var beforeAll_Original: HookBase = js.native
  
  def beforeEach(fn: HookFn): Unit = js.native
  def beforeEach(fn: HookFn, timeout: Double): Unit = js.native
  @JSName("beforeEach")
  var beforeEach_Original: HookBase = js.native
  
  def clearImmediate(immediateId: Immediate): Unit = js.native
  @JSName("clearImmediate")
  var clearImmediate_Original: js.Function1[/* immediateId */ Immediate, Unit] = js.native
  
  def clearInterval(intervalId: Timeout): Unit = js.native
  @JSName("clearInterval")
  var clearInterval_Original: js.Function1[/* intervalId */ Timeout, Unit] = js.native
  
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  @JSName("clearTimeout")
  var clearTimeout_Original: js.Function1[/* timeoutId */ Timeout, Unit] = js.native
  
  def decodeURI(encodedURI: String): String = js.native
  
  def decodeURIComponent(encodedURIComponent: String): String = js.native
  @JSName("decodeURIComponent")
  var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ String, String] = js.native
  
  @JSName("decodeURI")
  var decodeURI_Original: js.Function1[/* encodedURI */ String, String] = js.native
  
  def describe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("describe")
  var describe_Original: Describe = js.native
  
  def encodeURI(uri: String): String = js.native
  
  def encodeURIComponent(uriComponent: Boolean): String = js.native
  @JSName("encodeURIComponent")
  var encodeURIComponent_Original: js.Function1[/* uriComponent */ Boolean, String] = js.native
  
  @JSName("encodeURI")
  var encodeURI_Original: js.Function1[/* uri */ String, String] = js.native
  
  def escape(str: String): String = js.native
  @JSName("escape")
  var escape_Original: js.Function1[/* str */ String, String] = js.native
  
  def eval(x: String): js.Any = js.native
  @JSName("eval")
  var eval_Original: js.Function1[/* x */ String, _] = js.native
  
  def fail(): Unit = js.native
  
  def fdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("fdescribe")
  var fdescribe_Original: DescribeBase = js.native
  
  def fit(testName: TestName, fn: TestFn): Unit = js.native
  def fit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("fit")
  var fit_Original: ItBaseconcurrentItConcurr = js.native
  
  def gc(): Unit = js.native
  @JSName("gc")
  var gc_Original: js.Function0[Unit] = js.native
  
  var global: typings.node.NodeJS.Global = js.native
  
  def isFinite(number: Double): Boolean = js.native
  @JSName("isFinite")
  var isFinite_Original: js.Function1[/* number */ Double, Boolean] = js.native
  
  def isNaN(number: Double): Boolean = js.native
  @JSName("isNaN")
  var isNaN_Original: js.Function1[/* number */ Double, Boolean] = js.native
  
  def it(testName: TestName, fn: TestFn): Unit = js.native
  def it(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("it")
  var it_Original: ItConcurrent = js.native
  
  var jasmine: Jasmine = js.native
  
  def parseFloat(string: String): Double = js.native
  @JSName("parseFloat")
  var parseFloat_Original: js.Function1[/* string */ String, Double] = js.native
  
  def parseInt(s: String, radix: Double): Double = js.native
  @JSName("parseInt")
  var parseInt_Original: js.Function2[/* s */ String, /* radix */ Double, Double] = js.native
  
  def pending(): Unit = js.native
  
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  @JSName("queueMicrotask")
  var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit] = js.native
  
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  @JSName("setImmediate")
  var setImmediate_Original: js.Function2[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* repeated */ js.Any, 
    Immediate
  ] = js.native
  
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  @JSName("setInterval")
  var setInterval_Original: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* ms */ Double, 
    /* repeated */ js.Any, 
    Timeout
  ] = js.native
  
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  @JSName("setTimeout")
  var setTimeout_Original: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* ms */ Double, 
    /* repeated */ js.Any, 
    Timeout
  ] = js.native
  
  def spyOn(): Unit = js.native
  
  def spyOnProperty(): Unit = js.native
  
  def test(testName: TestName, fn: TestFn): Unit = js.native
  def test(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("test")
  var test_Original: ItConcurrent = js.native
  
  var undefined: js.UndefOr[scala.Nothing] = js.native
  
  def unescape(str: String): String = js.native
  @JSName("unescape")
  var unescape_Original: js.Function1[/* str */ String, String] = js.native
  
  var v8debug: js.UndefOr[js.Any] = js.native
  
  def xdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("xdescribe")
  var xdescribe_Original: DescribeBase = js.native
  
  def xit(testName: TestName, fn: TestFn): Unit = js.native
  def xit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("xit")
  var xit_Original: ItBase = js.native
  
  def xtest(testName: TestName, fn: TestFn): Unit = js.native
  def xtest(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("xtest")
  var xtest_Original: ItBase = js.native
}
