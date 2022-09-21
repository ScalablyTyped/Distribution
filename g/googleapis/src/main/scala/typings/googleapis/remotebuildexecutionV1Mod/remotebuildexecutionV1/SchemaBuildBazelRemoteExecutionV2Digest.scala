package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2Digest extends StObject {
  
  /**
    * The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long.
    */
  var hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the blob, in bytes.
    */
  var sizeBytes: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2Digest {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Digest]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2Digest](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashNull: Self = StObject.set(x, "hash", null)
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesNull: Self = StObject.set(x, "sizeBytes", null)
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
