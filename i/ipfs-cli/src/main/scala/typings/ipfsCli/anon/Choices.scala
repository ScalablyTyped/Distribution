package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Choices extends StObject {
  
  var choices: js.Array[String]
  
  var describe: String
  
  var `type`: String
}
object Choices {
  
  @scala.inline
  def apply(choices: js.Array[String], describe: String, `type`: String): Choices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
  
  @scala.inline
  implicit class ChoicesMutableBuilder[Self <: Choices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value :_*))
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
