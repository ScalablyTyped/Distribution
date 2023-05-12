package typings.jupyterYdoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyter/ydoc.@jupyter/ydoc/lib/api.ISharedNotebook.IOptions, 'data'> */
trait OmitIOptionsdata extends StObject {
  
  var disableDocumentWideUndoRedo: js.UndefOr[Boolean] = js.undefined
}
object OmitIOptionsdata {
  
  inline def apply(): OmitIOptionsdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitIOptionsdata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitIOptionsdata] (val x: Self) extends AnyVal {
    
    inline def setDisableDocumentWideUndoRedo(value: Boolean): Self = StObject.set(x, "disableDocumentWideUndoRedo", value.asInstanceOf[js.Any])
    
    inline def setDisableDocumentWideUndoRedoUndefined: Self = StObject.set(x, "disableDocumentWideUndoRedo", js.undefined)
  }
}
