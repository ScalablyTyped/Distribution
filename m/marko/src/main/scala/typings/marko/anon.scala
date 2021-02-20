package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AttributeGroups extends StObject {
    
    var attributeGroups: js.Any = js.native
  }
  object AttributeGroups {
    
    @scala.inline
    def apply(attributeGroups: js.Any): AttributeGroups = {
      val __obj = js.Dynamic.literal(attributeGroups = attributeGroups.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeGroups]
    }
    
    @scala.inline
    implicit class AttributeGroupsMutableBuilder[Self <: AttributeGroups] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeGroups(value: js.Any): Self = StObject.set(x, "attributeGroups", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
