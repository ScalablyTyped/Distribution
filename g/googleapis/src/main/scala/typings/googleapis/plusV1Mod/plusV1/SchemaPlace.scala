package typings.googleapis.plusV1Mod.plusV1

import typings.googleapis.AnonFormatted
import typings.googleapis.AnonLatitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlace extends js.Object {
  /**
    * The physical address of the place.
    */
  var address: js.UndefOr[AnonFormatted] = js.native
  /**
    * The display name of the place.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The id of the place.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies this resource as a place. Value: &quot;plus#place&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The position of the place.
    */
  var position: js.UndefOr[AnonLatitude] = js.native
}

object SchemaPlace {
  @scala.inline
  def apply(
    address: AnonFormatted = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    position: AnonLatitude = null
  ): SchemaPlace = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlace]
  }
}

