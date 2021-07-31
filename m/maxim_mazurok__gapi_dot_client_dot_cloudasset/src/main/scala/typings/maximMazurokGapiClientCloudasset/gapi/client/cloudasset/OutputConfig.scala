package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputConfig extends StObject {
  
  /** Destination on BigQuery. The output table stores the fields in asset proto as columns in BigQuery. */
  var bigqueryDestination: js.UndefOr[BigQueryDestination] = js.undefined
  
  /** Destination on Cloud Storage. */
  var gcsDestination: js.UndefOr[GcsDestination] = js.undefined
}
object OutputConfig {
  
  @scala.inline
  def apply(): OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputConfig]
  }
  
  @scala.inline
  implicit class OutputConfigMutableBuilder[Self <: OutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigqueryDestination(value: BigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    @scala.inline
    def setGcsDestination(value: GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
