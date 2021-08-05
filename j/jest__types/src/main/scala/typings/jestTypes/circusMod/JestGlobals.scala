package typings.jestTypes.circusMod

import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import typings.jestTypes.globalMod.Describe
import typings.jestTypes.globalMod.DescribeBase
import typings.jestTypes.globalMod.ItBase
import typings.jestTypes.globalMod.ItConcurrent
import typings.jestTypes.globalMod.TestFrameworkGlobals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JestGlobals
  extends StObject
     with TestFrameworkGlobals {
  
  var expect: js.Any
}
object JestGlobals {
  
  inline def apply(
    afterAll: (/* fn */ typings.jestTypes.globalMod.HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
    afterEach: (/* fn */ typings.jestTypes.globalMod.HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
    beforeAll: (/* fn */ typings.jestTypes.globalMod.HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
    beforeEach: (/* fn */ typings.jestTypes.globalMod.HookFn, /* timeout */ js.UndefOr[Double]) => Unit,
    describe: Describe,
    expect: js.Any,
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
  
  extension [Self <: JestGlobals](x: Self) {
    
    inline def setExpect(value: js.Any): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
  }
}
