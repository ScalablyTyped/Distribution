package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeAvailableEvent extends StObject {
  
  /**
    * The release channel of the version. If empty, it means a non-channel release.
    */
  var releaseChannel: js.UndefOr[SchemaReleaseChannel] = js.undefined
  
  /**
    * Optional relative path to the resource. For example, the relative path of the node pool.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource type of the release version.
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The release version available for upgrade.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpgradeAvailableEvent {
  
  inline def apply(): SchemaUpgradeAvailableEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeAvailableEvent]
  }
  
  extension [Self <: SchemaUpgradeAvailableEvent](x: Self) {
    
    inline def setReleaseChannel(value: SchemaReleaseChannel): Self = StObject.set(x, "releaseChannel", value.asInstanceOf[js.Any])
    
    inline def setReleaseChannelUndefined: Self = StObject.set(x, "releaseChannel", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
