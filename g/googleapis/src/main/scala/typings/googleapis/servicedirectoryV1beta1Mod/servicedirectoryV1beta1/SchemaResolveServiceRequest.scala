package typings.googleapis.servicedirectoryV1beta1Mod.servicedirectoryV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResolveServiceRequest extends StObject {
  
  /**
    * Optional. The filter applied to the endpoints of the resolved service. General `filter` string syntax: ` ()` * `` can be `name`, `address`, `port`, or `metadata.` for map field * `` can be `<`, `\>`, `<=`, `\>=`, `!=`, `=`, `:`. Of which `:` means `HAS`, and is roughly the same as `=` * `` must be the same data type as field * `` can be `AND`, `OR`, `NOT` Examples of valid filters: * `metadata.owner` returns endpoints that have a annotation with the key `owner`, this is the same as `metadata:owner` * `metadata.protocol=gRPC` returns endpoints that have key/value `protocol=gRPC` * `address=192.108.1.105` returns endpoints that have this address * `port\>8080` returns endpoints that have port number larger than 8080 * `name\>projects/my-project/locations/us-east1/namespaces/my-namespace/services/my-service/endpoints/endpoint-c` returns endpoints that have name that is alphabetically later than the string, so "endpoint-e" is returned but "endpoint-a" is not * `name=projects/my-project/locations/us-central1/namespaces/my-namespace/services/my-service/endpoints/ep-1` returns the endpoint that has an endpoint_id equal to `ep-1` * `metadata.owner!=sd AND metadata.foo=bar` returns endpoints that have `owner` in annotation key but value is not `sd` AND have key/value `foo=bar` * `doesnotexist.foo=bar` returns an empty list. Note that endpoint doesn't have a field called "doesnotexist". Since the filter does not match any endpoint, it returns no results For more information about filtering, see [API Filtering](https://aip.dev/160).
    */
  var endpointFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The maximum number of endpoints to return. Defaults to 25. Maximum is 100. If a value less than one is specified, the Default is used. If a value greater than the Maximum is specified, the Maximum is used.
    */
  var maxEndpoints: js.UndefOr[Double | Null] = js.undefined
}
object SchemaResolveServiceRequest {
  
  inline def apply(): SchemaResolveServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResolveServiceRequest]
  }
  
  extension [Self <: SchemaResolveServiceRequest](x: Self) {
    
    inline def setEndpointFilter(value: String): Self = StObject.set(x, "endpointFilter", value.asInstanceOf[js.Any])
    
    inline def setEndpointFilterNull: Self = StObject.set(x, "endpointFilter", null)
    
    inline def setEndpointFilterUndefined: Self = StObject.set(x, "endpointFilter", js.undefined)
    
    inline def setMaxEndpoints(value: Double): Self = StObject.set(x, "maxEndpoints", value.asInstanceOf[js.Any])
    
    inline def setMaxEndpointsNull: Self = StObject.set(x, "maxEndpoints", null)
    
    inline def setMaxEndpointsUndefined: Self = StObject.set(x, "maxEndpoints", js.undefined)
  }
}
