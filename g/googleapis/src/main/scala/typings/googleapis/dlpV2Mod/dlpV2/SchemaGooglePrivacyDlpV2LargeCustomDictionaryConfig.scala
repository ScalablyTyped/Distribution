package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig extends StObject {
  
  /**
    * Field in a BigQuery table where each cell represents a dictionary phrase.
    */
  var bigQueryField: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryField] = js.undefined
  
  /**
    * Set of files containing newline-delimited lists of dictionary phrases.
    */
  var cloudStorageFileSet: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStorageFileSet] = js.undefined
  
  /**
    * Location to store dictionary artifacts in Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
    */
  var outputPath: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStoragePath] = js.undefined
}
object SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig](x: Self) {
    
    inline def setBigQueryField(value: SchemaGooglePrivacyDlpV2BigQueryField): Self = StObject.set(x, "bigQueryField", value.asInstanceOf[js.Any])
    
    inline def setBigQueryFieldUndefined: Self = StObject.set(x, "bigQueryField", js.undefined)
    
    inline def setCloudStorageFileSet(value: SchemaGooglePrivacyDlpV2CloudStorageFileSet): Self = StObject.set(x, "cloudStorageFileSet", value.asInstanceOf[js.Any])
    
    inline def setCloudStorageFileSetUndefined: Self = StObject.set(x, "cloudStorageFileSet", js.undefined)
    
    inline def setOutputPath(value: SchemaGooglePrivacyDlpV2CloudStoragePath): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
  }
}
