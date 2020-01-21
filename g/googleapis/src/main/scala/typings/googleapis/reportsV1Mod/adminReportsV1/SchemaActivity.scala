package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.AnonApplicationName
import typings.googleapis.AnonCallerType
import typings.googleapis.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for the activity resource.
  */
@js.native
trait SchemaActivity extends js.Object {
  /**
    * User doing the action.
    */
  var actor: js.UndefOr[AnonCallerType] = js.native
  /**
    * ETag of the entry.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Activity events.
    */
  var events: js.UndefOr[js.Array[AnonName]] = js.native
  /**
    * Unique identifier for each activity record.
    */
  var id: js.UndefOr[AnonApplicationName] = js.native
  /**
    * IP Address of the user doing the action.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Domain of source customer.
    */
  var ownerDomain: js.UndefOr[String] = js.native
}

object SchemaActivity {
  @scala.inline
  def apply(
    actor: AnonCallerType = null,
    etag: String = null,
    events: js.Array[AnonName] = null,
    id: AnonApplicationName = null,
    ipAddress: String = null,
    kind: String = null,
    ownerDomain: String = null
  ): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (ownerDomain != null) __obj.updateDynamic("ownerDomain")(ownerDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivity]
  }
}

