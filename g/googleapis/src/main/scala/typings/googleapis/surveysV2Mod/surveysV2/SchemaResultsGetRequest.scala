package typings.googleapis.surveysV2Mod.surveysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultsGetRequest extends StObject {
  
  var resultMask: js.UndefOr[SchemaResultsMask] = js.undefined
}
object SchemaResultsGetRequest {
  
  inline def apply(): SchemaResultsGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultsGetRequest]
  }
  
  extension [Self <: SchemaResultsGetRequest](x: Self) {
    
    inline def setResultMask(value: SchemaResultsMask): Self = StObject.set(x, "resultMask", value.asInstanceOf[js.Any])
    
    inline def setResultMaskUndefined: Self = StObject.set(x, "resultMask", js.undefined)
  }
}
