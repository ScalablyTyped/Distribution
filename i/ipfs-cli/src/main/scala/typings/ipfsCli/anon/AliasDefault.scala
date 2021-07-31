package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasDefault extends StObject {
  
  var default: String
  
  var alias: String
  
  var describe: String
}
object AliasDefault {
  
  @scala.inline
  def apply(alias: String, default: String, describe: String): AliasDefault = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefault]
  }
  
  @scala.inline
  implicit class AliasDefaultMutableBuilder[Self <: AliasDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
  }
}
