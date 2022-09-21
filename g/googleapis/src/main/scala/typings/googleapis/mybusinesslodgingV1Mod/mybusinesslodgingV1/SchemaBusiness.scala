package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBusiness extends StObject {
  
  /**
    * Business center. A designated room at the hotel with one or more desks and equipped with guest-use computers, printers, fax machines and/or photocopiers. May or may not be open 24/7. May or may not require a key to access. Not a meeting room or conference room.
    */
  var businessCenter: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Business center exception.
    */
  var businessCenterException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Meeting rooms. Rooms at the hotel designated for business-related gatherings. Rooms are usually equipped with tables or desks, office chairs and audio/visual facilities to allow for presentations and conference calls. Also known as conference rooms.
    */
  var meetingRooms: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Meeting rooms count. The number of meeting rooms at the property.
    */
  var meetingRoomsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Meeting rooms count exception.
    */
  var meetingRoomsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Meeting rooms exception.
    */
  var meetingRoomsException: js.UndefOr[String | Null] = js.undefined
}
object SchemaBusiness {
  
  inline def apply(): SchemaBusiness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBusiness]
  }
  
  extension [Self <: SchemaBusiness](x: Self) {
    
    inline def setBusinessCenter(value: Boolean): Self = StObject.set(x, "businessCenter", value.asInstanceOf[js.Any])
    
    inline def setBusinessCenterException(value: String): Self = StObject.set(x, "businessCenterException", value.asInstanceOf[js.Any])
    
    inline def setBusinessCenterExceptionNull: Self = StObject.set(x, "businessCenterException", null)
    
    inline def setBusinessCenterExceptionUndefined: Self = StObject.set(x, "businessCenterException", js.undefined)
    
    inline def setBusinessCenterNull: Self = StObject.set(x, "businessCenter", null)
    
    inline def setBusinessCenterUndefined: Self = StObject.set(x, "businessCenter", js.undefined)
    
    inline def setMeetingRooms(value: Boolean): Self = StObject.set(x, "meetingRooms", value.asInstanceOf[js.Any])
    
    inline def setMeetingRoomsCount(value: Double): Self = StObject.set(x, "meetingRoomsCount", value.asInstanceOf[js.Any])
    
    inline def setMeetingRoomsCountException(value: String): Self = StObject.set(x, "meetingRoomsCountException", value.asInstanceOf[js.Any])
    
    inline def setMeetingRoomsCountExceptionNull: Self = StObject.set(x, "meetingRoomsCountException", null)
    
    inline def setMeetingRoomsCountExceptionUndefined: Self = StObject.set(x, "meetingRoomsCountException", js.undefined)
    
    inline def setMeetingRoomsCountNull: Self = StObject.set(x, "meetingRoomsCount", null)
    
    inline def setMeetingRoomsCountUndefined: Self = StObject.set(x, "meetingRoomsCount", js.undefined)
    
    inline def setMeetingRoomsException(value: String): Self = StObject.set(x, "meetingRoomsException", value.asInstanceOf[js.Any])
    
    inline def setMeetingRoomsExceptionNull: Self = StObject.set(x, "meetingRoomsException", null)
    
    inline def setMeetingRoomsExceptionUndefined: Self = StObject.set(x, "meetingRoomsException", js.undefined)
    
    inline def setMeetingRoomsNull: Self = StObject.set(x, "meetingRooms", null)
    
    inline def setMeetingRoomsUndefined: Self = StObject.set(x, "meetingRooms", js.undefined)
  }
}
