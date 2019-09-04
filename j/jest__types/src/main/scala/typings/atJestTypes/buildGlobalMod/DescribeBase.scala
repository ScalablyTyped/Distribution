package typings.atJestTypes.buildGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBase extends js.Object {
  @JSName("each")
  var each_Original: Each = js.native
  def apply(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  def each(table: EachTable, taggedTemplateData: js.Any*): js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit] = js.native
}

