package typings.luminoDatagrid.typesCelleditorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICellEditOptions extends StObject {
  
  /**
    * Cell editor to use for editing.
    *
    * #### Notes
    * This object is only used by cell editor controller.
    * If not set, controller picks the most suitable editor
    * for the particular cell configuration.
    */
  var editor: js.UndefOr[ICellEditor] = js.undefined
  
  /**
    * Callback method to call on cell edit cancel.
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback method to call on cell edit commit.
    */
  var onCommit: js.UndefOr[js.Function1[/* response */ ICellEditResponse, Unit]] = js.undefined
  
  /**
    * Cell input validator to use for value validation.
    */
  var validator: js.UndefOr[ICellInputValidator] = js.undefined
}
object ICellEditOptions {
  
  inline def apply(): ICellEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellEditOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICellEditOptions] (val x: Self) extends AnyVal {
    
    inline def setEditor(value: ICellEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnCommit(value: /* response */ ICellEditResponse => Unit): Self = StObject.set(x, "onCommit", js.Any.fromFunction1(value))
    
    inline def setOnCommitUndefined: Self = StObject.set(x, "onCommit", js.undefined)
    
    inline def setValidator(value: ICellInputValidator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
