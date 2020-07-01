package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiasettingsCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry to which this entry responds.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if, and only if, the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * The the list of accessible GMB accounts.
    */
  var gmbAccounts: js.UndefOr[SchemaGmbAccounts] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The retrieved or updated Lia settings.
    */
  var liaSettings: js.UndefOr[SchemaLiaSettings] = js.native
  /**
    * The list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProviders]] = js.native
}

object SchemaLiasettingsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: js.UndefOr[Double] = js.undefined,
    errors: SchemaErrors = null,
    gmbAccounts: SchemaGmbAccounts = null,
    kind: String = null,
    liaSettings: SchemaLiaSettings = null,
    posDataProviders: js.Array[SchemaPosDataProviders] = null
  ): SchemaLiasettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (gmbAccounts != null) __obj.updateDynamic("gmbAccounts")(gmbAccounts.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (liaSettings != null) __obj.updateDynamic("liaSettings")(liaSettings.asInstanceOf[js.Any])
    if (posDataProviders != null) __obj.updateDynamic("posDataProviders")(posDataProviders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiasettingsCustomBatchResponseEntry]
  }
}

