package typings.massive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<massive.massive.SearchDefinition, 'fields' | 'term'> */
  trait PickSearchDefinitionfield extends StObject {
    
    var fields: js.Array[String]
    
    var term: String
  }
  object PickSearchDefinitionfield {
    
    inline def apply(fields: js.Array[String], term: String): PickSearchDefinitionfield = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickSearchDefinitionfield]
    }
    
    extension [Self <: PickSearchDefinitionfield](x: Self) {
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
}
