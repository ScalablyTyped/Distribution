package typings.jupyterYdoc.anon

import typings.jupyterlabNbformat.mod.ICell
import typings.jupyterlabNbformat.mod.INotebookMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.INotebookContent> */
trait PartialINotebookContent extends StObject {
  
  var cells: js.UndefOr[js.Array[ICell]] = js.undefined
  
  var metadata: js.UndefOr[INotebookMetadata] = js.undefined
  
  var nbformat: js.UndefOr[Double] = js.undefined
  
  var nbformat_minor: js.UndefOr[Double] = js.undefined
}
object PartialINotebookContent {
  
  inline def apply(): PartialINotebookContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialINotebookContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialINotebookContent] (val x: Self) extends AnyVal {
    
    inline def setCells(value: js.Array[ICell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: ICell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setMetadata(value: INotebookMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNbformat(value: Double): Self = StObject.set(x, "nbformat", value.asInstanceOf[js.Any])
    
    inline def setNbformatUndefined: Self = StObject.set(x, "nbformat", js.undefined)
    
    inline def setNbformat_minor(value: Double): Self = StObject.set(x, "nbformat_minor", value.asInstanceOf[js.Any])
    
    inline def setNbformat_minorUndefined: Self = StObject.set(x, "nbformat_minor", js.undefined)
  }
}
