package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to batch delete of one or more Photos.
  */
trait SchemaBatchDeletePhotosResponse extends StObject {
  
  /**
    * The status for the operation to delete a single Photo in the batch
    * request.
    */
  var status: js.UndefOr[js.Array[SchemaStatus]] = js.undefined
}
object SchemaBatchDeletePhotosResponse {
  
  @scala.inline
  def apply(): SchemaBatchDeletePhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeletePhotosResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchDeletePhotosResponseMutableBuilder[Self <: SchemaBatchDeletePhotosResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: js.Array[SchemaStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: SchemaStatus*): Self = StObject.set(x, "status", js.Array(value :_*))
  }
}
