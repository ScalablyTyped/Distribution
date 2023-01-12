package typings.jestTypes.mod

import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def describe(blockName: BlockNameLike, blockFn: BlockFn): Unit
  @JSName("describe")
  var describe_Original: Describe
  
  def fdescribe(blockName: BlockNameLike, blockFn: BlockFn): Unit
  @JSName("fdescribe")
  var fdescribe_Original: DescribeBase
  
  def fit(testName: TestNameLike, fn: TestFn): Unit
  def fit(testName: TestNameLike, fn: TestFn, timeout: Double): Unit
  @JSName("fit")
  var fit_Original: ItBaseconcurrentItConcurr
  
  def it(testName: TestNameLike, fn: TestFn): Unit
  def it(testName: TestNameLike, fn: TestFn, timeout: Double): Unit
  @JSName("it")
  var it_Original: ItConcurrent
  
  def test(testName: TestNameLike, fn: TestFn): Unit
  def test(testName: TestNameLike, fn: TestFn, timeout: Double): Unit
  @JSName("test")
  var test_Original: ItConcurrent
  
  def xdescribe(blockName: BlockNameLike, blockFn: BlockFn): Unit
  @JSName("xdescribe")
  var xdescribe_Original: DescribeBase
  
  def xit(testName: TestNameLike, fn: TestFn): Unit
  def xit(testName: TestNameLike, fn: TestFn, timeout: Double): Unit
  @JSName("xit")
  var xit_Original: ItBase
  
  def xtest(testName: TestNameLike, fn: TestFn): Unit
  def xtest(testName: TestNameLike, fn: TestFn, timeout: Double): Unit
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestFrameworkGlobals] (val x: Self) extends AnyVal {
    
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
