package typings.jjv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Required extends StObject {
    
    var required: js.UndefOr[Boolean] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Required {
    
    @scala.inline
    def apply(): Required = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Required]
    }
    
    @scala.inline
    implicit class RequiredMutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
