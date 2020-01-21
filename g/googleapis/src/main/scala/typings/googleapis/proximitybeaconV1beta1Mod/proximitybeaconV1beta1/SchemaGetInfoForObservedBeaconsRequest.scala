package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for beacon and attachment information about beacons that a mobile
  * client has encountered &quot;in the wild&quot;.
  */
@js.native
trait SchemaGetInfoForObservedBeaconsRequest extends js.Object {
  /**
    * Specifies what kind of attachments to include in the response. When
    * given, the response will include only attachments of the given types.
    * When empty, no attachments will be returned. Must be in the format
    * &lt;var&gt;namespace/type&lt;/var&gt;. Accepts `*` to specify all types
    * in all namespaces owned by the client. Optional.
    */
  var namespacedTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The beacons that the client has encountered. At least one must be given.
    */
  var observations: js.UndefOr[js.Array[SchemaObservation]] = js.native
}

object SchemaGetInfoForObservedBeaconsRequest {
  @scala.inline
  def apply(namespacedTypes: js.Array[String] = null, observations: js.Array[SchemaObservation] = null): SchemaGetInfoForObservedBeaconsRequest = {
    val __obj = js.Dynamic.literal()
    if (namespacedTypes != null) __obj.updateDynamic("namespacedTypes")(namespacedTypes.asInstanceOf[js.Any])
    if (observations != null) __obj.updateDynamic("observations")(observations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetInfoForObservedBeaconsRequest]
  }
}

