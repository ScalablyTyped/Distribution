package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait SchemaBuildBazelRemoteExecutionV2PlatformProperty extends StObject {
  
  /**
    * The property name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The property value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2PlatformProperty {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2PlatformProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2PlatformProperty]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2PlatformProperty](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
