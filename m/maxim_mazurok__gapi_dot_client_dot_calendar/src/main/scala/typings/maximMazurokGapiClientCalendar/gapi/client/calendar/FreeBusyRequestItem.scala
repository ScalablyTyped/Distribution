package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeBusyRequestItem extends StObject {
  
  /** The identifier of a calendar or a group. */
  var id: js.UndefOr[String] = js.undefined
}
object FreeBusyRequestItem {
  
  @scala.inline
  def apply(): FreeBusyRequestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyRequestItem]
  }
  
  @scala.inline
  implicit class FreeBusyRequestItemMutableBuilder[Self <: FreeBusyRequestItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
