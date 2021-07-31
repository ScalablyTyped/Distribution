package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information reported for an outdated library.
  */
trait SchemaOutdatedLibrary extends StObject {
  
  /**
    * URLs to learn more information about the vulnerabilities in the library.
    */
  var learnMoreUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the outdated library.
    */
  var libraryName: js.UndefOr[String] = js.undefined
  
  /**
    * The version number.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SchemaOutdatedLibrary {
  
  @scala.inline
  def apply(): SchemaOutdatedLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutdatedLibrary]
  }
  
  @scala.inline
  implicit class SchemaOutdatedLibraryMutableBuilder[Self <: SchemaOutdatedLibrary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLearnMoreUrls(value: js.Array[String]): Self = StObject.set(x, "learnMoreUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnMoreUrlsUndefined: Self = StObject.set(x, "learnMoreUrls", js.undefined)
    
    @scala.inline
    def setLearnMoreUrlsVarargs(value: String*): Self = StObject.set(x, "learnMoreUrls", js.Array(value :_*))
    
    @scala.inline
    def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryNameUndefined: Self = StObject.set(x, "libraryName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
