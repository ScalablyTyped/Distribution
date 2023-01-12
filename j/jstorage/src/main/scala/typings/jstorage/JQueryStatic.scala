package typings.jstorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var jStorage: JStorageStatic
}
object JQueryStatic {
  
  inline def apply(jStorage: JStorageStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(jStorage = jStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setJStorage(value: JStorageStatic): Self = StObject.set(x, "jStorage", value.asInstanceOf[js.Any])
  }
}
