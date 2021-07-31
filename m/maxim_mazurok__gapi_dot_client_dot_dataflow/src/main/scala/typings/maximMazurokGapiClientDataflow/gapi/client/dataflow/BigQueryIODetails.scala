package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQueryIODetails extends StObject {
  
  /** Dataset accessed in the connection. */
  var dataset: js.UndefOr[String] = js.undefined
  
  /** Project accessed in the connection. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Query used to access data in the connection. */
  var query: js.UndefOr[String] = js.undefined
  
  /** Table accessed in the connection. */
  var table: js.UndefOr[String] = js.undefined
}
object BigQueryIODetails {
  
  @scala.inline
  def apply(): BigQueryIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryIODetails]
  }
  
  @scala.inline
  implicit class BigQueryIODetailsMutableBuilder[Self <: BigQueryIODetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
