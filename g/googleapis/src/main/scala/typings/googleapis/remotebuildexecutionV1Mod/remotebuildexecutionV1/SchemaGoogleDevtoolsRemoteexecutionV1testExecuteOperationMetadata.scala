package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata about an ongoing execution, which will be contained in the
  * metadata field of the Operation.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata extends StObject {
  
  /**
    * The digest of the Action being executed.
    */
  var actionDigest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.undefined
  
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
object SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadataMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testExecuteOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = StObject.set(x, "actionDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionDigestUndefined: Self = StObject.set(x, "actionDigest", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    @scala.inline
    def setStderrStreamName(value: String): Self = StObject.set(x, "stderrStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderrStreamNameUndefined: Self = StObject.set(x, "stderrStreamName", js.undefined)
    
    @scala.inline
    def setStdoutStreamName(value: String): Self = StObject.set(x, "stdoutStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdoutStreamNameUndefined: Self = StObject.set(x, "stdoutStreamName", js.undefined)
  }
}
