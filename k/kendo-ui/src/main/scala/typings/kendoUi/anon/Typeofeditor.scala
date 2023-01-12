package typings.kendoUi.anon

import org.scalablytyped.runtime.Instantiable0
import typings.kendoUi.kendo.ui.editor.Toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofeditor extends StObject {
  
  var Toolbar: Instantiable0[typings.kendoUi.kendo.ui.editor.Toolbar]
}
object Typeofeditor {
  
  inline def apply(Toolbar: Instantiable0[Toolbar]): Typeofeditor = {
    val __obj = js.Dynamic.literal(Toolbar = Toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofeditor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofeditor] (val x: Self) extends AnyVal {
    
    inline def setToolbar(value: Instantiable0[Toolbar]): Self = StObject.set(x, "Toolbar", value.asInstanceOf[js.Any])
  }
}
