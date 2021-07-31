package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasDefaultDescribe extends StObject {
  
  var default: Double
  
  var alias: String
  
  var describe: String
  
  var `type`: String
}
object AliasDefaultDescribe {
  
  @scala.inline
  def apply(alias: String, default: Double, describe: String, `type`: String): AliasDefaultDescribe = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultDescribe]
  }
  
  @scala.inline
  implicit class AliasDefaultDescribeMutableBuilder[Self <: AliasDefaultDescribe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
