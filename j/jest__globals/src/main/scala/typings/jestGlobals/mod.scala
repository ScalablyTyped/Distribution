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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/globals", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val afterAll: HookBase with FnCallFnTimeout = js.native
  
  val afterEach: HookBase with FnCallFnTimeout = js.native
  
  val beforeAll: HookBase with FnCallFnTimeout = js.native
  
  val beforeEach: HookBase with FnCallFnTimeout = js.native
  
  val describe: Describe with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  val expect: Expect = js.native
  
  val fdescribe: DescribeBase with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  val fit: ItBaseconcurrentItConcurr with FnCall = js.native
  
  val it: ItConcurrent with FnCall = js.native
  
  val jest: Jest = js.native
  
  val test: ItConcurrent with FnCall = js.native
  
  val xdescribe: DescribeBase with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  val xit: ItBase with FnCall = js.native
  
  val xtest: ItBase with FnCall = js.native
}
