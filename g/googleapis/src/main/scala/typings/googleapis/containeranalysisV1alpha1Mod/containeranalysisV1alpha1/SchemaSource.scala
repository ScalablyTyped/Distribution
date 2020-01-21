package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source describes the location of the source used for the build.
  */
@js.native
trait SchemaSource extends js.Object {
  /**
    * If provided, some of the source code used for the build may be found in
    * these locations, in the case where the source repository had multiple
    * remotes or submodules. This list will not include the context specified
    * in the context field.
    */
  var additionalContexts: js.UndefOr[js.Array[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext]] = js.native
  /**
    * If provided, the input binary artifacts for the build came from this
    * location.
    */
  var artifactStorageSource: js.UndefOr[SchemaStorageSource] = js.native
  /**
    * If provided, the source code used for the build came from this location.
    */
  var context: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext] = js.native
  /**
    * Hash(es) of the build source, which can be used to verify that the
    * original source integrity was maintained in the build.  The keys to this
    * map are file paths used as build source and the values contain the hash
    * values for those files.  If the build source came in a single package
    * such as a gzipped tarfile (.tar.gz), the FileHash will be for the single
    * path to that file.
    */
  var fileHashes: js.UndefOr[StringDictionary[SchemaFileHashes]] = js.native
  /**
    * If provided, get source from this location in a Cloud Repo.
    */
  var repoSource: js.UndefOr[SchemaRepoSource] = js.native
  /**
    * If provided, get the source from this location in in Google Cloud
    * Storage.
    */
  var storageSource: js.UndefOr[SchemaStorageSource] = js.native
}

object SchemaSource {
  @scala.inline
  def apply(
    additionalContexts: js.Array[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext] = null,
    artifactStorageSource: SchemaStorageSource = null,
    context: SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext = null,
    fileHashes: StringDictionary[SchemaFileHashes] = null,
    repoSource: SchemaRepoSource = null,
    storageSource: SchemaStorageSource = null
  ): SchemaSource = {
    val __obj = js.Dynamic.literal()
    if (additionalContexts != null) __obj.updateDynamic("additionalContexts")(additionalContexts.asInstanceOf[js.Any])
    if (artifactStorageSource != null) __obj.updateDynamic("artifactStorageSource")(artifactStorageSource.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (fileHashes != null) __obj.updateDynamic("fileHashes")(fileHashes.asInstanceOf[js.Any])
    if (repoSource != null) __obj.updateDynamic("repoSource")(repoSource.asInstanceOf[js.Any])
    if (storageSource != null) __obj.updateDynamic("storageSource")(storageSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSource]
  }
}

