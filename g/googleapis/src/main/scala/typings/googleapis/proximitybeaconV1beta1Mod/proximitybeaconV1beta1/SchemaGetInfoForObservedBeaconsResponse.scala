package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the requested beacons, optionally including attachment
  * data.
  */
@js.native
trait SchemaGetInfoForObservedBeaconsResponse extends StObject {
  
  /**
    * Public information about beacons. May be empty if the request matched no
    * beacons.
    */
  var beacons: js.UndefOr[js.Array[SchemaBeaconInfo]] = js.native
}
object SchemaGetInfoForObservedBeaconsResponse {
  
  @scala.inline
  def apply(): SchemaGetInfoForObservedBeaconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetInfoForObservedBeaconsResponse]
  }
  
  @scala.inline
  implicit class SchemaGetInfoForObservedBeaconsResponseMutableBuilder[Self <: SchemaGetInfoForObservedBeaconsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacons(value: js.Array[SchemaBeaconInfo]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconsUndefined: Self = StObject.set(x, "beacons", js.undefined)
    
    @scala.inline
    def setBeaconsVarargs(value: SchemaBeaconInfo*): Self = StObject.set(x, "beacons", js.Array(value :_*))
  }
}
