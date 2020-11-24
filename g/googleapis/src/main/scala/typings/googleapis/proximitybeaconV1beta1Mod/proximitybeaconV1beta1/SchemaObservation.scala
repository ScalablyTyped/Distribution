package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents one beacon observed once.
  */
@js.native
trait SchemaObservation extends js.Object {
  
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
  implicit class SchemaObservationOps[Self <: SchemaObservation] (val x: Self) extends AnyVal {
    
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
    def setAdvertisedId(value: SchemaAdvertisedId): Self = this.set("advertisedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisedId: Self = this.set("advertisedId", js.undefined)
    
    @scala.inline
    def setTelemetry(value: String): Self = this.set("telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelemetry: Self = this.set("telemetry", js.undefined)
    
    @scala.inline
    def setTimestampMs(value: String): Self = this.set("timestampMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampMs: Self = this.set("timestampMs", js.undefined)
  }
}
