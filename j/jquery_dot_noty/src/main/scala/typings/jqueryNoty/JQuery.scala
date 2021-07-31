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
  
  @scala.inline
  def apply(noty: Noty): JQuery = {
    val __obj = js.Dynamic.literal(noty = noty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoty(value: Noty): Self = StObject.set(x, "noty", value.asInstanceOf[js.Any])
  }
}
