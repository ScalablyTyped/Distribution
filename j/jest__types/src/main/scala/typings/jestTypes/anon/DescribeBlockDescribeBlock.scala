package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.jestTypesStrings.run_describe_finish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBlockDescribeBlock extends AsyncEvent {
  
  var describeBlock: typings.jestTypes.circusMod.DescribeBlock = js.native
  
  var name: run_describe_finish = js.native
}
object DescribeBlockDescribeBlock {
  
  @scala.inline
  def apply(describeBlock: typings.jestTypes.circusMod.DescribeBlock, name: run_describe_finish): DescribeBlockDescribeBlock = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBlockDescribeBlock]
  }
  
  @scala.inline
  implicit class DescribeBlockDescribeBlockMutableBuilder[Self <: DescribeBlockDescribeBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribeBlock(value: typings.jestTypes.circusMod.DescribeBlock): Self = StObject.set(x, "describeBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: run_describe_finish): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
