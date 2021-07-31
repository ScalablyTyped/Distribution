package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasStringDefaultBoolean extends StObject {
  
  var default: Boolean
  
  var alias: String
  
  var `type`: String
}
object AliasStringDefaultBoolean {
  
  @scala.inline
  def apply(alias: String, default: Boolean, `type`: String): AliasStringDefaultBoolean = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasStringDefaultBoolean]
  }
  
  @scala.inline
  implicit class AliasStringDefaultBooleanMutableBuilder[Self <: AliasStringDefaultBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
