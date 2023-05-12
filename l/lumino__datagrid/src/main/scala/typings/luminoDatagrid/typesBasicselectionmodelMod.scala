package typings.luminoDatagrid

import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel
import typings.luminoDatagrid.typesSelectionmodelMod.SelectionModel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBasicselectionmodelMod {
  
  @JSImport("@lumino/datagrid/types/basicselectionmodel", "BasicSelectionModel")
  @js.native
  open class BasicSelectionModel protected () extends SelectionModel {
    /**
      * Construct a new selection model.
      *
      * @param options - The options for initializing the model.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _cursorColumn: Any = js.native
    
    /* private */ var _cursorRectIndex: Any = js.native
    
    /* private */ var _cursorRow: Any = js.native
    
    /* private */ var _selections: Any = js.native
    
    /**
      * The column index of the cursor.
      */
    @JSName("cursorColumn")
    def cursorColumn_MBasicSelectionModel: Double = js.native
    
    /**
      * The row index of the cursor.
      */
    @JSName("cursorRow")
    def cursorRow_MBasicSelectionModel: Double = js.native
    
    /**
      * Whether the selection model is empty.
      */
    @JSName("isEmpty")
    def isEmpty_MBasicSelectionModel: Boolean = js.native
  }
}
