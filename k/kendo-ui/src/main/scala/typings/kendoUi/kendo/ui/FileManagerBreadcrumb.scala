package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerBreadcrumb extends StObject {
  
  var delimiterIcon: js.UndefOr[String] = js.undefined
  
  var rootIcon: js.UndefOr[String] = js.undefined
}
object FileManagerBreadcrumb {
  
  @scala.inline
  def apply(): FileManagerBreadcrumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerBreadcrumb]
  }
  
  @scala.inline
  implicit class FileManagerBreadcrumbMutableBuilder[Self <: FileManagerBreadcrumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiterIcon(value: String): Self = StObject.set(x, "delimiterIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterIconUndefined: Self = StObject.set(x, "delimiterIcon", js.undefined)
    
    @scala.inline
    def setRootIcon(value: String): Self = StObject.set(x, "rootIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootIconUndefined: Self = StObject.set(x, "rootIcon", js.undefined)
  }
}
