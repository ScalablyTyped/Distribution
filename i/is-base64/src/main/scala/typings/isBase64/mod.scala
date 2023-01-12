package typings.isBase64

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(string: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(string: String, options: IsBase64Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("is-base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IsBase64Options extends StObject {
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var allowMime: js.UndefOr[Boolean] = js.undefined
    
    var mimeRequired: js.UndefOr[Boolean] = js.undefined
    
    var paddingRequired: js.UndefOr[Boolean] = js.undefined
  }
  object IsBase64Options {
    
    inline def apply(): IsBase64Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsBase64Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsBase64Options] (val x: Self) extends AnyVal {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setAllowMime(value: Boolean): Self = StObject.set(x, "allowMime", value.asInstanceOf[js.Any])
      
      inline def setAllowMimeUndefined: Self = StObject.set(x, "allowMime", js.undefined)
      
      inline def setMimeRequired(value: Boolean): Self = StObject.set(x, "mimeRequired", value.asInstanceOf[js.Any])
      
      inline def setMimeRequiredUndefined: Self = StObject.set(x, "mimeRequired", js.undefined)
      
      inline def setPaddingRequired(value: Boolean): Self = StObject.set(x, "paddingRequired", value.asInstanceOf[js.Any])
      
      inline def setPaddingRequiredUndefined: Self = StObject.set(x, "paddingRequired", js.undefined)
    }
  }
}
