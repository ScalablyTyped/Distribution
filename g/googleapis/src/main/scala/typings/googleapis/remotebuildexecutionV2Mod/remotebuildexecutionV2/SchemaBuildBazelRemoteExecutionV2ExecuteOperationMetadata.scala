package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata about an ongoing execution, which will be contained in the
  * metadata field of the Operation.
  */
trait SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata extends StObject {
  
  /**
    * The digest of the Action being executed.
    */
  var actionDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
  
  var stage: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the client can use this name with ByteStream.Read to stream the
    * standard error.
    */
  var stderrStreamName: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the client can use this name with ByteStream.Read to stream the
    * standard output.
    */
  var stdoutStreamName: js.UndefOr[String] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2ExecuteOperationMetadata](x: Self) {
    
    inline def setActionDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "actionDigest", value.asInstanceOf[js.Any])
    
    inline def setActionDigestUndefined: Self = StObject.set(x, "actionDigest", js.undefined)
    
    inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setStderrStreamName(value: String): Self = StObject.set(x, "stderrStreamName", value.asInstanceOf[js.Any])
    
    inline def setStderrStreamNameUndefined: Self = StObject.set(x, "stderrStreamName", js.undefined)
    
    inline def setStdoutStreamName(value: String): Self = StObject.set(x, "stdoutStreamName", value.asInstanceOf[js.Any])
    
    inline def setStdoutStreamNameUndefined: Self = StObject.set(x, "stdoutStreamName", js.undefined)
  }
}
