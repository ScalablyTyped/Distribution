package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The template used for creating replicas in the pool.
  */
trait SchemaTemplate extends StObject {
  
  /**
    * An action to run during initialization of your replicas. An action is run
    * as shell commands which are executed one after the other in the same bash
    * shell, so any state established by one command is inherited by later
    * commands.
    */
  var action: js.UndefOr[SchemaAction] = js.undefined
  
  /**
    * A list of HTTP Health Checks to configure for this replica pool and all
    * virtual machines in this replica pool.
    */
  var healthChecks: js.UndefOr[js.Array[SchemaHealthCheck]] = js.undefined
  
  /**
    * A free-form string describing the version of this template. You can
    * provide any versioning string you would like. For example, version1 or
    * template-v1.
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * The virtual machine parameters to use for creating replicas. You can
    * define settings such as the machine type and the image of replicas in
    * this pool. This is required if replica type is SMART_VM.
    */
  var vmParams: js.UndefOr[SchemaVmParams] = js.undefined
}
object SchemaTemplate {
  
  inline def apply(): SchemaTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplate]
  }
  
  extension [Self <: SchemaTemplate](x: Self) {
    
    inline def setAction(value: SchemaAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setHealthChecks(value: js.Array[SchemaHealthCheck]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    inline def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    inline def setHealthChecksVarargs(value: SchemaHealthCheck*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVmParams(value: SchemaVmParams): Self = StObject.set(x, "vmParams", value.asInstanceOf[js.Any])
    
    inline def setVmParamsUndefined: Self = StObject.set(x, "vmParams", js.undefined)
  }
}
