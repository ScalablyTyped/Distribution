package typings.jestEach

import typings.jestTypes.mod.BlockFn
import typings.jestTypes.mod.BlockNameLike
import typings.jestTypes.mod.EachTestFn
import typings.jestTypes.mod.TestCallback
import typings.jestTypes.mod.TestFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(title: String, suite: EachTestFn[BlockFn]): Unit = js.native
    def apply(title: String, suite: EachTestFn[BlockFn], timeout: Double): Unit = js.native
    
    def only(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def only(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def skip(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def skip(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  }
  
  @js.native
  trait Concurrent extends StObject {
    
    def apply(title: String, test: EachTestFn[TestFn]): Unit = js.native
    def apply(title: String, test: EachTestFn[TestFn], timeout: Double): Unit = js.native
    
    var concurrent: Only = js.native
    
    def only(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def only(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def skip(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def skip(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  }
  
  @js.native
  trait Describe extends StObject {
    
    var describe: Call = js.native
    
    def fdescribe(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def fdescribe(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def fit(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def fit(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    var it: Concurrent = js.native
    
    var test: Concurrent = js.native
    
    def xdescribe(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def xdescribe(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def xit(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def xit(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def xtest(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def xtest(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  }
  
  @js.native
  trait Only extends StObject {
    
    def apply(title: String, test: EachTestFn[TestFn]): Unit = js.native
    def apply(title: String, test: EachTestFn[TestFn], timeout: Double): Unit = js.native
    
    def only(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def only(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
    
    def skip(title: BlockNameLike, test: EachTestFn[TestCallback]): Unit = js.native
    def skip(title: BlockNameLike, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  }
}
