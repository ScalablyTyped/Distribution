package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateInstanceConfigRequest extends StObject {
  
  /**
    * The instance configurations to be updated.
    */
  var config: js.UndefOr[SchemaInstanceConfig] = js.undefined
}
object SchemaUpdateInstanceConfigRequest {
  
  inline def apply(): SchemaUpdateInstanceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateInstanceConfigRequest]
  }
  
  extension [Self <: SchemaUpdateInstanceConfigRequest](x: Self) {
    
    inline def setConfig(value: SchemaInstanceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
