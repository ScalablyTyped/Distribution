package typings.jqueryAreYouSure

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def areYouSure(): JQuery
  def areYouSure(options: AreYouSureOptions): JQuery
  @JSName("areYouSure")
  var areYouSure_Original: AreYouSure
}
object JQuery {
  
  inline def apply(areYouSure: AreYouSure): JQuery = {
    val __obj = js.Dynamic.literal(areYouSure = areYouSure.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setAreYouSure(value: AreYouSure): Self = StObject.set(x, "areYouSure", value.asInstanceOf[js.Any])
  }
}
