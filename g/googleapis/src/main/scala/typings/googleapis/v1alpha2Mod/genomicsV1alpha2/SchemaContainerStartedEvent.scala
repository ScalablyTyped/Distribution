package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a container starts.
  */
@js.native
trait SchemaContainerStartedEvent extends js.Object {
  /**
    * The numeric ID of the action that started this container.
    */
  var actionId: js.UndefOr[Double] = js.native
  /**
    * The public IP address that can be used to connect to the container. This
    * field is only populated when at least one port mapping is present. If the
    * instance was created with a private address, this field will be empty
    * even if port mappings exist.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * The container-to-host port mappings installed for this container. This
    * set will contain any ports exposed using the `PUBLISH_EXPOSED_PORTS` flag
    * as well as any specified in the `Action` definition.
    */
  var portMappings: js.UndefOr[StringDictionary[Double]] = js.native
}

object SchemaContainerStartedEvent {
  @scala.inline
  def apply(
    actionId: Int | Double = null,
    ipAddress: String = null,
    portMappings: StringDictionary[Double] = null
  ): SchemaContainerStartedEvent = {
    val __obj = js.Dynamic.literal()
    if (actionId != null) __obj.updateDynamic("actionId")(actionId.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (portMappings != null) __obj.updateDynamic("portMappings")(portMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContainerStartedEvent]
  }
}

