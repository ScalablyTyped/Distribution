package typings.maximMazurokGapiClientBigqueryreservation.gapi.client.bigqueryreservation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiReservation extends StObject {
  
  /** The resource name of the singleton BI reservation. Reservation names have the form `projects/{project_id}/locations/{location_id}/bireservation`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Size of a reservation, in bytes. */
  var size: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update timestamp of a reservation. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object BiReservation {
  
  @scala.inline
  def apply(): BiReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiReservation]
  }
  
  @scala.inline
  implicit class BiReservationMutableBuilder[Self <: BiReservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
