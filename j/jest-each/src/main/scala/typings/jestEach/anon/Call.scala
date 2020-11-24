package typings.jestEach.anon

import typings.jestTypes.globalMod.BlockFn
import typings.jestTypes.globalMod.EachTestFn
import typings.jestTypes.globalMod.TestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(title: String, suite: EachTestFn[BlockFn]): Unit = js.native
  def apply(title: String, suite: EachTestFn[BlockFn], timeout: Double): Unit = js.native
  
  def only(title: String, test: EachTestFn[TestCallback]): Unit = js.native
  def only(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
  
  def skip(title: String, test: EachTestFn[TestCallback]): Unit = js.native
  def skip(title: String, test: EachTestFn[TestCallback], timeout: Double): Unit = js.native
}
