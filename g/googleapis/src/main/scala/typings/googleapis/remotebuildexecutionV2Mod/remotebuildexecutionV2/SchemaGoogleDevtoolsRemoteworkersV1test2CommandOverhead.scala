package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED - use CommandResult instead. Can be used as part of
  * CompleteRequest.metadata, or are part of a more sophisticated message.
  */
trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead extends StObject {
  
  /**
    * The elapsed time between calling Accept and Complete. The server will
    * also have its own idea of what this should be, but this excludes the
    * overhead of the RPCs and the bot response time.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of time *not* spent executing the command (ie
    * uploading/downloading files).
    */
  var overhead: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverheadMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setOverhead(value: String): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
  }
}
