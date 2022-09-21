package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputConfig extends StObject {
  
  /** Destination on BigQuery. The output table stores the fields in asset Protobuf as columns in BigQuery. */
  var bigqueryDestination: js.UndefOr[BigQueryDestination] = js.undefined
  
  /** Destination on Cloud Storage. */
  var gcsDestination: js.UndefOr[GcsDestination] = js.undefined
}
object OutputConfig {
  
  inline def apply(): OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputConfig]
  }
  
  extension [Self <: OutputConfig](x: Self) {
    
    inline def setBigqueryDestination(value: BigQueryDestination): Self = StObject.set(x, "bigqueryDestination", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDestinationUndefined: Self = StObject.set(x, "bigqueryDestination", js.undefined)
    
    inline def setGcsDestination(value: GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    inline def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
