package typings.jestTypes.mod

import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JestGlobals
  extends StObject
     with TestFrameworkGlobals {
  
  var expect: Any
}
object JestGlobals {
  
  inline def apply(
    afterAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
    afterEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
    beforeAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
    beforeEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
    describe: Describe,
    expect: Any,
    fdescribe: DescribeBase,
    fit: ItBaseconcurrentItConcurr,
    it: ItConcurrent,
    test: ItConcurrent,
    xdescribe: DescribeBase,
    xit: ItBase,
    xtest: ItBase
  ): JestGlobals = {
    val __obj = js.Dynamic.literal(afterAll = js.Any.fromFunction2(afterAll), afterEach = js.Any.fromFunction2(afterEach), beforeAll = js.Any.fromFunction2(beforeAll), beforeEach = js.Any.fromFunction2(beforeEach), describe = describe.asInstanceOf[js.Any], expect = expect.asInstanceOf[js.Any], fdescribe = fdescribe.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xtest = xtest.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestGlobals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JestGlobals] (val x: Self) extends AnyVal {
    
    inline def setExpect(value: Any): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
  }
}
