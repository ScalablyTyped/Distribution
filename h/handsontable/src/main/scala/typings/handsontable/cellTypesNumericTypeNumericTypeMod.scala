package typings.handsontable

import org.scalablytyped.runtime.Instantiable1
import typings.handsontable.cellTypesBaseMod.CellTypeObject
import typings.handsontable.commonMod.CellValue
import typings.handsontable.coreMod.default
import typings.handsontable.editorsNumericEditorMod.NumericEditor
import typings.handsontable.handsontableStrings.numeric
import typings.handsontable.settingsMod.CellProperties
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypesNumericTypeNumericTypeMod {
  
  @JSImport("handsontable/cellTypes/numericType/numericType", "CELL_TYPE")
  @js.native
  val CELL_TYPE: numeric = js.native
  
  trait NumericCellType
    extends StObject
       with CellTypeObject {
    
    @JSName("editor")
    var editor_NumericCellType: Instantiable1[/* instance */ default, NumericEditor]
    
    @JSName("renderer")
    def renderer_MNumericCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    def renderer_MNumericCellType(
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
    def validator_MNumericCellType(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit
    @JSName("validator")
    var validator_Original: js.ThisFunction2[
        /* this */ CellProperties, 
        /* value */ CellValue, 
        /* callback */ js.Function1[/* valid */ Boolean, Unit], 
        Unit
      ]
  }
  object NumericCellType {
    
    inline def apply(
      editor: Instantiable1[/* instance */ default, NumericEditor],
      renderer: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit,
      validator: js.ThisFunction2[
          /* this */ CellProperties, 
          /* value */ CellValue, 
          /* callback */ js.Function1[/* valid */ Boolean, Unit], 
          Unit
        ]
    ): NumericCellType = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], renderer = js.Any.fromFunction7(renderer), validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumericCellType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumericCellType] (val x: Self) extends AnyVal {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, NumericEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
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
