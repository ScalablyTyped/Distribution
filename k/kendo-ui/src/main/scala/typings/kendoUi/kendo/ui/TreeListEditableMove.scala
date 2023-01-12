package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListEditableMove extends StObject {
  
  var reorderable: js.UndefOr[Boolean] = js.undefined
}
object TreeListEditableMove {
  
  inline def apply(): TreeListEditableMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListEditableMove]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeListEditableMove] (val x: Self) extends AnyVal {
    
    inline def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    inline def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
  }
}
