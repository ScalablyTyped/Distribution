package typings.licenseChecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleInfo extends js.Object {
  
  /**
    * Copyright statements
    */
  var copyright: js.UndefOr[String] = js.native
  
  /**
    * Module description
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Publisher e-mail
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Path to license file, if available
    */
  var licenseFile: js.UndefOr[String] = js.native
  
  /**
    * Whether the license is modified
    */
  var licenseModified: js.UndefOr[String] = js.native
  
  /**
    * Contents of the license
    */
  var licenseText: js.UndefOr[String] = js.native
  
  /**
    * Array of licenses
    */
  var licenses: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Module name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Path of NOTICE file
    */
  var noticeFile: js.UndefOr[String] = js.native
  
  /**
    * Path to module
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Private module
    */
  var `private`: js.UndefOr[Boolean] = js.native
  
  /**
    * Publisher name
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * Repository URL
    */
  var repository: js.UndefOr[String] = js.native
  
  /**
    * Publisher URL
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Module version
    */
  var version: js.UndefOr[String] = js.native
}
object ModuleInfo {
  
  @scala.inline
  def apply(): ModuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleInfo]
  }
  
  @scala.inline
  implicit class ModuleInfoOps[Self <: ModuleInfo] (val x: Self) extends AnyVal {
    
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
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setLicenseFile(value: String): Self = this.set("licenseFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseFile: Self = this.set("licenseFile", js.undefined)
    
    @scala.inline
    def setLicenseModified(value: String): Self = this.set("licenseModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModified: Self = this.set("licenseModified", js.undefined)
    
    @scala.inline
    def setLicenseText(value: String): Self = this.set("licenseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseText: Self = this.set("licenseText", js.undefined)
    
    @scala.inline
    def setLicensesVarargs(value: String*): Self = this.set("licenses", js.Array(value :_*))
    
    @scala.inline
    def setLicenses(value: String | js.Array[String]): Self = this.set("licenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenses: Self = this.set("licenses", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNoticeFile(value: String): Self = this.set("noticeFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoticeFile: Self = this.set("noticeFile", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
