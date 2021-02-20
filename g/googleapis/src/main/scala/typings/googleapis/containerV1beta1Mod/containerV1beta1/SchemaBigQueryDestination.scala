package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for using BigQuery as the destination of resource usage export.
  */
@js.native
trait SchemaBigQueryDestination extends StObject {
  
  /**
    * The ID of a BigQuery Dataset.
    */
  var datasetId: js.UndefOr[String] = js.native
}
object SchemaBigQueryDestination {
  
  @scala.inline
  def apply(): SchemaBigQueryDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryDestination]
  }
  
  @scala.inline
  implicit class SchemaBigQueryDestinationMutableBuilder[Self <: SchemaBigQueryDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
  }
}
