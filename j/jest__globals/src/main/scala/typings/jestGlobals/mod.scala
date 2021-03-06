package typings.jestGlobals

import typings.expect.typesMod.Expect
import typings.jestEnvironment.mod.Jest
import typings.jestGlobals.anon.FnCall
import typings.jestGlobals.anon.FnCallFnTimeout
import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import typings.jestTypes.globalMod.BlockFn
import typings.jestTypes.globalMod.BlockName
import typings.jestTypes.globalMod.Describe
import typings.jestTypes.globalMod.DescribeBase
import typings.jestTypes.globalMod.HookBase
import typings.jestTypes.globalMod.ItBase
import typings.jestTypes.globalMod.ItConcurrent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/globals", "afterAll")
  @js.native
  val afterAll: HookBase with FnCallFnTimeout = js.native
  
  @JSImport("@jest/globals", "afterEach")
  @js.native
  val afterEach: HookBase with FnCallFnTimeout = js.native
  
  @JSImport("@jest/globals", "beforeAll")
  @js.native
  val beforeAll: HookBase with FnCallFnTimeout = js.native
  
  @JSImport("@jest/globals", "beforeEach")
  @js.native
  val beforeEach: HookBase with FnCallFnTimeout = js.native
  
  @JSImport("@jest/globals", "describe")
  @js.native
  val describe: Describe with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "expect")
  @js.native
  val expect: Expect = js.native
  
  @JSImport("@jest/globals", "fdescribe")
  @js.native
  val fdescribe: DescribeBase with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "fit")
  @js.native
  val fit: ItBaseconcurrentItConcurr with FnCall = js.native
  
  @JSImport("@jest/globals", "it")
  @js.native
  val it: ItConcurrent with FnCall = js.native
  
  @JSImport("@jest/globals", "jest")
  @js.native
  val jest: Jest = js.native
  
  @JSImport("@jest/globals", "test")
  @js.native
  val test: ItConcurrent with FnCall = js.native
  
  @JSImport("@jest/globals", "xdescribe")
  @js.native
  val xdescribe: DescribeBase with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "xit")
  @js.native
  val xit: ItBase with FnCall = js.native
  
  @JSImport("@jest/globals", "xtest")
  @js.native
  val xtest: ItBase with FnCall = js.native
}
