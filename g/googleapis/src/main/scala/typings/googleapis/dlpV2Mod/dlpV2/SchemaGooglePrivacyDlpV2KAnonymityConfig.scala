package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * k-anonymity metric, used for analysis of reidentification risk.
  */
trait SchemaGooglePrivacyDlpV2KAnonymityConfig extends StObject {
  
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
  var entityId: js.UndefOr[SchemaGooglePrivacyDlpV2EntityId] = js.undefined
  
  /**
    * Set of fields to compute k-anonymity over. When multiple fields are
    * specified, they are considered a single composite key. Structs and
    * repeated data types are not supported; however, nested fields are
    * supported so long as they are not structs themselves or nested within a
    * repeated field.
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2FieldId]] = js.undefined
}
object SchemaGooglePrivacyDlpV2KAnonymityConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KAnonymityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KAnonymityConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2KAnonymityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityId(value: SchemaGooglePrivacyDlpV2EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    @scala.inline
    def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "quasiIds", js.Array(value :_*))
  }
}
