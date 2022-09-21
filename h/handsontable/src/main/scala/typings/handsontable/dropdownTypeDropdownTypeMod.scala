package typings.handsontable

import org.scalablytyped.runtime.Instantiable1
import typings.handsontable.cellTypesBaseMod.CellTypeObject
import typings.handsontable.commonMod.CellValue
import typings.handsontable.coreMod.default
import typings.handsontable.dropdownEditorMod.DropdownEditor
import typings.handsontable.handsontableStrings.dropdown
import typings.handsontable.settingsMod.CellProperties
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownTypeDropdownTypeMod {
  
  @JSImport("handsontable/cellTypes/dropdownType/dropdownType", "CELL_TYPE")
  @js.native
  val CELL_TYPE: dropdown = js.native
  
  trait DropdownCellType
    extends StObject
       with CellTypeObject {
    
    @JSName("editor")
    var editor_DropdownCellType: Instantiable1[/* instance */ default, DropdownEditor]
    
    @JSName("renderer")
    def renderer_MDropdownCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    def renderer_MDropdownCellType(
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
    
    @JSName("validator")
    def validator_MDropdownCellType(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit
    @JSName("validator")
    var validator_Original: js.ThisFunction2[
        /* this */ CellProperties, 
        /* value */ CellValue, 
        /* callback */ js.Function1[/* valid */ Boolean, Unit], 
        Unit
      ]
  }
  object DropdownCellType {
    
    inline def apply(
      editor: Instantiable1[/* instance */ default, DropdownEditor],
      renderer: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit,
      validator: js.ThisFunction2[
          /* this */ CellProperties, 
          /* value */ CellValue, 
          /* callback */ js.Function1[/* valid */ Boolean, Unit], 
          Unit
        ]
    ): DropdownCellType = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], renderer = js.Any.fromFunction7(renderer), validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownCellType]
    }
    
    extension [Self <: DropdownCellType](x: Self) {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, DropdownEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setRenderer(
        value: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7(value))
      
      inline def setValidator(
        value: js.ThisFunction2[
              /* this */ CellProperties, 
              /* value */ CellValue, 
              /* callback */ js.Function1[/* valid */ Boolean, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
  }
}
