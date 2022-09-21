package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2CloudStorageOptions extends StObject {
  
  /**
    * Max number of bytes to scan from a file. If a scanned file's size is bigger than this value then the rest of the bytes are omitted. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
    */
  var bytesLimitPerFile: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max percentage of bytes to scan from a file. The rest are omitted. The number of bytes scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of bytes_limit_per_file and bytes_limit_per_file_percent can be specified. Cannot be set if de-identification is requested.
    */
  var bytesLimitPerFilePercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The set of one or more files to scan.
    */
  var fileSet: js.UndefOr[SchemaGooglePrivacyDlpV2FileSet] = js.undefined
  
  /**
    * List of file type groups to include in the scan. If empty, all files are scanned and available data format processors are applied. In addition, the binary content of the selected files is always scanned as well. Images are scanned only as binary if the specified region does not support image inspection and no file_types were specified. Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
    */
  var fileTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Limits the number of files to scan to this percentage of the input FileSet. Number of files scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
    */
  var filesLimitPercent: js.UndefOr[Double | Null] = js.undefined
  
  var sampleMethod: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2CloudStorageOptions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CloudStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageOptions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CloudStorageOptions](x: Self) {
    
    inline def setBytesLimitPerFile(value: String): Self = StObject.set(x, "bytesLimitPerFile", value.asInstanceOf[js.Any])
    
    inline def setBytesLimitPerFileNull: Self = StObject.set(x, "bytesLimitPerFile", null)
    
    inline def setBytesLimitPerFilePercent(value: Double): Self = StObject.set(x, "bytesLimitPerFilePercent", value.asInstanceOf[js.Any])
    
    inline def setBytesLimitPerFilePercentNull: Self = StObject.set(x, "bytesLimitPerFilePercent", null)
    
    inline def setBytesLimitPerFilePercentUndefined: Self = StObject.set(x, "bytesLimitPerFilePercent", js.undefined)
    
    inline def setBytesLimitPerFileUndefined: Self = StObject.set(x, "bytesLimitPerFile", js.undefined)
    
    inline def setFileSet(value: SchemaGooglePrivacyDlpV2FileSet): Self = StObject.set(x, "fileSet", value.asInstanceOf[js.Any])
    
    inline def setFileSetUndefined: Self = StObject.set(x, "fileSet", js.undefined)
    
    inline def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    inline def setFileTypesNull: Self = StObject.set(x, "fileTypes", null)
    
    inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value*))
    
    inline def setFilesLimitPercent(value: Double): Self = StObject.set(x, "filesLimitPercent", value.asInstanceOf[js.Any])
    
    inline def setFilesLimitPercentNull: Self = StObject.set(x, "filesLimitPercent", null)
    
    inline def setFilesLimitPercentUndefined: Self = StObject.set(x, "filesLimitPercent", js.undefined)
    
    inline def setSampleMethod(value: String): Self = StObject.set(x, "sampleMethod", value.asInstanceOf[js.Any])
    
    inline def setSampleMethodNull: Self = StObject.set(x, "sampleMethod", null)
    
    inline def setSampleMethodUndefined: Self = StObject.set(x, "sampleMethod", js.undefined)
  }
}
