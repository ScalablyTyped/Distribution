package typings.jsonapiSerializer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait About extends StObject {
    
    var about: js.UndefOr[String] = js.native
  }
  object About {
    
    @scala.inline
    def apply(): About = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[About]
    }
    
    @scala.inline
    implicit class AboutMutableBuilder[Self <: About] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    }
  }
  
  @js.native
  trait Parameter extends StObject {
    
    var parameter: js.UndefOr[String] = js.native
    
    var pointer: js.UndefOr[String] = js.native
  }
  object Parameter {
    
    @scala.inline
    def apply(): Parameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameter]
    }
    
    @scala.inline
    implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
      
      @scala.inline
      def setPointer(value: String): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    }
  }
}
