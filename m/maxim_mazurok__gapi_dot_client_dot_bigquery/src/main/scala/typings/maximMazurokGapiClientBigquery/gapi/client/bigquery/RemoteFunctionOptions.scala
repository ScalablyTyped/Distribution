package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteFunctionOptions extends StObject {
  
  /**
    * Fully qualified name of the user-provided connection object which holds the authentication information to send requests to the remote service. Format:
    * ```"projects/{projectId}/locations/{locationId}/connections/{connectionId}"```
    */
  var connection: js.UndefOr[String] = js.undefined
  
  /** Endpoint of the user-provided remote service, e.g. ```https://us-east1-my_gcf_project.cloudfunctions.net/remote_add``` */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /** Max number of rows in each batch sent to the remote service. If absent or if 0, BigQuery dynamically decides the number of rows in a batch. */
  var maxBatchingRows: js.UndefOr[String] = js.undefined
  
  /**
    * User-defined context as a set of key/value pairs, which will be sent as function invocation context together with batched arguments in the requests to the remote service. The total
    * number of bytes of keys and values must be less than 8KB.
    */
  var userDefinedContext: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object RemoteFunctionOptions {
  
  inline def apply(): RemoteFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteFunctionOptions]
  }
  
  extension [Self <: RemoteFunctionOptions](x: Self) {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setMaxBatchingRows(value: String): Self = StObject.set(x, "maxBatchingRows", value.asInstanceOf[js.Any])
    
    inline def setMaxBatchingRowsUndefined: Self = StObject.set(x, "maxBatchingRows", js.undefined)
    
    inline def setUserDefinedContext(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "userDefinedContext", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedContextUndefined: Self = StObject.set(x, "userDefinedContext", js.undefined)
  }
}
