package typings.juiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mozilla extends StObject {
    
    /** Mozilla 브라우저 체크 */
    var mozilla: Boolean
    
    /** IE 브라우저 체크 */
    var msie: Boolean
    
    /** Webkit 브라우저 체크 */
    var webkit: Boolean
  }
  object Mozilla {
    
    inline def apply(mozilla: Boolean, msie: Boolean, webkit: Boolean): Mozilla = {
      val __obj = js.Dynamic.literal(mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mozilla]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mozilla] (val x: Self) extends AnyVal {
      
      inline def setMozilla(value: Boolean): Self = StObject.set(x, "mozilla", value.asInstanceOf[js.Any])
      
      inline def setMsie(value: Boolean): Self = StObject.set(x, "msie", value.asInstanceOf[js.Any])
      
      inline def setWebkit(value: Boolean): Self = StObject.set(x, "webkit", value.asInstanceOf[js.Any])
    }
  }
}
