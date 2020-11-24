package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instance conceptually encapsulates all Remote Build Execution resources for
  * remote builds. An instance consists of storage and compute resources (for
  * example, `ContentAddressableStorage`, `ActionCache`, `WorkerPools`) used
  * for running remote builds. All Remote Build Execution API calls are scoped
  * to an instance.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance extends js.Object {
  
  /**
    * The location is a GCP region. Currently only `us-central1` is supported.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Output only. Whether stack driver logging is enabled for the instance.
    */
  var loggingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. Instance resource name formatted as:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be
    * populated when creating an instance since it is provided in the
    * `instance_id` field.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. State of the instance.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstanceOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLoggingEnabled(value: Boolean): Self = this.set("loggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingEnabled: Self = this.set("loggingEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
