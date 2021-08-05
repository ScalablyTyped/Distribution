package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasChoicesDefault extends StObject {
  
  var default: String
  
  var alias: String
  
  var choices: js.Array[String]
  
  var describe: String
  
  var `type`: String
}
object AliasChoicesDefault {
  
  inline def apply(alias: String, choices: js.Array[String], default: String, describe: String, `type`: String): AliasChoicesDefault = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasChoicesDefault]
  }
  
  extension [Self <: AliasChoicesDefault](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value :_*))
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
