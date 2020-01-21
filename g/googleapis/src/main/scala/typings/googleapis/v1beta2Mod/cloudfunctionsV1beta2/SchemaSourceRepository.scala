package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the location of the function source in a remote repository.
  */
@js.native
trait SchemaSourceRepository extends js.Object {
  /**
    * The name of the branch from which the function should be fetched.
    */
  var branch: js.UndefOr[String] = js.native
  /**
    * Output only. The id of the revision that was resolved at the moment of
    * function creation or update. For example when a user deployed from a
    * branch, it will be the revision id of the latest change on this branch at
    * that time. If user deployed from revision then this value will be always
    * equal to the revision specified by the user.
    */
  var deployedRevision: js.UndefOr[String] = js.native
  /**
    * URL to the hosted repository where the function is defined. Only paths in
    * https://source.developers.google.com domain are supported. The path
    * should contain the name of the repository.
    */
  var repositoryUrl: js.UndefOr[String] = js.native
  /**
    * The id of the revision that captures the state of the repository from
    * which the function should be fetched.
    */
  var revision: js.UndefOr[String] = js.native
  /**
    * The path within the repository where the function is defined. The path
    * should point to the directory where Cloud Functions files are located.
    * Use &quot;/&quot; if the function is defined directly in the root
    * directory of a repository.
    */
  var sourcePath: js.UndefOr[String] = js.native
  /**
    * The name of the tag that captures the state of the repository from which
    * the function should be fetched.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaSourceRepository {
  @scala.inline
  def apply(
    branch: String = null,
    deployedRevision: String = null,
    repositoryUrl: String = null,
    revision: String = null,
    sourcePath: String = null,
    tag: String = null
  ): SchemaSourceRepository = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (deployedRevision != null) __obj.updateDynamic("deployedRevision")(deployedRevision.asInstanceOf[js.Any])
    if (repositoryUrl != null) __obj.updateDynamic("repositoryUrl")(repositoryUrl.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (sourcePath != null) __obj.updateDynamic("sourcePath")(sourcePath.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceRepository]
  }
}

