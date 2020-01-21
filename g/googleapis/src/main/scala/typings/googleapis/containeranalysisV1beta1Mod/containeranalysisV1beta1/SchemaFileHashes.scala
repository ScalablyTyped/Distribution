package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container message for hashes of byte content of files, used in source
  * messages to verify integrity of source input to the build.
  */
@js.native
trait SchemaFileHashes extends js.Object {
  /**
    * Required. Collection of file hashes.
    */
  var fileHash: js.UndefOr[js.Array[SchemaHash]] = js.native
}

object SchemaFileHashes {
  @scala.inline
  def apply(fileHash: js.Array[SchemaHash] = null): SchemaFileHashes = {
    val __obj = js.Dynamic.literal()
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFileHashes]
  }
}

