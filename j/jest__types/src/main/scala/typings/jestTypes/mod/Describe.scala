package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Describe
  extends StObject
     with DescribeBase {
  
  def only(blockName: BlockNameLike, blockFn: BlockFn): Unit = js.native
  @JSName("only")
  var only_Original: DescribeBase = js.native
  
  def skip(blockName: BlockNameLike, blockFn: BlockFn): Unit = js.native
  @JSName("skip")
  var skip_Original: DescribeBase = js.native
}
