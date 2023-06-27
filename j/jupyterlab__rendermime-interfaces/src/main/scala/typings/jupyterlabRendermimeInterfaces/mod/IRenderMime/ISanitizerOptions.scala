package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to sanitize.
  */
trait ISanitizerOptions extends StObject {
  
  /**
    * The allowed attributes for a given tag.
    */
  var allowedAttributes: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  /**
    * The allowed style values for a given tag.
    */
  var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[js.RegExp]]]] = js.undefined
  
  /**
    * The allowed tags.
    */
  var allowedTags: js.UndefOr[js.Array[String]] = js.undefined
}
object ISanitizerOptions {
  
  inline def apply(): ISanitizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISanitizerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISanitizerOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowedAttributes(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "allowedAttributes", value.asInstanceOf[js.Any])
    
    inline def setAllowedAttributesUndefined: Self = StObject.set(x, "allowedAttributes", js.undefined)
    
    inline def setAllowedStyles(value: StringDictionary[StringDictionary[js.Array[js.RegExp]]]): Self = StObject.set(x, "allowedStyles", value.asInstanceOf[js.Any])
    
    inline def setAllowedStylesUndefined: Self = StObject.set(x, "allowedStyles", js.undefined)
    
    inline def setAllowedTags(value: js.Array[String]): Self = StObject.set(x, "allowedTags", value.asInstanceOf[js.Any])
    
    inline def setAllowedTagsUndefined: Self = StObject.set(x, "allowedTags", js.undefined)
    
    inline def setAllowedTagsVarargs(value: String*): Self = StObject.set(x, "allowedTags", js.Array(value*))
  }
}
