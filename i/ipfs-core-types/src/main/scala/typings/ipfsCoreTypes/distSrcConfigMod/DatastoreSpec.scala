package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreSpec extends StObject {
  
  var mounts: js.UndefOr[js.Array[DatastoreMountPoint]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DatastoreSpec {
  
  inline def apply(): DatastoreSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatastoreSpec]
  }
  
  extension [Self <: DatastoreSpec](x: Self) {
    
    inline def setMounts(value: js.Array[DatastoreMountPoint]): Self = StObject.set(x, "mounts", value.asInstanceOf[js.Any])
    
    inline def setMountsUndefined: Self = StObject.set(x, "mounts", js.undefined)
    
    inline def setMountsVarargs(value: DatastoreMountPoint*): Self = StObject.set(x, "mounts", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
