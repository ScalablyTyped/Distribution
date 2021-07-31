package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Diagnostics for a single beacon.
  */
trait SchemaDiagnostics extends StObject {
  
  /**
    * An unordered list of Alerts that the beacon has.
    */
  var alerts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Resource name of the beacon. For Eddystone-EID beacons, this may be the
    * beacon&#39;s current EID, or the beacon&#39;s &quot;stable&quot;
    * Eddystone-UID.
    */
  var beaconName: js.UndefOr[String] = js.undefined
  
  /**
    * The date when the battery is expected to be low. If the value is missing
    * then there is no estimate for when the battery will be low. This value is
    * only an estimate, not an exact date.
    */
  var estimatedLowBatteryDate: js.UndefOr[SchemaDate] = js.undefined
}
object SchemaDiagnostics {
  
  @scala.inline
  def apply(): SchemaDiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiagnostics]
  }
  
  @scala.inline
  implicit class SchemaDiagnosticsMutableBuilder[Self <: SchemaDiagnostics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlerts(value: js.Array[String]): Self = StObject.set(x, "alerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertsUndefined: Self = StObject.set(x, "alerts", js.undefined)
    
    @scala.inline
    def setAlertsVarargs(value: String*): Self = StObject.set(x, "alerts", js.Array(value :_*))
    
    @scala.inline
    def setBeaconName(value: String): Self = StObject.set(x, "beaconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconNameUndefined: Self = StObject.set(x, "beaconName", js.undefined)
    
    @scala.inline
    def setEstimatedLowBatteryDate(value: SchemaDate): Self = StObject.set(x, "estimatedLowBatteryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedLowBatteryDateUndefined: Self = StObject.set(x, "estimatedLowBatteryDate", js.undefined)
  }
}
