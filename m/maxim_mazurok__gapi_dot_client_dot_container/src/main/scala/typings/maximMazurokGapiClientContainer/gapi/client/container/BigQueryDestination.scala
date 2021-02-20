package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigQueryDestination extends StObject {
  
  /** The ID of a BigQuery Dataset. */
  var datasetId: js.UndefOr[String] = js.native
}
object BigQueryDestination {
  
  @scala.inline
  def apply(): BigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryDestination]
  }
  
  @scala.inline
  implicit class BigQueryDestinationMutableBuilder[Self <: BigQueryDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
  }
}
