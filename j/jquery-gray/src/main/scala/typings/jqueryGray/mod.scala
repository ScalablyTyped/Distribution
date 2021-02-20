package typings.jqueryGray

import typings.jqueryGray.jqueryGrayStrings.`grayscale-off`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* Inlined std.Partial<{  fade :string}> */
  @js.native
  trait Classes extends StObject {
    
    var fade: js.UndefOr[String] = js.native
  }
  object Classes {
    
    @scala.inline
    def apply(): Classes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Classes]
    }
    
    @scala.inline
    implicit class ClassesMutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFade(value: String): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  fade :boolean,   classes :jquery-gray.jquery-gray.Classes}> */
  @js.native
  trait Options extends StObject {
    
    var classes: js.UndefOr[Classes] = js.native
    
    var fade: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Classes): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
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
