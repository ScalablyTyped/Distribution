package typings.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Describe extends DescribeBase {
  
  def only(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("only")
  var only_Original: DescribeBase = js.native
  
  def skip(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  @JSName("skip")
  var skip_Original: DescribeBase = js.native
}
