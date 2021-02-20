package typings.jqueryElang

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IELangSearchEvents extends StObject {
  
  var select: JQueryDeferred[_] = js.native
}
object IELangSearchEvents {
  
  @scala.inline
  def apply(select: JQueryDeferred[_]): IELangSearchEvents = {
    val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangSearchEvents]
  }
  
  @scala.inline
  implicit class IELangSearchEventsMutableBuilder[Self <: IELangSearchEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelect(value: JQueryDeferred[_]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
