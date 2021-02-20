package typings.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when a container starts.
  */
@js.native
trait SchemaContainerStartedEvent extends StObject {
  
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
  implicit class SchemaContainerStartedEventMutableBuilder[Self <: SchemaContainerStartedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setPortMappings(value: StringDictionary[Double]): Self = StObject.set(x, "portMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortMappingsUndefined: Self = StObject.set(x, "portMappings", js.undefined)
  }
}
