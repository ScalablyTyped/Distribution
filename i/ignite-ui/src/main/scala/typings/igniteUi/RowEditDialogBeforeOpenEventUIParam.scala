package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowEditDialogBeforeOpenEventUIParam extends StObject {
  
  /**
    * Gets a reference to row edit dialog DOM element.
    */
  var dialogElement: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to GridUpdating.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object RowEditDialogBeforeOpenEventUIParam {
  
  @scala.inline
  def apply(): RowEditDialogBeforeOpenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEditDialogBeforeOpenEventUIParam]
  }
  
  @scala.inline
  implicit class RowEditDialogBeforeOpenEventUIParamMutableBuilder[Self <: RowEditDialogBeforeOpenEventUIParam] (val x: Self) extends AnyVal {
    
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
