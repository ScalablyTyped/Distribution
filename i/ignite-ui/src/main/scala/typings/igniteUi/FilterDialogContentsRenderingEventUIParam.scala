package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterDialogContentsRenderingEventUIParam extends StObject {
  
  /**
    * Gets reference to the filtering dialog DOM element.
    */
  var dialogElement: js.UndefOr[String] = js.native
  
  /**
    * Gets reference to GridFiltering.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object FilterDialogContentsRenderingEventUIParam {
  
  @scala.inline
  def apply(): FilterDialogContentsRenderingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterDialogContentsRenderingEventUIParam]
  }
  
  @scala.inline
  implicit class FilterDialogContentsRenderingEventUIParamMutableBuilder[Self <: FilterDialogContentsRenderingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogElement(value: String): Self = StObject.set(x, "dialogElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogElementUndefined: Self = StObject.set(x, "dialogElement", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
