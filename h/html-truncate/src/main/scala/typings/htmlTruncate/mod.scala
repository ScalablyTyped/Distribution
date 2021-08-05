package typings.htmlTruncate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Truncate HTML text and also keep tag safe.
    */
  inline def apply(input: String, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(input: String, maxLength: Double, options: TruncateOptions): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("html-truncate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TruncateOptions extends StObject {
    
    /**
      * Omission symbol for truncated string, '...' by default.
      */
    var ellipsis: Boolean | String
    
    /**
      * Flag to specify if keep image tag, false by default.
      */
    var keepImageTag: Boolean
  }
  object TruncateOptions {
    
    inline def apply(ellipsis: Boolean | String, keepImageTag: Boolean): TruncateOptions = {
      val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], keepImageTag = keepImageTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[TruncateOptions]
    }
    
    extension [Self <: TruncateOptions](x: Self) {
      
      inline def setEllipsis(value: Boolean | String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setKeepImageTag(value: Boolean): Self = StObject.set(x, "keepImageTag", value.asInstanceOf[js.Any])
    }
  }
}
