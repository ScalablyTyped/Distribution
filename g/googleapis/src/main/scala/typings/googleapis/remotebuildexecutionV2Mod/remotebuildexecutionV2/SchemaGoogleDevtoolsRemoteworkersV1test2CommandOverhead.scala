package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead extends StObject {
  
  /**
    * The elapsed time between calling Accept and Complete. The server will also have its own idea of what this should be, but this excludes the overhead of the RPCs and the bot response time.
    */
  var duration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount of time *not* spent executing the command (ie uploading/downloading files).
    */
  var overhead: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteworkersV1test2CommandOverhead](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOverhead(value: String): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
    
    inline def setOverheadNull: Self = StObject.set(x, "overhead", null)
    
    inline def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
  }
}
