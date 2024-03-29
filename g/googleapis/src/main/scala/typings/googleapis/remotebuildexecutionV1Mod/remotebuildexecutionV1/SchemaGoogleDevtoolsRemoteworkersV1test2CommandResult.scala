package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult extends StObject {
  
  /**
    * The elapsed time between calling Accept and Complete. The server will also have its own idea of what this should be, but this excludes the overhead of the RPCs and the bot response time.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The exit code of the process. An exit code of "0" should only be trusted if `status` has a code of OK (otherwise it may simply be unset).
    */
  var exitCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Implementation-dependent metadata about the task. Both servers and bots may define messages which can be encoded here; bots are free to provide metadata in multiple formats, and servers are free to choose one or more of the values to process and ignore others. In particular, it is *not* considered an error for the bot to provide the server with a field that it doesn't know about.
    */
  var metadata: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
  
  /**
    * The output files. The blob referenced by the digest should contain one of the following (implementation-dependent): * A marshalled DirectoryMetadata of the returned filesystem * A LUCI-style .isolated file
    */
  var outputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.undefined
  
  /**
    * The amount of time *not* spent executing the command (ie uploading/downloading files).
    */
  var overhead: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An overall status for the command. For example, if the command timed out, this might have a code of DEADLINE_EXCEEDED; if it was killed by the OS for memory exhaustion, it might have a code of RESOURCE_EXHAUSTED.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandResult](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeNull: Self = StObject.set(x, "exitCode", null)
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setMetadata(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetadataVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "metadata", js.Array(value*))
    
    inline def setOutputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOverhead(value: String): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
    
    inline def setOverheadNull: Self = StObject.set(x, "overhead", null)
    
    inline def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
