package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowEditDialogContentsRenderedEventUIParam extends StObject {
  
  /**
    * Gets a reference to row edit dialog DOM element.
    */
  var dialogElement: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object RowEditDialogContentsRenderedEventUIParam {
  
  @scala.inline
  def apply(): RowEditDialogContentsRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEditDialogContentsRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class RowEditDialogContentsRenderedEventUIParamMutableBuilder[Self <: RowEditDialogContentsRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogElement(value: js.Any): Self = StObject.set(x, "dialogElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogElementUndefined: Self = StObject.set(x, "dialogElement", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
