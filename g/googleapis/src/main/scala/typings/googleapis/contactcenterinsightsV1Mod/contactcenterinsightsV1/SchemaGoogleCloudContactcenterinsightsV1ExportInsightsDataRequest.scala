package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataRequest extends StObject {
  
  /**
    * Specified if sink is a BigQuery table.
    */
  var bigQueryDestination: js.UndefOr[
    SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataRequestBigQueryDestination
  ] = js.undefined
  
  /**
    * A filter to reduce results to a specific subset. Useful for exporting conversations with specific properties.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A fully qualified KMS key name for BigQuery tables protected by CMEK. Format: projects/{project\}/locations/{location\}/keyRings/{keyring\}/cryptoKeys/{key\}/cryptoKeyVersions/{version\}
    */
  var kmsKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The parent resource to export data from.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Options for what to do if the destination table already exists.
    */
  var writeDisposition: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataRequest {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataRequest]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataRequest](x: Self) {
    
    inline def setBigQueryDestination(value: SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataRequestBigQueryDestination): Self = StObject.set(x, "bigQueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigQueryDestinationUndefined: Self = StObject.set(x, "bigQueryDestination", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNull: Self = StObject.set(x, "kmsKey", null)
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    inline def setWriteDispositionNull: Self = StObject.set(x, "writeDisposition", null)
    
    inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}
