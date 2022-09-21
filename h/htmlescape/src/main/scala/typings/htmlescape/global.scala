package typings.htmlescape

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object htmlescape {
    
    inline def apply(o: Any): String = ^.asInstanceOf[js.Dynamic].apply(o.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("htmlescape")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sanitize(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
