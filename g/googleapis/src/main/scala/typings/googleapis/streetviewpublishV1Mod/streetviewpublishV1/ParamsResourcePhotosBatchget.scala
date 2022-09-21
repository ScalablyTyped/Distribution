package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotosBatchget
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If language_code is unspecified, the user's language preference for Google services is used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. IDs of the Photos. For HTTP GET requests, the URL query parameter should be `photoIds=&photoIds=&...`.
    */
  var photoIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. Specifies if a download URL for the photo bytes should be returned in the Photo response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourcePhotosBatchget {
  
  inline def apply(): ParamsResourcePhotosBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosBatchget]
  }
  
  extension [Self <: ParamsResourcePhotosBatchget](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPhotoIds(value: js.Array[String]): Self = StObject.set(x, "photoIds", value.asInstanceOf[js.Any])
    
    inline def setPhotoIdsUndefined: Self = StObject.set(x, "photoIds", js.undefined)
    
    inline def setPhotoIdsVarargs(value: String*): Self = StObject.set(x, "photoIds", js.Array(value*))
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
