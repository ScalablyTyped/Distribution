package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOutdatedLibrary extends StObject {
  
  /**
    * URLs to learn more information about the vulnerabilities in the library.
    */
  var learnMoreUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the outdated library.
    */
  var libraryName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version number.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaOutdatedLibrary {
  
  inline def apply(): SchemaOutdatedLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutdatedLibrary]
  }
  
  extension [Self <: SchemaOutdatedLibrary](x: Self) {
    
    inline def setLearnMoreUrls(value: js.Array[String]): Self = StObject.set(x, "learnMoreUrls", value.asInstanceOf[js.Any])
    
    inline def setLearnMoreUrlsNull: Self = StObject.set(x, "learnMoreUrls", null)
    
    inline def setLearnMoreUrlsUndefined: Self = StObject.set(x, "learnMoreUrls", js.undefined)
    
    inline def setLearnMoreUrlsVarargs(value: String*): Self = StObject.set(x, "learnMoreUrls", js.Array(value*))
    
    inline def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
    
    inline def setLibraryNameNull: Self = StObject.set(x, "libraryName", null)
    
    inline def setLibraryNameUndefined: Self = StObject.set(x, "libraryName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
