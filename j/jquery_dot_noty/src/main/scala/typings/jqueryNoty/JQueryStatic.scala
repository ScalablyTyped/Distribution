package typings.jqueryNoty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def noty(notyOptions: NotyOptions): Any
  @JSName("noty")
  var noty_Original: NotyStatic
}
object JQueryStatic {
  
  inline def apply(noty: NotyStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(noty = noty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setNoty(value: NotyStatic): Self = StObject.set(x, "noty", value.asInstanceOf[js.Any])
  }
}
