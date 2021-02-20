package typings.jestEach

import typings.jestTypes.globalMod.BlockFn
import typings.jestTypes.globalMod.EachTestFn
import typings.jestTypes.globalMod.TestCallback
import typings.jestTypes.globalMod.TestFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Arguments extends StObject {
    
    var arguments: js.Array[_] = js.native
    
    var title: String = js.native
  }
  object Arguments {
    
    @scala.inline
    def apply(arguments: js.Array[_], title: String): Arguments = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arguments]
    }
    
    @scala.inline
    implicit class ArgumentsMutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Array[_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(title: String, suite: EachTestFn[BlockFn]): Unit = js.native
    def apply(title: String, suite: EachTestFn[BlockFn], timeout: Double): Unit = js.native
    
    def only(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def only(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def skip(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def skip(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  }
  
  @js.native
  trait Concurrent extends StObject {
    
    def apply(title: String, test: EachTestFn[TestFn]): Unit = js.native
    def apply(title: String, test: EachTestFn[TestFn], timeout: Double): Unit = js.native
    
    var concurrent: Only = js.native
    
    def only(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def only(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def skip(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def skip(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  }
  
  @js.native
  trait Describe extends StObject {
    
    var describe: Call = js.native
    
    def fdescribe(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def fdescribe(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def fit(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def fit(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    var it: Concurrent = js.native
    
    var test: Concurrent = js.native
    
    def xdescribe(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def xdescribe(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def xit(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def xit(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def xtest(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def xtest(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  }
  
  @js.native
  trait Only extends StObject {
    
    def apply(title: String, test: EachTestFn[TestFn]): Unit = js.native
    def apply(title: String, test: EachTestFn[TestFn], timeout: Double): Unit = js.native
    
    def only(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def only(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def skip(title: String, test: EachTestFn[TestCallback]): Unit = js.native
    def skip(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  }
}
