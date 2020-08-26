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
  def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoIdOps[Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId] (val x: Self) extends AnyVal {
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
    def setProjectRepoId(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1ProjectRepoId): Self = this.set("projectRepoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectRepoId: Self = this.set("projectRepoId", js.undefined)
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}

