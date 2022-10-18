package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreType extends StObject {
  
  var compression: js.UndefOr[String] = js.undefined
  
  var path: String
  
  var shardFunc: js.UndefOr[String] = js.undefined
  
  var sync: js.UndefOr[Boolean] = js.undefined
  
  var `type`: String
}
object DatastoreType {
  
  inline def apply(path: String, `type`: String): DatastoreType = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreType]
  }
  
  extension [Self <: DatastoreType](x: Self) {
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setShardFunc(value: String): Self = StObject.set(x, "shardFunc", value.asInstanceOf[js.Any])
    
    inline def setShardFuncUndefined: Self = StObject.set(x, "shardFunc", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
