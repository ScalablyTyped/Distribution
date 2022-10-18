package typings.luminoDatagrid

import typings.luminoDatagrid.typesCelleditorMod.CellEditor.CellConfig
import typings.luminoDatagrid.typesCelleditorMod.ICellEditOptions
import typings.luminoDatagrid.typesCelleditorMod.ICellEditor
import typings.luminoDatagrid.typesDatamodelMod.DataModel.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCelleditorcontrollerMod {
  
  @JSImport("@lumino/datagrid/types/celleditorcontroller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lumino/datagrid/types/celleditorcontroller", "CellEditorController")
  @js.native
  open class CellEditorController ()
    extends StObject
       with ICellEditorController {
    
    /* private */ var _cell: Any = js.native
    
    /* private */ var _editor: Any = js.native
    
    /* private */ var _getDataTypeKey: Any = js.native
    
    /**
      * Choose the most appropriate cell editor to use based on overrides / cell data type.
      *
      * If no match is found in overrides or based on cell data type, and if cell has a primitive
      * data type then TextCellEditor is used as default cell editor. If 'default' cell editor
      * is overridden, then it is used instead of TextCellEditor for default.
      */
    /* private */ var _getEditor: Any = js.native
    
    /* private */ var _getMetadataBasedEditor: Any = js.native
    
    /* private */ var _metadataBasedOverrides: Any = js.native
    
    /* private */ var _metadataIdentifierToKey: Any = js.native
    
    /* private */ var _metadataMatchesIdentifier: Any = js.native
    
    /* private */ var _objectToKey: Any = js.native
    
    /* private */ var _onCancel: Any = js.native
    
    /* private */ var _onCommit: Any = js.native
    
    /* private */ var _typeBasedOverrides: Any = js.native
  }
  
  inline def resolveOption[T](option: ConfigOption[T], config: CellConfig): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOption")(option.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type ConfigFunc[T] = js.Function1[/* config */ CellConfig, T]
  
  type ConfigOption[T] = T | ConfigFunc[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.luminoDatagrid.typesCelleditorMod.CellDataType
    - typings.luminoDatagrid.typesDatamodelMod.DataModel.Metadata
    - typings.luminoDatagrid.luminoDatagridStrings.default
  */
  type EditorOverrideIdentifier = _EditorOverrideIdentifier | Metadata
  
  @js.native
  trait ICellEditorController extends StObject {
    
    /**
      * Cancel editing.
      */
    def cancel(): Unit = js.native
    
    /**
      * Start editing a cell.
      *
      * @param cell - The object holding cell configuration data.
      *
      * @param options - The cell editing options.
      */
    def edit(cell: CellConfig): Boolean = js.native
    def edit(cell: CellConfig, options: ICellEditOptions): Boolean = js.native
    
    /**
      * Override cell editor for the cells matching the identifier.
      *
      * @param identifier - Cell identifier to use when matching cells.
      * if identifier is a CellDataType, then cell matching is done using data type of the cell,
      * if identifier is a Metadata, then partial match of the cell metadata with identifier is used for match,
      * if identifier is 'default' then override is used as default editor when no other editor is found suitable
      *
      * @param editor - The cell editor to use or resolver to use to get an editor for matching cells.
      */
    def setEditor(identifier: EditorOverrideIdentifier, editor: ICellEditor): Unit = js.native
    def setEditor(identifier: EditorOverrideIdentifier, editor: Resolver): Unit = js.native
  }
  
  type Resolver = ConfigFunc[js.UndefOr[ICellEditor]]
  
  trait _EditorOverrideIdentifier extends StObject
}
