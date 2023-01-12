package typings.handsontable

import org.scalablytyped.runtime.Instantiable1
import typings.handsontable.cellTypesBaseMod.CellTypeObject
import typings.handsontable.coreMod.default
import typings.handsontable.editorsCheckboxEditorMod.CheckboxEditor
import typings.handsontable.handsontableStrings.checkbox
import typings.handsontable.settingsMod.CellProperties
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypesCheckboxTypeCheckboxTypeMod {
  
  @JSImport("handsontable/cellTypes/checkboxType/checkboxType", "CELL_TYPE")
  @js.native
  val CELL_TYPE: checkbox = js.native
  
  trait CheckboxCellType
    extends StObject
       with CellTypeObject {
    
    @JSName("editor")
    var editor_CheckboxCellType: Instantiable1[/* instance */ default, CheckboxEditor]
    
    @JSName("renderer")
    def renderer_MCheckboxCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    def renderer_MCheckboxCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: Double,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    var renderer_Original: js.Function7[
        /* instance */ default, 
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ Any, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
  }
  object CheckboxCellType {
    
    inline def apply(
      editor: Instantiable1[/* instance */ default, CheckboxEditor],
      renderer: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit
    ): CheckboxCellType = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], renderer = js.Any.fromFunction7(renderer))
      __obj.asInstanceOf[CheckboxCellType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxCellType] (val x: Self) extends AnyVal {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, CheckboxEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setRenderer(
        value: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7(value))
    }
  }
}
