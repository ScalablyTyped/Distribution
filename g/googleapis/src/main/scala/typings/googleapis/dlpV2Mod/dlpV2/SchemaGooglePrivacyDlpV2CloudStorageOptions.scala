package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options defining a file or a set of files within a Google Cloud Storage
  * bucket.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CloudStorageOptions extends js.Object {
  /**
    * Max number of bytes to scan from a file. If a scanned file&#39;s size is
    * bigger than this value then the rest of the bytes are omitted. Only one
    * of bytes_limit_per_file and bytes_limit_per_file_percent can be
    * specified.
    */
  var bytesLimitPerFile: js.UndefOr[String] = js.native
  /**
    * Max percentage of bytes to scan from a file. The rest are omitted. The
    * number of bytes scanned is rounded down. Must be between 0 and 100,
    * inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of
    * bytes_limit_per_file and bytes_limit_per_file_percent can be specified.
    */
  var bytesLimitPerFilePercent: js.UndefOr[Double] = js.native
  /**
    * The set of one or more files to scan.
    */
  var fileSet: js.UndefOr[SchemaGooglePrivacyDlpV2FileSet] = js.native
  /**
    * List of file type groups to include in the scan. If empty, all files are
    * scanned and available data format processors are applied. In addition,
    * the binary content of the selected files is always scanned as well.
    */
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Limits the number of files to scan to this percentage of the input
    * FileSet. Number of files scanned is rounded down. Must be between 0 and
    * 100, inclusively. Both 0 and 100 means no limit. Defaults to 0.
    */
  var filesLimitPercent: js.UndefOr[Double] = js.native
  var sampleMethod: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CloudStorageOptions {
  @scala.inline
  def apply(
    bytesLimitPerFile: String = null,
    bytesLimitPerFilePercent: Int | Double = null,
    fileSet: SchemaGooglePrivacyDlpV2FileSet = null,
    fileTypes: js.Array[String] = null,
    filesLimitPercent: Int | Double = null,
    sampleMethod: String = null
  ): SchemaGooglePrivacyDlpV2CloudStorageOptions = {
    val __obj = js.Dynamic.literal()
    if (bytesLimitPerFile != null) __obj.updateDynamic("bytesLimitPerFile")(bytesLimitPerFile.asInstanceOf[js.Any])
    if (bytesLimitPerFilePercent != null) __obj.updateDynamic("bytesLimitPerFilePercent")(bytesLimitPerFilePercent.asInstanceOf[js.Any])
    if (fileSet != null) __obj.updateDynamic("fileSet")(fileSet.asInstanceOf[js.Any])
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes.asInstanceOf[js.Any])
    if (filesLimitPercent != null) __obj.updateDynamic("filesLimitPercent")(filesLimitPercent.asInstanceOf[js.Any])
    if (sampleMethod != null) __obj.updateDynamic("sampleMethod")(sampleMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageOptions]
  }
}

