package typings.jqueryPlaceholder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CustomClass extends StObject {
    
    var customClass: String = js.native
  }
  object CustomClass {
    
    @scala.inline
    def apply(customClass: String): CustomClass = {
      val __obj = js.Dynamic.literal(customClass = customClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomClass]
    }
    
    @scala.inline
    implicit class CustomClassMutableBuilder[Self <: CustomClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomClass(value: String): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
    }
  }
}
