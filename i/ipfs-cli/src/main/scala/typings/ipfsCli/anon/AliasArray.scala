package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasArray extends StObject {
  
  var default: Double
  
  var alias: js.Array[String]
  
  var describe: String
  
  var `type`: String
}
object AliasArray {
  
  inline def apply(alias: js.Array[String], default: Double, describe: String, `type`: String): AliasArray = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasArray]
  }
  
  extension [Self <: AliasArray](x: Self) {
    
    inline def setAlias(value: js.Array[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasVarargs(value: String*): Self = StObject.set(x, "alias", js.Array(value :_*))
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
