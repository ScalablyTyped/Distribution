package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCasesCommentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of Case to which this comment should be added.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaComment] = js.undefined
}
object ParamsResourceCasesCommentsCreate {
  
  inline def apply(): ParamsResourceCasesCommentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCasesCommentsCreate]
  }
  
  extension [Self <: ParamsResourceCasesCommentsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaComment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
