package typings.jupyterYdoc.libApiMod

import typings.jupyterYdoc.anon.Delete
import typings.jupyterYdoc.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookChange
  extends StObject
     with DocumentChange {
  
  /**
    * Cell changes
    */
  var cellsChange: js.UndefOr[Delta[js.Array[ISharedCell]]] = js.undefined
  
  /**
    * Notebook metadata changes
    */
  var metadataChange: js.UndefOr[MapChanges] = js.undefined
  
  /**
    * nbformat version change
    */
  var nbformatChanged: js.UndefOr[Key] = js.undefined
}
object NotebookChange {
  
  inline def apply(): NotebookChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookChange] (val x: Self) extends AnyVal {
    
    inline def setCellsChange(value: Delta[js.Array[ISharedCell]]): Self = StObject.set(x, "cellsChange", value.asInstanceOf[js.Any])
    
    inline def setCellsChangeUndefined: Self = StObject.set(x, "cellsChange", js.undefined)
    
    inline def setCellsChangeVarargs(value: Delete[js.Array[ISharedCell]]*): Self = StObject.set(x, "cellsChange", js.Array(value*))
    
    inline def setMetadataChange(value: MapChanges): Self = StObject.set(x, "metadataChange", value.asInstanceOf[js.Any])
    
    inline def setMetadataChangeUndefined: Self = StObject.set(x, "metadataChange", js.undefined)
    
    inline def setNbformatChanged(value: Key): Self = StObject.set(x, "nbformatChanged", value.asInstanceOf[js.Any])
    
    inline def setNbformatChangedUndefined: Self = StObject.set(x, "nbformatChanged", js.undefined)
  }
}
