package typings.inert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait RelativeTo extends StObject {
    
    /**
      * Set the relative path
      */
    var relativeTo: String = js.native
  }
  object RelativeTo {
    
    @scala.inline
    def apply(relativeTo: String): RelativeTo = {
      val __obj = js.Dynamic.literal(relativeTo = relativeTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTo]
    }
    
    @scala.inline
    implicit class RelativeToMutableBuilder[Self <: RelativeTo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelativeTo(value: String): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    }
  }
}
