package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.AnonBoolValueDatetimeValue
import typings.googleapis.AnonCustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a usage report.
  */
@js.native
trait SchemaUsageReport extends js.Object {
  /**
    * The date to which the record belongs.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * Information about the type of the item.
    */
  var entity: js.UndefOr[AnonCustomerId] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The kind of object.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Parameter value pairs for various applications.
    */
  var parameters: js.UndefOr[js.Array[AnonBoolValueDatetimeValue]] = js.native
}

object SchemaUsageReport {
  @scala.inline
  def apply(
    date: String = null,
    entity: AnonCustomerId = null,
    etag: String = null,
    kind: String = null,
    parameters: js.Array[AnonBoolValueDatetimeValue] = null
  ): SchemaUsageReport = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUsageReport]
  }
}

