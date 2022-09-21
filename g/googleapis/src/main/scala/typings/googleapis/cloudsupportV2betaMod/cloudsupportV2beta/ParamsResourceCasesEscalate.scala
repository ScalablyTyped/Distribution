package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCasesEscalate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The fully qualified name of the Case resource to be escalated.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEscalateCaseRequest] = js.undefined
}
object ParamsResourceCasesEscalate {
  
  inline def apply(): ParamsResourceCasesEscalate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCasesEscalate]
  }
  
  extension [Self <: ParamsResourceCasesEscalate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaEscalateCaseRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
