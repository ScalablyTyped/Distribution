package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeConfig extends StObject {
  
  /**
    * Required. Number of cpus per Memcached node.
    */
  var cpuCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Memory size in MiB for each Memcached node.
    */
  var memorySizeMb: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNodeConfig {
  
  inline def apply(): SchemaNodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeConfig]
  }
  
  extension [Self <: SchemaNodeConfig](x: Self) {
    
    inline def setCpuCount(value: Double): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    inline def setCpuCountNull: Self = StObject.set(x, "cpuCount", null)
    
    inline def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    inline def setMemorySizeMb(value: Double): Self = StObject.set(x, "memorySizeMb", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeMbNull: Self = StObject.set(x, "memorySizeMb", null)
    
    inline def setMemorySizeMbUndefined: Self = StObject.set(x, "memorySizeMb", js.undefined)
  }
}
