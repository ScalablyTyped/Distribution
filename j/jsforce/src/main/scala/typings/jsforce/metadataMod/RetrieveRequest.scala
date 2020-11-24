package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveRequest extends js.Object {
  
  var apiVersion: js.UndefOr[String] = js.native
  
  var packageNames: js.UndefOr[js.Array[String]] = js.native
  
  var singlePackage: js.UndefOr[Boolean] = js.native
  
  var specificFiles: js.UndefOr[js.Array[String]] = js.native
  
  var unpackaged: js.UndefOr[Package] = js.native
}
object RetrieveRequest {
  
  @scala.inline
  def apply(): RetrieveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveRequest]
  }
  
  @scala.inline
  implicit class RetrieveRequestOps[Self <: RetrieveRequest] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setPackageNamesVarargs(value: String*): Self = this.set("packageNames", js.Array(value :_*))
    
    @scala.inline
    def setPackageNames(value: js.Array[String]): Self = this.set("packageNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageNames: Self = this.set("packageNames", js.undefined)
    
    @scala.inline
    def setSinglePackage(value: Boolean): Self = this.set("singlePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSinglePackage: Self = this.set("singlePackage", js.undefined)
    
    @scala.inline
    def setSpecificFilesVarargs(value: String*): Self = this.set("specificFiles", js.Array(value :_*))
    
    @scala.inline
    def setSpecificFiles(value: js.Array[String]): Self = this.set("specificFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecificFiles: Self = this.set("specificFiles", js.undefined)
    
    @scala.inline
    def setUnpackaged(value: Package): Self = this.set("unpackaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnpackaged: Self = this.set("unpackaged", js.undefined)
  }
}
