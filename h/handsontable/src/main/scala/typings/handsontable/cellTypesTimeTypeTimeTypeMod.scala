package typings.handsontable

import org.scalablytyped.runtime.Instantiable1
import typings.handsontable.cellTypesBaseMod.CellTypeObject
import typings.handsontable.commonMod.CellValue
import typings.handsontable.coreMod.default
import typings.handsontable.editorsTimeEditorMod.TimeEditor
import typings.handsontable.handsontableStrings.time
import typings.handsontable.settingsMod.CellProperties
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypesTimeTypeTimeTypeMod {
  
  @JSImport("handsontable/cellTypes/timeType/timeType", "CELL_TYPE")
  @js.native
  val CELL_TYPE: time = js.native
  
  trait TimeCellType
    extends StObject
       with CellTypeObject {
    
    @JSName("editor")
    var editor_TimeCellType: Instantiable1[/* instance */ default, TimeEditor]
    
    @JSName("renderer")
    def renderer_MTimeCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    def renderer_MTimeCellType(
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
    def validator_MTimeCellType(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit
    @JSName("validator")
    var validator_Original: js.ThisFunction2[
        /* this */ CellProperties, 
        /* value */ CellValue, 
        /* callback */ js.Function1[/* valid */ Boolean, Unit], 
        Unit
      ]
  }
  object TimeCellType {
    
    inline def apply(
      editor: Instantiable1[/* instance */ default, TimeEditor],
      renderer: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit,
      validator: js.ThisFunction2[
          /* this */ CellProperties, 
          /* value */ CellValue, 
          /* callback */ js.Function1[/* valid */ Boolean, Unit], 
          Unit
        ]
    ): TimeCellType = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], renderer = js.Any.fromFunction7(renderer), validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeCellType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeCellType] (val x: Self) extends AnyVal {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, TimeEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
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
