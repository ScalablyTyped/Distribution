package typings.jupyterlabApputils

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabApputils.sanitizerMod.ISanitizer.IOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    trait IOptions extends StObject {
      
      /**
        * The allowed attributes for a given tag.
        */
      var allowedAttributes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
      
      /**
        * The allowed style values for a given tag.
        */
      var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[RegExp]]]] = js.undefined
      
      /**
        * The allowed tags.
        */
      var allowedTags: js.UndefOr[js.Array[String]] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAllowedAttributes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "allowedAttributes", value.asInstanceOf[js.Any])
        
        inline def setAllowedAttributesUndefined: Self = StObject.set(x, "allowedAttributes", js.undefined)
        
        inline def setAllowedStyles(value: StringDictionary[StringDictionary[js.Array[RegExp]]]): Self = StObject.set(x, "allowedStyles", value.asInstanceOf[js.Any])
        
        inline def setAllowedStylesUndefined: Self = StObject.set(x, "allowedStyles", js.undefined)
        
        inline def setAllowedTags(value: js.Array[String]): Self = StObject.set(x, "allowedTags", value.asInstanceOf[js.Any])
        
        inline def setAllowedTagsUndefined: Self = StObject.set(x, "allowedTags", js.undefined)
        
        inline def setAllowedTagsVarargs(value: String*): Self = StObject.set(x, "allowedTags", js.Array(value :_*))
      }
    }
  }
}
