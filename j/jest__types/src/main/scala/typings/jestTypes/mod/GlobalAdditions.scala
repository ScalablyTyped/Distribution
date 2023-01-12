package typings.jestTypes.mod

import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.jestTypes.anon.ItBaseconcurrentItConcurr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalAdditions
  extends StObject
     with TestFrameworkGlobals {
  
  var __coverage__ : CoverageMapData
}
object GlobalAdditions {
  
  inline def apply(
    __coverage__ : CoverageMapData,
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
  ): GlobalAdditions = {
    val __obj = js.Dynamic.literal(__coverage__ = __coverage__.asInstanceOf[js.Any], afterAll = js.Any.fromFunction2(afterAll), afterEach = js.Any.fromFunction2(afterEach), beforeAll = js.Any.fromFunction2(beforeAll), beforeEach = js.Any.fromFunction2(beforeEach), describe = describe.asInstanceOf[js.Any], fdescribe = fdescribe.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xtest = xtest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalAdditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalAdditions] (val x: Self) extends AnyVal {
    
    inline def set__coverage__(value: CoverageMapData): Self = StObject.set(x, "__coverage__", value.asInstanceOf[js.Any])
  }
}
