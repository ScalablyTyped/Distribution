package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatingEventUIParam extends StObject {
  
  /**
    * Populated with options for the specific field in the collection or null.
    */
  var fieldOptions: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets reference to the igValidator widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the current value in target.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object ValidatingEventUIParam {
  
  @scala.inline
  def apply(): ValidatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatingEventUIParam]
  }
  
  @scala.inline
  implicit class ValidatingEventUIParamMutableBuilder[Self <: ValidatingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldOptions(value: js.Any): Self = StObject.set(x, "fieldOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldOptionsUndefined: Self = StObject.set(x, "fieldOptions", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
