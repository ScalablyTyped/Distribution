package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A context rule provides information about the context for an individual API
  * element.
  */
@js.native
trait SchemaContextRule extends js.Object {
  /**
    * A list of full type names or extension IDs of extensions allowed in grpc
    * side channel from client to backend.
    */
  var allowedRequestExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of full type names or extension IDs of extensions allowed in grpc
    * side channel from backend to client.
    */
  var allowedResponseExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of full type names of provided contexts.
    */
  var provided: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of full type names of requested contexts.
    */
  var requested: js.UndefOr[js.Array[String]] = js.native
  /**
    * Selects the methods to which this rule applies.  Refer to selector for
    * syntax details.
    */
  var selector: js.UndefOr[String] = js.native
}

object SchemaContextRule {
  @scala.inline
  def apply(
    allowedRequestExtensions: js.Array[String] = null,
    allowedResponseExtensions: js.Array[String] = null,
    provided: js.Array[String] = null,
    requested: js.Array[String] = null,
    selector: String = null
  ): SchemaContextRule = {
    val __obj = js.Dynamic.literal()
    if (allowedRequestExtensions != null) __obj.updateDynamic("allowedRequestExtensions")(allowedRequestExtensions.asInstanceOf[js.Any])
    if (allowedResponseExtensions != null) __obj.updateDynamic("allowedResponseExtensions")(allowedResponseExtensions.asInstanceOf[js.Any])
    if (provided != null) __obj.updateDynamic("provided")(provided.asInstanceOf[js.Any])
    if (requested != null) __obj.updateDynamic("requested")(requested.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContextRule]
  }
}

