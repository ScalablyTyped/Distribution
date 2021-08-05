package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for using BigQuery as the destination of resource usage export.
  */
trait SchemaBigQueryDestination extends StObject {
  
  /**
    * The ID of a BigQuery Dataset.
    */
  var datasetId: js.UndefOr[String] = js.undefined
}
object SchemaBigQueryDestination {
  
  inline def apply(): SchemaBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryDestination]
  }
  
  extension [Self <: SchemaBigQueryDestination](x: Self) {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
  }
}
