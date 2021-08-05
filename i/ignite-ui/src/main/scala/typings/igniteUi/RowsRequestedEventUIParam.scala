package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowsRequestedEventUIParam extends StObject {
  
  /**
    * Gets the next chunk index.
    */
  var chunkIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the chunk size.
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets a reference to igGridAppendRowsOnDemand.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the requested rows.
    */
  var rows: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object RowsRequestedEventUIParam {
  
  inline def apply(): RowsRequestedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRequestedEventUIParam]
  }
  
  extension [Self <: RowsRequestedEventUIParam](x: Self) {
    
    inline def setChunkIndex(value: Double): Self = StObject.set(x, "chunkIndex", value.asInstanceOf[js.Any])
    
    inline def setChunkIndexUndefined: Self = StObject.set(x, "chunkIndex", js.undefined)
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRows(value: js.Array[js.Any]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: js.Any*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
