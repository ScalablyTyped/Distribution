package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information reported for an outdated library.
  */
@js.native
trait SchemaOutdatedLibrary extends js.Object {
  
  /**
    * URLs to learn more information about the vulnerabilities in the library.
    */
  var learnMoreUrls: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the outdated library.
    */
  var libraryName: js.UndefOr[String] = js.native
  
  /**
    * The version number.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaOutdatedLibrary {
  
  @scala.inline
  def apply(): SchemaOutdatedLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutdatedLibrary]
  }
  
  @scala.inline
  implicit class SchemaOutdatedLibraryOps[Self <: SchemaOutdatedLibrary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLearnMoreUrlsVarargs(value: String*): Self = this.set("learnMoreUrls", js.Array(value :_*))
    
    @scala.inline
    def setLearnMoreUrls(value: js.Array[String]): Self = this.set("learnMoreUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLearnMoreUrls: Self = this.set("learnMoreUrls", js.undefined)
    
    @scala.inline
    def setLibraryName(value: String): Self = this.set("libraryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibraryName: Self = this.set("libraryName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
