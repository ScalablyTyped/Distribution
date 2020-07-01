package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action that gets executed during initialization of the replicas.
  */
@js.native
trait SchemaAction extends js.Object {
  /**
    * A list of commands to run, one per line. If any command fails, the whole
    * action is considered a failure and no further actions are run. This also
    * marks the virtual machine or replica as a failure.
    */
  var commands: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of environment variables to use for the commands in this action.
    */
  var envVariables: js.UndefOr[js.Array[SchemaEnvVariable]] = js.native
  /**
    * If an action&#39;s commands on a particular replica do not finish in the
    * specified timeoutMilliSeconds, the replica is considered to be in a
    * FAILING state. No efforts are made to stop any processes that were
    * spawned or created as the result of running the action&#39;s commands.
    * The default is the max allowed value, 1 hour (i.e. 3600000 milliseconds).
    */
  var timeoutMilliSeconds: js.UndefOr[Double] = js.native
}

object SchemaAction {
  @scala.inline
  def apply(
    commands: js.Array[String] = null,
    envVariables: js.Array[SchemaEnvVariable] = null,
    timeoutMilliSeconds: js.UndefOr[Double] = js.undefined
  ): SchemaAction = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (envVariables != null) __obj.updateDynamic("envVariables")(envVariables.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutMilliSeconds)) __obj.updateDynamic("timeoutMilliSeconds")(timeoutMilliSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAction]
  }
}

