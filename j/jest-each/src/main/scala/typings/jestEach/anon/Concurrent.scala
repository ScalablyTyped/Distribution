package typings.jestEach.anon

import typings.jestTypes.globalMod.EachTestFn
import typings.jestTypes.globalMod.TestCallback
import typings.jestTypes.globalMod.TestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Concurrent extends js.Object {
  
  def apply(title: String, test: EachTestFn[TestFn]): Unit = js.native
  def apply(title: String, test: EachTestFn[TestFn], timeout: Double): Unit = js.native
  
  var concurrent: Only = js.native
  
  def only(title: String, test: EachTestFn[TestCallback]): Unit = js.native
  def only(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  
  def skip(title: String, test: EachTestFn[TestCallback]): Unit = js.native
  def skip(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
}
