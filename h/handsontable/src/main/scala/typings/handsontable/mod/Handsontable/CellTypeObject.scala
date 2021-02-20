package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.StringDictionary
import typings.handsontable.mod.Handsontable._editors.Base
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellTypeObject
  extends GridSettings
     with /**
  * Custom properties which will be accessible in `cellProperties`
  */
/* key */ StringDictionary[js.Any] {
  
  @JSName("editor")
  var editor_CellTypeObject: js.UndefOr[
    Instantiable6[
      /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]
  ] = js.native
  
  @JSName("renderer")
  var renderer_CellTypeObject: js.UndefOr[typings.handsontable.mod.Handsontable.renderers.Base] = js.native
  
  @JSName("validator")
  var validator_CellTypeObject: js.UndefOr[typings.handsontable.mod.Handsontable.validators.Base] = js.native
}
object CellTypeObject {
  
  @scala.inline
  def apply(): CellTypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellTypeObject]
  }
  
  @scala.inline
  implicit class CellTypeObjectMutableBuilder[Self <: CellTypeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditor(
      value: Instantiable6[
          /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]
    ): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setRenderer(
      value: (/* instance */ typings.handsontable.mod._Handsontable.Core, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => HTMLTableCellElement | Unit
    ): Self = StObject.set(x, "renderer", js.Any.fromFunction7(value))
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setValidator(value: typings.handsontable.mod.Handsontable.validators.Base): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
