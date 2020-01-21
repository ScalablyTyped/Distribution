package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Selects a repo using a Google Cloud Platform project ID (e.g.,
  * winged-cargo-31) and a repo name within that project.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId extends js.Object {
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The name of the repo. Leave empty for the default repo.
    */
  var repoName: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId {
  @scala.inline
  def apply(projectId: String = null, repoName: String = null): SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (repoName != null) __obj.updateDynamic("repoName")(repoName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId]
  }
}

