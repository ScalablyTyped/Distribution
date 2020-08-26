package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container message for hashes of byte content of files, used in Source
  * messages to verify integrity of source input to the build.
  */
@js.native
trait SchemaFileHashes extends js.Object {
  /**
    * Collection of file hashes.
    */
  var fileHash: js.UndefOr[js.Array[SchemaHash]] = js.native
}

object SchemaFileHashes {
  @scala.inline
  def apply(): SchemaFileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileHashes]
  }
  @scala.inline
  implicit class SchemaFileHashesOps[Self <: SchemaFileHashes] (val x: Self) extends AnyVal {
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
    def setFileHashVarargs(value: SchemaHash*): Self = this.set("fileHash", js.Array(value :_*))
    @scala.inline
    def setFileHash(value: js.Array[SchemaHash]): Self = this.set("fileHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileHash: Self = this.set("fileHash", js.undefined)
  }
  
}

