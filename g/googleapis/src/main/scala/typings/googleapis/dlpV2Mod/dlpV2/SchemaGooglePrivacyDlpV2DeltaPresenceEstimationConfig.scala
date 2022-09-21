package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig extends StObject {
  
  /**
    * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers field must appear in exactly one field of one auxiliary table.
    */
  var auxiliaryTables: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StatisticalTable]] = js.undefined
  
  /**
    * Required. Fields considered to be quasi-identifiers. No two fields can have the same tag.
    */
  var quasiIds: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2QuasiId]] = js.undefined
  
  /**
    * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig](x: Self) {
    
    inline def setAuxiliaryTables(value: js.Array[SchemaGooglePrivacyDlpV2StatisticalTable]): Self = StObject.set(x, "auxiliaryTables", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryTablesUndefined: Self = StObject.set(x, "auxiliaryTables", js.undefined)
    
    inline def setAuxiliaryTablesVarargs(value: SchemaGooglePrivacyDlpV2StatisticalTable*): Self = StObject.set(x, "auxiliaryTables", js.Array(value*))
    
    inline def setQuasiIds(value: js.Array[SchemaGooglePrivacyDlpV2QuasiId]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    inline def setQuasiIdsVarargs(value: SchemaGooglePrivacyDlpV2QuasiId*): Self = StObject.set(x, "quasiIds", js.Array(value*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
