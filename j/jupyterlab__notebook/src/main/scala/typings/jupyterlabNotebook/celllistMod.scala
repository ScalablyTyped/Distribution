package typings.jupyterlabNotebook

import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.List
import typings.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablelistMod.IObservableList.IChangedArgs
import typings.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object celllistMod {
  
  @JSImport("@jupyterlab/notebook/lib/celllist", "CellList")
  @js.native
  class CellList protected () extends IObservableUndoableList[ICellModel] {
    /**
      * Construct the cell list.
      */
    def this(modelDB: IModelDB, factory: IContentFactory) = this()
    
    var _cellMap: js.Any = js.native
    
    var _cellOrder: js.Any = js.native
    
    var _changed: js.Any = js.native
    
    var _factory: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _onOrderChanged: js.Any = js.native
    
    /**
      * Whether the object can redo changes.
      */
    @JSName("canRedo")
    def canRedo_MCellList: Boolean = js.native
    
    /**
      * Whether the object can undo changes.
      */
    @JSName("canUndo")
    def canUndo_MCellList: Boolean = js.native
    
    /**
      * A signal emitted when the cell list has changed.
      */
    @JSName("changed")
    def changed_MCellList: ISignal[this.type, IChangedArgs[ICellModel]] = js.native
    
    /**
      * Test whether the cell list has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MCellList: Boolean = js.native
    
    /**
      * Test whether the list is empty.
      *
      * @returns `true` if the cell list is empty, `false` otherwise.
      *
      * #### Notes
      * This is a read-only property.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * No changes.
      */
    def isEmpty: Boolean = js.native
    
    /**
      * Get the length of the cell list.
      *
      * @return The number of cells in the cell list.
      *
      * #### Notes
      * This is a read-only property.
      *
      * #### Complexity
      * Constant.
      *
      * #### Iterator Validity
      * No changes.
      */
    @JSName("length")
    def length_MCellList: Double = js.native
    
    @JSName("type")
    var type_CellList: List = js.native
  }
}
