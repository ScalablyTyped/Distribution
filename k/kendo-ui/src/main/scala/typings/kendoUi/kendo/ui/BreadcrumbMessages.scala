package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadcrumbMessages extends StObject {
  
  var rootTitle: js.UndefOr[String] = js.undefined
}
object BreadcrumbMessages {
  
  inline def apply(): BreadcrumbMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbMessages]
  }
  
  extension [Self <: BreadcrumbMessages](x: Self) {
    
    inline def setRootTitle(value: String): Self = StObject.set(x, "rootTitle", value.asInstanceOf[js.Any])
    
    inline def setRootTitleUndefined: Self = StObject.set(x, "rootTitle", js.undefined)
  }
}
