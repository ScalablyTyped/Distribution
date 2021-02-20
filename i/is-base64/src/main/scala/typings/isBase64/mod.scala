package typings.isBase64

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-base64", JSImport.Namespace)
  @js.native
  def apply(string: String): Boolean = js.native
  @JSImport("is-base64", JSImport.Namespace)
  @js.native
  def apply(string: String, options: IsBase64Options): Boolean = js.native
  
  @js.native
  trait IsBase64Options extends StObject {
    
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    var allowMime: js.UndefOr[Boolean] = js.native
    
    var mimeRequired: js.UndefOr[Boolean] = js.native
    
    var paddingRequired: js.UndefOr[Boolean] = js.native
  }
  object IsBase64Options {
    
    @scala.inline
    def apply(): IsBase64Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsBase64Options]
    }
    
    @scala.inline
    implicit class IsBase64OptionsMutableBuilder[Self <: IsBase64Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setAllowMime(value: Boolean): Self = StObject.set(x, "allowMime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMimeUndefined: Self = StObject.set(x, "allowMime", js.undefined)
      
      @scala.inline
      def setMimeRequired(value: Boolean): Self = StObject.set(x, "mimeRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeRequiredUndefined: Self = StObject.set(x, "mimeRequired", js.undefined)
      
      @scala.inline
      def setPaddingRequired(value: Boolean): Self = StObject.set(x, "paddingRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRequiredUndefined: Self = StObject.set(x, "paddingRequired", js.undefined)
    }
  }
}
