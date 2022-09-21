package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportInstanceRequest extends StObject {
  
  /**
    * Required. Specify data to be imported.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.undefined
}
object SchemaImportInstanceRequest {
  
  inline def apply(): SchemaImportInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportInstanceRequest]
  }
  
  extension [Self <: SchemaImportInstanceRequest](x: Self) {
    
    inline def setInputConfig(value: SchemaInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
