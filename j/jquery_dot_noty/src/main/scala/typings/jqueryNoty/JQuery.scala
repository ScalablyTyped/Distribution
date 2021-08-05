package typings.jqueryNoty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def noty(notyOptions: NotyOptions): js.Any
  @JSName("noty")
  var noty_Original: Noty
}
object JQuery {
  
  inline def apply(noty: Noty): JQuery = {
    val __obj = js.Dynamic.literal(noty = noty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setNoty(value: Noty): Self = StObject.set(x, "noty", value.asInstanceOf[js.Any])
  }
}
