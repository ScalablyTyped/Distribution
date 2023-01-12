package typings.jestEach

import typings.jestTypes.mod.BlockFn
import typings.jestTypes.mod.EachTestFn
import typings.jestTypes.mod.TestFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(title: String, suite: EachTestFn[BlockFn]): Any = js.native
    def apply(title: String, suite: EachTestFn[BlockFn], timeout: Double): Any = js.native
    
    var only: Any = js.native
    
    var skip: Any = js.native
  }
  
  @js.native
  trait Concurrent extends StObject {
    
    def apply(title: String, test: EachTestFn[TestFn]): Any = js.native
    def apply(title: String, test: EachTestFn[TestFn], timeout: Double): Any = js.native
    
    def concurrent(title: String, test: EachTestFn[TestFn]): Any = js.native
    def concurrent(title: String, test: EachTestFn[TestFn], timeout: Double): Any = js.native
    @JSName("concurrent")
    var concurrent_Original: Only = js.native
    
    var only: Any = js.native
    
    var skip: Any = js.native
  }
  
  trait Describe extends StObject {
    
    def describe(title: String, suite: EachTestFn[BlockFn]): Any
    def describe(title: String, suite: EachTestFn[BlockFn], timeout: Double): Any
    @JSName("describe")
    var describe_Original: Call
    
    var fdescribe: Any
    
    var fit: Any
    
    def it(title: String, test: EachTestFn[TestFn]): Any
    def it(title: String, test: EachTestFn[TestFn], timeout: Double): Any
    @JSName("it")
    var it_Original: Concurrent
    
    def test(title: String, test: EachTestFn[TestFn]): Any
    def test(title: String, test: EachTestFn[TestFn], timeout: Double): Any
    @JSName("test")
    var test_Original: Concurrent
    
    var xdescribe: Any
    
    var xit: Any
    
    var xtest: Any
  }
  object Describe {
    
    inline def apply(
      describe: Call,
      fdescribe: Any,
      fit: Any,
      it: Concurrent,
      test: Concurrent,
      xdescribe: Any,
      xit: Any,
      xtest: Any
    ): Describe = {
      val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any], fdescribe = fdescribe.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xtest = xtest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Describe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Describe] (val x: Self) extends AnyVal {
      
      inline def setDescribe(value: Call): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setFdescribe(value: Any): Self = StObject.set(x, "fdescribe", value.asInstanceOf[js.Any])
      
      inline def setFit(value: Any): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setIt(value: Concurrent): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
      
      inline def setTest(value: Concurrent): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setXdescribe(value: Any): Self = StObject.set(x, "xdescribe", value.asInstanceOf[js.Any])
      
      inline def setXit(value: Any): Self = StObject.set(x, "xit", value.asInstanceOf[js.Any])
      
      inline def setXtest(value: Any): Self = StObject.set(x, "xtest", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Only extends StObject {
    
    def apply(title: String, test: EachTestFn[TestFn]): Any = js.native
    def apply(title: String, test: EachTestFn[TestFn], timeout: Double): Any = js.native
    
    var only: Any = js.native
    
    var skip: Any = js.native
  }
}
