package typings.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBase extends js.Object {
  
  def apply(blockName: BlockName, blockFn: BlockFn): Unit = js.native
  
  var each: Each[BlockFn] = js.native
}
