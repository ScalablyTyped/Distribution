package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasCoerce extends StObject {
  
  var default: Boolean
  
  var alias: String
  
  def coerce(value: js.Any): js.Any
  
  var describe: String
  
  var `type`: String
}
object AliasCoerce {
  
  inline def apply(alias: String, coerce: js.Any => js.Any, default: Boolean, describe: String, `type`: String): AliasCoerce = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], coerce = js.Any.fromFunction1(coerce), default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasCoerce]
  }
  
  extension [Self <: AliasCoerce](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setCoerce(value: js.Any => js.Any): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
