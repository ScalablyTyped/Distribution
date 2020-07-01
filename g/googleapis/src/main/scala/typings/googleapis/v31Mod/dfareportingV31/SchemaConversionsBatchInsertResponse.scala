package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insert Conversions Response.
  */
@js.native
trait SchemaConversionsBatchInsertResponse extends js.Object {
  /**
    * Indicates that some or all conversions failed to insert.
    */
  var hasFailures: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchInsertResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The insert status of each conversion. Statuses are returned in the same
    * order that conversions are inserted.
    */
  var status: js.UndefOr[js.Array[SchemaConversionStatus]] = js.native
}

object SchemaConversionsBatchInsertResponse {
  @scala.inline
  def apply(
    hasFailures: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    status: js.Array[SchemaConversionStatus] = null
  ): SchemaConversionsBatchInsertResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasFailures)) __obj.updateDynamic("hasFailures")(hasFailures.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConversionsBatchInsertResponse]
  }
}

