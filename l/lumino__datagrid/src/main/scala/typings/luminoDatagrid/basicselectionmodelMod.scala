package typings.luminoDatagrid

import typings.luminoDatagrid.selectionmodelMod.SelectionModel
import typings.luminoDatagrid.selectionmodelMod.SelectionModel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicselectionmodelMod {
  
  @JSImport("@lumino/datagrid/lib/basicselectionmodel", "BasicSelectionModel")
  @js.native
  class BasicSelectionModel protected () extends SelectionModel {
    /**
      * Construct a new selection model.
      *
      * @param options - The options for initializing the model.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _cursorColumn: js.Any = js.native
    
    /* private */ var _cursorRectIndex: js.Any = js.native
    
    /* private */ var _cursorRow: js.Any = js.native
    
    /* private */ var _selections: js.Any = js.native
  }
}
