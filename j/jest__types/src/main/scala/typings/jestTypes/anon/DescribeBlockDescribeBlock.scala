package typings.jestTypes.anon

import typings.jestTypes.circusMod.AsyncEvent
import typings.jestTypes.jestTypesStrings.run_describe_finish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBlockDescribeBlock
  extends StObject
     with AsyncEvent {
  
  var describeBlock: typings.jestTypes.circusMod.DescribeBlock
  
  var name: run_describe_finish
}
object DescribeBlockDescribeBlock {
  
  inline def apply(describeBlock: typings.jestTypes.circusMod.DescribeBlock): DescribeBlockDescribeBlock = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = "run_describe_finish")
    __obj.asInstanceOf[DescribeBlockDescribeBlock]
  }
  
  extension [Self <: DescribeBlockDescribeBlock](x: Self) {
    
    inline def setDescribeBlock(value: typings.jestTypes.circusMod.DescribeBlock): Self = StObject.set(x, "describeBlock", value.asInstanceOf[js.Any])
    
    inline def setName(value: run_describe_finish): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
