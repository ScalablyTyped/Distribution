package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmSelectionConfig extends StObject {
  
  /**
    * Required. The Google Cloud Platform zone the VM is located.
    */
  var vmZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaVmSelectionConfig {
  
  inline def apply(): SchemaVmSelectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmSelectionConfig]
  }
  
  extension [Self <: SchemaVmSelectionConfig](x: Self) {
    
    inline def setVmZone(value: String): Self = StObject.set(x, "vmZone", value.asInstanceOf[js.Any])
    
    inline def setVmZoneNull: Self = StObject.set(x, "vmZone", null)
    
    inline def setVmZoneUndefined: Self = StObject.set(x, "vmZone", js.undefined)
  }
}
