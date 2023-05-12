package typings.jupyterYdoc.libApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SharedCell {
  
  /**
    * Cell data
    */
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterYdoc.anon.PartialIRawCellcelltypest
    - typings.jupyterYdoc.anon.PartialICodeCellcelltypes
    - typings.jupyterYdoc.anon.PartialIMarkdownCellcellt
    - typings.jupyterYdoc.anon.PartialIBaseCellcelltypes
  */
  trait Cell extends StObject
  object Cell {
    
    inline def PartialIBaseCellcelltypes(): typings.jupyterYdoc.anon.PartialIBaseCellcelltypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jupyterYdoc.anon.PartialIBaseCellcelltypes]
    }
    
    inline def PartialICodeCellcelltypes(): typings.jupyterYdoc.anon.PartialICodeCellcelltypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jupyterYdoc.anon.PartialICodeCellcelltypes]
    }
    
    inline def PartialIMarkdownCellcellt(): typings.jupyterYdoc.anon.PartialIMarkdownCellcellt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jupyterYdoc.anon.PartialIMarkdownCellcellt]
    }
    
    inline def PartialIRawCellcelltypest(): typings.jupyterYdoc.anon.PartialIRawCellcelltypest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jupyterYdoc.anon.PartialIRawCellcelltypest]
    }
  }
  
  /**
    * Shared cell constructor options.
    */
  trait IOptions extends StObject {
    
    /**
      * Optional notebook to which this cell belongs.
      *
      * If not provided the cell will be standalone.
      */
    var notebook: js.UndefOr[ISharedNotebook] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setNotebook(value: ISharedNotebook): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
      
      inline def setNotebookUndefined: Self = StObject.set(x, "notebook", js.undefined)
    }
  }
}
