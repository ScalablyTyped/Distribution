package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A unique identifier for a Cloud Repo.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId extends js.Object {
  /**
    * A combination of a project ID and a repo name.
    */
  var projectRepoId: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId] = js.native
  /**
    * A server-assigned, globally unique identifier.
    */
  var uid: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId {
  @scala.inline
  def apply(
    projectRepoId: SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId = null,
    uid: String = null
  ): SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId = {
    val __obj = js.Dynamic.literal()
    if (projectRepoId != null) __obj.updateDynamic("projectRepoId")(projectRepoId.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId]
  }
}

