package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBlobsGettree
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The hash. In the case of SHA-256, it will always be a lowercase hex
    * string exactly 64 characters long.
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * The instance of the execution system to operate against. A server may
    * support multiple instances of the execution system (with their own
    * workers, storage, caches, etc.). The server MAY require use of this field
    * to select between them in an implementation-defined fashion, otherwise it
    * can be omitted.
    */
  var instanceName: js.UndefOr[String] = js.undefined
  
  /**
    * A maximum page size to request. If present, the server will request no
    * more than this many items. Regardless of whether a page size is
    * specified, the server may place its own limit on the number of items to
    * be returned and require the client to retrieve more items using a
    * subsequent request.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, which must be a value received in a previous
    * GetTreeResponse. If present, the server will use it to return the
    * following page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the blob, in bytes.
    */
  var sizeBytes: js.UndefOr[String] = js.undefined
}
object ParamsResourceBlobsGettree {
  
  inline def apply(): ParamsResourceBlobsGettree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlobsGettree]
  }
  
  extension [Self <: ParamsResourceBlobsGettree](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
