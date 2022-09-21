package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChangeReport extends StObject {
  
  /**
    * List of changes between two service configurations. The changes will be alphabetically sorted based on the identifier of each change. A ConfigChange identifier is a dot separated path to the configuration. Example: visibility.rules[selector='LibraryService.CreateBook'].restriction
    */
  var configChanges: js.UndefOr[js.Array[SchemaConfigChange]] = js.undefined
}
object SchemaChangeReport {
  
  inline def apply(): SchemaChangeReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeReport]
  }
  
  extension [Self <: SchemaChangeReport](x: Self) {
    
    inline def setConfigChanges(value: js.Array[SchemaConfigChange]): Self = StObject.set(x, "configChanges", value.asInstanceOf[js.Any])
    
    inline def setConfigChangesUndefined: Self = StObject.set(x, "configChanges", js.undefined)
    
    inline def setConfigChangesVarargs(value: SchemaConfigChange*): Self = StObject.set(x, "configChanges", js.Array(value*))
  }
}
