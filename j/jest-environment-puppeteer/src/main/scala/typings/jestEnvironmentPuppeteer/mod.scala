package typings.jestEnvironmentPuppeteer

import org.scalablytyped.runtime.Instantiable2
import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import typings.jestTypes.globalMod.Describe
import typings.jestTypes.globalMod.DescribeBase
import typings.jestTypes.globalMod.Global
import typings.jestTypes.globalMod.HookFn
import typings.jestTypes.globalMod.ItBase
import typings.jestTypes.globalMod.ItConcurrent
import typings.jestTypes.globalMod.Jasmine
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.Immediate
import typings.node.NodeJS.Timeout
import typings.node.anon.TypeofBuffer
import typings.node.vmMod.Context
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.BrowserContext
import typings.puppeteer.mod.Page
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
  @JSImport("jest-environment-puppeteer", JSImport.Namespace)
  @js.native
  class ^ () extends PuppeteerEnvironment
  
  object global {
    
    @JSGlobal("browser")
    @js.native
    val browser: Browser = js.native
    
    @JSGlobal("context")
    @js.native
    val context: BrowserContext = js.native
    
    @JSGlobal("jestPuppeteer")
    @js.native
    val jestPuppeteer: JestPuppeteer = js.native
    
    @JSGlobal("page")
    @js.native
    val page: Page = js.native
  }
  
  trait Global_
    extends StObject
       with Global {
    
    var browser: Browser
    
    var context: Context
    
    var jestPuppeteer: JestPuppeteer
    
    var page: Page
  }
  object Global_ {
    
    @scala.inline
    def apply(
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
      browser: Browser,
      clearImmediate: /* immediateId */ Immediate => Unit,
      clearInterval: /* intervalId */ Timeout => Unit,
      clearTimeout: /* timeoutId */ Timeout => Unit,
      context: Context,
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
      jestPuppeteer: JestPuppeteer,
      page: Page,
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
    ): Global_ = {
      val __obj = js.Dynamic.literal(Array = js.Any.fromFunction0(Array), ArrayBuffer = ArrayBuffer.asInstanceOf[js.Any], Boolean = js.Any.fromFunction0(Boolean), Buffer = Buffer.asInstanceOf[js.Any], DataView = DataView.asInstanceOf[js.Any], Date = js.Any.fromFunction0(Date), Error = js.Any.fromFunction0(Error), EvalError = js.Any.fromFunction0(EvalError), Float32Array = Float32Array.asInstanceOf[js.Any], Float64Array = Float64Array.asInstanceOf[js.Any], Function = js.Any.fromFunction1(Function), Infinity = Infinity.asInstanceOf[js.Any], Int16Array = Int16Array.asInstanceOf[js.Any], Int32Array = Int32Array.asInstanceOf[js.Any], Int8Array = Int8Array.asInstanceOf[js.Any], Intl = Intl.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Math = Math.asInstanceOf[js.Any], NaN = NaN.asInstanceOf[js.Any], Number = js.Any.fromFunction0(Number), Object = js.Any.fromFunction0(Object), Promise = Promise.asInstanceOf[js.Any], RangeError = js.Any.fromFunction0(RangeError), ReferenceError = js.Any.fromFunction0(ReferenceError), RegExp = js.Any.fromFunction1(RegExp), Set = Set.asInstanceOf[js.Any], String = js.Any.fromFunction0(String), Symbol = Symbol.asInstanceOf[js.Any], SyntaxError = js.Any.fromFunction0(SyntaxError), TypeError = js.Any.fromFunction0(TypeError), URIError = js.Any.fromFunction0(URIError), Uint16Array = Uint16Array.asInstanceOf[js.Any], Uint32Array = Uint32Array.asInstanceOf[js.Any], Uint8Array = Uint8Array.asInstanceOf[js.Any], Uint8ClampedArray = Uint8ClampedArray.asInstanceOf[js.Any], WeakMap = WeakMap.asInstanceOf[js.Any], WeakSet = WeakSet.asInstanceOf[js.Any], __coverage__ = __coverage__.asInstanceOf[js.Any], afterAll = js.Any.fromFunction2(afterAll), afterEach = js.Any.fromFunction2(afterEach), beforeAll = js.Any.fromFunction2(beforeAll), beforeEach = js.Any.fromFunction2(beforeEach), browser = browser.asInstanceOf[js.Any], clearImmediate = js.Any.fromFunction1(clearImmediate), clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), context = context.asInstanceOf[js.Any], decodeURI = js.Any.fromFunction1(decodeURI), decodeURIComponent = js.Any.fromFunction1(decodeURIComponent), describe = describe.asInstanceOf[js.Any], encodeURI = js.Any.fromFunction1(encodeURI), encodeURIComponent = js.Any.fromFunction1(encodeURIComponent), escape = js.Any.fromFunction1(escape), eval = js.Any.fromFunction1(eval), fail = js.Any.fromFunction0(fail), fdescribe = fdescribe.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], gc = js.Any.fromFunction0(gc), global = global.asInstanceOf[js.Any], isFinite = js.Any.fromFunction1(isFinite), isNaN = js.Any.fromFunction1(isNaN), it = it.asInstanceOf[js.Any], jasmine = jasmine.asInstanceOf[js.Any], jestPuppeteer = jestPuppeteer.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], parseFloat = js.Any.fromFunction1(parseFloat), parseInt = js.Any.fromFunction2(parseInt), pending = js.Any.fromFunction0(pending), queueMicrotask = js.Any.fromFunction1(queueMicrotask), setImmediate = js.Any.fromFunction2(setImmediate), setInterval = js.Any.fromFunction3(setInterval), setTimeout = js.Any.fromFunction3(setTimeout), spyOn = js.Any.fromFunction0(spyOn), spyOnProperty = js.Any.fromFunction0(spyOnProperty), test = test.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], unescape = js.Any.fromFunction1(unescape), xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xtest = xtest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global_]
    }
    
    @scala.inline
    implicit class Global_MutableBuilder[Self <: Global_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJestPuppeteer(value: JestPuppeteer): Self = StObject.set(x, "jestPuppeteer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
  
  trait JestPuppeteer extends StObject {
    
    /**
      * Suspends test execution and gives you opportunity to see what's going on in the browser
      * - Jest is suspended (no timeout)
      * - A debugger instruction to Chromium, if Puppeteer has been launched with { devtools: true } it will stop
      *
      * ```ts
      * it('should put test in debug mode', async () => {
      *   await jestPuppeteer.debug()
      * })
      * ```
      */
    def debug(): js.Promise[Unit]
    
    /**
      * Reset global.browser
      *
      * ```ts
      * beforeEach(async () => {
      *   await jestPuppeteer.resetBrowser()
      * })
      * ```
      */
    def resetBrowser(): js.Promise[Unit]
    
    /**
      * Reset global.page
      *
      * ```ts
      * beforeEach(async () => {
      *   await jestPuppeteer.resetPage()
      * })
      * ```
      */
    def resetPage(): js.Promise[Unit]
  }
  object JestPuppeteer {
    
    @scala.inline
    def apply(
      debug: () => js.Promise[Unit],
      resetBrowser: () => js.Promise[Unit],
      resetPage: () => js.Promise[Unit]
    ): JestPuppeteer = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), resetBrowser = js.Any.fromFunction0(resetBrowser), resetPage = js.Any.fromFunction0(resetPage))
      __obj.asInstanceOf[JestPuppeteer]
    }
    
    @scala.inline
    implicit class JestPuppeteerMutableBuilder[Self <: JestPuppeteer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: () => js.Promise[Unit]): Self = StObject.set(x, "debug", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetBrowser(value: () => js.Promise[Unit]): Self = StObject.set(x, "resetBrowser", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetPage(value: () => js.Promise[Unit]): Self = StObject.set(x, "resetPage", js.Any.fromFunction0(value))
    }
  }
  
  /** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
  @js.native
  trait PuppeteerEnvironment
    extends typings.jestEnvironmentNode.mod.^ {
    
    @JSName("global")
    var global_PuppeteerEnvironment: Global_ = js.native
  }
}
