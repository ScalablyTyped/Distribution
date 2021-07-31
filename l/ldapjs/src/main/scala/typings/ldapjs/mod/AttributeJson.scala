package typings.ldapjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeJson extends StObject {
  
  var `type`: String
  
  var vals: js.Array[String]
}
object AttributeJson {
  
  @scala.inline
  def apply(`type`: String, vals: js.Array[String]): AttributeJson = {
    val __obj = js.Dynamic.literal(vals = vals.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeJson]
  }
  
  @scala.inline
  implicit class AttributeJsonMutableBuilder[Self <: AttributeJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVals(value: js.Array[String]): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValsVarargs(value: String*): Self = StObject.set(x, "vals", js.Array(value :_*))
  }
}
