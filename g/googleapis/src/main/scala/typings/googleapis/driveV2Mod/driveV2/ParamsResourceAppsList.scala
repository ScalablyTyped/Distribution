package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsList
  extends StObject
     with StandardParameters {
  
  /**
    * A comma-separated list of file extensions for open with filtering. All apps within the given app query scope which can open any of the given file extensions will be included in the response. If appFilterMimeTypes are provided as well, the result is a union of the two resulting app lists.
    */
  var appFilterExtensions: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of MIME types for open with filtering. All apps within the given app query scope which can open any of the given MIME types will be included in the response. If appFilterExtensions are provided as well, the result is a union of the two resulting app lists.
    */
  var appFilterMimeTypes: js.UndefOr[String] = js.undefined
  
  /**
    * A language or locale code, as defined by BCP 47, with some extensions from Unicode's LDML format (http://www.unicode.org/reports/tr35/).
    */
  var languageCode: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsList {
  
  inline def apply(): ParamsResourceAppsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsList]
  }
  
  extension [Self <: ParamsResourceAppsList](x: Self) {
    
    inline def setAppFilterExtensions(value: String): Self = StObject.set(x, "appFilterExtensions", value.asInstanceOf[js.Any])
    
    inline def setAppFilterExtensionsUndefined: Self = StObject.set(x, "appFilterExtensions", js.undefined)
    
    inline def setAppFilterMimeTypes(value: String): Self = StObject.set(x, "appFilterMimeTypes", value.asInstanceOf[js.Any])
    
    inline def setAppFilterMimeTypesUndefined: Self = StObject.set(x, "appFilterMimeTypes", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
