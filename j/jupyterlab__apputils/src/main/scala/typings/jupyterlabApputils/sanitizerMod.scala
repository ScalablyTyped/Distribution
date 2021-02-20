package typings.jupyterlabApputils

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabApputils.sanitizerMod.ISanitizer.IOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizerMod {
  
  @JSImport("@jupyterlab/apputils/lib/sanitizer", "defaultSanitizer")
  @js.native
  val defaultSanitizer: ISanitizer = js.native
  
  @js.native
  trait ISanitizer extends StObject {
    
    /**
      * Sanitize an HTML string.
      *
      * @param dirty - The dirty text.
      *
      * @param options - The optional sanitization options.
      *
      * @returns The sanitized string.
      */
    def sanitize(dirty: String): String = js.native
    def sanitize(dirty: String, options: IOptions): String = js.native
  }
  object ISanitizer {
    
    /**
      * The options used to sanitize.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The allowed attributes for a given tag.
        */
      var allowedAttributes: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
      
      /**
        * The allowed style values for a given tag.
        */
      var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[RegExp]]]] = js.native
      
      /**
        * The allowed tags.
        */
      var allowedTags: js.UndefOr[js.Array[String]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowedAttributes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "allowedAttributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowedAttributesUndefined: Self = StObject.set(x, "allowedAttributes", js.undefined)
        
        @scala.inline
        def setAllowedStyles(value: StringDictionary[StringDictionary[js.Array[RegExp]]]): Self = StObject.set(x, "allowedStyles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowedStylesUndefined: Self = StObject.set(x, "allowedStyles", js.undefined)
        
        @scala.inline
        def setAllowedTags(value: js.Array[String]): Self = StObject.set(x, "allowedTags", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowedTagsUndefined: Self = StObject.set(x, "allowedTags", js.undefined)
        
        @scala.inline
        def setAllowedTagsVarargs(value: String*): Self = StObject.set(x, "allowedTags", js.Array(value :_*))
      }
    }
  }
}
