package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the source in a supported storage service.
  */
@js.native
trait SchemaSource extends js.Object {
  /**
    * If provided, get the source from this location in a Cloud Source
    * Repository.
    */
  var repoSource: js.UndefOr[SchemaRepoSource] = js.native
  /**
    * If provided, get the source from this location in Google Cloud Storage.
    */
  var storageSource: js.UndefOr[SchemaStorageSource] = js.native
}

object SchemaSource {
  @scala.inline
  def apply(repoSource: SchemaRepoSource = null, storageSource: SchemaStorageSource = null): SchemaSource = {
    val __obj = js.Dynamic.literal()
    if (repoSource != null) __obj.updateDynamic("repoSource")(repoSource.asInstanceOf[js.Any])
    if (storageSource != null) __obj.updateDynamic("storageSource")(storageSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSource]
  }
}

