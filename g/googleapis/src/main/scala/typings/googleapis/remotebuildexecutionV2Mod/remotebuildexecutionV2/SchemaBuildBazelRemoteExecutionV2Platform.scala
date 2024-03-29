package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2Platform extends StObject {
  
  /**
    * The properties that make up this platform. In order to ensure that equivalent `Platform`s always hash to the same value, the properties MUST be lexicographically sorted by name, and then by value. Sorting of strings is done by code point, equivalently, by the UTF-8 bytes.
    */
  var properties: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2PlatformProperty]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2Platform {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2Platform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Platform]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2Platform](x: Self) {
    
    inline def setProperties(value: js.Array[SchemaBuildBazelRemoteExecutionV2PlatformProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SchemaBuildBazelRemoteExecutionV2PlatformProperty*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
