package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeEditable extends StObject {
  
  var connect: js.UndefOr[Boolean] = js.native
}
object ShapeEditable {
  
  @scala.inline
  def apply(): ShapeEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeEditable]
  }
  
  @scala.inline
  implicit class ShapeEditableMutableBuilder[Self <: ShapeEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect(value: Boolean): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
  }
}
