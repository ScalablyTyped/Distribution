package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch shipping settings response.
  */
@js.native
trait SchemaShippingsettingsCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#shippingsettingsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The retrieved or updated account shipping settings.
    */
  var shippingSettings: js.UndefOr[SchemaShippingSettings] = js.native
}

object SchemaShippingsettingsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: SchemaErrors = null,
    kind: String = null,
    shippingSettings: SchemaShippingSettings = null
  ): SchemaShippingsettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (shippingSettings != null) __obj.updateDynamic("shippingSettings")(shippingSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShippingsettingsCustomBatchResponseEntry]
  }
}

