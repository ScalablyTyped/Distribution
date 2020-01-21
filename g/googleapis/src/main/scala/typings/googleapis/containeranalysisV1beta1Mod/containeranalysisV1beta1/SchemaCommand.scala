package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Command describes a step performed as part of the build pipeline.
  */
@js.native
trait SchemaCommand extends js.Object {
  /**
    * Command-line arguments used when executing this command.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * Working directory (relative to project source root) used when running
    * this command.
    */
  var dir: js.UndefOr[String] = js.native
  /**
    * Environment variables set before running this command.
    */
  var env: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional unique identifier for this command, used in wait_for to
    * reference this command as a dependency.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Required. Name of the command, as presented on the command line, or if
    * the command is packaged as a Docker container, as presented to `docker
    * pull`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID(s) of the command(s) that this command depends on.
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

