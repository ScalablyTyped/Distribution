package typings.jsonexport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserOptions extends js.Object {
  
  var arrayPathString: js.UndefOr[String] = js.native
  
  var booleanFalseString: js.UndefOr[String] = js.native
  
  var booleanTrueString: js.UndefOr[String] = js.native
  
  var endOfLine: js.UndefOr[String] = js.native
  
  var fillGaps: js.UndefOr[Boolean] = js.native
  
  var forceTextDelimiter: js.UndefOr[Boolean] = js.native
  
  var headerPathString: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Array[String]] = js.native
  
  var includeHeaders: js.UndefOr[Boolean] = js.native
  
  var mainPathItem: js.UndefOr[String] = js.native
  
  var rename: js.UndefOr[js.Array[String]] = js.native
  
  var rowDelimiter: js.UndefOr[String] = js.native
  
  var textDelimiter: js.UndefOr[String] = js.native
  
  var undefinedString: js.UndefOr[String] = js.native
  
  var verticalOutput: js.UndefOr[Boolean] = js.native
}
object UserOptions {
  
  @scala.inline
  def apply(): UserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserOptions]
  }
  
  @scala.inline
  implicit class UserOptionsOps[Self <: UserOptions] (val x: Self) extends AnyVal {
    
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
    def setArrayPathString(value: String): Self = this.set("arrayPathString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayPathString: Self = this.set("arrayPathString", js.undefined)
    
    @scala.inline
    def setBooleanFalseString(value: String): Self = this.set("booleanFalseString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanFalseString: Self = this.set("booleanFalseString", js.undefined)
    
    @scala.inline
    def setBooleanTrueString(value: String): Self = this.set("booleanTrueString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanTrueString: Self = this.set("booleanTrueString", js.undefined)
    
    @scala.inline
    def setEndOfLine(value: String): Self = this.set("endOfLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOfLine: Self = this.set("endOfLine", js.undefined)
    
    @scala.inline
    def setFillGaps(value: Boolean): Self = this.set("fillGaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillGaps: Self = this.set("fillGaps", js.undefined)
    
    @scala.inline
    def setForceTextDelimiter(value: Boolean): Self = this.set("forceTextDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceTextDelimiter: Self = this.set("forceTextDelimiter", js.undefined)
    
    @scala.inline
    def setHeaderPathString(value: String): Self = this.set("headerPathString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderPathString: Self = this.set("headerPathString", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIncludeHeaders(value: Boolean): Self = this.set("includeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeHeaders: Self = this.set("includeHeaders", js.undefined)
    
    @scala.inline
    def setMainPathItem(value: String): Self = this.set("mainPathItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainPathItem: Self = this.set("mainPathItem", js.undefined)
    
    @scala.inline
    def setRenameVarargs(value: String*): Self = this.set("rename", js.Array(value :_*))
    
    @scala.inline
    def setRename(value: js.Array[String]): Self = this.set("rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRename: Self = this.set("rename", js.undefined)
    
    @scala.inline
    def setRowDelimiter(value: String): Self = this.set("rowDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDelimiter: Self = this.set("rowDelimiter", js.undefined)
    
    @scala.inline
    def setTextDelimiter(value: String): Self = this.set("textDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDelimiter: Self = this.set("textDelimiter", js.undefined)
    
    @scala.inline
    def setUndefinedString(value: String): Self = this.set("undefinedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndefinedString: Self = this.set("undefinedString", js.undefined)
    
    @scala.inline
    def setVerticalOutput(value: Boolean): Self = this.set("verticalOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOutput: Self = this.set("verticalOutput", js.undefined)
  }
}
