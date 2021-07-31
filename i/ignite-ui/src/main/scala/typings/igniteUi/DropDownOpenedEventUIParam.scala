package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownOpenedEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to jquery DOM element which represents drop down list container.
    */
  var list: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to igCombo.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object DropDownOpenedEventUIParam {
  
  @scala.inline
  def apply(): DropDownOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownOpenedEventUIParam]
  }
  
  @scala.inline
  implicit class DropDownOpenedEventUIParamMutableBuilder[Self <: DropDownOpenedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: js.Any): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
