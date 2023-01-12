package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileManagerBreadcrumb extends StObject {
  
  var delimiterIcon: js.UndefOr[String] = js.undefined
  
  var rootIcon: js.UndefOr[String] = js.undefined
}
object FileManagerBreadcrumb {
  
  inline def apply(): FileManagerBreadcrumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerBreadcrumb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileManagerBreadcrumb] (val x: Self) extends AnyVal {
    
    inline def setDelimiterIcon(value: String): Self = StObject.set(x, "delimiterIcon", value.asInstanceOf[js.Any])
    
    inline def setDelimiterIconUndefined: Self = StObject.set(x, "delimiterIcon", js.undefined)
    
    inline def setRootIcon(value: String): Self = StObject.set(x, "rootIcon", value.asInstanceOf[js.Any])
    
    inline def setRootIconUndefined: Self = StObject.set(x, "rootIcon", js.undefined)
  }
}
