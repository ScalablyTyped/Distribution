package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttributeGroups extends StObject {
    
    var attributeGroups: js.Any
  }
  object AttributeGroups {
    
    inline def apply(attributeGroups: js.Any): AttributeGroups = {
      val __obj = js.Dynamic.literal(attributeGroups = attributeGroups.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeGroups]
    }
    
    extension [Self <: AttributeGroups](x: Self) {
      
      inline def setAttributeGroups(value: js.Any): Self = StObject.set(x, "attributeGroups", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
