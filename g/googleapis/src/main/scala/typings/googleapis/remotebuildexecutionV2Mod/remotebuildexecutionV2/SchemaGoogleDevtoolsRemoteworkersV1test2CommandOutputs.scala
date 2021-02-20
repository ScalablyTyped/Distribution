package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED - use CommandResult instead. Describes the actual outputs from
  * the task.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs extends StObject {
  
  /**
    * exit_code is only fully reliable if the status&#39; code is OK. If the
    * task exceeded its deadline or was cancelled, the process may still
    * produce an exit code as it is cancelled, and this will be populated, but
    * a successful (zero) is unlikely to be correct unless the status code is
    * OK.
    */
  var exitCode: js.UndefOr[Double] = js.native
  
  /**
    * The output files. The blob referenced by the digest should contain one of
    * the following (implementation-dependent):    * A marshalled
    * DirectoryMetadata of the returned filesystem    * A LUCI-style .isolated
    * file
    */
  var outputs: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
}
object SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputsMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandOutputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    @scala.inline
    def setOutputs(value: SchemaGoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
  }
}
