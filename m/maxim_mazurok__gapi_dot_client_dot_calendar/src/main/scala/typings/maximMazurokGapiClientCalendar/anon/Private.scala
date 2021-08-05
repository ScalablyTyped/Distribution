package typings.maximMazurokGapiClientCalendar.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Private extends StObject {
  
  /** Properties that are private to the copy of the event that appears on this calendar. */
  var `private`: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Private & TopLevel[js.Any]
  ] = js.undefined
  
  /** Properties that are shared between copies of the event on other attendees' calendars. */
  var shared: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Private & TopLevel[js.Any]
  ] = js.undefined
}
object Private {
  
  inline def apply(): Private = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Private]
  }
  
  extension [Self <: Private](x: Self) {
    
    inline def setPrivate(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Private & TopLevel[js.Any]
    ): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setShared(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCalendar.maximMazurokGapiClientCalendarStrings.Private & TopLevel[js.Any]
    ): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
  }
}
