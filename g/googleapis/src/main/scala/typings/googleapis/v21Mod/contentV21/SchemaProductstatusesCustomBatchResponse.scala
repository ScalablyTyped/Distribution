package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProductstatusesCustomBatchResponse extends StObject {
  
  /**
    * The result of the execution of the batch requests.
    */
  var entries: js.UndefOr[js.Array[SchemaProductstatusesCustomBatchResponseEntry]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productstatusesCustomBatchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaProductstatusesCustomBatchResponse {
  
  @scala.inline
  def apply(): SchemaProductstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductstatusesCustomBatchResponse]
  }
  
  @scala.inline
  implicit class SchemaProductstatusesCustomBatchResponseMutableBuilder[Self <: SchemaProductstatusesCustomBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaProductstatusesCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaProductstatusesCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
