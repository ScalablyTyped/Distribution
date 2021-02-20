package typings.htmlTruncate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Truncate HTML text and also keep tag safe.
    */
  @JSImport("html-truncate", JSImport.Namespace)
  @js.native
  def apply(input: String, maxLength: Double): String = js.native
  @JSImport("html-truncate", JSImport.Namespace)
  @js.native
  def apply(input: String, maxLength: Double, options: TruncateOptions): String = js.native
  
  @js.native
  trait TruncateOptions extends StObject {
    
    /**
      * Omission symbol for truncated string, '...' by default.
      */
    var ellipsis: Boolean | String = js.native
    
    /**
      * Flag to specify if keep image tag, false by default.
      */
    var keepImageTag: Boolean = js.native
  }
  object TruncateOptions {
    
    @scala.inline
    def apply(ellipsis: Boolean | String, keepImageTag: Boolean): TruncateOptions = {
      val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], keepImageTag = keepImageTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TruncateOptions]
    }
    
    @scala.inline
    implicit class TruncateOptionsMutableBuilder[Self <: TruncateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipsis(value: Boolean | String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepImageTag(value: Boolean): Self = StObject.set(x, "keepImageTag", value.asInstanceOf[js.Any])
    }
  }
}
