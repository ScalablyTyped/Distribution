package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provenance of a build. Contains all information needed to verify the full
  * details about the build from source to completion.
  */
@js.native
trait SchemaBuildProvenance extends js.Object {
  /**
    * Special options applied to this build. This is a catch-all field where
    * build providers can enter any desired additional details.
    */
  var buildOptions: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Version string of the builder at the time this build was executed.
    */
  var builderVersion: js.UndefOr[String] = js.native
  /**
    * Output of the build.
    */
  var builtArtifacts: js.UndefOr[js.Array[SchemaArtifact]] = js.native
  /**
    * Commands requested by the build.
    */
  var commands: js.UndefOr[js.Array[SchemaCommand]] = js.native
  /**
    * Time at which the build was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * E-mail address of the user who initiated this build. Note that this was
    * the user&#39;s e-mail address at the time the build was initiated; this
    * address may not represent the same end-user for all time.
    */
  var creator: js.UndefOr[String] = js.native
  /**
    * Time at which execution of the build was finished.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Required. Unique identifier of the build.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * URI where any logs for this provenance were written.
    */
  var logsUri: js.UndefOr[String] = js.native
  /**
    * ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Details of the Source input to the build.
    */
  var sourceProvenance: js.UndefOr[SchemaSource] = js.native
  /**
    * Time at which execution of the build was started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Trigger identifier if the build was triggered automatically; empty if
    * not.
    */
  var triggerId: js.UndefOr[String] = js.native
}

object SchemaBuildProvenance {
  @scala.inline
  def apply(
    buildOptions: StringDictionary[String] = null,
    builderVersion: String = null,
    builtArtifacts: js.Array[SchemaArtifact] = null,
    commands: js.Array[SchemaCommand] = null,
    createTime: String = null,
    creator: String = null,
    endTime: String = null,
    id: String = null,
    logsUri: String = null,
    projectId: String = null,
    sourceProvenance: SchemaSource = null,
    startTime: String = null,
    triggerId: String = null
  ): SchemaBuildProvenance = {
    val __obj = js.Dynamic.literal()
    if (buildOptions != null) __obj.updateDynamic("buildOptions")(buildOptions.asInstanceOf[js.Any])
    if (builderVersion != null) __obj.updateDynamic("builderVersion")(builderVersion.asInstanceOf[js.Any])
    if (builtArtifacts != null) __obj.updateDynamic("builtArtifacts")(builtArtifacts.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (logsUri != null) __obj.updateDynamic("logsUri")(logsUri.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (sourceProvenance != null) __obj.updateDynamic("sourceProvenance")(sourceProvenance.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (triggerId != null) __obj.updateDynamic("triggerId")(triggerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildProvenance]
  }
}

