package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileManagerBreadcrumb extends js.Object {
  
  var delimiterIcon: js.UndefOr[String] = js.native
  
  var rootIcon: js.UndefOr[String] = js.native
}
object FileManagerBreadcrumb {
  
  @scala.inline
  def apply(): FileManagerBreadcrumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerBreadcrumb]
  }
  
  @scala.inline
  implicit class FileManagerBreadcrumbOps[Self <: FileManagerBreadcrumb] (val x: Self) extends AnyVal {
    
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
    def setDelimiterIcon(value: String): Self = this.set("delimiterIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiterIcon: Self = this.set("delimiterIcon", js.undefined)
    
    @scala.inline
    def setRootIcon(value: String): Self = this.set("rootIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootIcon: Self = this.set("rootIcon", js.undefined)
  }
}
