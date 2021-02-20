package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * δ-presence metric, used to estimate how likely it is for an attacker to
  * figure out that one given individual appears in a de-identified dataset.
  * Similarly to the k-map metric, we cannot compute δ-presence exactly without
  * knowing the attack dataset, so we use a statistical model instead.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig extends StObject {
  
  /**
    * Several auxiliary tables can be used in the analysis. Each custom_tag
    * used to tag a quasi-identifiers field must appear in exactly one field of
    * one auxiliary table.
    */
  var auxiliaryTables: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StatisticalTable]] = js.native
  
  /**
    * Fields considered to be quasi-identifiers. No two fields can have the
    * same tag. [required]
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2QuasiId]] = js.native
  
  /**
    * ISO 3166-1 alpha-2 region code to use in the statistical modeling.
    * Required if no column is tagged with a region-specific InfoType (like
    * US_ZIP_5) or a region code.
    */
  var regionCode: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuxiliaryTables(value: js.Array[SchemaGooglePrivacyDlpV2StatisticalTable]): Self = StObject.set(x, "auxiliaryTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuxiliaryTablesUndefined: Self = StObject.set(x, "auxiliaryTables", js.undefined)
    
    @scala.inline
    def setAuxiliaryTablesVarargs(value: SchemaGooglePrivacyDlpV2StatisticalTable*): Self = StObject.set(x, "auxiliaryTables", js.Array(value :_*))
    
    @scala.inline
    def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2QuasiId]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    @scala.inline
    def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2QuasiId*): Self = StObject.set(x, "quasiIds", js.Array(value :_*))
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
