package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeType extends StObject {
  
  var describe: String
  
  var `type`: String
}
object DescribeType {
  
  @scala.inline
  def apply(describe: String, `type`: String): DescribeType = {
    val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeType]
  }
  
  @scala.inline
  implicit class DescribeTypeMutableBuilder[Self <: DescribeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
