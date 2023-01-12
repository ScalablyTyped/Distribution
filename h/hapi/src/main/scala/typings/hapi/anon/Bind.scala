package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bind extends StObject {
  
  var bind: js.Object
  
  var files: RelativeTo
}
object Bind {
  
  inline def apply(bind: js.Object, files: RelativeTo): Bind = {
    val __obj = js.Dynamic.literal(bind = bind.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bind] (val x: Self) extends AnyVal {
    
    inline def setBind(value: js.Object): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: RelativeTo): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
  }
}
