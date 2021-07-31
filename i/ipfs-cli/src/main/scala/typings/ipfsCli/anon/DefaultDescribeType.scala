package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDescribeType extends StObject {
  
  var default: Double
  
  var describe: String
  
  var `type`: String
}
object DefaultDescribeType {
  
  @scala.inline
  def apply(default: Double, describe: String, `type`: String): DefaultDescribeType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescribeType]
  }
  
  @scala.inline
  implicit class DefaultDescribeTypeMutableBuilder[Self <: DefaultDescribeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
