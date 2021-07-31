package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDefinition extends StObject {
  
  var fields: js.Array[String]
  
  var term: String
  
  var where: AnyObject[js.Any]
}
object SearchDefinition {
  
  @scala.inline
  def apply(fields: js.Array[String], term: String, where: AnyObject[js.Any]): SearchDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDefinition]
  }
  
  @scala.inline
  implicit class SearchDefinitionMutableBuilder[Self <: SearchDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: AnyObject[js.Any]): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
