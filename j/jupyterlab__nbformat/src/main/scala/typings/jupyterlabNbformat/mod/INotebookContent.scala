package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INotebookContent
  extends StObject
     with PartialJSONObject {
  
  var cells: js.Array[ICell]
  
  var metadata: INotebookMetadata
  
  var nbformat: Double
  
  var nbformat_minor: Double
}
object INotebookContent {
  
  inline def apply(cells: js.Array[ICell], metadata: INotebookMetadata, nbformat: Double, nbformat_minor: Double): INotebookContent = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookContent]
  }
  
  extension [Self <: INotebookContent](x: Self) {
    
    inline def setCells(value: js.Array[ICell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: ICell*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    inline def setMetadata(value: INotebookMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setNbformat(value: Double): Self = StObject.set(x, "nbformat", value.asInstanceOf[js.Any])
    
    inline def setNbformat_minor(value: Double): Self = StObject.set(x, "nbformat_minor", value.asInstanceOf[js.Any])
  }
}
