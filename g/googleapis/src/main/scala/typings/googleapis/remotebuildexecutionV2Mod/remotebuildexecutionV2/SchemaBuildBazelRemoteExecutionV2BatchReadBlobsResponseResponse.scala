package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response corresponding to a single blob that the client tried to upload.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse extends StObject {
  
  /**
    * The raw binary data.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * The digest to which this response corresponds.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  
  /**
    * The result of attempting to download that blob.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.native
}
object SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponseMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2BatchReadBlobsResponseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
