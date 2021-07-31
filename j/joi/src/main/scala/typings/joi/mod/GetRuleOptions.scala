package typings.joi.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuleOptions extends StObject {
  
  var args: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var operator: js.UndefOr[String] = js.undefined
}
object GetRuleOptions {
  
  @scala.inline
  def apply(name: String): GetRuleOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleOptions]
  }
  
  @scala.inline
  implicit class GetRuleOptionsMutableBuilder[Self <: GetRuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: Record[String, js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
