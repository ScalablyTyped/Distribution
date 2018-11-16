package typings
package jestDashEachLib.jestDashEachMod.JestEachNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeObj extends js.Object {
  @JSName("only")
  var only_Original: DescribeFn = js.native
  @JSName("skip")
  var skip_Original: DescribeFn = js.native
  def apply(name: java.lang.String, fn: DescribeFn): scala.Unit = js.native
  def only(name: java.lang.String, fn: SyncCallback): scala.Unit = js.native
  def skip(name: java.lang.String, fn: SyncCallback): scala.Unit = js.native
}

