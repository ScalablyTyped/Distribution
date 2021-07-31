package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalDialogGroupingColumnEventUIParam extends StObject {
  
  /**
    * The key of the column to be grouped.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the current layout object, if any.
    */
  var layout: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ModalDialogGroupingColumnEventUIParam {
  
  @scala.inline
  def apply(): ModalDialogGroupingColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogGroupingColumnEventUIParam]
  }
  
  @scala.inline
  implicit class ModalDialogGroupingColumnEventUIParamMutableBuilder[Self <: ModalDialogGroupingColumnEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
