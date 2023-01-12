package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeAvailableEvent extends StObject {
  
  /** The release channel of the version. If empty, it means a non-channel release. */
  var releaseChannel: js.UndefOr[ReleaseChannel] = js.undefined
  
  /** Optional relative path to the resource. For example, the relative path of the node pool. */
  var resource: js.UndefOr[String] = js.undefined
  
  /** The resource type of the release version. */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /** The release version available for upgrade. */
  var version: js.UndefOr[String] = js.undefined
}
object UpgradeAvailableEvent {
  
  inline def apply(): UpgradeAvailableEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeAvailableEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeAvailableEvent] (val x: Self) extends AnyVal {
    
    inline def setReleaseChannel(value: ReleaseChannel): Self = StObject.set(x, "releaseChannel", value.asInstanceOf[js.Any])
    
    inline def setReleaseChannelUndefined: Self = StObject.set(x, "releaseChannel", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
