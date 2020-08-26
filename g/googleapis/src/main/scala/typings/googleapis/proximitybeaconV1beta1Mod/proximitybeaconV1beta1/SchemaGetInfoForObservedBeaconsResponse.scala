package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the requested beacons, optionally including attachment
  * data.
  */
@js.native
trait SchemaGetInfoForObservedBeaconsResponse extends js.Object {
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
  implicit class SchemaGetInfoForObservedBeaconsResponseOps[Self <: SchemaGetInfoForObservedBeaconsResponse] (val x: Self) extends AnyVal {
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
    def setBeaconsVarargs(value: SchemaBeaconInfo*): Self = this.set("beacons", js.Array(value :_*))
    @scala.inline
    def setBeacons(value: js.Array[SchemaBeaconInfo]): Self = this.set("beacons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeacons: Self = this.set("beacons", js.undefined)
  }
  
}

