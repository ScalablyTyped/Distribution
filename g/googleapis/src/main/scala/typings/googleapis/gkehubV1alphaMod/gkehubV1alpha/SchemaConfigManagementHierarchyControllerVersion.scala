package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementHierarchyControllerVersion extends StObject {
  
  /**
    * Version for Hierarchy Controller extension
    */
  var `extension`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version for open source HNC
    */
  var hnc: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementHierarchyControllerVersion {
  
  inline def apply(): SchemaConfigManagementHierarchyControllerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementHierarchyControllerVersion]
  }
  
  extension [Self <: SchemaConfigManagementHierarchyControllerVersion](x: Self) {
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionNull: Self = StObject.set(x, "extension", null)
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setHnc(value: String): Self = StObject.set(x, "hnc", value.asInstanceOf[js.Any])
    
    inline def setHncNull: Self = StObject.set(x, "hnc", null)
    
    inline def setHncUndefined: Self = StObject.set(x, "hnc", js.undefined)
  }
}
