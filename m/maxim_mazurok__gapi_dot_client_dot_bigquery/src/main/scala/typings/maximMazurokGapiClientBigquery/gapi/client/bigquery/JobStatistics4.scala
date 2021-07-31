package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatistics4 extends StObject {
  
  /**
    * [Output-only] Number of files per destination URI or URI pattern specified in the extract configuration. These values will be in the same order as the URIs specified in the
    * 'destinationUris' field.
    */
  var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /** [Output-only] Number of user bytes extracted into the result. This is the byte count as computed by BigQuery for billing purposes. */
  var inputBytes: js.UndefOr[String] = js.undefined
}
object JobStatistics4 {
  
  @scala.inline
  def apply(): JobStatistics4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics4]
  }
  
  @scala.inline
  implicit class JobStatistics4MutableBuilder[Self <: JobStatistics4] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationUriFileCounts(value: js.Array[String]): Self = StObject.set(x, "destinationUriFileCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUriFileCountsUndefined: Self = StObject.set(x, "destinationUriFileCounts", js.undefined)
    
    @scala.inline
    def setDestinationUriFileCountsVarargs(value: String*): Self = StObject.set(x, "destinationUriFileCounts", js.Array(value :_*))
    
    @scala.inline
    def setInputBytes(value: String): Self = StObject.set(x, "inputBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBytesUndefined: Self = StObject.set(x, "inputBytes", js.undefined)
  }
}
