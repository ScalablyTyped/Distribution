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
    var ellipsis: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Flag to specify if keep image tag, false by default.
      */
    var keepImageTag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tolerance when options.truncateLastWord is false before we give up and just truncate at the maxLength position, 10 by default (but not greater than maxLength)
      */
    var slop: js.UndefOr[Double] = js.undefined
    
    /**
      * truncates last word, true by default
      */
    var truncateLastWord: js.UndefOr[Boolean] = js.undefined
  }
  object TruncateOptions {
    
    inline def apply(): TruncateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TruncateOptions] (val x: Self) extends AnyVal {
      
      inline def setEllipsis(value: Boolean | String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setKeepImageTag(value: Boolean): Self = StObject.set(x, "keepImageTag", value.asInstanceOf[js.Any])
      
      inline def setKeepImageTagUndefined: Self = StObject.set(x, "keepImageTag", js.undefined)
      
      inline def setSlop(value: Double): Self = StObject.set(x, "slop", value.asInstanceOf[js.Any])
      
      inline def setSlopUndefined: Self = StObject.set(x, "slop", js.undefined)
      
      inline def setTruncateLastWord(value: Boolean): Self = StObject.set(x, "truncateLastWord", value.asInstanceOf[js.Any])
      
      inline def setTruncateLastWordUndefined: Self = StObject.set(x, "truncateLastWord", js.undefined)
    }
  }
}
