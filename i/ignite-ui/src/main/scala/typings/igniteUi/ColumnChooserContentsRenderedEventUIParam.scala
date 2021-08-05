package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnChooserContentsRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the Column Chooser element. This is a jQuery object.
    */
  var columnChooserElement: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ColumnChooserContentsRenderedEventUIParam {
  
  inline def apply(): ColumnChooserContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnChooserContentsRenderedEventUIParam]
  }
  
  extension [Self <: ColumnChooserContentsRenderedEventUIParam](x: Self) {
    
    inline def setColumnChooserElement(value: String): Self = StObject.set(x, "columnChooserElement", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserElementUndefined: Self = StObject.set(x, "columnChooserElement", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
