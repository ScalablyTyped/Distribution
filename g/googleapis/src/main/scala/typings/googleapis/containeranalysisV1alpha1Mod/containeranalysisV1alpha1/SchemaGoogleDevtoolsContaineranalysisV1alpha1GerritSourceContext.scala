package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SourceContext referring to a Gerrit project.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext extends js.Object {
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext] = js.native
  /**
    * The full project name within the host. Projects may be nested, so
    * &quot;project/subproject&quot; is a valid project name. The &quot;repo
    * name&quot; is the hostURI/project.
    */
  var gerritProject: js.UndefOr[String] = js.native
  /**
    * The URI of a running Gerrit instance.
    */
  var hostUri: js.UndefOr[String] = js.native
  /**
    * A revision (commit) ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext {
  @scala.inline
  def apply(
    aliasContext: SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext = null,
    gerritProject: String = null,
    hostUri: String = null,
    revisionId: String = null
  ): SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext = {
    val __obj = js.Dynamic.literal()
    if (aliasContext != null) __obj.updateDynamic("aliasContext")(aliasContext.asInstanceOf[js.Any])
    if (gerritProject != null) __obj.updateDynamic("gerritProject")(gerritProject.asInstanceOf[js.Any])
    if (hostUri != null) __obj.updateDynamic("hostUri")(hostUri.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext]
  }
}

