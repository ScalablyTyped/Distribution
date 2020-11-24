package typings.kendoUi.anon

import org.scalablytyped.runtime.Instantiable0
import typings.kendoUi.kendo.ui.editor.Toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofeditor extends js.Object {
  
  var Toolbar: Instantiable0[typings.kendoUi.kendo.ui.editor.Toolbar] = js.native
}
object Typeofeditor {
  
  @scala.inline
  def apply(Toolbar: Instantiable0[Toolbar]): Typeofeditor = {
    val __obj = js.Dynamic.literal(Toolbar = Toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofeditor]
  }
  
  @scala.inline
  implicit class TypeofeditorOps[Self <: Typeofeditor] (val x: Self) extends AnyVal {
    
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
    def setToolbar(value: Instantiable0[Toolbar]): Self = this.set("Toolbar", value.asInstanceOf[js.Any])
  }
}
