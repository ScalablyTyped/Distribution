package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExpansionFile extends js.Object {
  /**
    * If set this field indicates that this APK has an Expansion File uploaded
    * to it: this APK does not reference another APK&#39;s Expansion File. The
    * field&#39;s value is the size of the uploaded Expansion File in bytes.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * If set this APK&#39;s Expansion File references another APK&#39;s
    * Expansion File. The file_size field will not be set.
    */
  var referencesVersion: js.UndefOr[Double] = js.native
}

object SchemaExpansionFile {
  @scala.inline
  def apply(fileSize: String = null, referencesVersion: js.UndefOr[Double] = js.undefined): SchemaExpansionFile = {
    val __obj = js.Dynamic.literal()
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(referencesVersion)) __obj.updateDynamic("referencesVersion")(referencesVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExpansionFile]
  }
}

