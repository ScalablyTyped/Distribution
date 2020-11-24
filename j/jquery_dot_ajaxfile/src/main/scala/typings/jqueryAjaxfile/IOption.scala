package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOption extends js.Object {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var desiredResponseDataType: js.UndefOr[DataType] = js.native
  
  var files: js.UndefOr[js.Array[IFileData]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var timeoutInSeconds: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object IOption {
  
  @scala.inline
  def apply(): IOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOption]
  }
  
  @scala.inline
  implicit class IOptionOps[Self <: IOption] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDesiredResponseDataType(value: DataType): Self = this.set("desiredResponseDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredResponseDataType: Self = this.set("desiredResponseDataType", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: IFileData*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[IFileData]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setTimeoutInSeconds(value: Double): Self = this.set("timeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("timeoutInSeconds", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
