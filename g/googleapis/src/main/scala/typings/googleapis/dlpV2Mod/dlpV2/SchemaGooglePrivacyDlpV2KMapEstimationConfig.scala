package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2KMapEstimationConfig extends StObject {
  
  /**
    * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers column must appear in exactly one column of one auxiliary table.
    */
  var auxiliaryTables: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2AuxiliaryTable]] = js.undefined
  
  /**
    * Required. Fields considered to be quasi-identifiers. No two columns can have the same tag.
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2TaggedField]] = js.undefined
  
  /**
    * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2KMapEstimationConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2KMapEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2KMapEstimationConfig](x: Self) {
    
    inline def setAuxiliaryTables(value: js.Array[SchemaGooglePrivacyDlpV2AuxiliaryTable]): Self = StObject.set(x, "auxiliaryTables", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryTablesUndefined: Self = StObject.set(x, "auxiliaryTables", js.undefined)
    
    inline def setAuxiliaryTablesVarargs(value: SchemaGooglePrivacyDlpV2AuxiliaryTable*): Self = StObject.set(x, "auxiliaryTables", js.Array(value*))
    
    inline def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2TaggedField]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    inline def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2TaggedField*): Self = StObject.set(x, "quasiIds", js.Array(value*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
