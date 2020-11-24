package typings.jqueryAjaxfile.AjaxFileJQuery

import typings.jqueryAjaxfile.IFileData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJQueryOption extends js.Object {
  
  var complete: js.UndefOr[js.Function2[/* jqXHR */ IJQueryXHR, /* textStatus */ String, _]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dataType: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[
    js.Function3[/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String, _]
  ] = js.native
  
  var files: js.UndefOr[js.Array[IFileData]] = js.native
  
  var global: js.UndefOr[Boolean] = js.native
  
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR, _]
  ] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object IJQueryOption {
  
  @scala.inline
  def apply(): IJQueryOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJQueryOption]
  }
  
  @scala.inline
  implicit class IJQueryOptionOps[Self <: IJQueryOption] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: (/* jqXHR */ IJQueryXHR, /* textStatus */ String) => _): Self = this.set("complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setError(value: (/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String) => _): Self = this.set("error", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: IFileData*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[IFileData]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR) => _): Self = this.set("success", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
