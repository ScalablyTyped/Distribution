package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatastoreMountPoint extends StObject {
  
  var child: DatastoreType
  
  var mountpoint: String
  
  var prefix: String
  
  var `type`: String
}
object DatastoreMountPoint {
  
  inline def apply(child: DatastoreType, mountpoint: String, prefix: String, `type`: String): DatastoreMountPoint = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], mountpoint = mountpoint.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreMountPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatastoreMountPoint] (val x: Self) extends AnyVal {
    
    inline def setChild(value: DatastoreType): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setMountpoint(value: String): Self = StObject.set(x, "mountpoint", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
