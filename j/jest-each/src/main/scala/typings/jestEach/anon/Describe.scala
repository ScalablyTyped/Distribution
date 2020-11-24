package typings.jestEach.anon

import typings.jestTypes.globalMod.EachTestFn
import typings.jestTypes.globalMod.TestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Describe extends js.Object {
  
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
