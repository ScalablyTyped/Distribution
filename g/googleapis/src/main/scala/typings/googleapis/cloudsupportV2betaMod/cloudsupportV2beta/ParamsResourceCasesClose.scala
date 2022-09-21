package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCasesClose
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The fully qualified name of the case resource to be closed.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCloseCaseRequest] = js.undefined
}
object ParamsResourceCasesClose {
  
  inline def apply(): ParamsResourceCasesClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCasesClose]
  }
  
  extension [Self <: ParamsResourceCasesClose](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaCloseCaseRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
