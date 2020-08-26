package typings.googleapis.contentV2Mod.contentV2

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
  def apply(): SchemaLiasettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class SchemaLiasettingsCustomBatchResponseEntryOps[Self <: SchemaLiasettingsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    @scala.inline
    def setErrors(value: SchemaErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setGmbAccounts(value: SchemaGmbAccounts): Self = this.set("gmbAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmbAccounts: Self = this.set("gmbAccounts", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLiaSettings(value: SchemaLiaSettings): Self = this.set("liaSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiaSettings: Self = this.set("liaSettings", js.undefined)
    @scala.inline
    def setPosDataProvidersVarargs(value: SchemaPosDataProviders*): Self = this.set("posDataProviders", js.Array(value :_*))
    @scala.inline
    def setPosDataProviders(value: js.Array[SchemaPosDataProviders]): Self = this.set("posDataProviders", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosDataProviders: Self = this.set("posDataProviders", js.undefined)
  }
  
}

