package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `EnvironmentVariable` is one variable to set in the running
  * program&#39;s environment.
  */
trait SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable extends StObject {
  
  /**
    * The variable name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The variable value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2CommandEnvironmentVariable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
