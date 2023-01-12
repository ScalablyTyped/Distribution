package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchCriteria extends StObject {
  
  var fields: js.Array[String]
  
  var term: String
}
object SearchCriteria {
  
  inline def apply(fields: js.Array[String], term: String): SearchCriteria = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchCriteria] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
  }
}
