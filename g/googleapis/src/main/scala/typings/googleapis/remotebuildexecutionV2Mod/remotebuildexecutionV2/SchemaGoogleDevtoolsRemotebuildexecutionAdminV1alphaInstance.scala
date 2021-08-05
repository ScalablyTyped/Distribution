package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instance conceptually encapsulates all Remote Build Execution resources for
  * remote builds. An instance consists of storage and compute resources (for
  * example, `ContentAddressableStorage`, `ActionCache`, `WorkerPools`) used
  * for running remote builds. All Remote Build Execution API calls are scoped
  * to an instance.
  */
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance extends StObject {
  
  /**
    * The location is a GCP region. Currently only `us-central1` is supported.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Whether stack driver logging is enabled for the instance.
    */
  var loggingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. Instance resource name formatted as:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be
    * populated when creating an instance since it is provided in the
    * `instance_id` field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. State of the instance.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "loggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoggingEnabledUndefined: Self = StObject.set(x, "loggingEnabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
