package typings.jestTypes.anon

import typings.jestTypes.jestTypesStrings.run_describe_finish
import typings.jestTypes.mod.AsyncEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBlockDescribeBlock
  extends StObject
     with AsyncEvent {
  
  var describeBlock: typings.jestTypes.mod.DescribeBlock
  
  var name: run_describe_finish
}
object DescribeBlockDescribeBlock {
  
  inline def apply(describeBlock: typings.jestTypes.mod.DescribeBlock): DescribeBlockDescribeBlock = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = "run_describe_finish")
    __obj.asInstanceOf[DescribeBlockDescribeBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBlockDescribeBlock] (val x: Self) extends AnyVal {
    
    inline def setDescribeBlock(value: typings.jestTypes.mod.DescribeBlock): Self = StObject.set(x, "describeBlock", value.asInstanceOf[js.Any])
    
    inline def setName(value: run_describe_finish): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
