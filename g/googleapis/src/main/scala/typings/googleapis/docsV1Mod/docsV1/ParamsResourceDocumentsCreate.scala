package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDocumentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDocument] = js.undefined
}
object ParamsResourceDocumentsCreate {
  
  inline def apply(): ParamsResourceDocumentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDocumentsCreate]
  }
  
  extension [Self <: ParamsResourceDocumentsCreate](x: Self) {
    
    inline def setRequestBody(value: SchemaDocument): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
