package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The BCP-47 language code to use for evaluating localized Field labels in response. When not specified, values in the default configured language will be used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaLabel] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin privileges. The server will verify the user is an admin before allowing access.
    */
  var useAdminAccess: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceLabelsCreate {
  
  inline def apply(): ParamsResourceLabelsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsCreate]
  }
  
  extension [Self <: ParamsResourceLabelsCreate](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAppsDriveLabelsV2betaLabel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
  }
}
