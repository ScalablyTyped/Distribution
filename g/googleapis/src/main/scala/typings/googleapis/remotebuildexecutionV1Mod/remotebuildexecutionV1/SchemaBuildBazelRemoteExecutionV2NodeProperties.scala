package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2NodeProperties extends StObject {
  
  /**
    * The file's last modification timestamp.
    */
  var mtime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of string-based NodeProperties.
    */
  var properties: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2NodeProperty]] = js.undefined
  
  /**
    * The UNIX file mode, e.g., 0755.
    */
  var unixMode: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2NodeProperties {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2NodeProperties]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2NodeProperties](x: Self) {
    
    inline def setMtime(value: String): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeNull: Self = StObject.set(x, "mtime", null)
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    inline def setProperties(value: js.Array[SchemaBuildBazelRemoteExecutionV2NodeProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: SchemaBuildBazelRemoteExecutionV2NodeProperty*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setUnixMode(value: Double): Self = StObject.set(x, "unixMode", value.asInstanceOf[js.Any])
    
    inline def setUnixModeNull: Self = StObject.set(x, "unixMode", null)
    
    inline def setUnixModeUndefined: Self = StObject.set(x, "unixMode", js.undefined)
  }
}
