package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQueryDestination extends StObject {
  
  /** The ID of a BigQuery Dataset. */
  var datasetId: js.UndefOr[String] = js.undefined
}
object BigQueryDestination {
  
  inline def apply(): BigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigQueryDestination] (val x: Self) extends AnyVal {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
  }
}
