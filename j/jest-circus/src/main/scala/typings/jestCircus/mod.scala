package typings.jestCircus

import typings.jestCircus.anon.Call
import typings.jestCircus.anon.Each
import typings.jestTypes.mod.BlockFn
import typings.jestTypes.mod.BlockNameLike
import typings.jestTypes.mod.EachTestFn
import typings.jestTypes.mod.HookFn
import typings.jestTypes.mod.It
import typings.jestTypes.mod.RunResult
import typings.jestTypes.mod.TestFn
import typings.jestTypes.mod.TestNameLike
import typings.std.Event
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-circus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("jest-circus", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jest-circus", "default.afterAll")
    @js.native
    def afterAll: THook = js.native
    inline def afterAll(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterAll")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterAll(fn: HookFn, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterAll")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterAll_=(x: THook): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterAll")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-circus", "default.afterEach")
    @js.native
    def afterEach: THook = js.native
    inline def afterEach(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterEach(fn: HookFn, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterEach")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def afterEach_=(x: THook): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-circus", "default.beforeAll")
    @js.native
    def beforeAll: THook = js.native
    inline def beforeAll(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeAll")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeAll(fn: HookFn, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeAll")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeAll_=(x: THook): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeAll")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-circus", "default.beforeEach")
    @js.native
    def beforeEach: THook = js.native
    inline def beforeEach(fn: HookFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeEach(fn: HookFn, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeEach")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def beforeEach_=(x: THook): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-circus", "default.describe")
    @js.native
    def describe: Each = js.native
    inline def describe(blockName: BlockNameLike, blockFn: BlockFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(blockName.asInstanceOf[js.Any], blockFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def describe_=(x: Each): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("describe")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-circus", "default.it")
    @js.native
    def it: It = js.native
    inline def it(testName: TestNameLike, fn: TestFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(testName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def it(testName: TestNameLike, fn: TestFn, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("it")(testName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def it_=(x: It): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("it")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-circus", "default.test")
    @js.native
    def test: It = js.native
    inline def test(testName: TestNameLike, fn: TestFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(testName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def test(testName: TestNameLike, fn: TestFn, timeout: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(testName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def test_=(x: It): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("test")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("jest-circus", "afterAll")
  @js.native
  val afterAll: THook = js.native
  
  @JSImport("jest-circus", "afterEach")
  @js.native
  val afterEach: THook = js.native
  
  @JSImport("jest-circus", "beforeAll")
  @js.native
  val beforeAll: THook = js.native
  
  @JSImport("jest-circus", "beforeEach")
  @js.native
  val beforeEach: THook = js.native
  
  object describe {
    
    inline def apply(blockName: BlockNameLike, blockFn: BlockFn): Unit = (^.asInstanceOf[js.Dynamic].apply(blockName.asInstanceOf[js.Any], blockFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("jest-circus", "describe")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jest-circus", "describe.each")
    @js.native
    def each: EachTestFn[Any] = js.native
    inline def each(args: Any*): ReturnType[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReturnType[Any]]
    inline def each_=(x: EachTestFn[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("each")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-circus", "describe.only")
    @js.native
    def only: Call = js.native
    inline def only(blockName: BlockNameLike, blockFn: BlockFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("only")(blockName.asInstanceOf[js.Any], blockFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def only_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("only")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-circus", "describe.skip")
    @js.native
    def skip: Call = js.native
    inline def skip(blockName: BlockNameLike, blockFn: BlockFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("skip")(blockName.asInstanceOf[js.Any], blockFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def skip_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skip")(x.asInstanceOf[js.Any])
  }
  
  inline def getState(): typings.jestTypes.mod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")().asInstanceOf[typings.jestTypes.mod.State]
  
  @JSImport("jest-circus", "it")
  @js.native
  val it: It = js.native
  
  inline def resetState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetState")().asInstanceOf[Unit]
  
  inline def run(): js.Promise[RunResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[js.Promise[RunResult]]
  
  inline def setState(state: typings.jestTypes.mod.State): typings.jestTypes.mod.State = ^.asInstanceOf[js.Dynamic].applyDynamic("setState")(state.asInstanceOf[js.Any]).asInstanceOf[typings.jestTypes.mod.State]
  
  @JSImport("jest-circus", "test")
  @js.native
  val test: It = js.native
  
  type Event2 = Event
  
  type State = typings.jestTypes.mod.State
  
  type THook = js.Function2[/* fn */ HookFn, /* timeout */ js.UndefOr[Double], Unit]
}
