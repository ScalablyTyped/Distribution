package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePagesUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The name of this `ClaimReview` markup page resource, in the form of `pages/{page_id\}`. Except for update requests, this field is output-only and should not be set by the user.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.undefined
}
object ParamsResourcePagesUpdate {
  
  inline def apply(): ParamsResourcePagesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagesUpdate]
  }
  
  extension [Self <: ParamsResourcePagesUpdate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
