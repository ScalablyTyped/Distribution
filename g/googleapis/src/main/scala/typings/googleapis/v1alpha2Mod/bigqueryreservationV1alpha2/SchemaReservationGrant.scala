package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReservationGrant extends StObject {
  
  /**
    * The resource which will use the reservation. E.g. projects/myproject, folders/123, organizations/456.
    */
  var grantee: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Which type of jobs will use the reservation.
    */
  var jobType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the resource. E.g.: projects/myproject/locations/eu/reservationGrants/123.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the reservation. E.g., projects/myproject/locations/eu/reservations/my_reservation. This reservation must be in the same location as the grant. This reservation should belong to the same parent project.
    */
  var reservation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the ReservationGrant.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaReservationGrant {
  
  inline def apply(): SchemaReservationGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReservationGrant]
  }
  
  extension [Self <: SchemaReservationGrant](x: Self) {
    
    inline def setGrantee(value: String): Self = StObject.set(x, "grantee", value.asInstanceOf[js.Any])
    
    inline def setGranteeNull: Self = StObject.set(x, "grantee", null)
    
    inline def setGranteeUndefined: Self = StObject.set(x, "grantee", js.undefined)
    
    inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeNull: Self = StObject.set(x, "jobType", null)
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReservation(value: String): Self = StObject.set(x, "reservation", value.asInstanceOf[js.Any])
    
    inline def setReservationNull: Self = StObject.set(x, "reservation", null)
    
    inline def setReservationUndefined: Self = StObject.set(x, "reservation", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
