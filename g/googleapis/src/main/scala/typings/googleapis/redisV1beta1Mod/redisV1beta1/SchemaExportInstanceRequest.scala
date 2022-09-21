package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExportInstanceRequest extends StObject {
  
  /**
    * Required. Specify data to be exported.
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.undefined
}
object SchemaExportInstanceRequest {
  
  inline def apply(): SchemaExportInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportInstanceRequest]
  }
  
  extension [Self <: SchemaExportInstanceRequest](x: Self) {
    
    inline def setOutputConfig(value: SchemaOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
