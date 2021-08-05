package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options defining a file or a set of files within a Google Cloud Storage
  * bucket.
  */
trait SchemaGooglePrivacyDlpV2CloudStorageOptions extends StObject {
  
  /**
    * Max number of bytes to scan from a file. If a scanned file&#39;s size is
    * bigger than this value then the rest of the bytes are omitted. Only one
    * of bytes_limit_per_file and bytes_limit_per_file_percent can be
    * specified.
    */
  var bytesLimitPerFile: js.UndefOr[String] = js.undefined
  
  /**
    * Max percentage of bytes to scan from a file. The rest are omitted. The
    * number of bytes scanned is rounded down. Must be between 0 and 100,
    * inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of
    * bytes_limit_per_file and bytes_limit_per_file_percent can be specified.
    */
  var bytesLimitPerFilePercent: js.UndefOr[Double] = js.undefined
  
  /**
    * The set of one or more files to scan.
    */
  var fileSet: js.UndefOr[SchemaGooglePrivacyDlpV2FileSet] = js.undefined
  
  /**
    * List of file type groups to include in the scan. If empty, all files are
    * scanned and available data format processors are applied. In addition,
    * the binary content of the selected files is always scanned as well.
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Limits the number of files to scan to this percentage of the input
    * FileSet. Number of files scanned is rounded down. Must be between 0 and
    * 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
    */
  var filesLimitPercent: js.UndefOr[Double] = js.undefined
  
  var sampleMethod: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2CloudStorageOptions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CloudStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageOptions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CloudStorageOptions](x: Self) {
    
    inline def setBytesLimitPerFile(value: String): Self = StObject.set(x, "bytesLimitPerFile", value.asInstanceOf[js.Any])
    
    inline def setBytesLimitPerFilePercent(value: Double): Self = StObject.set(x, "bytesLimitPerFilePercent", value.asInstanceOf[js.Any])
    
    inline def setBytesLimitPerFilePercentUndefined: Self = StObject.set(x, "bytesLimitPerFilePercent", js.undefined)
    
    inline def setBytesLimitPerFileUndefined: Self = StObject.set(x, "bytesLimitPerFile", js.undefined)
    
    inline def setFileSet(value: SchemaGooglePrivacyDlpV2FileSet): Self = StObject.set(x, "fileSet", value.asInstanceOf[js.Any])
    
    inline def setFileSetUndefined: Self = StObject.set(x, "fileSet", js.undefined)
    
    inline def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
    
    inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
    
    inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value :_*))
    
    inline def setFilesLimitPercent(value: Double): Self = StObject.set(x, "filesLimitPercent", value.asInstanceOf[js.Any])
    
    inline def setFilesLimitPercentUndefined: Self = StObject.set(x, "filesLimitPercent", js.undefined)
    
    inline def setSampleMethod(value: String): Self = StObject.set(x, "sampleMethod", value.asInstanceOf[js.Any])
    
    inline def setSampleMethodUndefined: Self = StObject.set(x, "sampleMethod", js.undefined)
  }
}
