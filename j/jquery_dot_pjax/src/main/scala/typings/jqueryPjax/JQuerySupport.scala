package typings.jqueryPjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuerySupport extends StObject {
  
  /**
    * A boolean value indicates if pjax is supported by the browser.
    */
  var pjax: Boolean
}
object JQuerySupport {
  
  inline def apply(pjax: Boolean): JQuerySupport = {
    val __obj = js.Dynamic.literal(pjax = pjax.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
  
  extension [Self <: JQuerySupport](x: Self) {
    
    inline def setPjax(value: Boolean): Self = StObject.set(x, "pjax", value.asInstanceOf[js.Any])
  }
}
