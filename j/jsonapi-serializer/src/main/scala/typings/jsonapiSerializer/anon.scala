package typings.jsonapiSerializer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait About extends StObject {
    
    var about: js.UndefOr[String] = js.undefined
  }
  object About {
    
    inline def apply(): About = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[About]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: About] (val x: Self) extends AnyVal {
      
      inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    }
  }
  
  trait Parameter extends StObject {
    
    var parameter: js.UndefOr[String] = js.undefined
    
    var pointer: js.UndefOr[String] = js.undefined
  }
  object Parameter {
    
    inline def apply(): Parameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
      
      inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
      
      inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
      
      inline def setPointer(value: String): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      inline def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    }
  }
}
