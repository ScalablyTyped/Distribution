package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * k-anonymity metric, used for analysis of reidentification risk.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KAnonymityConfig extends js.Object {
  /**
    * Optional message indicating that multiple rows might be associated to a
    * single individual. If the same entity_id is associated to multiple
    * quasi-identifier tuples over distinct rows, we consider the entire
    * collection of tuples as the composite quasi-identifier. This collection
    * is a multiset: the order in which the different tuples appear in the
    * dataset is ignored, but their frequency is taken into account.  Important
    * note: a maximum of 1000 rows can be associated to a single entity ID. If
    * more rows are associated with the same entity ID, some might be ignored.
    */
  var entityId: js.UndefOr[SchemaGooglePrivacyDlpV2EntityId] = js.native
  /**
    * Set of fields to compute k-anonymity over. When multiple fields are
    * specified, they are considered a single composite key. Structs and
    * repeated data types are not supported; however, nested fields are
    * supported so long as they are not structs themselves or nested within a
    * repeated field.
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.native
}

object SchemaGooglePrivacyDlpV2KAnonymityConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KAnonymityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KAnonymityConfigOps[Self <: SchemaGooglePrivacyDlpV2KAnonymityConfig] (val x: Self) extends AnyVal {
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
    def setEntityId(value: SchemaGooglePrivacyDlpV2EntityId): Self = this.set("entityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityId: Self = this.set("entityId", js.undefined)
    @scala.inline
    def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = this.set("quasiIds", js.Array(value :_*))
    @scala.inline
    def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = this.set("quasiIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuasiIds: Self = this.set("quasiIds", js.undefined)
  }
  
}

