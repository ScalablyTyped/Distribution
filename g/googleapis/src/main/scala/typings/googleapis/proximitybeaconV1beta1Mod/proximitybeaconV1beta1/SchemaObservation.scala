package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents one beacon observed once.
  */
@js.native
trait SchemaObservation extends StObject {
  
  /**
    * The ID advertised by the beacon the client has encountered.  If the
    * submitted `advertised_id` type is Eddystone-EID, then the client must be
    * authorized to resolve the given beacon. Otherwise no data will be
    * returned for that beacon. Required.
    */
  var advertisedId: js.UndefOr[SchemaAdvertisedId] = js.native
  
  /**
    * The array of telemetry bytes received from the beacon. The server is
    * responsible for parsing it. This field may frequently be empty, as with a
    * beacon that transmits telemetry only occasionally.
    */
  var telemetry: js.UndefOr[String] = js.native
  
  /**
    * Time when the beacon was observed.
    */
  var timestampMs: js.UndefOr[String] = js.native
}
object SchemaObservation {
  
  @scala.inline
  def apply(): SchemaObservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObservation]
  }
  
  @scala.inline
  implicit class SchemaObservationMutableBuilder[Self <: SchemaObservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisedId(value: SchemaAdvertisedId): Self = StObject.set(x, "advertisedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisedIdUndefined: Self = StObject.set(x, "advertisedId", js.undefined)
    
    @scala.inline
    def setTelemetry(value: String): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    @scala.inline
    def setTimestampMs(value: String): Self = StObject.set(x, "timestampMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMsUndefined: Self = StObject.set(x, "timestampMs", js.undefined)
  }
}
