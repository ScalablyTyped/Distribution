package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the Google Tag Manager Container access permissions.
  */
trait SchemaContainerAccess extends StObject {
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * List of Container permissions.
    */
  var permission: js.UndefOr[String] = js.undefined
}
object SchemaContainerAccess {
  
  inline def apply(): SchemaContainerAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerAccess]
  }
  
  extension [Self <: SchemaContainerAccess](x: Self) {
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
