package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildbotResourceUsageStat extends StObject {
  
  var total: js.UndefOr[String | Null] = js.undefined
  
  var used: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildbotResourceUsageStat {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildbotResourceUsageStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotResourceUsageStat]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildbotResourceUsageStat](x: Self) {
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalNull: Self = StObject.set(x, "total", null)
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setUsed(value: String): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedNull: Self = StObject.set(x, "used", null)
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
  }
}
