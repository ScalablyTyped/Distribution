package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the `WatchVariable()` method.
  */
trait SchemaWatchVariableRequest extends StObject {
  
  /**
    * If specified, checks the current timestamp of the variable and if the
    * current timestamp is newer than `newerThan` timestamp, the method returns
    * immediately.  If not specified or the variable has an older timestamp,
    * the watcher waits for a the value to change before returning.
    */
  var newerThan: js.UndefOr[String] = js.undefined
}
object SchemaWatchVariableRequest {
  
  @scala.inline
  def apply(): SchemaWatchVariableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchVariableRequest]
  }
  
  @scala.inline
  implicit class SchemaWatchVariableRequestMutableBuilder[Self <: SchemaWatchVariableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewerThan(value: String): Self = StObject.set(x, "newerThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewerThanUndefined: Self = StObject.set(x, "newerThan", js.undefined)
  }
}
