package typings.jestTypes

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.Immediate
import typings.node.NodeJS.Timeout
import typings.node.anon.TypeofBuffer
import typings.std.ArrayBufferConstructor
import typings.std.DataViewConstructor
import typings.std.Error
import typings.std.EvalError
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.JSON
import typings.std.MapConstructor
import typings.std.Math
import typings.std.PromiseConstructor
import typings.std.RangeError
import typings.std.Record
import typings.std.ReferenceError
import typings.std.RegExp
import typings.std.ReturnType
import typings.std.SetConstructor
import typings.std.SyntaxError
import typings.std.TemplateStringsArray
import typings.std.TypeError
import typings.std.URIError
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import typings.std.Uint8ClampedArrayConstructor
import typings.std.WeakMapConstructor
import typings.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  type ArrayTable = Table | Row
  
  type BlockFn = js.Function0[Unit]
  
  type BlockName = String
  
  type Col = js.Any
  
  type ConcurrentTestFn = js.Function1[/* done */ js.UndefOr[DoneFn], js.Promise[js.UndefOr[Unit | js.Any]]]
  
  @js.native
  trait Describe
    extends StObject
       with DescribeBase {
    
    def only(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("only")
    var only_Original: DescribeBase = js.native
    
    def skip(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    @JSName("skip")
    var skip_Original: DescribeBase = js.native
  }
  
  @js.native
  trait DescribeBase extends StObject {
    
    def apply(blockName: BlockName, blockFn: BlockFn): Unit = js.native
    
    var each: Each[BlockFn] = js.native
  }
  
  type DoneFn = js.Function1[/* reason */ js.UndefOr[String | Error], Unit]
  
  type Each[EachCallback /* <: TestCallback */] = (js.Function2[
    /* table */ EachTable, 
    /* repeated */ js.Any, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ]) | js.Function0[js.Function0[Unit]]
  
  type EachTable = ArrayTable | TemplateTable
  
  @js.native
  trait EachTestFn[EachCallback /* <: TestCallback */] extends StObject {
    
    def apply(args: js.Any*): ReturnType[EachCallback] = js.native
  }
  
  /* Inlined parent @jest/types.@jest/types/build/Global.GlobalAdditions */
  /* Inlined parent std.Omit<node.NodeJS.Global, keyof @jest/types.@jest/types/build/Global.GlobalAdditions> */
  trait Global
    extends StObject
       with /* extras */ StringDictionary[js.Any] {
    
    def Array(): js.Array[js.Any]
    
    var ArrayBuffer: ArrayBufferConstructor
    
    @JSName("Array")
    var Array_Original: js.Function0[js.Array[js.Any]]
    
    def Boolean[T](): scala.Boolean
    @JSName("Boolean")
    var Boolean_Original: js.Function0[Boolean]
    
    var Buffer: TypeofBuffer & (Instantiable2[/* str */ String, /* encoding */ js.UndefOr[BufferEncoding], typings.node.Buffer])
    
    var DataView: DataViewConstructor
    
    def Date(): String
    @JSName("Date")
    var Date_Original: js.Function0[String]
    
    def Error(): typings.std.Error
    @JSName("Error")
    var Error_Original: js.Function0[Error]
    
    def EvalError(): typings.std.EvalError
    @JSName("EvalError")
    var EvalError_Original: js.Function0[EvalError]
    
    var Float32Array: Float32ArrayConstructor
    
    var Float64Array: Float64ArrayConstructor
    
    def Function(args: String*): js.Function
    @JSName("Function")
    var Function_Original: js.Function1[/* repeated */ String, js.Function]
    
    var Infinity: Double
    
    var Int16Array: Int16ArrayConstructor
    
    var Int32Array: Int32ArrayConstructor
    
    var Int8Array: Int8ArrayConstructor
    
    var Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any
    
    var JSON: typings.std.JSON
    
    var Map: MapConstructor
    
    var Math: typings.std.Math
    
    var NaN: Double
    
    def Number(): Double
    @JSName("Number")
    var Number_Original: js.Function0[Double]
    
    def Object(): js.Any
    @JSName("Object")
    var Object_Original: js.Function0[js.Any]
    
    var Promise: PromiseConstructor
    
    def RangeError(): typings.std.RangeError
    @JSName("RangeError")
    var RangeError_Original: js.Function0[RangeError]
    
    def ReferenceError(): typings.std.ReferenceError
    @JSName("ReferenceError")
    var ReferenceError_Original: js.Function0[ReferenceError]
    
    def RegExp(pattern: typings.std.RegExp): typings.std.RegExp
    @JSName("RegExp")
    var RegExp_Original: js.Function1[/* pattern */ RegExp, RegExp]
    
    var Set: SetConstructor
    
    def String(): java.lang.String
    @JSName("String")
    var String_Original: js.Function0[String]
    
    var Symbol: js.Function
    
    def SyntaxError(): typings.std.SyntaxError
    @JSName("SyntaxError")
    var SyntaxError_Original: js.Function0[SyntaxError]
    
    def TypeError(): typings.std.TypeError
    @JSName("TypeError")
    var TypeError_Original: js.Function0[TypeError]
    
    def URIError(): typings.std.URIError
    @JSName("URIError")
    var URIError_Original: js.Function0[URIError]
    
    var Uint16Array: Uint16ArrayConstructor
    
    var Uint32Array: Uint32ArrayConstructor
    
    var Uint8Array: Uint8ArrayConstructor
    
    var Uint8ClampedArray: Uint8ClampedArrayConstructor
    
    var WeakMap: WeakMapConstructor
    
    var WeakSet: WeakSetConstructor
    
    var __coverage__ : CoverageMapData
    
    def afterAll(fn: HookFn): Unit
    def afterAll(fn: HookFn, timeout: Double): Unit
    @JSName("afterAll")
    var afterAll_Original: HookBase
    
    def afterEach(fn: HookFn): Unit
    def afterEach(fn: HookFn, timeout: Double): Unit
    @JSName("afterEach")
    var afterEach_Original: HookBase
    
    def beforeAll(fn: HookFn): Unit
    def beforeAll(fn: HookFn, timeout: Double): Unit
    @JSName("beforeAll")
    var beforeAll_Original: HookBase
    
    def beforeEach(fn: HookFn): Unit
    def beforeEach(fn: HookFn, timeout: Double): Unit
    @JSName("beforeEach")
    var beforeEach_Original: HookBase
    
    def clearImmediate(immediateId: Immediate): Unit
    @JSName("clearImmediate")
    var clearImmediate_Original: js.Function1[/* immediateId */ Immediate, Unit]
    
    def clearInterval(intervalId: Timeout): Unit
    @JSName("clearInterval")
    var clearInterval_Original: js.Function1[/* intervalId */ Timeout, Unit]
    
    def clearTimeout(timeoutId: Timeout): Unit
    @JSName("clearTimeout")
    var clearTimeout_Original: js.Function1[/* timeoutId */ Timeout, Unit]
    
    def decodeURI(encodedURI: String): String
    
    def decodeURIComponent(encodedURIComponent: String): String
    @JSName("decodeURIComponent")
    var decodeURIComponent_Original: js.Function1[/* encodedURIComponent */ String, String]
    
    @JSName("decodeURI")
    var decodeURI_Original: js.Function1[/* encodedURI */ String, String]
    
    def describe(blockName: BlockName, blockFn: BlockFn): Unit
    @JSName("describe")
    var describe_Original: Describe
    
    def encodeURI(uri: String): String
    
    def encodeURIComponent(uriComponent: Boolean): String
    @JSName("encodeURIComponent")
    var encodeURIComponent_Original: js.Function1[/* uriComponent */ Boolean, String]
    
    @JSName("encodeURI")
    var encodeURI_Original: js.Function1[/* uri */ String, String]
    
    def escape(str: String): String
    @JSName("escape")
    var escape_Original: js.Function1[/* str */ String, String]
    
    def eval(x: String): js.Any
    @JSName("eval")
    var eval_Original: js.Function1[/* x */ String, js.Any]
    
    def fail(): Unit
    
    def fdescribe(blockName: BlockName, blockFn: BlockFn): Unit
    @JSName("fdescribe")
    var fdescribe_Original: DescribeBase
    
    def fit(testName: TestName, fn: TestFn): Unit
    def fit(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("fit")
    var fit_Original: ItBaseconcurrentItConcurr
    
    def gc(): Unit
    @JSName("gc")
    var gc_Original: js.Function0[Unit]
    
    var global: typings.node.NodeJS.Global
    
    def isFinite(number: Double): Boolean
    @JSName("isFinite")
    var isFinite_Original: js.Function1[/* number */ Double, Boolean]
    
    def isNaN(number: Double): Boolean
    @JSName("isNaN")
    var isNaN_Original: js.Function1[/* number */ Double, Boolean]
    
    def it(testName: TestName, fn: TestFn): Unit
    def it(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("it")
    var it_Original: ItConcurrent
    
    var jasmine: Jasmine
    
    def parseFloat(string: String): Double
    @JSName("parseFloat")
    var parseFloat_Original: js.Function1[/* string */ String, Double]
    
    def parseInt(s: String, radix: Double): Double
    @JSName("parseInt")
    var parseInt_Original: js.Function2[/* s */ String, /* radix */ Double, Double]
    
    def pending(): Unit
    
    def queueMicrotask(callback: js.Function0[Unit]): Unit
    @JSName("queueMicrotask")
    var queueMicrotask_Original: js.Function1[/* callback */ js.Function0[Unit], Unit]
    
    def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate
    @JSName("setImmediate")
    var setImmediate_Original: js.Function2[
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* repeated */ js.Any, 
        Immediate
      ]
    
    def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout
    @JSName("setInterval")
    var setInterval_Original: js.Function3[
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* ms */ Double, 
        /* repeated */ js.Any, 
        Timeout
      ]
    
    def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout
    @JSName("setTimeout")
    var setTimeout_Original: js.Function3[
        /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
        /* ms */ Double, 
        /* repeated */ js.Any, 
        Timeout
      ]
    
    def spyOn(): Unit
    
    def spyOnProperty(): Unit
    
    def test(testName: TestName, fn: TestFn): Unit
    def test(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("test")
    var test_Original: ItConcurrent
    
    var undefined: Unit
    
    def unescape(str: String): String
    @JSName("unescape")
    var unescape_Original: js.Function1[/* str */ String, String]
    
    var v8debug: js.UndefOr[js.Any] = js.undefined
    
    def xdescribe(blockName: BlockName, blockFn: BlockFn): Unit
    @JSName("xdescribe")
    var xdescribe_Original: DescribeBase
    
    def xit(testName: TestName, fn: TestFn): Unit
    def xit(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("xit")
    var xit_Original: ItBase
    
    def xtest(testName: TestName, fn: TestFn): Unit
    def xtest(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("xtest")
    var xtest_Original: ItBase
  }
  object Global {
    
    inline def apply(
      Array: () => js.Array[js.Any],
      ArrayBuffer: ArrayBufferConstructor,
      Boolean: () => Boolean,
      Buffer: TypeofBuffer & (Instantiable2[/* str */ String, /* encoding */ js.UndefOr[BufferEncoding], Buffer]),
      DataView: DataViewConstructor,
      Date: () => String,
      Error: () => Error,
      EvalError: () => EvalError,
      Float32Array: Float32ArrayConstructor,
      Float64Array: Float64ArrayConstructor,
      Function: /* repeated */ String => js.Function,
      Infinity: Double,
      Int16Array: Int16ArrayConstructor,
      Int32Array: Int32ArrayConstructor,
      Int8Array: Int8ArrayConstructor,
      Intl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any,
      JSON: JSON,
      Map: MapConstructor,
      Math: Math,
      NaN: Double,
      Number: () => Double,
      Object: () => js.Any,
      Promise: PromiseConstructor,
      RangeError: () => RangeError,
      ReferenceError: () => ReferenceError,
      RegExp: /* pattern */ RegExp => RegExp,
      Set: SetConstructor,
      String: () => String,
      Symbol: js.Function,
      SyntaxError: () => SyntaxError,
      TypeError: () => TypeError,
      URIError: () => URIError,
      Uint16Array: Uint16ArrayConstructor,
      Uint32Array: Uint32ArrayConstructor,
      Uint8Array: Uint8ArrayConstructor,
      Uint8ClampedArray: Uint8ClampedArrayConstructor,
      WeakMap: WeakMapConstructor,
      WeakSet: WeakSetConstructor,
      __coverage__ : CoverageMapData,
      afterAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      afterEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      beforeAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      beforeEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      clearImmediate: /* immediateId */ Immediate => Unit,
      clearInterval: /* intervalId */ Timeout => Unit,
      clearTimeout: /* timeoutId */ Timeout => Unit,
      decodeURI: /* encodedURI */ String => String,
      decodeURIComponent: /* encodedURIComponent */ String => String,
      describe: Describe,
      encodeURI: /* uri */ String => String,
      encodeURIComponent: /* uriComponent */ Boolean => String,
      escape: /* str */ String => String,
      eval: /* x */ String => js.Any,
      fail: () => Unit,
      fdescribe: DescribeBase,
      fit: ItBaseconcurrentItConcurr,
      gc: () => Unit,
      global: typings.node.NodeJS.Global,
      isFinite: /* number */ Double => Boolean,
      isNaN: /* number */ Double => Boolean,
      it: ItConcurrent,
      jasmine: Jasmine,
      parseFloat: /* string */ String => Double,
      parseInt: (/* s */ String, /* radix */ Double) => Double,
      pending: () => Unit,
      queueMicrotask: /* callback */ js.Function0[Unit] => Unit,
      setImmediate: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Immediate,
      setInterval: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Timeout,
      setTimeout: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Timeout,
      spyOn: () => Unit,
      spyOnProperty: () => Unit,
      test: ItConcurrent,
      undefined: Unit,
      unescape: /* str */ String => String,
      xdescribe: DescribeBase,
      xit: ItBase,
      xtest: ItBase
    ): Global = {
      val __obj = js.Dynamic.literal(Array = js.Any.fromFunction0(Array), ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any], Boolean = js.Any.fromFunction0(Boolean), Buffer = Buffer.asInstanceOf[js.Any], DataView = DataView.asInstanceOf[js.Any], Date = js.Any.fromFunction0(Date), Error = js.Any.fromFunction0(Error), EvalError = js.Any.fromFunction0(EvalError), Float32Array = Float32Array.asInstanceOf[js.Any], Float64Array = Float64Array.asInstanceOf[js.Any], Function = js.Any.fromFunction1(Function), Infinity = Infinity.asInstanceOf[js.Any], Int16Array = Int16Array.asInstanceOf[js.Any], Int32Array = Int32Array.asInstanceOf[js.Any], Int8Array = Int8Array.asInstanceOf[js.Any], Intl = Intl.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Math = Math.asInstanceOf[js.Any], NaN = NaN.asInstanceOf[js.Any], Number = js.Any.fromFunction0(Number), Object = js.Any.fromFunction0(Object), Promise = Promise.asInstanceOf[js.Any], RangeError = js.Any.fromFunction0(RangeError), ReferenceError = js.Any.fromFunction0(ReferenceError), RegExp = js.Any.fromFunction1(RegExp), Set = Set.asInstanceOf[js.Any], String = js.Any.fromFunction0(String), Symbol = Symbol.asInstanceOf[js.Any], SyntaxError = js.Any.fromFunction0(SyntaxError), TypeError = js.Any.fromFunction0(TypeError), URIError = js.Any.fromFunction0(URIError), Uint16Array = Uint16Array.asInstanceOf[js.Any], Uint32Array = Uint32Array.asInstanceOf[js.Any], Uint8Array = Uint8Array.asInstanceOf[js.Any], Uint8ClampedArray = Uint8ClampedArray.asInstanceOf[js.Any], WeakMap = WeakMap.asInstanceOf[js.Any], WeakSet = WeakSet.asInstanceOf[js.Any], __coverage__ = __coverage__.asInstanceOf[js.Any], afterAll = js.Any.fromFunction2(afterAll), afterEach = js.Any.fromFunction2(afterEach), beforeAll = js.Any.fromFunction2(beforeAll), beforeEach = js.Any.fromFunction2(beforeEach), clearImmediate = js.Any.fromFunction1(clearImmediate), clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), decodeURI = js.Any.fromFunction1(decodeURI), decodeURIComponent = js.Any.fromFunction1(decodeURIComponent), describe = describe.asInstanceOf[js.Any], encodeURI = js.Any.fromFunction1(encodeURI), encodeURIComponent = js.Any.fromFunction1(encodeURIComponent), escape = js.Any.fromFunction1(escape), eval = js.Any.fromFunction1(eval), fail = js.Any.fromFunction0(fail), fdescribe = fdescribe.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], gc = js.Any.fromFunction0(gc), global = global.asInstanceOf[js.Any], isFinite = js.Any.fromFunction1(isFinite), isNaN = js.Any.fromFunction1(isNaN), it = it.asInstanceOf[js.Any], jasmine = jasmine.asInstanceOf[js.Any], parseFloat = js.Any.fromFunction1(parseFloat), parseInt = js.Any.fromFunction2(parseInt), pending = js.Any.fromFunction0(pending), queueMicrotask = js.Any.fromFunction1(queueMicrotask), setImmediate = js.Any.fromFunction2(setImmediate), setInterval = js.Any.fromFunction3(setInterval), setTimeout = js.Any.fromFunction3(setTimeout), spyOn = js.Any.fromFunction0(spyOn), spyOnProperty = js.Any.fromFunction0(spyOnProperty), test = test.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], unescape = js.Any.fromFunction1(unescape), xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xtest = xtest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setAfterAll(value: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "afterAll", js.Any.fromFunction2(value))
      
      inline def setAfterEach(value: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction2(value))
      
      inline def setArray(value: () => js.Array[js.Any]): Self = StObject.set(x, "Array", js.Any.fromFunction0(value))
      
      inline def setArrayBuffer(value: ArrayBufferConstructor): Self = StObject.set(x, "ArrayBuffer", value.asInstanceOf[js.Any])
      
      inline def setBeforeAll(value: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "beforeAll", js.Any.fromFunction2(value))
      
      inline def setBeforeEach(value: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction2(value))
      
      inline def setBoolean(value: () => Boolean): Self = StObject.set(x, "Boolean", js.Any.fromFunction0(value))
      
      inline def setBuffer(
        value: TypeofBuffer & (Instantiable2[/* str */ String, /* encoding */ js.UndefOr[BufferEncoding], Buffer])
      ): Self = StObject.set(x, "Buffer", value.asInstanceOf[js.Any])
      
      inline def setClearImmediate(value: /* immediateId */ Immediate => Unit): Self = StObject.set(x, "clearImmediate", js.Any.fromFunction1(value))
      
      inline def setClearInterval(value: /* intervalId */ Timeout => Unit): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
      
      inline def setClearTimeout(value: /* timeoutId */ Timeout => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setDataView(value: DataViewConstructor): Self = StObject.set(x, "DataView", value.asInstanceOf[js.Any])
      
      inline def setDate(value: () => String): Self = StObject.set(x, "Date", js.Any.fromFunction0(value))
      
      inline def setDecodeURI(value: /* encodedURI */ String => String): Self = StObject.set(x, "decodeURI", js.Any.fromFunction1(value))
      
      inline def setDecodeURIComponent(value: /* encodedURIComponent */ String => String): Self = StObject.set(x, "decodeURIComponent", js.Any.fromFunction1(value))
      
      inline def setDescribe(value: Describe): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setEncodeURI(value: /* uri */ String => String): Self = StObject.set(x, "encodeURI", js.Any.fromFunction1(value))
      
      inline def setEncodeURIComponent(value: /* uriComponent */ Boolean => String): Self = StObject.set(x, "encodeURIComponent", js.Any.fromFunction1(value))
      
      inline def setError(value: () => Error): Self = StObject.set(x, "Error", js.Any.fromFunction0(value))
      
      inline def setEscape(value: /* str */ String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      
      inline def setEval(value: /* x */ String => js.Any): Self = StObject.set(x, "eval", js.Any.fromFunction1(value))
      
      inline def setEvalError(value: () => EvalError): Self = StObject.set(x, "EvalError", js.Any.fromFunction0(value))
      
      inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
      
      inline def setFdescribe(value: DescribeBase): Self = StObject.set(x, "fdescribe", value.asInstanceOf[js.Any])
      
      inline def setFit(value: ItBaseconcurrentItConcurr): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFloat32Array(value: Float32ArrayConstructor): Self = StObject.set(x, "Float32Array", value.asInstanceOf[js.Any])
      
      inline def setFloat64Array(value: Float64ArrayConstructor): Self = StObject.set(x, "Float64Array", value.asInstanceOf[js.Any])
      
      inline def setFunction(value: /* repeated */ String => js.Function): Self = StObject.set(x, "Function", js.Any.fromFunction1(value))
      
      inline def setGc(value: () => Unit): Self = StObject.set(x, "gc", js.Any.fromFunction0(value))
      
      inline def setGlobal(value: typings.node.NodeJS.Global): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setInfinity(value: Double): Self = StObject.set(x, "Infinity", value.asInstanceOf[js.Any])
      
      inline def setInt16Array(value: Int16ArrayConstructor): Self = StObject.set(x, "Int16Array", value.asInstanceOf[js.Any])
      
      inline def setInt32Array(value: Int32ArrayConstructor): Self = StObject.set(x, "Int32Array", value.asInstanceOf[js.Any])
      
      inline def setInt8Array(value: Int8ArrayConstructor): Self = StObject.set(x, "Int8Array", value.asInstanceOf[js.Any])
      
      inline def setIntl(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Intl */ js.Any): Self = StObject.set(x, "Intl", value.asInstanceOf[js.Any])
      
      inline def setIsFinite(value: /* number */ Double => Boolean): Self = StObject.set(x, "isFinite", js.Any.fromFunction1(value))
      
      inline def setIsNaN(value: /* number */ Double => Boolean): Self = StObject.set(x, "isNaN", js.Any.fromFunction1(value))
      
      inline def setIt(value: ItConcurrent): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      inline def setJSON(value: JSON): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setJasmine(value: Jasmine): Self = StObject.set(x, "jasmine", value.asInstanceOf[js.Any])
      
      inline def setMap(value: MapConstructor): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
      
      inline def setMath(value: Math): Self = StObject.set(x, "Math", value.asInstanceOf[js.Any])
      
      inline def setNaN(value: Double): Self = StObject.set(x, "NaN", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: () => Double): Self = StObject.set(x, "Number", js.Any.fromFunction0(value))
      
      inline def setObject(value: () => js.Any): Self = StObject.set(x, "Object", js.Any.fromFunction0(value))
      
      inline def setParseFloat(value: /* string */ String => Double): Self = StObject.set(x, "parseFloat", js.Any.fromFunction1(value))
      
      inline def setParseInt(value: (/* s */ String, /* radix */ Double) => Double): Self = StObject.set(x, "parseInt", js.Any.fromFunction2(value))
      
      inline def setPending(value: () => Unit): Self = StObject.set(x, "pending", js.Any.fromFunction0(value))
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setQueueMicrotask(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "queueMicrotask", js.Any.fromFunction1(value))
      
      inline def setRangeError(value: () => RangeError): Self = StObject.set(x, "RangeError", js.Any.fromFunction0(value))
      
      inline def setReferenceError(value: () => ReferenceError): Self = StObject.set(x, "ReferenceError", js.Any.fromFunction0(value))
      
      inline def setRegExp(value: /* pattern */ RegExp => RegExp): Self = StObject.set(x, "RegExp", js.Any.fromFunction1(value))
      
      inline def setSet(value: SetConstructor): Self = StObject.set(x, "Set", value.asInstanceOf[js.Any])
      
      inline def setSetImmediate(
        value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* repeated */ js.Any) => Immediate
      ): Self = StObject.set(x, "setImmediate", js.Any.fromFunction2(value))
      
      inline def setSetInterval(
        value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Timeout
      ): Self = StObject.set(x, "setInterval", js.Any.fromFunction3(value))
      
      inline def setSetTimeout(
        value: (/* callback */ js.Function1[/* repeated */ js.Any, Unit], /* ms */ Double, /* repeated */ js.Any) => Timeout
      ): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
      
      inline def setSpyOn(value: () => Unit): Self = StObject.set(x, "spyOn", js.Any.fromFunction0(value))
      
      inline def setSpyOnProperty(value: () => Unit): Self = StObject.set(x, "spyOnProperty", js.Any.fromFunction0(value))
      
      inline def setString(value: () => String): Self = StObject.set(x, "String", js.Any.fromFunction0(value))
      
      inline def setSymbol(value: js.Function): Self = StObject.set(x, "Symbol", value.asInstanceOf[js.Any])
      
      inline def setSyntaxError(value: () => SyntaxError): Self = StObject.set(x, "SyntaxError", js.Any.fromFunction0(value))
      
      inline def setTest(value: ItConcurrent): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTypeError(value: () => TypeError): Self = StObject.set(x, "TypeError", js.Any.fromFunction0(value))
      
      inline def setURIError(value: () => URIError): Self = StObject.set(x, "URIError", js.Any.fromFunction0(value))
      
      inline def setUint16Array(value: Uint16ArrayConstructor): Self = StObject.set(x, "Uint16Array", value.asInstanceOf[js.Any])
      
      inline def setUint32Array(value: Uint32ArrayConstructor): Self = StObject.set(x, "Uint32Array", value.asInstanceOf[js.Any])
      
      inline def setUint8Array(value: Uint8ArrayConstructor): Self = StObject.set(x, "Uint8Array", value.asInstanceOf[js.Any])
      
      inline def setUint8ClampedArray(value: Uint8ClampedArrayConstructor): Self = StObject.set(x, "Uint8ClampedArray", value.asInstanceOf[js.Any])
      
      inline def setUndefined(value: Unit): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      inline def setUnescape(value: /* str */ String => String): Self = StObject.set(x, "unescape", js.Any.fromFunction1(value))
      
      inline def setV8debug(value: js.Any): Self = StObject.set(x, "v8debug", value.asInstanceOf[js.Any])
      
      inline def setV8debugUndefined: Self = StObject.set(x, "v8debug", js.undefined)
      
      inline def setWeakMap(value: WeakMapConstructor): Self = StObject.set(x, "WeakMap", value.asInstanceOf[js.Any])
      
      inline def setWeakSet(value: WeakSetConstructor): Self = StObject.set(x, "WeakSet", value.asInstanceOf[js.Any])
      
      inline def setXdescribe(value: DescribeBase): Self = StObject.set(x, "xdescribe", value.asInstanceOf[js.Any])
      
      inline def setXit(value: ItBase): Self = StObject.set(x, "xit", value.asInstanceOf[js.Any])
      
      inline def setXtest(value: ItBase): Self = StObject.set(x, "xtest", value.asInstanceOf[js.Any])
      
      inline def set__coverage__(value: CoverageMapData): Self = StObject.set(x, "__coverage__", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalAdditions
    extends StObject
       with TestFrameworkGlobals {
    
    var __coverage__ : CoverageMapData
    
    def fail(): Unit
    
    var jasmine: Jasmine
    
    def pending(): Unit
    
    def spyOn(): Unit
    
    def spyOnProperty(): Unit
  }
  object GlobalAdditions {
    
    inline def apply(
      __coverage__ : CoverageMapData,
      afterAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      afterEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      beforeAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      beforeEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      describe: Describe,
      fail: () => Unit,
      fdescribe: DescribeBase,
      fit: ItBaseconcurrentItConcurr,
      it: ItConcurrent,
      jasmine: Jasmine,
      pending: () => Unit,
      spyOn: () => Unit,
      spyOnProperty: () => Unit,
      test: ItConcurrent,
      xdescribe: DescribeBase,
      xit: ItBase,
      xtest: ItBase
    ): GlobalAdditions = {
      val __obj = js.Dynamic.literal(__coverage__ = __coverage__.asInstanceOf[js.Any], afterAll = js.Any.fromFunction2(afterAll), afterEach = js.Any.fromFunction2(afterEach), beforeAll = js.Any.fromFunction2(beforeAll), beforeEach = js.Any.fromFunction2(beforeEach), describe = describe.asInstanceOf[js.Any], fail = js.Any.fromFunction0(fail), fdescribe = fdescribe.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], jasmine = jasmine.asInstanceOf[js.Any], pending = js.Any.fromFunction0(pending), spyOn = js.Any.fromFunction0(spyOn), spyOnProperty = js.Any.fromFunction0(spyOnProperty), test = test.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xtest = xtest.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalAdditions]
    }
    
    extension [Self <: GlobalAdditions](x: Self) {
      
      inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
      
      inline def setJasmine(value: Jasmine): Self = StObject.set(x, "jasmine", value.asInstanceOf[js.Any])
      
      inline def setPending(value: () => Unit): Self = StObject.set(x, "pending", js.Any.fromFunction0(value))
      
      inline def setSpyOn(value: () => Unit): Self = StObject.set(x, "spyOn", js.Any.fromFunction0(value))
      
      inline def setSpyOnProperty(value: () => Unit): Self = StObject.set(x, "spyOnProperty", js.Any.fromFunction0(value))
      
      inline def set__coverage__(value: CoverageMapData): Self = StObject.set(x, "__coverage__", value.asInstanceOf[js.Any])
    }
  }
  
  type HookBase = js.Function2[/* fn */ HookFn, /* timeout */ js.UndefOr[Double], Unit]
  
  type HookFn = TestFn
  
  @js.native
  trait It
    extends StObject
       with ItBase {
    
    def only(testName: TestName, fn: TestFn): Unit = js.native
    def only(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("only")
    var only_Original: ItBase = js.native
    
    def skip(testName: TestName, fn: TestFn): Unit = js.native
    def skip(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    @JSName("skip")
    var skip_Original: ItBase = js.native
    
    def todo(testName: TestName): Unit = js.native
  }
  
  @js.native
  trait ItBase extends StObject {
    
    def apply(testName: TestName, fn: TestFn): Unit = js.native
    def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
    
    var each: Each[TestFn] = js.native
  }
  
  @js.native
  trait ItConcurrent
    extends StObject
       with It {
    
    def concurrent(testName: String, testFn: ConcurrentTestFn): Unit = js.native
    def concurrent(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
    @JSName("concurrent")
    var concurrent_Original: ItConcurrentExtended = js.native
  }
  
  @js.native
  trait ItConcurrentBase extends StObject {
    
    def apply(testName: String, testFn: ConcurrentTestFn): Unit = js.native
    def apply(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
    
    var each: Each[ConcurrentTestFn] = js.native
  }
  
  @js.native
  trait ItConcurrentExtended
    extends StObject
       with ItConcurrentBase {
    
    def only(testName: String, testFn: ConcurrentTestFn): Unit = js.native
    def only(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
    @JSName("only")
    var only_Original: ItConcurrentBase = js.native
    
    def skip(testName: String, testFn: ConcurrentTestFn): Unit = js.native
    def skip(testName: String, testFn: ConcurrentTestFn, timeout: Double): Unit = js.native
    @JSName("skip")
    var skip_Original: ItConcurrentBase = js.native
  }
  
  trait Jasmine extends StObject {
    
    var _DEFAULT_TIMEOUT_INTERVAL: js.UndefOr[Double] = js.undefined
    
    def addMatchers(matchers: Record[String, js.Any]): Unit
  }
  object Jasmine {
    
    inline def apply(addMatchers: Record[String, js.Any] => Unit): Jasmine = {
      val __obj = js.Dynamic.literal(addMatchers = js.Any.fromFunction1(addMatchers))
      __obj.asInstanceOf[Jasmine]
    }
    
    extension [Self <: Jasmine](x: Self) {
      
      inline def setAddMatchers(value: Record[String, js.Any] => Unit): Self = StObject.set(x, "addMatchers", js.Any.fromFunction1(value))
      
      inline def set_DEFAULT_TIMEOUT_INTERVAL(value: Double): Self = StObject.set(x, "_DEFAULT_TIMEOUT_INTERVAL", value.asInstanceOf[js.Any])
      
      inline def set_DEFAULT_TIMEOUT_INTERVALUndefined: Self = StObject.set(x, "_DEFAULT_TIMEOUT_INTERVAL", js.undefined)
    }
  }
  
  type Row = js.Array[Col]
  
  type Table = js.Array[Row]
  
  type TemplateData = js.Array[js.Any]
  
  type TemplateTable = TemplateStringsArray
  
  type TestCallback = BlockFn | TestFn | ConcurrentTestFn
  
  type TestFn = js.Function1[
    /* done */ js.UndefOr[DoneFn], 
    js.UndefOr[(js.Promise[js.UndefOr[Unit | js.Any]]) | Unit]
  ]
  
  trait TestFrameworkGlobals extends StObject {
    
    def afterAll(fn: HookFn): Unit
    def afterAll(fn: HookFn, timeout: Double): Unit
    @JSName("afterAll")
    var afterAll_Original: HookBase
    
    def afterEach(fn: HookFn): Unit
    def afterEach(fn: HookFn, timeout: Double): Unit
    @JSName("afterEach")
    var afterEach_Original: HookBase
    
    def beforeAll(fn: HookFn): Unit
    def beforeAll(fn: HookFn, timeout: Double): Unit
    @JSName("beforeAll")
    var beforeAll_Original: HookBase
    
    def beforeEach(fn: HookFn): Unit
    def beforeEach(fn: HookFn, timeout: Double): Unit
    @JSName("beforeEach")
    var beforeEach_Original: HookBase
    
    def describe(blockName: BlockName, blockFn: BlockFn): Unit
    @JSName("describe")
    var describe_Original: Describe
    
    def fdescribe(blockName: BlockName, blockFn: BlockFn): Unit
    @JSName("fdescribe")
    var fdescribe_Original: DescribeBase
    
    def fit(testName: TestName, fn: TestFn): Unit
    def fit(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("fit")
    var fit_Original: ItBaseconcurrentItConcurr
    
    def it(testName: TestName, fn: TestFn): Unit
    def it(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("it")
    var it_Original: ItConcurrent
    
    def test(testName: TestName, fn: TestFn): Unit
    def test(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("test")
    var test_Original: ItConcurrent
    
    def xdescribe(blockName: BlockName, blockFn: BlockFn): Unit
    @JSName("xdescribe")
    var xdescribe_Original: DescribeBase
    
    def xit(testName: TestName, fn: TestFn): Unit
    def xit(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("xit")
    var xit_Original: ItBase
    
    def xtest(testName: TestName, fn: TestFn): Unit
    def xtest(testName: TestName, fn: TestFn, timeout: Double): Unit
    @JSName("xtest")
    var xtest_Original: ItBase
  }
  object TestFrameworkGlobals {
    
    inline def apply(
      afterAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      afterEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      beforeAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      beforeEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
      describe: Describe,
      fdescribe: DescribeBase,
      fit: ItBaseconcurrentItConcurr,
      it: ItConcurrent,
      test: ItConcurrent,
      xdescribe: DescribeBase,
      xit: ItBase,
      xtest: ItBase
    ): TestFrameworkGlobals = {
      val __obj = js.Dynamic.literal(afterAll = js.Any.fromFunction2(afterAll), afterEach = js.Any.fromFunction2(afterEach), beforeAll = js.Any.fromFunction2(beforeAll), beforeEach = js.Any.fromFunction2(beforeEach), describe = describe.asInstanceOf[js.Any], fdescribe = fdescribe.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xtest = xtest.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestFrameworkGlobals]
    }
    
    extension [Self <: TestFrameworkGlobals](x: Self) {
      
      inline def setAfterAll(value: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "afterAll", js.Any.fromFunction2(value))
      
      inline def setAfterEach(value: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction2(value))
      
      inline def setBeforeAll(value: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "beforeAll", js.Any.fromFunction2(value))
      
      inline def setBeforeEach(value: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction2(value))
      
      inline def setDescribe(value: Describe): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setFdescribe(value: DescribeBase): Self = StObject.set(x, "fdescribe", value.asInstanceOf[js.Any])
      
      inline def setFit(value: ItBaseconcurrentItConcurr): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setIt(value: ItConcurrent): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      inline def setTest(value: ItConcurrent): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setXdescribe(value: DescribeBase): Self = StObject.set(x, "xdescribe", value.asInstanceOf[js.Any])
      
      inline def setXit(value: ItBase): Self = StObject.set(x, "xit", value.asInstanceOf[js.Any])
      
      inline def setXtest(value: ItBase): Self = StObject.set(x, "xtest", value.asInstanceOf[js.Any])
    }
  }
  
  type TestName = String
}
