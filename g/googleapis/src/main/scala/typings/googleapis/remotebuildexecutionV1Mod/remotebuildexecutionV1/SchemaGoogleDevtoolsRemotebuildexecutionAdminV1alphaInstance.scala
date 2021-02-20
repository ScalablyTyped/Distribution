package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
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
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance extends StObject {
  
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
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstanceMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "loggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingEnabledUndefined: Self = StObject.set(x, "loggingEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
