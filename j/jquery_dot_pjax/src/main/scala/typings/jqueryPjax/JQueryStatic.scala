package typings.jqueryPjax

import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  /**
    * Loads a URL with ajax, puts the response body inside a container, then pushState()'s the loaded URL.
    * Works just like $.ajax in that it accepts a jQuery ajax settings object (with keys like url, type, data, etc).
    * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
    * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * - push: a boolean indicates whether to pushState the URL. Default is true.
    * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
    */
  def pjax(): JQueryXHR
  def pjax(options: PjaxSettings): JQueryXHR
  @JSName("pjax")
  var pjax_Original: PjaxStatic
}
object JQueryStatic {
  
  inline def apply(pjax: PjaxStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(pjax = pjax.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setPjax(value: PjaxStatic): Self = StObject.set(x, "pjax", value.asInstanceOf[js.Any])
  }
}
