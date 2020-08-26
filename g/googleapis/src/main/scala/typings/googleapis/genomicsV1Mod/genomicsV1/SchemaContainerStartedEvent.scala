package typings.googleapis.genomicsV1Mod.genomicsV1

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
  def apply(): SchemaContainerStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerStartedEvent]
  }
  @scala.inline
  implicit class SchemaContainerStartedEventOps[Self <: SchemaContainerStartedEvent] (val x: Self) extends AnyVal {
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
    def setActionId(value: Double): Self = this.set("actionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setPortMappings(value: StringDictionary[Double]): Self = this.set("portMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortMappings: Self = this.set("portMappings", js.undefined)
  }
  
}

