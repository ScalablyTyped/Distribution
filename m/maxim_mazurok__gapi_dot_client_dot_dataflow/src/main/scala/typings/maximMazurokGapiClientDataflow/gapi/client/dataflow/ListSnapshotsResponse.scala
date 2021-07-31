package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSnapshotsResponse extends StObject {
  
  /** Returned snapshots. */
  var snapshots: js.UndefOr[js.Array[Snapshot]] = js.undefined
}
object ListSnapshotsResponse {
  
  @scala.inline
  def apply(): ListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotsResponse]
  }
  
  @scala.inline
  implicit class ListSnapshotsResponseMutableBuilder[Self <: ListSnapshotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshots(value: js.Array[Snapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
  }
}
