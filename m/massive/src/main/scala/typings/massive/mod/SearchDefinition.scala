package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDefinition extends StObject {
  
  var fields: js.Array[String]
  
  var term: String
  
  var where: AnyObject[Any]
}
object SearchDefinition {
  
  inline def apply(fields: js.Array[String], term: String, where: AnyObject[Any]): SearchDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchDefinition] (val x: Self) extends AnyVal {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setWhere(value: AnyObject[Any]): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
