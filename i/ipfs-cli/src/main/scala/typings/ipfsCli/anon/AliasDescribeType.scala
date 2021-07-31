package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasDescribeType extends StObject {
  
  var alias: String
  
  var describe: String
  
  var `type`: String
}
object AliasDescribeType {
  
  @scala.inline
  def apply(alias: String, describe: String, `type`: String): AliasDescribeType = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDescribeType]
  }
  
  @scala.inline
  implicit class AliasDescribeTypeMutableBuilder[Self <: AliasDescribeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
