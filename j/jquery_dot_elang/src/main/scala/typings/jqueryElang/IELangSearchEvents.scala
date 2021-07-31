package typings.jqueryElang

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IELangSearchEvents extends StObject {
  
  var select: JQueryDeferred[js.Any]
}
object IELangSearchEvents {
  
  @scala.inline
  def apply(select: JQueryDeferred[js.Any]): IELangSearchEvents = {
    val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangSearchEvents]
  }
  
  @scala.inline
  implicit class IELangSearchEventsMutableBuilder[Self <: IELangSearchEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelect(value: JQueryDeferred[js.Any]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
