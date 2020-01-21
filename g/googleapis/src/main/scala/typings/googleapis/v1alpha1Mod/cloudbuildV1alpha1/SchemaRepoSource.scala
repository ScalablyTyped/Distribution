package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the source in a Google Cloud Source Repository.
  */
@js.native
trait SchemaRepoSource extends js.Object {
  /**
    * Name of the branch to build.
    */
  var branchName: js.UndefOr[String] = js.native
  /**
    * Explicit commit SHA to build.
    */
  var commitSha: js.UndefOr[String] = js.native
  /**
    * Directory, relative to the source root, in which to run the build.  This
    * must be a relative path. If a step&#39;s `dir` is specified and is an
    * absolute path, this value is ignored for that step&#39;s execution.
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * ID of the project that owns the Cloud Source Repository. If omitted, the
    * project ID requesting the build is assumed.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Name of the Cloud Source Repository. If omitted, the name
    * &quot;default&quot; is assumed.
    */
  var repoName: js.UndefOr[String] = js.native
  /**
    * Name of the tag to build.
    */
  var tagName: js.UndefOr[String] = js.native
}

object SchemaRepoSource {
  @scala.inline
  def apply(
    branchName: String = null,
    commitSha: String = null,
    dir: String = null,
    projectId: String = null,
    repoName: String = null,
    tagName: String = null
  ): SchemaRepoSource = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName.asInstanceOf[js.Any])
    if (commitSha != null) __obj.updateDynamic("commitSha")(commitSha.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (repoName != null) __obj.updateDynamic("repoName")(repoName.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRepoSource]
  }
}

