package typings.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Describe extends DescribeBase {
  @JSName("only")
  var only_Original: DescribeBase = js.native
  @JSName("skip")
  var skip_Original: DescribeBase = js.native
  def only(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  def skip(blockName: BlockName, blockFn: BlockFn): Unit = js.native
}

