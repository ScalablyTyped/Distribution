package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMemoryInfo extends StObject {
  
  /**
    * Maximum memory that can be allocated to the process in KiB
    */
  var memoryCapInKibibyte: js.UndefOr[String] = js.undefined
  
  /**
    * Total memory available on the device in KiB
    */
  var memoryTotalInKibibyte: js.UndefOr[String] = js.undefined
}
object SchemaMemoryInfo {
  
  inline def apply(): SchemaMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemoryInfo]
  }
  
  extension [Self <: SchemaMemoryInfo](x: Self) {
    
    inline def setMemoryCapInKibibyte(value: String): Self = StObject.set(x, "memoryCapInKibibyte", value.asInstanceOf[js.Any])
    
    inline def setMemoryCapInKibibyteUndefined: Self = StObject.set(x, "memoryCapInKibibyte", js.undefined)
    
    inline def setMemoryTotalInKibibyte(value: String): Self = StObject.set(x, "memoryTotalInKibibyte", value.asInstanceOf[js.Any])
    
    inline def setMemoryTotalInKibibyteUndefined: Self = StObject.set(x, "memoryTotalInKibibyte", js.undefined)
  }
}
