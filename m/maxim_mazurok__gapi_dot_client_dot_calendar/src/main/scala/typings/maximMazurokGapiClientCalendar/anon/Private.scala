package typings.maximMazurokGapiClientCalendar.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Private extends js.Object {
  
  /** Properties that are private to the copy of the event that appears on this calendar. */
  var `private`: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Private with TopLevel[js.Any]
  ] = js.native
  
  /** Properties that are shared between copies of the event on other attendees' calendars. */
  var shared: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Private with TopLevel[js.Any]
  ] = js.native
}
object Private {
  
  @scala.inline
  def apply(): Private = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Private]
  }
  
  @scala.inline
  implicit class PrivateOps[Self <: Private] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrivate(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Private with TopLevel[js.Any]
    ): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setShared(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Private with TopLevel[js.Any]
    ): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
  }
}
