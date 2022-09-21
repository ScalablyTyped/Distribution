package typings.handsontable

import org.scalablytyped.runtime.Instantiable1
import typings.handsontable.cellTypesBaseMod.CellTypeObject
import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.password
import typings.handsontable.passwordEditorMod.PasswordEditor
import typings.handsontable.settingsMod.CellProperties
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object passwordTypePasswordTypeMod {
  
  @JSImport("handsontable/cellTypes/passwordType/passwordType", "CELL_TYPE")
  @js.native
  val CELL_TYPE: password = js.native
  
  trait PasswordCellType
    extends StObject
       with CellTypeObject {
    
    @JSName("editor")
    var editor_PasswordCellType: Instantiable1[/* instance */ default, PasswordEditor]
    
    @JSName("renderer")
    def renderer_MPasswordCellType(
      instance: default,
      TD: HTMLTableCellElement,
      row: Double,
      col: Double,
      prop: String,
      value: Any,
      cellProperties: CellProperties
    ): Unit
    @JSName("renderer")
    def renderer_MPasswordCellType(
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
  object PasswordCellType {
    
    inline def apply(
      editor: Instantiable1[/* instance */ default, PasswordEditor],
      renderer: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit
    ): PasswordCellType = {
      val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], renderer = js.Any.fromFunction7(renderer))
      __obj.asInstanceOf[PasswordCellType]
    }
    
    extension [Self <: PasswordCellType](x: Self) {
      
      inline def setEditor(value: Instantiable1[/* instance */ default, PasswordEditor]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setRenderer(
        value: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7(value))
    }
  }
}
