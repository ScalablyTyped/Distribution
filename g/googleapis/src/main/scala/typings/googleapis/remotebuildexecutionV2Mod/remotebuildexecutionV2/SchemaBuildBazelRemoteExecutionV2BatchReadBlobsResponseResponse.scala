package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response corresponding to a single blob that the client tried to upload.
  */
trait SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse extends StObject {
  
  /**
    * The raw binary data.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * The digest to which this response corresponds.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /**
    * The result of attempting to download that blob.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
