package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for the `WatchVariable()` method.
  */
@js.native
trait SchemaWatchVariableRequest extends js.Object {
  
  /**
    * If specified, checks the current timestamp of the variable and if the
    * current timestamp is newer than `newerThan` timestamp, the method returns
    * immediately.  If not specified or the variable has an older timestamp,
    * the watcher waits for a the value to change before returning.
    */
  var newerThan: js.UndefOr[String] = js.native
}
object SchemaWatchVariableRequest {
  
  @scala.inline
  def apply(): SchemaWatchVariableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchVariableRequest]
  }
  
  @scala.inline
  implicit class SchemaWatchVariableRequestOps[Self <: SchemaWatchVariableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewerThan(value: String): Self = this.set("newerThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewerThan: Self = this.set("newerThan", js.undefined)
  }
}
