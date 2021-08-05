package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the requested beacons, optionally including attachment
  * data.
  */
trait SchemaGetInfoForObservedBeaconsResponse extends StObject {
  
  /**
    * Public information about beacons. May be empty if the request matched no
    * beacons.
    */
  var beacons: js.UndefOr[js.Array[SchemaBeaconInfo]] = js.undefined
}
object SchemaGetInfoForObservedBeaconsResponse {
  
  inline def apply(): SchemaGetInfoForObservedBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetInfoForObservedBeaconsResponse]
  }
  
  extension [Self <: SchemaGetInfoForObservedBeaconsResponse](x: Self) {
    
    inline def setBeacons(value: js.Array[SchemaBeaconInfo]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    inline def setBeaconsUndefined: Self = StObject.set(x, "beacons", js.undefined)
    
    inline def setBeaconsVarargs(value: SchemaBeaconInfo*): Self = StObject.set(x, "beacons", js.Array(value :_*))
  }
}
