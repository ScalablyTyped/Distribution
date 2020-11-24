package typings.jestTypes.globalMod

import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestFrameworkGlobals extends js.Object {
  
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
  
  def describe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("describe")
  var describe_Original: Describe = js.native
  
  def fdescribe(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("fdescribe")
  var fdescribe_Original: DescribeBase = js.native
  
  def fit(testName: TestName, fn: TestFn): Unit = js.native
  def fit(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("fit")
  var fit_Original: ItBaseconcurrentItConcurr = js.native
  
  def it(testName: TestName, fn: TestFn): Unit = js.native
  def it(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("it")
  var it_Original: ItConcurrent = js.native
  
  def test(testName: TestName, fn: TestFn): Unit = js.native
  def test(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
  @JSName("test")
  var test_Original: ItConcurrent = js.native
  
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
