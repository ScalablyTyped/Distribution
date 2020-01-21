package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A report type.
  */
@js.native
trait SchemaReportType extends js.Object {
  /**
    * The date/time when this report type was/will be deprecated.
    */
  var deprecateTime: js.UndefOr[String] = js.native
  /**
    * The ID of the report type (max. 100 characters).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of the report type (max. 100 characters).
    */
  var name: js.UndefOr[String] = js.native
  /**
    * True if this a system-managed report type; otherwise false. Reporting
    * jobs for system-managed report types are created automatically and can
    * thus not be used in the `CreateJob` method.
    */
  var systemManaged: js.UndefOr[Boolean] = js.native
}

object SchemaReportType {
  @scala.inline
  def apply(
    deprecateTime: String = null,
    id: String = null,
    name: String = null,
    systemManaged: js.UndefOr[Boolean] = js.undefined
  ): SchemaReportType = {
    val __obj = js.Dynamic.literal()
    if (deprecateTime != null) __obj.updateDynamic("deprecateTime")(deprecateTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(systemManaged)) __obj.updateDynamic("systemManaged")(systemManaged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportType]
  }
}

