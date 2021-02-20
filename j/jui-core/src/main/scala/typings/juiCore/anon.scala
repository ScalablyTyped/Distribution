package typings.juiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Mozilla extends StObject {
    
    /** Mozilla 브라우저 체크 */
    var mozilla: Boolean = js.native
    
    /** IE 브라우저 체크 */
    var msie: Boolean = js.native
    
    /** Webkit 브라우저 체크 */
    var webkit: Boolean = js.native
  }
  object Mozilla {
    
    @scala.inline
    def apply(mozilla: Boolean, msie: Boolean, webkit: Boolean): Mozilla = {
      val __obj = js.Dynamic.literal(mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mozilla]
    }
    
    @scala.inline
    implicit class MozillaMutableBuilder[Self <: Mozilla] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMozilla(value: Boolean): Self = StObject.set(x, "mozilla", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsie(value: Boolean): Self = StObject.set(x, "msie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
    }
  }
}
