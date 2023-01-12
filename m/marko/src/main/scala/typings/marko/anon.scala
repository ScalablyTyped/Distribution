package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttributeGroups extends StObject {
    
    var attributeGroups: Any
  }
  object AttributeGroups {
    
    inline def apply(attributeGroups: Any): AttributeGroups = {
      val __obj = js.Dynamic.literal(attributeGroups = attributeGroups.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeGroups]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeGroups] (val x: Self) extends AnyVal {
      
      inline def setAttributeGroups(value: Any): Self = StObject.set(x, "attributeGroups", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
