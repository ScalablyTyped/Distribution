package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single property for the environment. The server is responsible for
  * specifying the property `name`s that it accepts. If an unknown `name` is
  * provided in the requirements for an Action, the server SHOULD reject the
  * execution request. If permitted by the server, the same `name` may occur
  * multiple times.  The server is also responsible for specifying the
  * interpretation of property `value`s. For instance, a property describing
  * how much RAM must be available may be interpreted as allowing a worker with
  * 16GB to fulfill a request for 8GB, while a property describing the OS
  * environment on which the action must be performed may require an exact
  * match with the worker&#39;s OS.  The server MAY use the `value` of one or
  * more properties to determine how it sets up the execution environment, such
  * as by making specific system files available to the worker.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2PlatformProperty extends js.Object {
  
  /**
    * The property name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The property value.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaBuildBazelRemoteExecutionV2PlatformProperty {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2PlatformProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PlatformProperty]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2PlatformPropertyOps[Self <: SchemaBuildBazelRemoteExecutionV2PlatformProperty] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
