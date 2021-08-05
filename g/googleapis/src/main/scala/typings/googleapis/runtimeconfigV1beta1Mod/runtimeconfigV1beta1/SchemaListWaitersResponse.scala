package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListWaiters()` method. Order of returned waiter objects
  * is arbitrary.
  */
trait SchemaListWaitersResponse extends StObject {
  
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Found waiters in the project.
    */
  var waiters: js.UndefOr[js.Array[SchemaWaiter]] = js.undefined
}
object SchemaListWaitersResponse {
  
  inline def apply(): SchemaListWaitersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWaitersResponse]
  }
  
  extension [Self <: SchemaListWaitersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setWaiters(value: js.Array[SchemaWaiter]): Self = StObject.set(x, "waiters", value.asInstanceOf[js.Any])
    
    inline def setWaitersUndefined: Self = StObject.set(x, "waiters", js.undefined)
    
    inline def setWaitersVarargs(value: SchemaWaiter*): Self = StObject.set(x, "waiters", js.Array(value :_*))
  }
}
