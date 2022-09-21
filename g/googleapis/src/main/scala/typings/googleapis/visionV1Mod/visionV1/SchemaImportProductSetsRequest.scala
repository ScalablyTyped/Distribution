package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportProductSetsRequest extends StObject {
  
  /**
    * Required. The input content for the list of requests.
    */
  var inputConfig: js.UndefOr[SchemaImportProductSetsInputConfig] = js.undefined
}
object SchemaImportProductSetsRequest {
  
  inline def apply(): SchemaImportProductSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportProductSetsRequest]
  }
  
  extension [Self <: SchemaImportProductSetsRequest](x: Self) {
    
    inline def setInputConfig(value: SchemaImportProductSetsInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
