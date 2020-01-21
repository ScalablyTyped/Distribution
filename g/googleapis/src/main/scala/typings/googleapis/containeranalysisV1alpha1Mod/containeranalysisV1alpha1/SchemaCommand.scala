package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Command describes a step performed as part of the build pipeline.
  */
@js.native
trait SchemaCommand extends js.Object {
  /**
    * Command-line arguments used when executing this Command.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Working directory (relative to project source root) used when running
    * this Command.
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * Environment variables set before running this Command.
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional unique identifier for this Command, used in wait_for to
    * reference this Command as a dependency.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the command, as presented on the command line, or if the command
    * is packaged as a Docker container, as presented to `docker pull`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID(s) of the Command(s) that this Command depends on.
    */
  var waitFor: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCommand {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    dir: String = null,
    env: js.Array[String] = null,
    id: String = null,
    name: String = null,
    waitFor: js.Array[String] = null
  ): SchemaCommand = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommand]
  }
}

