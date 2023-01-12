package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupConnections extends StObject {
  
  var internal: js.Array[Connection]
  
  var source: js.Array[Connection]
  
  var target: js.Array[Connection]
}
object GroupConnections {
  
  inline def apply(internal: js.Array[Connection], source: js.Array[Connection], target: js.Array[Connection]): GroupConnections = {
    val __obj = js.Dynamic.literal(internal = internal.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupConnections]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupConnections] (val x: Self) extends AnyVal {
    
    inline def setInternal(value: js.Array[Connection]): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalVarargs(value: Connection*): Self = StObject.set(x, "internal", js.Array(value*))
    
    inline def setSource(value: js.Array[Connection]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: Connection*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setTarget(value: js.Array[Connection]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: Connection*): Self = StObject.set(x, "target", js.Array(value*))
  }
}
