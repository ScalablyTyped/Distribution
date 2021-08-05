package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowsRequestingEventUIParam extends StObject {
  
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
}
object RowsRequestingEventUIParam {
  
  inline def apply(): RowsRequestingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRequestingEventUIParam]
  }
  
  extension [Self <: RowsRequestingEventUIParam](x: Self) {
    
    inline def setChunkIndex(value: Double): Self = StObject.set(x, "chunkIndex", value.asInstanceOf[js.Any])
    
    inline def setChunkIndexUndefined: Self = StObject.set(x, "chunkIndex", js.undefined)
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
