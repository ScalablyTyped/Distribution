package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChoicesDefault extends StObject {
  
  var default: String
  
  var choices: js.Array[String]
  
  var describe: String
  
  var `type`: String
}
object ChoicesDefault {
  
  @scala.inline
  def apply(choices: js.Array[String], default: String, describe: String, `type`: String): ChoicesDefault = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoicesDefault]
  }
  
  @scala.inline
  implicit class ChoicesDefaultMutableBuilder[Self <: ChoicesDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
