package typings.handsontable

import org.scalablytyped.runtime.Instantiable1
import typings.handsontable.cellTypesBaseMod.CellTypeObject
import typings.handsontable.coreMod.default
import typings.handsontable.editorsTextEditorMod.TextEditor
import typings.handsontable.handsontableStrings.text
import typings.handsontable.settingsMod.CellProperties
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypesTextTypeTextTypeMod {
  
  @JSImport("handsontable/cellTypes/textType/textType", "CELL_TYPE")
  @js.native
  val CELL_TYPE: text = js.native
  
  trait TextCellType
    extends StObject
       with CellTypeObject {
    
    @JSName("editor")
    var editor_TextCellType: Instantiable1[/* instance */ default, TextEditor]
    
    @JSName("renderer")
    def renderer_MTextCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    def renderer_MTextCellType(
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
  object TextCellType {
    
    inline def apply(
      editor: Instantiable1[/* instance */ default, TextEditor],
      renderer: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit
    ): TextCellType = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], renderer = js.Any.fromFunction7(renderer))
      __obj.asInstanceOf[TextCellType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextCellType] (val x: Self) extends AnyVal {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, TextEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setRenderer(
        value: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7(value))
    }
  }
}
