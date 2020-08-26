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
  def apply(): SchemaPopulateVersionFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopulateVersionFilesRequest]
  }
  @scala.inline
  implicit class SchemaPopulateVersionFilesRequestOps[Self <: SchemaPopulateVersionFilesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiles(value: StringDictionary[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
  }
  
}

