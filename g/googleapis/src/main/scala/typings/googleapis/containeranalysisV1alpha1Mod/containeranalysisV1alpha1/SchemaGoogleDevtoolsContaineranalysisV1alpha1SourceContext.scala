package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SourceContext is a reference to a tree of files. A SourceContext together
  * with a path point to a unique revision of a single file or directory.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext extends js.Object {
  /**
    * A SourceContext referring to a revision in a Google Cloud Source Repo.
    */
  var cloudRepo: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext] = js.native
  /**
    * A SourceContext referring to a Gerrit project.
    */
  var gerrit: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext] = js.native
  /**
    * A SourceContext referring to any third party Git repo (e.g., GitHub).
    */
  var git: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext] = js.native
  /**
    * Labels with user defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext {
  @scala.inline
  def apply(
    cloudRepo: SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext = null,
    gerrit: SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext = null,
    git: SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext = null,
    labels: StringDictionary[String] = null
  ): SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext = {
    val __obj = js.Dynamic.literal()
    if (cloudRepo != null) __obj.updateDynamic("cloudRepo")(cloudRepo.asInstanceOf[js.Any])
    if (gerrit != null) __obj.updateDynamic("gerrit")(gerrit.asInstanceOf[js.Any])
    if (git != null) __obj.updateDynamic("git")(git.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1SourceContext]
  }
}

