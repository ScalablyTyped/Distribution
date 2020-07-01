package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instance conceptually encapsulates all Remote Build Execution resources for
  * remote builds. An instance consists of storage and compute resources (for
  * example, `ContentAddressableStorage`, `ActionCache`, `WorkerPools`) used
  * for running remote builds. All Remote Build Execution API calls are scoped
  * to an instance.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance extends js.Object {
  /**
    * The location is a GCP region. Currently only `us-central1` is supported.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Output only. Whether stack driver logging is enabled for the instance.
    */
  var loggingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Output only. Instance resource name formatted as:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be
    * populated when creating an instance since it is provided in the
    * `instance_id` field.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. State of the instance.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance {
  @scala.inline
  def apply(
    location: String = null,
    loggingEnabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    state: String = null
  ): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(loggingEnabled)) __obj.updateDynamic("loggingEnabled")(loggingEnabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  }
}

