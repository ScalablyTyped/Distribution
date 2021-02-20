package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowsRequestedEventUIParam extends StObject {
  
  /**
    * Gets the next chunk index.
    */
  var chunkIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets the chunk size.
    */
  var chunkSize: js.UndefOr[Double] = js.native
  
  /**
    * Gets a reference to igGridAppendRowsOnDemand.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the requested rows.
    */
  var rows: js.UndefOr[js.Array[_]] = js.native
}
object RowsRequestedEventUIParam {
  
  @scala.inline
  def apply(): RowsRequestedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowsRequestedEventUIParam]
  }
  
  @scala.inline
  implicit class RowsRequestedEventUIParamMutableBuilder[Self <: RowsRequestedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkIndex(value: Double): Self = StObject.set(x, "chunkIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkIndexUndefined: Self = StObject.set(x, "chunkIndex", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[_]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Any*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
