package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPopulateVersionFilesRequest extends js.Object {
  /**
    * A set of file paths to the hashes corresponding to assets that should be
    * added to the version. Note that a file path to an empty hash will remove
    * the path from the version. Calculate a hash by Gzipping the file then
    * taking the SHA256 hash of the newly compressed file.
    */
  var files: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaPopulateVersionFilesRequest {
  @scala.inline
  def apply(files: StringDictionary[String] = null): SchemaPopulateVersionFilesRequest = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPopulateVersionFilesRequest]
  }
}

