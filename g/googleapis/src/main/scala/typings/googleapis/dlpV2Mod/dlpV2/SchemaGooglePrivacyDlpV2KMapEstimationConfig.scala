package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reidentifiability metric. This corresponds to a risk model similar to what
  * is called &quot;journalist risk&quot; in the literature, except the attack
  * dataset is statistically modeled instead of being perfectly known. This can
  * be done using publicly available data (like the US Census), or using a
  * custom statistical model (indicated as one or several BigQuery tables), or
  * by extrapolating from the distribution of values in the input dataset. A
  * column with a semantic tag attached.
  */
trait SchemaGooglePrivacyDlpV2KMapEstimationConfig extends StObject {
  
  /**
    * Several auxiliary tables can be used in the analysis. Each custom_tag
    * used to tag a quasi-identifiers column must appear in exactly one column
    * of one auxiliary table.
    */
  var auxiliaryTables: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2AuxiliaryTable]] = js.undefined
  
  /**
    * Fields considered to be quasi-identifiers. No two columns can have the
    * same tag. [required]
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2TaggedField]] = js.undefined
  
  /**
    * ISO 3166-1 alpha-2 region code to use in the statistical modeling.
    * Required if no column is tagged with a region-specific InfoType (like
    * US_ZIP_5) or a region code.
    */
  var regionCode: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2KMapEstimationConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2KMapEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2KMapEstimationConfig](x: Self) {
    
    inline def setAuxiliaryTables(value: js.Array[SchemaGooglePrivacyDlpV2AuxiliaryTable]): Self = StObject.set(x, "auxiliaryTables", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryTablesUndefined: Self = StObject.set(x, "auxiliaryTables", js.undefined)
    
    inline def setAuxiliaryTablesVarargs(value: SchemaGooglePrivacyDlpV2AuxiliaryTable*): Self = StObject.set(x, "auxiliaryTables", js.Array(value :_*))
    
    inline def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2TaggedField]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    inline def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2TaggedField*): Self = StObject.set(x, "quasiIds", js.Array(value :_*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
