package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProgress extends StObject {
  
  /** Estimate of the number of bytes copied so far for this table. This will eventually reach 'estimated_size_bytes' unless the table copy is CANCELLED. */
  var estimatedCopiedBytes: js.UndefOr[String] = js.native
  
  /** Estimate of the size of the table to be copied. */
  var estimatedSizeBytes: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object TableProgress {
  
  @scala.inline
  def apply(): TableProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProgress]
  }
  
  @scala.inline
  implicit class TableProgressMutableBuilder[Self <: TableProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedCopiedBytes(value: String): Self = StObject.set(x, "estimatedCopiedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedCopiedBytesUndefined: Self = StObject.set(x, "estimatedCopiedBytes", js.undefined)
    
    @scala.inline
    def setEstimatedSizeBytes(value: String): Self = StObject.set(x, "estimatedSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedSizeBytesUndefined: Self = StObject.set(x, "estimatedSizeBytes", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
