package typings.jqueryGray

import typings.jqueryGray.jqueryGrayStrings.`grayscale-off`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  fade :string}> */
  trait Classes extends StObject {
    
    var fade: js.UndefOr[String] = js.undefined
  }
  object Classes {
    
    inline def apply(): Classes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Classes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
      
      inline def setFade(value: String): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  fade :boolean,   classes :jquery-gray.jquery-gray.Classes}> */
  trait Options extends StObject {
    
    var classes: js.UndefOr[Classes] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: Classes): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def gray(): JQuery = js.native
      def gray(options: Options): JQuery = js.native
      
      @JSName("toggleClass")
      def toggleClass_grayscaleoff(className: `grayscale-off`): JQuery = js.native
    }
  }
}
