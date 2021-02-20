package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramPannable extends StObject {
  
  var key: js.UndefOr[String] = js.native
}
object DiagramPannable {
  
  @scala.inline
  def apply(): DiagramPannable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramPannable]
  }
  
  @scala.inline
  implicit class DiagramPannableMutableBuilder[Self <: DiagramPannable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
