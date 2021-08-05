package typings.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectMap extends StObject {
  
  var deleted: js.Array[KdbxObject]
  
  var objects: js.Array[KdbxObject]
  
  var remote: js.Array[KdbxObject]
}
object ObjectMap {
  
  inline def apply(deleted: js.Array[KdbxObject], objects: js.Array[KdbxObject], remote: js.Array[KdbxObject]): ObjectMap = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMap]
  }
  
  extension [Self <: ObjectMap](x: Self) {
    
    inline def setDeleted(value: js.Array[KdbxObject]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedVarargs(value: KdbxObject*): Self = StObject.set(x, "deleted", js.Array(value :_*))
    
    inline def setObjects(value: js.Array[KdbxObject]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: KdbxObject*): Self = StObject.set(x, "objects", js.Array(value :_*))
    
    inline def setRemote(value: js.Array[KdbxObject]): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteVarargs(value: KdbxObject*): Self = StObject.set(x, "remote", js.Array(value :_*))
  }
}
