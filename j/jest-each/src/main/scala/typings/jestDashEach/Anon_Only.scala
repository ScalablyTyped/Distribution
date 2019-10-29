package typings.jestDashEach

import typings.atJestTypes.buildGlobalMod.EachTestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Only extends js.Object {
  def apply(title: String, test: EachTestFn): Unit = js.native
  def apply(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def only(title: String, test: EachTestFn): Unit = js.native
  def only(title: String, test: EachTestFn, timeout: Double): Unit = js.native
  def skip(title: String, test: EachTestFn): Unit = js.native
  def skip(title: String, test: EachTestFn, timeout: Double): Unit = js.native
}

