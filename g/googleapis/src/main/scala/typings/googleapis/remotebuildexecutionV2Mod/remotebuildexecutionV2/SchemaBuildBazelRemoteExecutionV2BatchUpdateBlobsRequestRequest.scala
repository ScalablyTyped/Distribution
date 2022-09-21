package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest extends StObject {
  
  /**
    * The raw binary data.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The digest of the blob. This MUST be the digest of `data`.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2BatchUpdateBlobsRequestRequest](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}
